package carro;

public class Carro {
	private String marca;
	private String cor;
	private boolean motorEstado;
	private int rotacaoMotor = 0;
	
	//  Construtor
	public Carro(String marca, String cor) {
//		this.marca = marca;
//		this.cor = cor;
		this.motorEstado = true;
		this.rotacaoMotor = 1000;	
		setMarca(marca);
		setCor(cor);
	}
	public Carro(String marca, String cor, boolean motorEstado) {
//		this.marca = marca;
//		this.cor = cor;
//		this.motorEstado = motorEstado;
		setMarca(marca);
		setCor(cor);
		setMotorEstado(motorEstado);
		if(motorEstado == true)
			this.rotacaoMotor = 1000;
		else
			this.rotacaoMotor = 0;
	}
	public Carro(String marca, String cor, boolean motorEstado, int rotacaoMotor) {
//		this.marca = marca;
//		this.cor = cor;
//		this.motorEstado = motorEstado;
//		this.rotacaoMotor = rotacaoMotor;
		setMarca(marca);
		setCor(cor);
		setMotorEstado(motorEstado);
		setRotacaoMotor(rotacaoMotor);
		if(motorEstado == false)
			this.rotacaoMotor = 0;
		if(rotacaoMotor == 0)
			this.motorEstado = false;
	}
	
	//  getters e setters
	//  marca
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	//  cor
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	//  estado do motor
	public void setMotorEstado(boolean motorEstado) {
		this.motorEstado = motorEstado;
	}
	public boolean getMotorEstado() {
		return motorEstado;
	}
	//  rotacao do motor
	public void setRotacaoMotor(int rotacaoMotor) {
		this.rotacaoMotor = rotacaoMotor;
	}
	public int getRotacaoMotor() {
		return rotacaoMotor;	
	}
	
	//  metodos
	public void ligaMotor() {
		//motorEstado = true;
		setMotorEstado(true);
		rotacaoMotor = 1000;
		System.out.println("O motor foi ligado.");
	}
	
	public void desligaMotor() {
		setMotorEstado(false);
		rotacaoMotor = 0;
		System.out.println("O motor foi desligado.");
	}
	
	
	public void aceleraMotor() {
		if(motorEstado == true)	
			rotacaoMotor += 100;
			
	}
	public void desaceleraMotor() {
		if(motorEstado == true)
			rotacaoMotor -= 100;
	}

	//  exibir atributos
	public void mostraAtributos() {
		System.out.println("O carro tem a cor " + getCor() + " e eh da marca " + getMarca() + " a rotacao do motor esta em " + getRotacaoMotor() +".");
		if (motorEstado == true) {
			System.out.println("O motor ja esta ligado.");
		}
		else {
			System.out.println("O motor esta desligado.");
		}
	}
}
