package fileReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArquivoExemplo2 {
	public static void main(String[] args) {
		int dados[ ] = { 71, 73, 70, 56, 57, 97, 13, 0, 12, 0, 145, 0, 0, 255, 255
				, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 44, 0, 0, 0, 0, 13, 0, 12
				, 0, 0, 2, 38, 132, 45, 121, 11, 25, 175, 150, 120, 20, 162, 132
				, 51, 110, 106, 239, 22, 8, 160, 56, 137, 96, 72, 77, 33, 130, 86
				, 37, 219, 182, 230, 137, 89, 82, 181, 50, 220, 103, 20, 0, 59 };
		
		try {
			FileOutputStream file = new FileOutputStream("/Users/202203143387/Downloads/Teste2.rtf");
			for(int i =0;i<dados.length; i++) {
				file.write(dados[i]);
			}
			file.close();
			System.out.println("Dados gravados com sucesso!");
		}catch(IOException exception) {
			System.out.println("Erro " + exception.toString());
		}
	}
}
