package listaExercicio02;

public class Exec1 {

	public static void main(String[] args) {
		
		int altura = 5, base = 3;
		
		System.out.print("A area do retangulo e: ");
		System.out.println(calculaArea(altura, base)); 
		System.out.print("O perimetro do retangulo e: ");
		System.out.println(perimetroRetangulo(altura, base));
	}
	public static int calculaArea(int a, int b) {
		int area;
		area = a * b;
		return area;
		
	}
	public static int perimetroRetangulo(int a, int b) {
		int perimetro;
		perimetro = a*2 + b*2;
		return perimetro;
	}
}
