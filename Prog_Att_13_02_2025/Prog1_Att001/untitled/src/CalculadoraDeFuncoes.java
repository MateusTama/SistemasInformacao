
public class CalculadoraDeFuncoes {
    public double x;
    public double y;
    public double resultado;
    Calculadora calc = new Calculadora();

    public CalculadoraDeFuncoes(double num1, double num2) {
        x = num1;
        y = num2;
    }

    public void ImpressaodeValores() {
        resultado = calc.multiplicar(x, x);
        resultado = resultado + calc.multiplicar(y, 2);
        resultado = calc.subtrair(resultado, 1);
        System.out.println("Resultado da função X2 + 2Y – 1 é: " + resultado);
        resultado = calc.multiplicar(x, x);
        resultado = calc.multiplicar(resultado, x);
        resultado = calc.subtrair(resultado, calc.dividir(2, 3));
        resultado = calc.somar(resultado, calc.multiplicar(5, calc.multiplicar(x, x)));
        System.out.println("Resultado da função x^3 - 2 / 3 + 5x^2 é:" + resultado);
    }



}
