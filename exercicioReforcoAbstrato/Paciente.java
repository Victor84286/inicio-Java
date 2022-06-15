package exercicioReforcoAbstrato;

public abstract class Paciente {

	private String nome;
	private float valorConsulta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(float valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	public abstract float calcularConsulta();
	
}
