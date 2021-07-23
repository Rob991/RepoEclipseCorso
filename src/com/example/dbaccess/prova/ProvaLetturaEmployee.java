package com.example.dbaccess.prova;

import java.util.List;

import com.example.dbaccess.DAO.EmployeeDAO;
import com.example.dbaccess.entities.Employee;
import com.example.dbaccess.exception.EmployeeException;

public class ProvaLetturaEmployee {

	public static void main(String[] args) throws EmployeeException {

		EmployeeDAO edao = new EmployeeDAO();
		List<Employee> employees = edao.findAll();
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println();

		Employee employee = edao.findById(120);
		System.out.println(employee);
	}
}
