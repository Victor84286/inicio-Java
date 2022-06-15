package exercicioReforcoAbstrato;

public class NaoAssegurado extends Paciente {

	private String hospitalAtendido;
	final float taxaExtra =
			(float) 0.1;

	public String getHospitalAtendido() {
		return hospitalAtendido;
	}

	public void setHospitalAtendido(String hospitalAtendido) {
		this.hospitalAtendido = hospitalAtendido;
	}
	
	public float calcularConsulta() {
		return (super.getValorConsulta() + taxaExtra * super.getValorConsulta());
	}
}
