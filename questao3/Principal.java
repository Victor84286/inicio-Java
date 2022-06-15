package questao3;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Soma som = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao prod = new Multiplicacao();
		Divisao div = new Divisao();
		
		
		Scanner sc1 = new Scanner(System.in);
		int operacao;
		do {
			System.out.println("Escreva a operacao que quer realizar\n(1 para adicao, 2 para subtracao, 3 prar multiplicacao,  4 para divisao e 5 para parar o codigo)");
			operacao = sc1.nextInt();
		
			switch(operacao) {
				case 1: System.out.println("Escreva os numeros que deseja utilizar na soma");
				som.setA(sc1.nextInt());
				som.setB(sc1.nextInt());
			
				System.out.println("O resultado da soma foi: "+som.calcula());break;
			
				case 2: System.out.println("Escreva os numeros que deseja utilizar na subtracao");
				sub.setA(sc1.nextInt());
				sub.setB(sc1.nextInt());
			
				System.out.println("O resultado da subtracao foi: "+sub.calcula());break;
			
				case 3: System.out.println("Escreva os numeros que deseja utilizar na multiplicacao");
				prod.setA(sc1.nextInt());
				prod.setB(sc1.nextInt());
			
				System.out.println("O resultado da multiplicacao foi: "+ prod.calcula());break;
			
				case 4: System.out.println("Escreva os numeros que deseja utilizar na divisao");
				div.setA(sc1.nextInt());
				div.setB(sc1.nextInt());
				
				System.out.println("O resultado da divisao foi: "+ div.calcula());break;
				
				case 5: System.out.println("A operacao foi encerrada");break;
				
				default: System.out.println("Não reconhecido");
			}
		}while(operacao != 5);
		
		sc1.close();
	}
}
