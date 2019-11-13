package br.com.roomscrool.aulas;

public class CadastrarProdutosEstoqueMercado {

	int produto = 100;

	public boolean mercado(int estoque) {
		if (this.produto < estoque) {
			return false;
		} else {
			this.produto = this.produto - estoque;
		}
		return true;
	}
}
