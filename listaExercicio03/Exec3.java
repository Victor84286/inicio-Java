package listaExercicio03;

public class Exec3 {
	public static void main(String[] args) {
		double peso = 70, altura = 1.67;
		System.out.print("O imc e: ");
		System.out.println(calculaIMC(peso, altura));
		comparaIMC(calculaIMC(peso, altura));
	}
	public static double calculaIMC(double p, double a) {
		double imc;
		imc = p /(a*a);
		return imc;
	}
	public static void comparaIMC(double imc) {
		if(imc<=18.5) {
			System.out.println("Abaixo do peso normal.");
		}
		else if(imc<=25) {
			System.out.println("Peso normal.");
		}
		else if(imc<=30) {
			System.out.println("Acima do peso normal.");
		}
		else{
			System.out.println("Obesidade.");
		}
	}
}
