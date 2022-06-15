package questao3;

public class Multiplicacao extends OperacaoMatematica{
	private double produto;
	
	public void setProduto(double produto) {
		this.produto = produto;
	}
	public double getProduto() {
		return produto;
	}
	
	public double calcula() {
		produto = super.getA() * super.getB();
		return produto;
	}
}
