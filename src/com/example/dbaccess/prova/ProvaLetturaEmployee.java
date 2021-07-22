package com.example.dbaccess.prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.dbaccess.database.EmployeeException;
import com.example.dbaccess.entities.Employee;

public class ProvaLetturaEmployee {

	public static void main(String[] args) throws EmployeeException {

		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String sql = "select employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id from employees order by last_name";

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = Employee.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));
				System.out.println(rs.getRow() + "° " + e);
			}
		} catch (SQLException e) {
			throw new EmployeeException("Errore di lettura impiegati", e);
		} finally { 
			System.out.println("\nConnessione al database chiusa");
			try {
				rs.close();
			} catch (SQLException e) {
			}
			try {
				ps.close();
			} catch (SQLException e) {
			}
			try {
				connection.close();
			} catch (SQLException e) {
			}

		}

	}
}
