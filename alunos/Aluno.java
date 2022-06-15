package alunos;

public class Aluno {
	//public static void main(String[] args) {
		String nome;
		float nota1, nota2;
		int matric;
		public Aluno() {
		
			this.nome = " ";
			this.nota1 = 0;
			this.nota2 = 0;
			this.matric = 0;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getNota1() {
			return nota1;
		}
		public void setNota1(float nota1) {
			this.nota1 = nota1;
		}
		public float getNota2() {
			return nota2;
		}
		public void setNota2(float nota2) {
			this.nota2 = nota2;
		}
		public int getMatric() {
			return matric;
		}
		public void setMatric(int matric) {
			this.matric = matric;
		}
		
		public float calculaMedia() {
			return ((getNota1() + getNota2())/2);
		}
		
	//}
}
