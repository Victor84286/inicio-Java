package empregado;

public class EmpFixoComissionado extends EmpComissionado {

	private double salarioBase;
	
	public EmpFixoComissionado(String nome, String sobreNome, String cpf, double totalVendas, double taxaComissao, double salarioBase) {
		super(nome, sobreNome, cpf, totalVendas, taxaComissao);
		setSalarioBase(salarioBase);
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double salario() {
		return getSalarioBase() + super.salario();
	}
}
