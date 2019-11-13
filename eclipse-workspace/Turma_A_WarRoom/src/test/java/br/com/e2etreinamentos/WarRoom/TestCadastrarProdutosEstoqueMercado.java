package br.com.roomscrool.aulas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCadastrarProdutosEstoqueMercado {
	
	CadastrarProdutosEstoqueMercado c;
	
	@Test
	public void estoque() {
		assertEquals(50, c.produto);
	}
}
