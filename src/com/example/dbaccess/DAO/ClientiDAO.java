package com.example.dbaccess.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dbaccess.databaseConnection.ConnectionFactory;
import com.example.dbaccess.entities.Cliente;
import com.example.dbaccess.exception.ClientiException;

public class ClientiDAO implements DAO<Cliente, Integer>{

	public static final String findAllQuery = "select id, nome, cognome, email, indirizzo, citta, provincia, cap from clienti order by cognome, nome";
	
	public static final String findQueryById = "select id, nome, cognome, email, indirizzo, citta, provincia, cap from clienti where id = ?";
	
	public List<Cliente> findAll() throws ClientiException {
		List<Cliente> lista = new ArrayList<Cliente>();
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(findAllQuery);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente cliente = Cliente.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
			lista.add(cliente);
			}
		} catch (SQLException e) {
			throw new ClientiException("Errore di lettura clienti", e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { ps.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		
		return lista;
	}

	@Override
	public Cliente findById(Integer id) throws ClientiException {
		Cliente cliente = null;
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(findQueryById);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				cliente = Cliente.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			throw new ClientiException("Errore di lettura cliente id="+id, e);
		} finally {
			try { rs.close(); } catch (Exception e) {}
			try { ps.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}
		
		return cliente;
	}
}



