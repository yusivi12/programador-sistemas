package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("Sorteio entre 50 e 80: " + resultado);

		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("N�mero Sorteado: " + numeroSorteado);

			int maior;
			maior = Math.max(resultado, 65);
			System.out.println("Entre 65 e " + resultado + " o maior valor � " + maior);

			double area = Math.PI * Math.pow(5, 2);
			System.out.println("�rea de um c�rculo de " + "raio 5 � " + area);

			double sen, cos, tan;
			double a = 60;
			sen = Math.sin(Math.toRadians(a));
			cos = Math.cos(Math.toRadians(a));
			tan = Math.tan(Math.toRadians(a));
			System.out.println("Seno: " + sen);
			System.out.println("Cosseno: " + cos);
			System.out.println("Tangente: " + tan);

			double raiz = Math.sqrt(4);
			System.out.println("Raiz quadrada de 4 � " + raiz);

		}
	}
}
