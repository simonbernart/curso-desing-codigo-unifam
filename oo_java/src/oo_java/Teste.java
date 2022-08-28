package oo_java;


import oo_java.abstracao.Bicicleta;
import oo_java.abstracao.Carro;



public class Teste {
  public static void main(String args[]){
    		Carro gol = new Carro();
  		    gol.modelo = "Gol";
  	//  	    gol.marca = "Volkswagen";
   //
    //		Carro linea = new Carro();
    //		linea.marca = "Volkswagen";
    //
    //		gol.ligar();
    //	    gol.desligar();
    //		linea.ligar();
    //		linea.desligar();
    
    //    // #### ENCAPSULAMENTO ###
        
    //		Carro fusion = new Carro();
    //		fusion.modelo = "Gol";
    //		fusion.marca = "Volkswagen";
    //		fusion.setPlaca("XTPO-1983");
    //		//gol.acelerar(); //Se essa linha for descomentada, o código gerará um erro, pois estamos tentando acelerar um carro desligado
    //		gol.ligar();
    //		System.out.println(gol.ligado); // Vai imprimir "true", pois o método ligar() foi chamado
    //		gol.ligado = true; // Atributo que define se o carro está ligado ou não alterado "na mão"
    //		fusion.ligar();
    //		fusion.acelerar();
    //		fusion.desligar();
    //		System.out.println(gol.ligado); // Vai imprimir "false", pois o método desligar() foi chamado
    //
    //
    //    // #### HERANÇA ###
    //    
    		Bicicleta bicicleta = new Bicicleta();
    
    		bicicleta.setModelo("Monark");
    
    		System.out.println(bicicleta.getModelo());
    
    		bicicleta.acelerar();
        
      
        // #### ABSTRACAO ###
        
    		Carro carro = new Carro();
    
    		carro.setModelo("Sandero");
    
    		System.out.println(carro.getModelo());
    
    		carro.acelerar();		
        
        
        // #### POLIMORFISMO ###
        
    //		Veiculo carro = new Carro();
    //
    //		carro.setModelo("Sandero");
    //		System.out.println(carro.getModelo());
    //		carro.acelerar();		
    //
    //	   Veiculo bicicleta = new Bicicleta();
    //		bicicleta.setModelo("Sandero"); 	
    //       	bicicleta.acelerar();	
    //           System.out.println(bicicleta.getModelo());
        
  }
}
