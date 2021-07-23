package com.example.esercizi;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Prova {

	private static final Logger log = LogManager.getLogger(Prova.class);
	List<Integer> list = new ArrayList<>();

	public void prova() {
		for (int i = 1; i == 0; i--) {
			list.add(i);
			log.debug(list.size());
		}
		log.info("Grandezza lista: " + list.size());
		if (list.size() <= 0) {
			log.fatal("Errore: La lista non è implementata correttamente");
		}
	}

	public static void main(String[] args) {
		log.trace("Messaggio di trace");
		log.debug("Messaggio di debug");
		log.info("Messaggio di info");
		log.warn("Messaggio di warn");
		log.error("Messaggio di error");
		log.fatal("Messaggio di fatal");
	}

	private void doSomething() {

	}

}
