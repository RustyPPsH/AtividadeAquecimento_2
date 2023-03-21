package uni.osmar14032023;


public class CarroPasseio extends Veiculo {
    private String color;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
    }
    
    

    public CarroPasseio(String color, String modelo, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
