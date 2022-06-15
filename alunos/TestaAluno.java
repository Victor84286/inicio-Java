package alunos;
import java.util.Scanner;

public class TestaAluno {
	public static void main(String[] args) {
		
		
		Aluno[ ] alunos = new Aluno[10];
		
		for(int i = 0; i< alunos.length; i++) {
			Scanner sc = new Scanner(System.in);
			Aluno aluno = new Aluno();
			System.out.println("Escreva o nome do aluno");
			aluno.setNome(sc.nextLine());
			System.out.println("Escreva a matricula do aluno");
			aluno.setMatric(sc.nextInt());
			System.out.println("Escreva a primeira nota");
			aluno.setNota1(sc.nextFloat());
			System.out.println("Escreva a segunda nota");
			aluno.setNota2(sc.nextFloat());
			alunos[i] = aluno;
			sc.close();
		}
		
		for(int i = 0; i< alunos.length; i++) {
			Aluno aluno = alunos[i];
			
			System.out.println("O nome do aluno eh: " + aluno.getNome() + "\nA matricula eh: " + aluno.getMatric() + "\nA primeira nota do aluno foi: " + aluno.getNota1() + "\nA segunda nota foi: " + aluno.getNota2() + "\nA media foi: " + aluno.calculaMedia());
		}
  	}
}
