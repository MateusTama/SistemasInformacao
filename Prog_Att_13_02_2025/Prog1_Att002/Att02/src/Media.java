
public class Media {
    public double x;
    public double y;
    public double media;

    public Media(double n1, double n2) {
        x = n1;
        y = n2;
        media = (x + y) / 2;
    }

    public void Aprovado() {
        if (media >= 7) {
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");
    }
}
