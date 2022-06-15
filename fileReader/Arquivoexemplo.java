package fileReader;
import java.io.FileInputStream;
import java.io.IOException;


public class Arquivoexemplo {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("/Users/202203143387/Documents/Teste1.rtf");
			boolean eof = false;
			int cont = 0;
			
			while(!eof) {
				int entrada = file.read();
				if(entrada !=-1) {
					System.out.println(entrada + " ");
					cont++;
				}
				else { 
					eof = true;
				}
				file.close();
				System.out.println("\nBytes lidos: " + cont);
			}
		}
		catch(IOException exception) {
			System.out.println("Erro " + exception.toString());
		}
		
	}
}
