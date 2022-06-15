package listaExercicio02;

public class Exec3 {
	public static void main(String[] args) {
		
		int altura = 5, base = 3;
		float alturaFloat = 6, baseFloat = 4;
		System.out.println("A altura em inteiro e: "+altura);
		System.out.println("A base em inteiro e: "+base);
		mostraArea(altura, base);
		mostraPerimetro(altura, base);
		System.out.println("A altura em float e: "+alturaFloat);
		System.out.println("A base em float e: "+baseFloat);
		mostraAreaFloat(alturaFloat, baseFloat);
		mostraPerimetroFloat(alturaFloat, baseFloat);
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
	public static void mostraAreaFloat(float a, float b) {
		float area;
		area = a * b;
		System.out.println("A area do retangulo e: "+area);
	}
	public static void mostraPerimetroFloat(float a, float b) {
		float perimetro;
		perimetro = a*2 + b*2;
		System.out.println("O perimetro do retangulo e: "+ perimetro);
	}
	
}
