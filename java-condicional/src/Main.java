import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int result = resultTest();
        if (result > 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Que pena, você foi reprovado.");
        }
    }
    static int resultTest() {
        return new Random().ints(0,11).findFirst().getAsInt();
    }
}