package listaExercicio01;

public class Exec4 {
	
	public static void main(String argv[]) {
	
		float valorFabrica = 35000, porcentagemLucro = 25, porcentagemImposto = 15, imposto, lucro, comprador;
		
		lucro = valorFabrica*porcentagemLucro/100;
		imposto = valorFabrica*porcentagemImposto/100;
		comprador = valorFabrica + lucro + imposto;
		
		System.out.println("O preco para o comprador final é: "+comprador);
		System.out.println("O valor do imposto é: "+imposto);
		System.out.println("O valor do lucro do vendedor é: "+lucro);
	}
}
