package banco;

public class Principal {
	public static void main(String args[]) {
		
		ContaCorrente conta1 = new ContaCorrente(500);
		ContaEspecial conta2 = new ContaEspecial(1000);
		
		//conta normal
		System.out.println("O saldo eh: " + conta1.getSaldo());
		
		conta1.depositar(20);
		
		System.out.println("O saldo eh: " + conta1.getSaldo());
		
		conta1.sacar(20);
		
		System.out.println("O saldo eh: " + conta1.getSaldo());
		
		//conta especial
		System.out.println("O saldo eh: " + conta2.getSaldo());
		
		conta2.depositar(20);
		
		System.out.println("O saldo eh: " + conta2.getSaldo());
		
		conta2.sacar(30);
		
		System.out.println("O saldo eh: " + conta2.getSaldo());
	}
	
}
