package execpInterface;

public class Quadrado implements FormaGeometrica {

	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return lado*4;
	}
}

