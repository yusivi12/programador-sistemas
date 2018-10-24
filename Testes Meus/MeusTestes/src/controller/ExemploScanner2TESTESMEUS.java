package controller;

import java.util.Scanner;

public class ExemploScanner2TESTESMEUS {
	

	public static void main(String[] args) {

		String nome;
		
		
		
		System.out.println("Digite seu nome");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.println("Nome Digitado: " + nome.toUpperCase());
		
		
		String cidade;
		
		System.out.println("Digite sua Cidade");
		Scanner sc3 = new Scanner(System.in);
		cidade = sc3.nextLine();
		
		System.out.println("Sua Cidade: " + cidade.toUpperCase());
		
		int idade;
		
		System.out.println("Digite sua idade");
		Scanner sc4 = new Scanner(System.in);
		idade = sc4.nextInt();
		
		System.out.println("Sua Idade: " + idade);
		
		

		double salario;

		System.out.println("Digite o Salário que deseja:");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();

		System.out.println("Salário Digitado: " + salario);
		
		System.out.println("Informações Interpretadas com Sucesso.");
		
		
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();

	}
}