package questao3;

public class Divisao extends OperacaoMatematica{
	private double divisao;
	
	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}
	public double getDivisao() {
		return divisao;
	}
	
	public double calcula() {
		divisao = (super.getA() / super.getB());
		return divisao;
	}
}
