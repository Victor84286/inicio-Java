package vetorObjetos;

public class TestaPonto {
	public static void main(String[] args) {
		Ponto[ ]pontos = new Ponto[10];
		
		for(int i =0; i<pontos.length; i++) {
			Ponto p = new Ponto();
			p.setX(i);
			p.setY(2*i);;
			pontos[i] = p;
		}
		
		for(int i = 0; i<pontos.length; i++) {
			Ponto p = pontos[i];
			System.out.println("Ponto - X: " + p.getX() + " Y: " + p.getY());
		}
	}
}
