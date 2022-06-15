package exemplos;

public class ExemploSwitch {
	public static void main(String[] args) {
		int tam;
		String valor = "java";
		tam = valor.length();
		switch(tam) {
		case 0: System.out.println("zero");break;
		case 1: System.out.println("um");break;
		case 2: System.out.println("dois");break;
		case 3: System.out.println("tres");break;
		case 4: System.out.println("quatro");break;
		case 5: System.out.println("cinco");break;
		case 6: System.out.println("seis");break;
		case 7: System.out.println("sete");break;
		case 8: System.out.println("oito");break;
		case 9: System.out.println("nove");break;
		default: System.out.println("Não reconhecido");
		}
	}
}
