package com.example.dbaccess.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.dbaccess.exception.ConnectionFactoryException;

public class ConnectionFactory {
	private static final String driverName = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String userName = "hr";
	private static final String password = "hr";

	public static Connection getConnection() {
		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url, userName, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			throw new ConnectionFactoryException("Errore nella creazione della java.sql.Connection", e);
		}
	}

}
