package colecao;
import java.util.Scanner;
import java.util.ArrayList;

public class UsaCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Carro> listaCarros = new ArrayList<>();
		int escolha;
			
		System.out.println("Escreva a quantidade de veiculos que ira dar entrada");
		escolha = sc.nextInt();
		
		for(int i = 0; i<escolha; i++) {
			Carro carro = new Carro();
			System.out.println("Escreva o modelo do carro");
			carro.setModelo(sc.next());
			System.out.println("Escreva a placa do carro");
			carro.setPlaca(sc.next());
			System.out.println("Escreva a quilometragem");
			carro.setKms(sc.nextInt());
			System.out.println("Escreva o ano do carro");
			carro.setAno(sc.nextInt());
			
			System.out.println("Quer ver se o carro tem mais de 100 kms?\n(1 para sim, qualquer outro numero para nao)");
			escolha = sc.nextInt();
			if(escolha == 1)
				carro.ehMaior();
			
			listaCarros.add(carro);
		}
		System.out.println(listaCarros);
		sc.close();
	}
}
