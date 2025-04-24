public class Maria extends Pessoa implements IAcoesPessoa {
    public Maria(String nome, String endereco, String sexo, int idade) {
        super(nome, endereco, sexo, idade);
    }

    @Override
    public void andar() {
        System.out.println("Estou andando.");
    }

    @Override
    public void parar() {
        System.out.println("Parei de andar.");
    }
}
