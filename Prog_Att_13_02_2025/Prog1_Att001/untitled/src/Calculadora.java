public class Calculadora {
    //Atributos
    public double num1;
    public double num2;
    public double resultado;

    //Construtor
    public Calculadora () {

    }

    //Ações
    public double somar (double n1, double n2) {
        num1 = n1;
        num2 = n2;
        resultado = n1 + n2;
        return resultado;
    }

    public double subtrair (double n1, double n2) {
        num1 = n1;
        num2 = n2;
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar (double n1, double n2) {
        num1 = n1;
        num2 = n2;
        resultado = n1 * n2;
        return resultado;
    }

    public double dividir (double n1, double n2) {
        num1 = n1;
        num2 = n2;
        resultado = n1 / n2;
        return resultado;
    }

}
