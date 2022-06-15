package questao3;

public class Soma extends OperacaoMatematica {
	private double soma;
	
	
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public double getSoma() {
		return soma;
	}
	
	public double calcula() {
		soma = super.getA() + super.getB();
		return soma;
	}
}
