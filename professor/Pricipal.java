package professor;

public class Pricipal {
	public static void main(String args[]) {
		
		ProfessorDedicado professorD = new ProfessorDedicado();
		ProfessorHorista professorH = new ProfessorHorista();
	
		professorD.setNome("Victor");
		professorD.setMatricula("12345");
		professorD.setIdade(19);
		professorD.setDesconto(1000);
		professorD.setSalarioBruto(10000);
		
		professorH.setNome("Jean");
		professorH.setMatricula("54321");
		professorH.setIdade(23);
		professorH.setDesconto(1000);
		professorH.setValorHora(200);
		professorH.setHorasTrabalhadas(50);
		
		professorD.exibirDados();
		//System.out.println("O salario do professor "+ professorD.getNome() +" de matricula " + professorD.getMatricula() + " eh: " + professorD.calculaSalario());
		System.out.println("O salario do professor "+ professorH.getNome() +" de matricula " + professorH.getMatricula() + " eh: " + professorH.calculaSalario());
	}
}
