package banco;

public class ContaCorrente {
	private double saldo, taxa = 0.05;
	
	public ContaCorrente(double saldo) {
		setSaldo(saldo);
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double depositar(double deposito) {
		return (saldo += deposito);
	}
	
	public double sacar(double saque) {
		return (saldo -=(saque+taxa*saque));
	}
}
