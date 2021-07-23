package com.example.dbaccess.DAO;

import java.util.List;

import com.example.dbaccess.exception.ClientiException;

public interface DAO<ENTITY, KEY> {

	ENTITY findById(KEY id);

	List<ENTITY> findAll();

}
