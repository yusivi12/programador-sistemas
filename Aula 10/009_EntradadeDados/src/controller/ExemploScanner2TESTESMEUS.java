package controller;

import java.util.Scanner;

public class ExemploScanner2TESTESMEUS {
	

	public static void main(String[] args) {

		String nome;
		String cidade;
		int idade;
		
		System.out.println("Digite seu nome");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();

		System.out.println("Nome Digitado: " + nome);
		
		
		String cidade;
		
		System.out.println("Digite sua Cidade");
		Scanner sc3 = new Scanner(System.in);
		cidade = sc3.nextLine();
		
		System.out.println("Sua Cidade: " + cidade);
		

		double salario;

		System.out.println("Digite o Salário que deseja:");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();

		System.out.println("Salário Digitado; " + salario);
		
		sc.close();
		sc2.close();

	}
}