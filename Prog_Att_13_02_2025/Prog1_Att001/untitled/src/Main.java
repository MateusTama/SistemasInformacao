import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        CalculadoraDeFuncoes calcFunc = new CalculadoraDeFuncoes(n1, n2);
        calcFunc.ImpressaodeValores();

    }

}
