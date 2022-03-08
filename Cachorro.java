public class Cachorro extends Mamifero {

    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "Amamenta";
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        return "AU AU AU";
    }

    private String raça;
    private String tamanho;

    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    
    
    
}
