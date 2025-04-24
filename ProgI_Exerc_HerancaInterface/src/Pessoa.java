abstract class Pessoa {
    private String nome;
    private String endereco;
    private String sexo;
    private int idade;

    public Pessoa(String nome, String endereco, String sexo, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println("Olá! Meu nome é " + this.nome + ".");
    }
}
