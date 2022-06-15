package fileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArquivoExemplo4 {
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		int num;
		
		System.out.println("Informe o numero para tabuada: ");
		num = sc.nextInt();
		
		FileWriter arquivo = new FileWriter("/Users/202203143387/Documents/arquivo/Tabuada.txt");
		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		gravaArquivo.printf("***** Resultado da tabuada ******\n");
		for(int i = 0; i<=10; i++) {
			gravaArquivo.printf(" %d * %d = %d \n", i, num, (i*num));
		}
		gravaArquivo.printf("********************************");
		
		arquivo.close();
		gravaArquivo.close();
		System.out.println("\nTabuada do " + num + " gravada com sucesso em User/202203143387/Documents/arquivo/Tabuada.rtf");
		sc.close();
	}
}
