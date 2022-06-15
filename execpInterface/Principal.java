package execpInterface;
import java.util.Scanner;
public class Principal {
	public static void main(String args[]) {
		int forma;
		Scanner sc1 = new Scanner(System.in);
		
		Circulo roda = new Circulo();
		
		Quadrado quad = new Quadrado();
		
		Retangulo ret = new Retangulo();
		do {
			System.out.println("Escreva qual forma deseja iniciar\n(1 para circulo, 2 para quadrado, 3 para retangulo e 4 para parar o programa)");
			forma = sc1.nextInt();
			
			switch(forma) {
				case 1: System.out .println("Escreva o raio");
				roda.setRaio(sc1.nextDouble());
				
				System.out.println("A area do circulo eh: "+roda.area()+"\nA circunferencia eh: "+roda.perimetro());break;
				
				case 2: System.out.println("Escreva o lado");
				quad.setLado(sc1.nextDouble());
				
				System.out.println("\nA area do quadrado eh: "+quad.area()+"\nO perimetro do quadrado eh: "+quad.perimetro());break;
				
				case 3: System.out.println("Escreva a base e a altura do retangulo");
				ret.setBase(sc1.nextDouble());
				ret.setAltura(sc1.nextDouble());
				
				System.out.println("\nA area do retangulo eh: "+ret.area()+"\nO perimetro do retangulo eh: "+ret.perimetro());break;
				
				case 4: System.out.println("O programa foi encerrado");break;
				
				default: System.out.println("Nao foi identificado");
			}
		}while (forma != 4);
		sc1.close();
	}
}
