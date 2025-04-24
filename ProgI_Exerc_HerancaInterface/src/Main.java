public class Main {
    public static void main(String[] args) {
        Maria maria = new Maria("Maria", "Rua Cunha", "Feminino", 28);

        //Imprimir as informações da classe Maria herdadas da classe Pessoa
        System.out.println("Nome:" + maria.getNome());
        System.out.println("Endereço:" + maria.getEndereco());
        System.out.println("Idade:" + maria.getIdade());
        System.out.println("Sexo:" + maria.getSexo());

        //Executar método da saudação da classe Maria
        System.out.println();
        maria.saudacao();

        //Executar os métodos andar e parar da interface IAcoesPessoa implementada na classe Maria
        System.out.println();
        maria.andar();
        maria.parar();
    }
}