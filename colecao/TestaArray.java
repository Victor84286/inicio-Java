package colecao;
import java.util.Arrays;

public class TestaArray {
	public static void main(String[] args) {
		int[] vetor= {60,30,50,70,20,40,10};
		int chaveProcura, indice;
		System.out.println("Numero de elementos do vetor: "+vetor.length);
		
		System.out.println("Vetor original: "+ Arrays.toString(vetor));
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado: "+ Arrays.toString(vetor));
		chaveProcura = 30;
		indice = Arrays.binarySearch(vetor, chaveProcura);
		System.out.println("chave: "+ chaveProcura);
		System.out.println("Índice do elemento chave "+ indice);
//		  int[][] cebola = new int[5][4];
//		  
//		  for (int i = 0; i < cebola.length; i++) {
//			  for (int j = 0; j < cebola[i].length; j++) {
//				  cebola[i][j] =
//			  }
//		  }
		  
	}

}
