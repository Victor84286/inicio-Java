package colecao;
import java.util.Stack;

public class TestaObject2 {
	public static void main(String[] args) {
		 
		int valor;
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		pilha.push(10);
		pilha.push(70);
		pilha.push(50);
		pilha.push(80);
		pilha.push(100);
		
		valor = pilha.pop();
		System.out.println("Objeto Pilha: " + valor);		
		valor = pilha.pop();
		System.out.println("Objeto Pilha: " + valor);		
		valor = pilha.pop();
		System.out.println("Objeto Pilha: " + valor);
	}
}
