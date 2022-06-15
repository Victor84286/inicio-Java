package excecoes;

import java.util.Scanner;

public class Excecao4 {
	public static float calculaQuociente(float v1, float v2)throws ArithmeticException{
		if(v2 == 0)
			throw (new ArithmeticException());
		return v1/v2;
	}
	public static void main(String[] args) {
		float val1, val2, result;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Entre com o primeiro valor: ");
			val1 = sc.nextFloat();
			System.out.print("Entre com o segundo valor: ");
			val2 = sc.nextFloat();
			result = calculaQuociente (val1, val2);
			System.out.println(val1 + "/" + val2 + "=" + result);
		}
		catch(ArithmeticException e1) {
			System.out.println("Tentatica de divisao por zero!");
			System.out.println("Entrada com dado incorreto");
		}
		sc.close();
	}
}
