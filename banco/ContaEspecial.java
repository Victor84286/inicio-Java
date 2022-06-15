package banco;

public class ContaEspecial extends ContaCorrente {
	
	private double saldo, taxa = 0.01; 
	
	public ContaEspecial(double saldo) {
		super(saldo);
	}
	@Override
	public double sacar(double saque) {
		return (saldo -=(saque+taxa*saque));
	}
	}
