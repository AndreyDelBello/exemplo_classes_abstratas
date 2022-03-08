public class Gato extends Mamifero {

    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "Amamenta";
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        return "MIAU!";
    }
    
    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    
}
