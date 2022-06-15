package professor;

public abstract class Professor {
	
	private String nome, matricula;
	private int idade, desconto;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public int getDesconto() {
		return desconto;
	}
	public int getIdade() {
		return idade;
	}
	
	public abstract double calculaSalario();
	
}
