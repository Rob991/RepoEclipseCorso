package com.example.dbaccess.entities;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cognome;
	private String email;
	private String numTelefono;
	private String dataAssunzione;
	private String idLavoro;
	private Double salario;
	private Double commissioni;
	private Integer idManager;
	private Integer idDipartimento;

	public Employee() {
	}

	public Employee(String nome, String cognome, String email, String numTelefono, String dataAssunzione,
			String idLavoro, Double salario, Double commissioni, Integer idManager, Integer idDipartimento) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numTelefono = numTelefono;
		this.dataAssunzione = dataAssunzione;
		this.idLavoro = idLavoro;
		this.salario = salario;
		this.commissioni = commissioni;
		this.idManager = idManager;
		this.idDipartimento = idDipartimento;
	}

	public static Employee create(Integer id, String nome, String cognome, String email, String numTelefono,
			String dataAssunzione, String idLavoro, Double salario, Double commissioni, Integer idManager,
			Integer idDipartimento) {
		Employee newEmployee = new Employee();
		newEmployee.setId(id);
		newEmployee.setNome(nome);
		newEmployee.setCognome(cognome);
		newEmployee.setEmail(email);
		newEmployee.setNumTelefono(numTelefono);
		newEmployee.setDataAssunzione(dataAssunzione);
		newEmployee.setIdLavoro(idLavoro);
		newEmployee.setSalario(salario);
		newEmployee.setCommissioni(commissioni);
		newEmployee.setIdManager(idManager);
		newEmployee.setId(idDipartimento);
		return newEmployee;
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

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(String dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public String getIdLavoro() {
		return idLavoro;
	}

	public void setIdLavoro(String idLavoro) {
		this.idLavoro = idLavoro;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getCommissioni() {
		return commissioni;
	}

	public void setCommissioni(Double commissioni) {
		this.commissioni = commissioni;
	}

	public Integer getIdManager() {
		return idManager;
	}

	public void setIdManager(Integer idManager) {
		this.idManager = idManager;
	}

	public Integer getIdDipartimento() {
		return idDipartimento;
	}

	public void setIdDipartimento(Integer idDipartimento) {
		this.idDipartimento = idDipartimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", numTelefono=");
		builder.append(numTelefono);
		builder.append(", dataAssunzione=");
		builder.append(dataAssunzione);
		builder.append(", idLavoro=");
		builder.append(idLavoro);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", commissioni=");
		builder.append(commissioni);
		builder.append(", idManager=");
		builder.append(idManager);
		builder.append(", idDipartimento=");
		builder.append(idDipartimento);
		builder.append("]");
		return builder.toString();
	}

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
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

}
