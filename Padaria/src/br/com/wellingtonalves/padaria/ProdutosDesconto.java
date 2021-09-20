package br.com.wellingtonalves.padaria;
import java.util.ArrayList;
public class ProdutosDesconto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void insertProduto(Produto produto) {
		produtos.add(produto);
	}
	public void mostrarDetalhesTodos() {
		for(Produto p : produtos) {
			p.mostrarDetalhes();
		}
	}	
}
