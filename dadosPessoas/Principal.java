package dadosPessoas;

public class Principal {
	public static void main(String args[]) {
		RegistroCliente cliente1 = new RegistroCliente("desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", 0, 0, "desconhecido");
		RegistroFornecedor fornecedor1 = new RegistroFornecedor("desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido", "desconhecido");
	
		cliente1.setNome("Victor");
		cliente1.setEndereco("Rua Salvador de Mesquita");
		cliente1.setBairro("Recreio");
		cliente1.setCidade("Rio de Janeiro");
		cliente1.setEstado("RJ");
		cliente1.setCep("22795316");
		cliente1.setTelefone("98841-4400");
		cliente1.setCpf("13447917784");
		cliente1.setLimiteCredito(600);
		cliente1.setTelefoneContato(988414400);
		cliente1.setLocalTrabalho("Sustentado pelos pais");
		
		fornecedor1.setNome("");
		fornecedor1.setEndereco("");
		fornecedor1.setBairro("");
		fornecedor1.setCidade("");
		fornecedor1.setEstado("");
		fornecedor1.setCep("");
		fornecedor1.setTelefone("");
		fornecedor1.setCnpj("");
		fornecedor1.setLimiteVendas("");
		fornecedor1.setFormaPagamento("");
		fornecedor1.setInscricaoEstadual("");
		fornecedor1.setRepresentanteComercial("");
		
		cliente1.exibirDados();
//		System.out.printf("%s %s \n", "O nome eh: ", cliente1.getNome());
//		System.out.printf("%s %s \n", "O endereco eh: ", cliente1.getEndereco());
//		System.out.printf("%s %s \n", "O bairro eh: ", cliente1.getBairro());
//		System.out.printf("%s %s \n", "A cidade eh: ", cliente1.getCidade());
//		System.out.printf("%s %s \n", "O estado eh: ", cliente1.getEstado());
//		System.out.printf("%s %s \n", "O cep eh: ", cliente1.getCep());
//		System.out.printf("%s %s \n", "O telefone eh: ", cliente1.getTelefone());
//		System.out.printf("%s %s \n", "O CPF eh: ", cliente1.getCpf());
//		System.out.printf("%s %d \n", "O limite de credito do cliente eh: ", cliente1.getLimiteCredito());
//		System.out.printf("%s %d \n", "O telefone para contato eh: ", cliente1.getTelefoneContato());
//		System.out.printf("%s %s \n\n\n", "O local de trabalho eh: ", cliente1.getLocalTrabalho());
		
		System.out.printf("\n\n%s %s \n", "O nome eh: ", fornecedor1.getNome());
		System.out.printf("%s %s \n", "O endereco eh: ", fornecedor1.getEndereco());
		System.out.printf("%s %s \n", "O bairro eh: ", fornecedor1.getBairro());
		System.out.printf("%s %s \n", "A cidade eh: ", fornecedor1.getCidade());
		System.out.printf("%s %s \n", "O estado eh: ", fornecedor1.getEstado());
		System.out.printf("%s %s \n", "O cep eh: ", fornecedor1.getCep());
		System.out.printf("%s %s \n", "O telefone eh: ", fornecedor1.getTelefone());
		System.out.printf("%s %s \n", "O CNPJ eh: ", fornecedor1.getCnpj());
		System.out.printf("%s %s \n", "O limite de vendas eh: ", fornecedor1.getLimiteVendas());
		System.out.printf("%s %s \n", "A forma de pagamento principal eh: ", fornecedor1.getFormaPagamento());
		System.out.printf("%s %s \n", "A inscricao estadual eh: ", fornecedor1.getInscricaoEstadual());
		System.out.printf("%s %s \n", "O representante comercial eh: ", fornecedor1.getRepresentanteComercial());
	}
}
