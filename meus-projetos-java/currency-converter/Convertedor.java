import java.util.Locale;
import java.util.Scanner;

public class Convertedor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter conversor = new CurrencyConverter();

        System.out.println("Bem Vindos ao Convertedor");

        System.out.print("Qual o valor do dolar? ");
        double cotacaoDolar = sc.nextDouble();
        conversor.cotacaoDolar = cotacaoDolar;

        System.out.print("Quantos dolares vc deseja comprar? ");
        double valorEmDolar = sc.nextDouble();

        double resultado = conversor.converterParaReais(valorEmDolar);

        System.out.printf("Vc vai pagar em Reais: %.2f%n", resultado);

        sc.close();
    }
}
