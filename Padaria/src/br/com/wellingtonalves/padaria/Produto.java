package br.com.wellingtonalves.padaria;

public class Produto {
	private String nome;
	private double valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor - (valor * 0.50);
	}
	public void mostrarDetalhes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor: " + this.valor);
		System.out.println("--");
	}	
}
