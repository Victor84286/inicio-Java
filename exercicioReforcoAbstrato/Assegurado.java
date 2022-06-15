package exercicioReforcoAbstrato;

public class Assegurado extends Paciente{

	private int codigoSegurado;
	private String planoSaude;
	
	public int getCodigoSegurado() {
		return codigoSegurado;
	}
	public void setCodigoSegurado(int codigoSegurado) {
		this.codigoSegurado = codigoSegurado;
	}
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public float calcularConsulta() {
		return super.getValorConsulta()/2;
	}
}
