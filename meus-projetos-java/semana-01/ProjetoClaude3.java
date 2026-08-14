import java.util.Locale;
import java.util.Scanner;

public class ProjetoClaude3 {
    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Calculadora

        System.out.println("Calculadora Simples");

        Thread.sleep(1000);

        System.out.println("Escolha 2 numeros inteiros");

        String load = ("Carregando...");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = (numero1 + numero2);
        int sub = (numero1 - numero2);
        double div = ((double)numero1 / numero2);
        int mult = (numero1 * numero2);

        Thread.sleep(500);

        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Divisao");
        System.out.println("4 - Multiplicacao");

        Thread.sleep(1000);

        System.out.println("Escolha a operacao de acordo com o numero");

        int ope = sc.nextInt();

        for (int i = 0; i < load.length(); i++) {
            System.out.print(load.charAt(i));
            Thread.sleep(500);
        }
        switch (ope) {
            case 1:
                System.out.println("Resultado:" + soma);
                break;
            case 2:
                System.out.println("Resultado:" + sub);
                break;
            case 3:
                if (numero2 == 0) {
                System.out.println("Nao pode ser dividido por 0");
                } else {
                    System.out.printf("Resultado: %.2f%n", div);
                }
                break;
            case 4:
                System.out.println("Resultado:" + mult);
                break;
            default:
                System.out.println("Operacao invalida");

        }
    }
}
