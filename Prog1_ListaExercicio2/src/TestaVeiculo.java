import poo.Veiculo;

public class TestaVeiculo {
    public static void main(String[] args) {
        //Veiculo veiculo1, veiculo2 = new Veiculo();
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();

//        veiculo1.modelo = "porsche";
//        veiculo1.cor = "branco";
//        veiculo1.ano = 2007;

        veiculo1.setModelo("porsche");
        veiculo1.setCor("branco");
        veiculo1.setAno(2007);

        System.out.println("\nINFORMAÇÕES DO VEÍCULO 1:\n");
        veiculo1.exibe();

//        System.out.println("\tModelo: " + veiculo1.modelo);
//        System.out.println("\tCor: " + veiculo1.cor);
//        System.out.println("\tAno: " + veiculo1.ano);

//        veiculo2.modelo = "ferrari";
//        veiculo2.cor = "vermelho";
//        veiculo2.ano = 2010;

        veiculo2.setModelo("ferrari");
        veiculo2.setCor("vermelho");
        veiculo2.setAno(2010);

        System.out.println("\nINFORMAÇÕES DO VEÍCULO 2:\n");
        veiculo2.exibe();

//        System.out.println("\tModelo: " + veiculo2.modelo);
//        System.out.println("\tCor: " + veiculo2.cor);
//        System.out.println("\tAno: " + veiculo2.ano);
    }
}