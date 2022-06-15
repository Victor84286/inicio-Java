package carro;

public class UsaCarro {
	public static void main(String args[]) {
																																																									
	Carro meuCarro = new Carro("Palio", "azul");
	Carro outroCarro = new Carro("Gol", "prata", false);
	Carro terceiroCarro = new Carro("Jeep", "marrom", true, 2000);
	
	meuCarro.mostraAtributos();
	outroCarro.mostraAtributos();
	terceiroCarro.mostraAtributos();

//	meuCarro.marca = "ferrari";
//	meuCarro.cor = "varmelha";
//	meuCarro.ligaMotor();
//	
//	meuCarro.desligaMotor();
//	meuCarro.mostraAtributos();
//	
//	
//	outroCarro.marca = "Gol";
//	outroCarro.cor = "prata";
//	
//	outroCarro.ligaMotor();
//	outroCarro.mostraAtributos();
//	outroCarro.aceleraMotor();
//	outroCarro.mostraAtributos();
//	outroCarro.desligaMotor();
//	outroCarro.mostraAtributos();
//	
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	outroCarro.aceleraMotor();
//	
	
	}
}
