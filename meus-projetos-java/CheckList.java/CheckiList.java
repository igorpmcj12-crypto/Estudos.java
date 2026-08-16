
import java.util.Locale;
import java.util.Scanner;

public class List {

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Cores
        String VERDE = "\u001B[32m";
        String AMARELO = "\u001B[33m";
        String CIANO = "\u001B[36m";
        String VERMELHO = "\u001B[31m";
        String RESET = "\u001B[0m";

        // Variaveis
        int op;
        Tarefa[] tarefa = new Tarefa[20]; // Arrays com espaço de 20
        int quantidadeTarefas = 0;

        // Interface
        do {
            System.out.println();
            System.out.println(CIANO + "=========================================" + RESET);
            System.out.println(CIANO + "           Bem Vindo ao CheckList         " + RESET);
            System.out.println(CIANO + "=========================================" + RESET);
            System.out.println();
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Ver Tarefas");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Escolha uma das opcoes: ");
            op = sc.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    sc.nextLine(); // limpa o "Enter" que sobrou do nextInt() anterior
                    System.out.print("Descricao da Tarefa: ");
                    tarefa[quantidadeTarefas] = new Tarefa();
                    tarefa[quantidadeTarefas].descricao = sc.nextLine(); // le a linha inteira
                    tarefa[quantidadeTarefas].concluida = false;
                    quantidadeTarefas++;
                    System.out.println(VERDE + "Tarefa adicionada com sucesso!" + RESET);
                    break;
                case 2:
                    if (quantidadeTarefas == 0) {
                        System.out.println(AMARELO + "Nenhuma tarefa cadastrada ainda." + RESET);
                    } else {
                        System.out.println(CIANO + "----- Suas Tarefas -----" + RESET);
                        for (int i = 0; i < quantidadeTarefas; i++) {
                            String status = tarefa[i].concluida ? (VERDE + "[Concluida]" + RESET) : (AMARELO + "[Pendente]" + RESET);
                            System.out.println((i + 1) + " - " + tarefa[i].descricao + " " + status);
                        }
                    }
                    break;

                case 3:
                    if (quantidadeTarefas == 0) {
                        System.out.println(AMARELO + "Nenhuma tarefa cadastrada ainda." + RESET);
                    } else {
                        System.out.println(CIANO + "----- Suas Tarefas -----" + RESET);
                        for (int i = 0; i < quantidadeTarefas; i++) {
                            String status = tarefa[i].concluida ? (VERDE + "[Concluida]" + RESET) : (AMARELO + "[Pendente]" + RESET);
                            System.out.println((i + 1) + " - " + tarefa[i].descricao + " " + status);
                        }

                        System.out.println();
                        System.out.print("Qual tarefa deseja concluir? (numero): ");
                        int numeroEscolhido = sc.nextInt();
                        int posicao = numeroEscolhido - 1;

                        if (posicao >= 0 && posicao < quantidadeTarefas) {
                            tarefa[posicao].concluida = true;
                            System.out.println(VERDE + "Tarefa concluida!" + RESET);
                        } else {
                            System.out.println(VERMELHO + "Numero invalido." + RESET);
                        }
                    }
                    break;

                case 4:
                    System.out.println(CIANO + "Saindo... Ate a proxima!" + RESET);
                    break;

                default:
                    System.out.println(VERMELHO + "Opcao invalida" + RESET);
            }

        } while (op != 4);

        sc.close();
    }
}
