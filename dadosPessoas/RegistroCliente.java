package dadosPessoas;

public class RegistroCliente extends DadosPessoais {
	
	private int limiteCredito, telefoneContato;
	private String localTrabalho, cpf;
	
	public RegistroCliente(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String cpf, int limiteCredito, int telefoneContato, String localTrabalho) {
		super(nome, endereco, bairro, cidade, estado, cep, telefone);
		setCpf(cpf);
		setLimiteCredito(limiteCredito);
		setTelefoneContato(telefoneContato);
		setLocalTrabalho(localTrabalho);
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	public String getCpf() {
		return cpf;
	}
	public int getLimiteCredito() {
		return limiteCredito;
	}
	public int getTelefoneContato() {
		return telefoneContato;
	}
	public String getLocalTrabalho() {
		return localTrabalho;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF: " + getCpf() + "Limite de credito: " + getLimiteCredito() + "local de trabalho: " + getLocalTrabalho() + "\nTelefone para contato: " + getTelefoneContato());
	}
}
