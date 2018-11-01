package controller;

public class EscopoDeVariavel {
	static int x = 1;
	public static void metodoA() {
		int x = 25;
		System.out.println("Variável local x ao entrar no metodoA é " + x);
		x=x+1;
		System.out.println("Variável local x antes de sair do metodoA é " + x);
	}
	
	public static void metodoB() {
		System.out.println("Variável x ao entrar no metodo B é " + x + " global. ");
		x = x*10;
		System.out.println("Variável x antes de sair do metodo B é "+x );
	}
	
	public static void main(String [] args) {
		metodoA();
		int x = 5;
		System.out.println("x no início de main() é " + x);
	}
}	
