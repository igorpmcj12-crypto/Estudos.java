import java.util.Locale;
import java.util.Scanner;

public class ProjetoClaude5 {
    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Tabuada Simples
        String load = ("Calculando...");

        System.out.println("Tabuada Simples");
        Thread.sleep(500);

        System.out.println("Escolha qual tabuada vc quer saber");
        Thread.sleep(500);

        int numero = sc.nextInt();
        int contador = 1;

        for (int i = 0; i < load.length(); i++) {
            System.out.print(load.charAt(i));
            Thread.sleep(500);
        }

        while (contador <= 10) {
        System.out.println(numero + " x " + contador + " = " + (numero * contador));
        Thread.sleep(750);
        contador++;
        }
    }
}
