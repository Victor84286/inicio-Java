package dadosPessoas;

public class RegistroFornecedor extends DadosPessoais {
	
	private String formaPagamento, inscricaoEstadual, representanteComercial, cnpj, limiteVendas;
	
	public RegistroFornecedor(String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone, String cnpj, String limiteVendas, String formaPagamento, String inscricaoEstadual, String representanteComercial) {
		super(nome, endereco, bairro, cidade, estado, cep, telefone);
		setCnpj(cnpj);
		setLimiteVendas(limiteVendas);
		setFormaPagamento(formaPagamento);
		setInscricaoEstadual(inscricaoEstadual);
		setRepresentanteComercial(representanteComercial);
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setLimiteVendas(String limiteVendas) {
		this.limiteVendas = limiteVendas;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public void setRepresentanteComercial(String representanteComercial) {
		this.representanteComercial = representanteComercial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public String getLimiteVendas() {
		return limiteVendas;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public String getRepresentanteComercial() {
		return representanteComercial;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("");
	}
}
