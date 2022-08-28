package oo_java.abstracao;
 

// a classe abstrata não pode ser instanciada


public abstract class Veiculo {
	
    public String modelo;
	public String marca;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
		// o método abstrato: a classe Veiculo sabe que ela tem que acelerar, mas não sabe como fazer isso.
		//a responsabilidade passa a ser das classes filha.
	public abstract void acelerar();

}
