import java.util.Locale;
import java.util.Scanner;

public class Frangus {

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Criacao do Usuario
        Usuario usuario = new Usuario();
        usuario.nome = "Lauren";
        usuario.senha = "Lmodler57*";

        // Variaveis dos for
        String load = ("Registrando...");
        String sair = ("Saindo...");

        // Produtos
        Produto embalagem = new Produto();
        embalagem.nome = "Embalagens";
        embalagem.quantidade = 0;

        System.out.println("=========================================");
        System.out.println("    Login - Estoque Frangus e Polenta");
        System.out.println("=========================================");
        System.out.println();
        Thread.sleep(800);
        System.out.println("Digite Usuario e senha abaixo");
        System.out.print("Usuario: ");
        String nomeDigitado = sc.next();
        System.out.print("Senha: ");
        String senhaDigitada = sc.next();
        if (usuario.nome.equals(nomeDigitado) && usuario.senha.equals(senhaDigitada)) {
            System.out.println("Acesso Liberado");
        }
        else {
            System.out.println("Usuario ou Senha Invalido...");
        }
        int op;
        do {
            System.out.println("===========================================");
            System.out.println("  Sistema de Estoque - Fraguns e Polenta");
            System.out.println("===========================================");
            System.out.println("1 - Entrada");
            System.out.println("2 - Saida");
            System.out.println("3 - Ver Estoque");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Escolha uma Opcao: ");
            System.out.println();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Quantidade de Entrada: ");
                    int qtdEntrada = sc.nextInt();
                    embalagem.darEntrada(qtdEntrada);

                    for (int i = 0; i < load.length(); i++) {
                        System.out.print(load.charAt(i));
                        Thread.sleep(200);
                    }
                    System.out.println();
                    Thread.sleep(800);
                    System.out.println("Entrada Registrada");
                    break;
                case 2:
                    System.out.print("Quantidade de Saida: ");
                    int qtdSaida = sc.nextInt();
                    embalagem.darSaida(qtdSaida);
                    break;
                case 3:
                    System.out.println("Quantidade Atual no Estoque");
                    Thread.sleep(700);
                    System.out.println(embalagem);
                    break;
                case 4:
                    for (int i = 0; i < sair.length(); i++) {
                        System.out.print(sair.charAt(i));
                        Thread.sleep(400);
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (op != 4);

        sc.close();
    }
}
