public class TestaAnimal {
    
    public static void main(String[] args) {
        Animal gato = new Animal("gato");
        Animal cachorro = new Animal("cachorro");
        Animal galinha = new Animal("galinha");
        Animal rato = new Animal("rato");
        Animal sapo = new Animal("sapo");
        Animal pato = new Animal("pato");

        gato.adicionaAmigo(cachorro);
        gato.adicionaAmigo(galinha);
        gato.adicionaAmigo(pato);
        gato.adicionaAmigo(sapo);
        gato.adicionaAmigo(rato);

        System.out.println("Amigos de gato: " + gato.amigosAnimal());
        System.out.println("Amigos de rato: " + rato.amigosAnimal());

        rato.removeAmigo(gato);

        System.out.println("Amigos de gato: " + gato.amigosAnimal());
        System.out.println("Amgos de rato: " + rato.amigosAnimal());
    }

}
