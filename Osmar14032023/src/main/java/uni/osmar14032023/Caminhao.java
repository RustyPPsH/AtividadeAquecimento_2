package uni.osmar14032023;


public class Caminhao extends Veiculo{
    private int cargaMax;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
    }
    

    public Caminhao(int cargaMax, int alturaMax, int comprimento, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.cargaMax = cargaMax;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    
}
