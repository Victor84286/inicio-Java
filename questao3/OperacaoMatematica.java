package questao3;

public abstract class OperacaoMatematica {
	private int a, b;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public abstract double calcula();
}
