package colecao;
import java.util.ArrayList;
public class TestaArrayList1 {
	public static void main(String[] args) {
		
		ArrayList <String> nome = new ArrayList<String>();
		nome.add("Ana"); nome.add("Joao"); nome.add("Maria"); nome.add("Pedro"); nome.add("Jose");
		
		ArrayList <Integer> idade = new ArrayList<Integer>();
		idade.add(18); idade.add(20); idade.add(30); idade.add(22); idade.add(48);
		
		for(int i  = 0; i<nome.size(); i++) {
			System.out.printf("Nome: %s \t Idade: %d\n", nome.get(i), idade.get(i));
		}
	}
}
