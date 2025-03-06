public class Media10Alunos {
    public double alunos;
    public double total;
    public double media;

    public Media10Alunos() {
        alunos = 0;
        total = 0;
        media = 0;
    }

    public void ImprimirMedia() {
        if (alunos > 0) {
            media = total / alunos;
            System.out.println("A média das notas da turma é: " + media);
            return;
        }
        System.out.println("A nota de nenhum aluno foi informada.");
    }

    public void AdicionarNota(int nota) {
        total += nota;
        alunos++;
    }
}
