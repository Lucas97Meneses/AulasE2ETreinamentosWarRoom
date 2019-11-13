package br.com.roomscrool.aulas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadora {
	
	Calculadora c;
	
	@Test
	public void testSoma() {
	    assertEquals(10, c.soma(5,5));
	
	}
		
	@Test
	public void testSubtracao() {
		assertEquals(10, c.subtracao(15,5));
		
	}
	
	@Test
	public void testMultiplicacao() {
		assertEquals(10, c.multiplicacao(5,2));
	}
	
	@Test
	public void testDivisao() {
		assertEquals(10, c.divisao(20,2));
	}

}
