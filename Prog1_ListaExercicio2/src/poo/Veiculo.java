package poo;

public class Veiculo {
//    public String modelo;
//    public String cor;
//    public int ano;

    private String modelo;
    private String cor;
    private int ano;

    public Veiculo() {

    }

    public void exibe() {
//        System.out.println("\tModelo: " + this.modelo);
//        System.out.println("\tCor: " + this.cor);
//        System.out.println("\tAno: " + this.ano);

        System.out.println("\tModelo: " + this.getModelo());
        System.out.println("\tCor: " + this.getCor());
        System.out.println("\tAno: " + this.getAno());
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
