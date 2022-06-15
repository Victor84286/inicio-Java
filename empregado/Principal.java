package empregado;

public class Principal {
	public static void main(String args[]) {
		EmpComissionado empCom = new EmpComissionado("Ana", "Alves", "987654321-01", 30000, 0.03);
		
		EmpFixoComissionado empFixoCom = new EmpFixoComissionado("Roberto", "Silveira", "123456789-10", 20000, 0.02, 300);
		
		System.out.printf("Dados do Empregado Comissionado:\n");
		System.out.printf("%s %s \n", "Nome: ", empCom.getNome());
		System.out.printf("%s %s \n", "Sobrenome: ", empCom.getSobreNome());
		System.out.printf("%s %s \n", "CPF: ", empCom.getCpf());
		System.out.printf("%s %.2f \n", "Total de vendas: ", empCom.getTotalVendas());
		System.out.printf("%s %.2f \n", "Taxa de Comissao: ", empCom.getTaxaComissao());
		System.out.printf("%s %.2f \n\n\n", "Salario: ", empCom.salario());		
		
		System.out.printf("Dados do Empregado Comissionado com salario fixo:\n");
		System.out.printf("%s %s \n", "Nome: ", empFixoCom.getNome());
		System.out.printf("%s %s \n", "Sobrenome: ", empFixoCom.getSobreNome());
		System.out.printf("%s %s \n", "CPF: ", empFixoCom.getCpf());
		System.out.printf("%s %.2f \n", "Total de vendas: ", empFixoCom.getTotalVendas());
		System.out.printf("%s %.2f \n", "Taxa de Comissao: ", empFixoCom.getTaxaComissao());
		System.out.printf("%s %.2f \n", "Salario base: ", empFixoCom.getSalarioBase());
		System.out.printf("%s %.2f \n\n\n", "Salario: ", empFixoCom.salario());
		
	}
}