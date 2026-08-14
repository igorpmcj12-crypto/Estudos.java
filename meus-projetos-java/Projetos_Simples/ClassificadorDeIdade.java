import java.util.Locale;
import java.util.Scanner;

public class ClassificadorDeIdade {
    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Clasificador de idade

        System.out.println("Bem vindo ao clasificador de idades digite seu nome e sua idade abaixo");
        Thread.sleep(2000);

        int idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Crianca");
        }
        else if (idade < 18) {
            System.out.println("Adolecente");
        }
        else if (idade < 60) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }
    }
}
