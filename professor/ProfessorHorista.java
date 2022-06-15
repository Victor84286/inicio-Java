package professor;

public class ProfessorHorista extends Professor {

	private float horasTrabalhadas;
	private int valorHora;
	
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public int getValorHora() {
		return valorHora;
	}
	
	public double calculaSalario() {
		return (getHorasTrabalhadas()*getValorHora() - super.getDesconto());
	}
}
