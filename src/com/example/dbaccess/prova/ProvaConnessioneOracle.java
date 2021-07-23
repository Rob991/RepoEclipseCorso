package com.example.dbaccess.prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProvaConnessioneOracle {

	public static void main(String[] args) throws Exception {

		// 1)Caricamento del driver

		Class.forName("oracle.jdbc.driver.OracleDriver"); // Richiesto solo per versione < 4

		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";

		// 2) Creare una java.sql.connection

		Connection connection = DriverManager.getConnection(url, username, password);

		// 3) Creaiamo lo statement

		String sql = "select 123 * 555 from dual";
		PreparedStatement ps = connection.prepareStatement(sql);

		// 4) Otteniamo i dati

		ResultSet rs = ps.executeQuery();

		// 4.1) rs si posiziona sulla prima tupla

		rs.next();

		// 4.2) Prendo il risultato

		String risultato = rs.getString(1);

		System.out.println("Risultato = " + risultato);

		// Shutdown

		rs.close();
		ps.close();

		connection.close(); // Importante

	}

}
