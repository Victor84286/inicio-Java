package codigosOO;

public class Livro {
	private String livroNome;
	private String livroAutor;
	private String livroEdicao;
	private String livroEditora;
	private int livroAno =0;
	
	public Livro() {
		setLivroNome("desconhecido");
		setLivroAutor("desconhecido");
		setLivroEdicao("desconhecido");
		setLivroEditora("desconhecido");
		setLivroAno(0);
	}
	
	public Livro(String livroNome, String livroAutor, String livroEdicao, String livroEditora, int livroAno) {
		setLivroNome(livroNome);
		setLivroAutor(livroAutor);
		setLivroEdicao(livroEdicao);
		setLivroEditora(livroEditora);
		setLivroAno(livroAno);
	}
	
	public void setLivroNome(String livroNome){
		this.livroNome = livroNome;
	}
	public void setLivroAutor(String livroAutor){
		this.livroAutor= livroAutor;
	}
	public void setLivroEdicao(String livroEdicao){
		this.livroEdicao = livroEdicao;
	}
	public void setLivroEditora(String livroEditora){
		this.livroEditora= livroEditora;
	}
	public void setLivroAno(int livroAno){
		this.livroAno = livroAno;
	}
	
	public String getLivroNome(){
		return livroNome;
	}
	public String getLivroAutor() {
		return livroAutor;
	}
	public String getLivroEdicao() {
		return livroEdicao;
	}
	public String getLivroEditora() {
		return livroEditora;
	}
	public int getLivroAno() {
		return livroAno;
	}
}
