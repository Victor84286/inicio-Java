package fileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoExemplo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aquivo texto: ");
		String nome = sc.nextLine();
		
		System.out.println("\nConteudo do arquivo texto: ");
		try {
			FileReader arquivo = new FileReader("/Users/202203143387/Documents/arquivo/"+nome);
			BufferedReader lerArq = new BufferedReader(arquivo);
			
			String linha = lerArq.readLine();
			while(linha!=null) {
				System.out.println(linha);
				linha = lerArq.readLine();
			}
			arquivo.close();
			sc.close();
		}
		catch(IOException e) {
			System.out.println("Erro na abertura do arquivo: "+e.getMessage());
		}
		System.out.println();
	}
}
