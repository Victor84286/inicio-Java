package exemplos;

public class Operador1 {
	
	public static void main(String args[]) {
		int contador = 10, numero = 6, x, y, var;
		System.out.println("contador = " + contador);
		System.out.println("numero = " + numero);
		System.out.println();
		
		numero++;
		contador--;
		System.out.println("contador = " + contador);
		System.out.println("numero = " + numero);
		System.out.println();
		
		x = 2;
		var = 0;
		var = ++x;
		System.out.println("x = " + x);
		System.out.println("var = " + var);
		System.out.println();
		
		y = 2;
		var = 0;
		var = y++;
		System.out.println("y = " + y);
		System.out.println("var = " + var);
		System.out.println();
	}

}
