public class Principal {
    public static void main(String[] args) {
        

        Papagaio p = new Papagaio();
        Aguia a = new Aguia();
        
        a.setNome("Filipina");
        System.out.print("Aguia: ");
        System.out.println(a.getNome());
        System.out.println(a.voar());
        System.out.println(a.nadar());

        p.setNome("Loro");
        System.out.print("Papagaio: ");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.nadar());

    }
    
}
