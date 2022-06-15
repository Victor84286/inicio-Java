package execpInterface;

public class Circulo implements FormaGeometrica {
	public double raio;
	final double Pi = 3.14;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Pi *raio*raio;
	}
	
	public double perimetro() {
		return 2*Pi*raio;
	}
}
