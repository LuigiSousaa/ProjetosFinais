import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        // vetor das contas
        PessoaFisica contaPf[] = new PessoaFisica[19];
        boolean ligado = true;
        int decisao;
        int cont = 0;
        while (ligado) {
            int escolha;
            System.out.println("§=======================================§");
            System.out.println("|                                       |");
            System.out.println("|   Seja muito bem-vindo ao LugyBank!   |");
            System.out.println("|           Seu banco digital           |");
            System.out.println("|                                       |");
            System.out.println("§=======================================§");
            Thread.sleep(2500);

            escolha = Integer.parseInt(JOptionPane.showInputDialog("A seguir estão listados os nossos serviços:"
                    + "\n 1- Criar uma conta"
                    + "\n 2- Para fazer uma busca de conta"
                    + "\n 3- Sair"));
            for (int i = 0; i < 15; i++) {
                System.out.println("");
            }

            if (escolha == 1) {
                System.out.println("§=======================================§");
                System.out.println("|                                       |");
                System.out.println("|        Você entrou no processo        |");
                System.out.println("|          de criação de conta          |");
                System.out.println("|                                       |");
                System.out.println("§=======================================§");
                }
                decisao = Integer.parseInt(JOptionPane.showInputDialog("Aqui estão as opções para a criação da conta:"
                        + "\n 1- Pessoa física"
                        + "\n 2- Pessoa jurídica"));
                if (decisao == 1) {
                    for (int i = 0; i < 15; i++) {
                        System.out.println("");
                    System.out.println("§======================================§");
                    System.out.println("|                                      |");
                    System.out.println("|          Crição de conta do          |");
                    System.out.println("|         tipo 'Pessoa física'         |");
                    System.out.println("|                                      |");
                    System.out.println("§======================================§");
                    }
                }
                if (decisao == 2) {
                    System.out.println("§======================================§");
                    System.out.println("|                                      |");
                    System.out.println("|          Crição de conta do          |");
                    System.out.println("|        tipo 'Pessoa jurídica'        |");
                    System.out.println("|                                      |");
                    System.out.println("§======================================§");
                    for (int i = 0; i < 15; i++) {
                        System.out.println("");
                    }
                }
                ligado = false;
            }
            if (escolha == 2) {
                System.out.println("§=======================================§");
                System.out.println("|                                       |");
                System.out.println("|        Você entrou no buscador        |");
                System.out.println("|               de contas               |");
                System.out.println("|                                       |");
                System.out.println("§=======================================§");
                for (int i = 0; i < 15; i++) {
                    System.out.println("");
                }
            } else if (escolha == 3) {
                System.out.println("§========================================§");
                System.out.println("|                                        |");
                System.out.println("|             Até a próxima!             |");
                System.out.println("|                                        |");
                System.out.println("§========================================§");
                ligado = false;
            }
        }

    }
}