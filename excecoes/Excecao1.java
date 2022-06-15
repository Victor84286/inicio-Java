package excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao1 {
public static void main(String[] args) {
	int val1, val2;
	double result;
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.print("Entre com o primeiro valor: ");
		val1 = sc.nextInt();
		System.out.print("Entre com o segundo valor: ");
		val2 = sc.nextInt();
		result = val1/val2;
		System.out.println(val1 + "/" + val2 + "+" + result);
	}
	catch(ArithmeticException e1) {
		System.out.println("Excecao: " + e1);
		System.out.println( "Tentativa divisao por zero!");
		System.out.println("Entre com um numero diferente de zero");
	}
	catch(InputMismatchException e2) {
		System.out.println("Erro: dado de entrada errado ");
		System.out.println("O erro foi: " + e2);
	}
	sc.close();
}
}
