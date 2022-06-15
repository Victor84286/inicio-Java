package listaExercicio02;

public class Exec2 {
	public static void main(String[] args) {
		
		int altura = 5, base = 3;
		
		mostraArea(altura, base);
		
		mostraPerimetro(altura, base);
		
	}
	public static void mostraArea(int a, int b) {
		int area;
		area = a * b;
		System.out.println("A area do retangulo e: "+area);
	}
	public static void mostraPerimetro(int a, int b) {
		int perimetro;
		perimetro = a*2 + b*2;
		System.out.println("O perimetro do retangulo e: "+ perimetro);
	}

}
