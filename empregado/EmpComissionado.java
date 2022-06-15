package empregado;

public class EmpComissionado {
	private String nome, sobreNome, cpf;
	private double totalVendas, taxaComissao;
	//nome, sobreNome, cpf, totalVendas, taxaComissao
	public EmpComissionado(String nome, String sobreNome, String cpf, double totalVendas, double taxaComissao) {
		setNome(nome);
		setSobreNome(sobreNome);
		setCpf(cpf);
		setTotalVendas(totalVendas);
		setTaxaComissao(taxaComissao);
	}
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	//getters
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public String getCpf() {
		return cpf;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	
	public double salario() {
		return getTaxaComissao() * getTotalVendas();
	}
}
