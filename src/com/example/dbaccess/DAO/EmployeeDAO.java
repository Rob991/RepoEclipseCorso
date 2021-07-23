package com.example.dbaccess.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dbaccess.databaseConnection.ConnectionFactory;
import com.example.dbaccess.entities.Employee;
import com.example.dbaccess.exception.EmployeeException;

public class EmployeeDAO implements DAO<Employee, Integer> {

	public static final String findAllQuery = "select employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id from employees order by last_name";

	public static final String findQueryById = "select employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id from employees where employee_id = ?";

	public List<Employee> findAll() throws EmployeeException {
		List<Employee> lista = new ArrayList<Employee>();
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(findAllQuery);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = Employee.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9),
						rs.getInt(10), rs.getInt(11));
				lista.add(e);
			}
		} catch (SQLException e) {
			throw new EmployeeException("Errore di lettura impiegati", e);
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				ps.close();
			} catch (Exception e) {
			}
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

	@Override
	public Employee findById(Integer id) throws EmployeeException {
		Employee employee = null;
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(findQueryById);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				employee = Employee.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9),
						rs.getInt(10), rs.getInt(11));
			}
		} catch (SQLException e) {
			throw new EmployeeException("Errore di lettura impiegato id =" + id, e);
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				ps.close();
			} catch (Exception e) {
			}
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
		return employee;
	}

}
