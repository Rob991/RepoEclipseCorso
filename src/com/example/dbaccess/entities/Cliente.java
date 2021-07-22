package com.example.dbaccess.entities;

import java.io.Serializable;
import java.util.Objects;

//	Entity cliente
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cognome;
	private String email;
	private String indirizzo;
	private String citta;
	private String provincia;
	private Integer cap;

	public Cliente() {
	} // Obbligatorio se altri costruttori

	public Cliente(String nome, String cognome, String email, String indirizzo, String citta, String provincia,
			Integer cap) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.cap = cap;
	}

	public static Cliente create(Integer id, String nome, String cognome, String email, String indirizzo, String citta,
			String provincia, Integer cap) {
		Cliente newCliente = new Cliente();
		newCliente.setId(id);
		newCliente.setNome(nome);
		newCliente.setCognome(cognome);
		newCliente.setEmail(email);
		newCliente.setIndirizzo(indirizzo);
		newCliente.setCitta(citta);
		newCliente.setProvincia(provincia);
		newCliente.setCap(cap);
		return newCliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}

	// Quando due clienti sono diversi

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", indirizzo=");
		builder.append(indirizzo);
		builder.append(", citta=");
		builder.append(citta);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", cap=");
		builder.append(cap);
		builder.append("]");
		return builder.toString();
	}

}
