package listaExercicio03;

public class Exec1 {
	public static void main(String[] args) {
		int idade = 19;
		analisaIdade(idade);
	}
	public static void analisaIdade(int I) {
		if (I>=21) {
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}
	}
}
