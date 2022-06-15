package professor;

public class ProfessorDedicado extends Professor {
	
	private float salarioBruto;
	
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public float getSalarioBruto() {
		return salarioBruto;
	}
	
	public double calculaSalario() {
		return (getSalarioBruto() - super.getDesconto());
	}
	public void exibirDados() {
		System.out.println("O salario do professor "+ getNome() +" de matricula " + getMatricula() + " eh: " + calculaSalario());
		System.out.println("A idade do professor " + getNome() + " eh "+ getIdade());
	}
}
