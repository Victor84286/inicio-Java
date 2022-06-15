package questao3;

public class Subtracao extends OperacaoMatematica{
	private double subtracao;
	
	public void setSubtracao(double subtracao) {
		this.subtracao = subtracao;
	}
	public double getSubtracao() {
		return subtracao;
	}
	
	public double calcula() {
		subtracao = super.getA() - super.getB();
		return subtracao;
	}
}
