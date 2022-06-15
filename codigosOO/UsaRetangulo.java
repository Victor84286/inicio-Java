package codigosOO;

//				Retangulo() ===== funcao (construtor em POO)
public class UsaRetangulo {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Retangulo r3 = new Retangulo();
		
		// r1
		r1.base = 5;
		r1.altura = 7;
		System.out.print("\n**Retangulo r1**");
		System.out.println("\nBase: " + r1.base);
		System.out.println("Altura: " + r1.altura);
		r1.exibeArea();
		r1.exibePerimetro();
		
		//  r2
		r2.base = 3;
		r2.altura = 2;
		System.out.print("\n**Retangulo r2**");
		System.out.println("\nBase: " + r2.base);
		System.out.println("Altura: " + r2.altura);
		r2.exibeArea();
		r2.exibePerimetro();

		//  r3
		r3.base = 38;
		r3.altura = 12;
		System.out.print("\n**Retangulo r3**");
		System.out.println("\nBase: " + r3.base);
		System.out.println("Altura: " + r3.altura);
		r3.exibeArea();
		r3.exibePerimetro();
	}
	
}