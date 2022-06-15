package colecao;

public class Carro {
	private String modelo, placa;
	private int ano, kms;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public void ehMaior() {
		if(getKms() >100)
			System.out.println("tem mais de 100 kms rodados");
		else
			System.out.println("tem menos de 100 kms rodados");
	}
	public void exibeKms() {
		System.out.println("A kilometragem eh: "+getKms());
	}
	@Override
	public String toString() {
		System.out.println( "Carro :\nmodelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", kms=" + kms);
		exibeKms();
		return "";
	}
	
}
