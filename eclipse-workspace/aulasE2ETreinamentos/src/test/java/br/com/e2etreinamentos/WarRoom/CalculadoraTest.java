package br.com.e2etreinamentos.WarRoom;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora c;

	@Test
	public void testSoma() throws Exception {
		assertEquals(10, c.soma(5,5));
	}
	
	@Test
	public void testSubtracao() throws Exception {
		assertEquals(10, c.subtracao(20,10));
	}
	
	@Test
	public void testMultiplicacao() throws Exception {
		assertEquals(10, c.multiplicacao(5,5));
	}
	
	@Test
	public void testDivisao() throws Exception {
		assertEquals(10, c.divisao(20,2));
	}
}
