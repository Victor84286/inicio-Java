package fileReader;
import java.io.File;
import java.util.Scanner;

public class ArquivoExemplo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome de um arquivo ou diretorio:");
		String nome = sc.nextLine();
		
		File arquivo = new File(nome);
		System.out.println(arquivo.getAbsolutePath());
		
		if(arquivo.exists()) {
			if(arquivo.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n", arquivo.getName(), arquivo.length());
				
			}
			else {
				System.out.println("\nConteudo do diretorio:\n");
				String diretorio [ ] = arquivo.list();
				for(String item: diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		}
		else
			System.out.println("Erro: arquivo ou diretorio informado nao existe!\n");
		sc.close();
	}
}
