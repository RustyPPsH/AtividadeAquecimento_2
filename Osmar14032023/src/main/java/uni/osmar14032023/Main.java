
package uni.osmar14032023;


public class Main {
        
     public static void main(String[] args) {
        
    
    
    Veiculo carro01 = new Veiculo();
    Caminhao caminhao01 = new Caminhao (0, 0, 0, 0, 0, 0);
    
    carro01.setPeso(1250);
    carro01.setVelocMax(60);
    
    caminhao01.setCargaMax(120);
    caminhao01.setComprimento(1200);

    
    System.out.println("Caminhao - Carga Maxima: " + caminhao01.getCargaMax() + "t");
    System.out.println("Carro - Peso: " + carro01.getPeso());
    


            }
}
