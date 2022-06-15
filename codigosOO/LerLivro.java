package codigosOO;

public class LerLivro {
	public static void main(String args[]) {
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		livro1.setLivroNome("O Jogo");
		livro1.setLivroAutor("Victor");
		livro1.setLivroEdicao("Primeira");
		livro1.setLivroEditora("Jogadora");
		livro1.setLivroAno(2022);
		
		livro2.setLivroAno(3030);
		
		System.out.println("O nome do autor eh: "+livro1.getLivroNome());
		System.out.println("O autor do livro eh: "+livro1.getLivroAutor());
		System.out.println("A edicao do livro eh: "+livro1.getLivroEdicao());
		System.out.println("A editora do livro eh: "+livro1.getLivroEditora());
		System.out.println("O ano do livro eh: "+livro1.getLivroAno()+"\n");
		
		System.out.println("O nome do autor eh: "+livro2.getLivroNome());
		System.out.println("O autor do livro eh: "+livro2.getLivroAutor());
		System.out.println("A edicao do livro eh: "+livro2.getLivroEdicao());
		System.out.println("A editora do livro eh: "+livro2.getLivroEditora());
		System.out.println("O ano do livro eh: "+livro2.getLivroAno()+"\n");
	}
}
