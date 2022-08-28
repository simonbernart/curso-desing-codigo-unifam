package oo_java.encapsulamento;

public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public String placa;
    public boolean ligado;

    public Carro(){
        ligado = false;
    }
    public void ligar(){
        ligado = true;
        System.out.println("O Veiculo ligou!");
  }

     public void desligar(){
        ligado = false;
        System.out.println("O veiculo desligou!");

  }

    public void acelerar(){
        if (!ligado){
            try{
                throw new Exception("O carro não pode acelerar sem estar ligado");

            }catch (Exception e) {
                e.printStackTrace();

            }// Erro: o carro está desligado
        }
        System.out.println("o carro foi acelerado");
    }
    


 public String getPlaca(){
    return placa;

}
public String setPlaca(String placa){
    return this.placa = placa;
}

}


