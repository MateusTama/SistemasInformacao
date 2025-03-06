package animais;

public class Gato {
    private int idade;
    private String nome;
    private String cor;
    private String raca; //readonly
    private String cor_dos_olhos;

    /*
    Atributos read-only: somente leitura -> método get;
    Atributos write-only: somente escrita -> método set;
    Atributos full: leitura/escrita -> ambos;
    */

    public Gato(String raca) {
        this.raca = raca;
    }

    //Read only
    public String getRaca() {
        return this.raca;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor_dos_olhos() {
        return cor_dos_olhos;
    }

    public void setCor_dos_olhos(String cor_dos_olhos) {
        this.cor_dos_olhos = cor_dos_olhos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                ", cor_dos_olhos='" + cor_dos_olhos + '\'' +
                '}';
    }

    public void miar() {
        System.out.println(nome + " está miando...");
    }
}
