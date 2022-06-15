package colecao;

import java.util.ArrayList;
import java.util.Vector;

public class TestaArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Vector<Character> vetor = new Vector<Character>();
		
		lista.add(18); lista.add(20); lista.add(30); lista.add(22); lista.add(48);
		System.out.println("ArrayList: "+ lista);
		Object[]objeto = lista.toArray();
		System.out.println("\nfor each:");
		for(Integer i: lista) {
			System.out.println(i);
		}
		System.out.println("\nObjetos: ");
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(objeto[i]+" ");	
		}
		System.out.println( );
		System.out.println( );
			
		vetor.add('A'); vetor.add('C');vetor.add('D'); vetor.add(1, 'B');
		System.out.println("Vector: "+vetor);
		Object[] objeto2 = vetor.toArray();
		System.out.println("Objetos: ");
		for(int i = 0; i<vetor.size(); i++){
			System.out.println(objeto2[i]+" ");
		}
		System.out.println( );
	}
}
