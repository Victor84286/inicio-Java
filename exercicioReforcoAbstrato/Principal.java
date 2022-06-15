package exercicioReforcoAbstrato;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("\n\nEscreva se o paciente tem ou nao seguro\n(1 para eh assegurado, 2 para nao eh assegurado e 9 para encerrar o programa)");
			escolha = sc1.nextInt();
			
			switch(escolha) {
			case 1:
				Assegurado asseg = new Assegurado();
				
				System.out.println("Escreva o nome do paciente");
				asseg.setNome(sc1.next());
				
				System.out.println("Escreva o valor da consulta");
				asseg.setValorConsulta(sc1.nextFloat());
				
				System.out.println("Escreva o codigo do seguro");
				asseg.setCodigoSegurado(sc1.nextInt());
				
				System.out.println("Escreva o nome do plano de saude");
				asseg.setPlanoSaude(sc1.next());
				
				System.out.println("O paciente " + asseg.getNome() + "\nCodigo de seguro " + asseg.getCodigoSegurado() + "\nplano de saude " + asseg.getPlanoSaude() +"\n\nDeve pagar: " + asseg.calcularConsulta());
				break;
				
			case 2:
				NaoAssegurado nasseg = new NaoAssegurado();
				
				System.out.println("Escreva o nome do paciente");
				nasseg.setNome(sc1.next());
				
				System.out.println("Escreva o valor da consulta");
				nasseg.setValorConsulta(sc1.nextFloat());
								
				System.out.println("Escreva o nome do hospital onde foi feito o atendimento");
				nasseg.setHospitalAtendido(sc1.next());
				
				System.out.println("O paciente " + nasseg.getNome() + "\nHospital de atendimento " + nasseg.getHospitalAtendido() +"\n\nDeve pagar: " + nasseg.calcularConsulta());
				break;
				
			case 9:
				System.out.println("O programa foi encerrado\n\n");
				break;
				
			default:
				System.out.println("Nao reconhecido\n");
				break;
			}
		}while(escolha != 9);
		sc1.close();
	}
}
