package listaExercicio01;

public class Exec3 {
	
	public static void main(String argv[]) {
	
		int deposito = 500, juros = 3, rendimento, valorTotal;
		
		rendimento = deposito*juros/100;
		valorTotal = deposito + rendimento;
		
		System.out.println("O valor do rendimento é: "+rendimento+" e o valor final é: "+valorTotal);
	}
}
