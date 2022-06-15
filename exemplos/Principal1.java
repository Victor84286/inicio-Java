package exemplos;

public class Principal1 {
	public static void main(String argv[]) {
		
		int script = 6, atuacao = 9, direcao = 8;
		
		System.out.print("A pontuacao do filme é ");
		Filme3.pontuarFilme(script, atuacao, direcao);
	
		System.out.print("A pontuacao do filme do James Bond é ");
		System.out.println(JamesBondFilme.pontuarFilme(script, atuacao, direcao));
	}
}
