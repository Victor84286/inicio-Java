package exemplos;
import java.util.Scanner;

public class EntraDado {

	public static void main(String args[]) {
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Entre com a nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Entre com a nota do trabalho: ");
		trabalho=sc.nextFloat();
		
		media = (nota1 + nota2 + trabalho)/3;
		System.out.println("A media é: " + media);
		sc.close();
	}
}
