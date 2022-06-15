package listaExercicio01;

public class Exec2 {
	
	public static void main(String srgs[]) {

		float salarioBase = 1500, grat = 5, impost = 7, salario_a_receber;
		
		salario_a_receber = salarioBase*(100 + grat)/100 - salarioBase*impost/100;
		
		System.out.println(salario_a_receber);
	}

}
