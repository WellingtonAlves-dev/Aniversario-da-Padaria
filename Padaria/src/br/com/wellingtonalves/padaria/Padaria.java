package br.com.wellingtonalves.padaria;
import java.util.Scanner;
public class Padaria {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("--");
		System.out.println("Aniversario familia Joaquim");
		System.out.println("--");
		
		ProdutosDesconto produtos = new ProdutosDesconto();
		
		int contador = 0;
		
		while(contador <= 3) {
			try {
				System.out.printf("Nome do produto: ");
				String nome = s.nextLine();
				System.out.printf("Valor do produto: ");
				
				double preco = s.nextDouble();
				s.nextLine();
				Produto p1 = new Produto();
				p1.setNome(nome);
				p1.setValor(preco);
				p1.mostrarDetalhes();
				System.out.printf("Deseja adicionar esse produto (S / N): ");
				String opcao = s.next().toLowerCase();
				if(opcao.equals("s")) {
					produtos.insertProduto(p1);
					contador++;
				}
			} catch(java.util.InputMismatchException e) {
				System.out.println("O valor precisa ser do tipo flutuante");
			} finally {
				s.nextLine();
			}
		}
		System.out.println("--");
		System.out.println("Todos os produtos adicionados: ");
		produtos.mostrarDetalhesTodos();
		
	}
}
