package exemplos;

public class Principal2 {
	public static void main(String args[]) {

		int intScript = 6, intActing = 9, intDirecting = 8;
		double doubleScript = 6.0, doubleActing = 9.0, doubleDirecting = 8.0;
		
		mostrarPontuarFilme(intScript, intActing, intDirecting);
		mostrarPontuarFilme(intScript, intActing);
		
		mostrarPontuarFilme(doubleScript, doubleActing, doubleDirecting);
		mostrarPontuarFilme(doubleScript, doubleActing);
	
	}
	public static void mostrarPontuarFilme(int s, int a, int d) {

		System.out.print("A pontuacao inteira do filme é ");
		System.out.println(s + a + d);
		
	}
	public static void mostrarPontuarFilme(int s, int a) {

		System.out.print("A pontuacao inteira do filme é ");
		System.out.println(s + a);
		
	}
	public static void mostrarPontuarFilme(double s, double a, double d) {
		
		System.out.print("A pontuacao do filme é ");
		System.out.println(s + a + d);
		
	}
	public static void mostrarPontuarFilme(double s, double a) {
		
		System.out.print("A pontuacao do filme é ");
		System.out.println(s + a);
		
	}

}
