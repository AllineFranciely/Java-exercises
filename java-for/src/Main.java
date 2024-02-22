//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] alunos = new String[] {"João", "Aline", "Marcos", "Priscila"};
        String log;

        int totalAlunos= alunos.length;

        log = "A lista de chamadas possui " + totalAlunos + "alunos \n";

        int matricula;

        for (int i = 0; i < totalAlunos; i++) {
            matricula = i + 1;
            log = "Matrícula: " + matricula + " Aluno: " + alunos[i] + "\n";
            System.out.println(log);
        }
    }
}