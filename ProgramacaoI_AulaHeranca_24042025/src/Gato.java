public class Gato extends Animais implements IGato {
    private String cor_dos_olhos;

    public Gato(String nome, String cor, String raca, int idade, String cor_dos_olhos) {
        super(nome, cor, raca, idade);
        this.cor_dos_olhos = cor_dos_olhos;
    }

    public void miar() {
        System.out.println(nome + " miando...");
    }

    public String getCor_dos_olhos() {
        return cor_dos_olhos;
    }

    public void setCor_dos_olhos(String cor_dos_olhos) {
        this.cor_dos_olhos = cor_dos_olhos;
    }

    @Override
    public void arranhar() {

    }

    @Override
    public void dormir() {

    }
}
