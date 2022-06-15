package excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecExcecao {
	public static void main(String[] args) {
		float val1, val2, result;
		int escolha;
		Scanner sc = new Scanner(System.in);
		
		try {
			do {
				
				System.out.print("Escreva o valor do primeiro numero\n(menor ou igual a 0 encerra o programa)\n");
				val1 = sc.nextFloat();
				if(val1 <1) {
					System.out.println("O programa foi encerrado");
					break;
				}
				System.out.print("Escreva o valor do segundo numero\n");
				val2 = sc.nextFloat();
				System.out.print("Escreva qual a operacao deseja realizar\n(1 para soma, 2 parasubtracao, 3 para multiplicacao, 4 para divisao)\n");
				escolha = sc.nextInt();
				switch(escolha) {
				case 1:
					result = val1 + val2;
					System.out.println(val1 + "+" + val2 + "=" + result);
					break;
				case 2:
					result = val1 - val2;
					System.out.println(val1 + "-" + val2 + "=" + result);
					break;
				case 3:
					result = val1 * val2;
					System.out.println(val1 + "*" + val2 + "=" + result);
					break;
				case 4:
					if(val2 == 0)
						throw(new ArithmeticException());
					result = val1 / val2;
					System.out.println(val1 + "/" + val2 + "=" + result);
					break;
				default:
					System.out.println("Nao reconhecido");
				}
			}while(val1>0);
		}
		catch(ArithmeticException e1) {
			System.out.println("Erro: dividir por 0 nao eh possivel!");
		}
		catch(InputMismatchException e2) {
			System.out.println("Erro: entrada de dado errada!");
		}
		sc.close();
	}
}
