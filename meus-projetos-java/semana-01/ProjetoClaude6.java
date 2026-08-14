import java.util.Locale;
import java.util.Scanner;

public class ProjetoClaude6 {
    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Calculadora de IMC
        System.out.println("Bem Vindo a Calculadora de IMC");
        Thread.sleep(750);

        String load = ("Calculando... ");
        int op;
        do {
            // Menu interativo
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma Opcao: ");
            op = sc.nextInt();

            // Entrada de dados/ peso,altura e nome
            if (op == 1) {
                Pessoa pessoa = new Pessoa();

                System.out.print("Nome: ");
                pessoa.nome = sc.next();

                System.out.print("Peso: ");
                pessoa.peso = sc.nextDouble();

                System.out.print("Altura: ");
                pessoa.altura = sc.nextDouble();

                for (int i = 0; i < load.length(); i++) {
                    System.out.print(load.charAt(i));
                    Thread.sleep(500);
                }

                pessoa.classificarIMC();
            }
            else if (op == 2) {
                System.out.println("Saindo...");
            }
            else {
                System.out.println("Operacao Invalida");
            }
        } while (op != 2);

        sc.close();
    }
}
