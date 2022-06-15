package dadosPessoas;

public class DadosPessoais {
	
	private String nome, endereco, bairro, cidade, estado, cep, telefone;
	
	public DadosPessoais(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone) {
		setNome(nome);
		setEndereco(endereco);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setTelefone(telefone);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ getNome() + "\nEndereco: "+ getEndereco() + "\nBairro: " + getBairro() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nCEP: " + getCep() + "\nTelefone: "+getTelefone());
	}
}
