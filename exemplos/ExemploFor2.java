package exemplos;

public class ExemploFor2 {
	public static void main(String[] args) {
		System.out.println(metodoInt(4));
	}
	public static int metodoInt(int n) {
		int counter, result = 1;
		for(counter = n; counter != 0; counter--) {
			result*=2;
		}
		return result;
	}
}
