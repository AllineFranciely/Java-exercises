//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
                "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

        final int numeroVagas = 10;

        String[] vagas = new String[numeroVagas];

        int vagaAtual = 0;

        String inscrito = "Indefinido";
        String log;

        while (vagaAtual < numeroVagas) {
            inscrito = inscritos[vagaAtual];
            log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual += 1;
            System.out.println(log);
        }
    }
}