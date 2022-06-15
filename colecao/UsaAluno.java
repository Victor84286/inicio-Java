package colecao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class UsaAluno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Aluno> arrayListAlunos = new ArrayList<>();
		
		for (int i = 0; i < 2; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome(sc.next());
			aluno.setMatricula(sc.nextInt());
			aluno.setNota1(sc.nextFloat());
			aluno.setNota2(sc.nextFloat());
			
			arrayListAlunos.add(aluno);
		}
		System.out.println(arrayListAlunos);
		
		sc.close();
	}
}
