package com.example.dbaccess.prova;

import java.util.List;

import com.example.dbaccess.DAO.ClientiDAO;
import com.example.dbaccess.entities.Cliente;
import com.example.dbaccess.exception.ClientiException;

public class ProvaLetturaClienti {

	public static void main(String[] args) throws ClientiException {

		ClientiDAO cdao = new ClientiDAO();
		List<Cliente> clienti = cdao.findAll();
		for(Cliente c : clienti) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Cliente cliente = cdao.findById(5);
		System.out.println(cliente);
	}

}
