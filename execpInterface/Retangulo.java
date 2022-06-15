package execpInterface;

public class Retangulo implements FormaGeometrica{

	private double base, altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return base*altura;
	}
	
	public double perimetro() {
		return base*2 + altura*2;
	}
}
