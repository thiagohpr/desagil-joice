package br.edu.insper.desagil.joice.model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.Testador;

public class TestadorCalculadora {
	
	private Testador t;
	private static double DELTA = 0.05;

	@BeforeEach
	private void setUp() {
	    t = new Testador();
	}
	
	@Test
	public void testeNiobio() {
	    assertEquals(8.57,t.testeNiobio(),DELTA);
	}
	@Test
	public void testeCobre() {
	    assertEquals(8.89,t.testeCobre(),DELTA);
	}

	@Test
	public void testeTungs() {
	    assertEquals(19.28,t.testeTungs(),DELTA);
	}

	@Test
	public void testeOuro() {
	    assertEquals(19.36,t.testeOuro(),DELTA);
	}

	@Test
	public void testeLitio() {
	    assertEquals(0.53,t.testeLitio(),DELTA);
	}

	@Test
	public void testePrata() {
	    assertEquals(10.60,t.testePrata(),DELTA);
	}


}
