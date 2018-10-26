
package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		
		String nome;
		nome = Teclado.lerTexto("Digite seu nome:");
		
		
		int nota1 = Teclado.lerInt("Digite nota 1");
		
		int nota2 = Teclado.lerInt("Digite nota 2");
		
		int nota3 = Teclado.lerInt("Digite nota 3");
		
		int nota4 = Teclado.lerInt("Digite nota 4");
		
		int media = nota1 + nota2 + nota3 + nota4;
		media = media/4;
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
						
		// TODO Auto-generated method stub

	}

}
