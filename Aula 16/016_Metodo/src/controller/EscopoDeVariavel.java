package controller;

public class EscopoDeVariavel {
	static int x = 1;
	public static void metodoA() {
		int x = 25;
		System.out.println("Vari�vel local x ao entrar no metodoA � " + x);
		x=x+1;
		System.out.println("Vari�vel local x antes de sair do metodoA � " + x);
	}
	
	public static void metodoB() {
		System.out.println("Vari�vel x ao entrar no metodo B � " + x + " global. ");
		x = x*10;
		System.out.println("Vari�vel x antes de sair do metodo B � "+x );
	}
	
	public static void main(String [] args) {
		metodoA();
		int x = 5;
		System.out.println("x no in�cio de main() � " + x);
	}
}	
