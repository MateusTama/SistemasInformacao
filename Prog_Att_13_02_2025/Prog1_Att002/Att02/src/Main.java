import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        Media avg = new Media(n1, n2);
        avg.Aprovado();

        Media10Alunos mediaAlunos = new Media10Alunos();
        int nota;
        System.out.println("Digite a nota: ");
        nota = scanner.nextInt();
        while (nota != -1) {
            mediaAlunos.AdicionarNota(nota);
            System.out.println("Digite a nota: ");
            nota = scanner.nextInt();
        }
        mediaAlunos.ImprimirMedia();
    }

}
