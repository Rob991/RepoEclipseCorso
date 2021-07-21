package com.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.esercizi.Prova;

class ProvaTest {

	private static final Logger log = LogManager.getLogger(Prova.class);

	@Test
	void test() {
		log.trace("Messaggio di trace");
		log.debug("Messaggio di debug");
		log.info("Messaggio di info");
		log.warn("Messaggio di warn");
		log.error("Messaggio di error");
		log.fatal("Messaggio di fatal");
	}

}
