import animais.Gato;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Siames");
        gato1.setNome("Garfield");
        gato1.miar();
        System.out.println("Raça: " + gato1.getRaca());
        System.out.println(gato1.toString());
    }
}