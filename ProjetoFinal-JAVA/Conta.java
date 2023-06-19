
import javax.swing.JOptionPane;

/**
 * App
 */
public class Banco {

    public static void main(String[] args) throws InterruptedException {
        // vetor das contas
        PessoaFisica contaPf[] = new PessoaFisica[19];
        PessoaJuridica contaPj[] = new PessoaJuridica[19];
        // atributos
        int cont = 0;
        int escolha;
        boolean ligado = true;

        JOptionPane.showMessageDialog(null, "Seja muito bem-vindo ao LUGY BANK!");

        while (ligado) {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("A seguir estão listados os nossos serviços:"
                    + "\n 1- Criar uma conta"
                    + "\n 2- Para entrar no buscador de contas"
                    + "\n 3- Sair"));
            if (escolha == 1) {
                JOptionPane.showMessageDialog(null, "Você entrou no processo de criação de contas");

                int criarConta = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de conta deseja criar?" +
                        "\n 1- Pessoa física" +
                        "\n 2- Pessoa jurídica"));
                if (criarConta == 1) {
                    contaPf[cont] = new PessoaFisica();

                    contaPf[cont].setName(JOptionPane.showInputDialog("Digite seu nome"));
                    contaPf[cont].setnCPF(JOptionPane.showInputDialog("Digite su CPF"));
                    contaPf[cont].setEmail(JOptionPane.showInputDialog("Digite um email para contato"));
                    contaPf[cont].setIdConta(cont + 1000 + 1);

                    JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");

                    JOptionPane.showMessageDialog(null, "Estes são seus dados, " + contaPf[cont].getName() +
                            "\n Número da conta: " + contaPf[cont].getIdConta() +
                            "\n CPF: " + contaPf[cont].getnCPF() +
                            "\n Email para contato: " + contaPf[cont].getEmail() +
                            "\n Saldo: " + contaPf[cont].getSaldo());
                    cont++;
                }
                if (criarConta == 2) {
                    contaPj[cont] = new PessoaJuridica();

                    contaPj[cont].setName(JOptionPane.showInputDialog("Digite o nome da empresa"));
                    contaPj[cont].setnCNPJ(JOptionPane.showInputDialog("Digite o CNPJ da empresa"));
                    contaPj[cont].setEmail(JOptionPane.showInputDialog("Digite um email para contato"));
                    contaPj[cont].setIdConta(cont + 1000 + 1);

                    JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");

                    JOptionPane.showMessageDialog(null, "Estes são seus dados, " + contaPj[cont].getName() +
                            "\n Número da conta: " + contaPj[cont].getIdConta() +
                            "\n CNPJ: " + contaPj[cont].getnCNPJ() +
                            "\n Email para contato: " + contaPj[cont].getEmail() +
                            "\n Saldo: " + contaPj[cont].getSaldo());
                    cont++;
                }
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "Você entrou no buscador de contas");

                int buscaConta = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite o tipo de conta que deseja buscar" +
                                "\n 1- Pessoa física" +
                                "\n 2- Pessoa jurídica"));
                if (buscaConta == 1) {
                    // buscar a conta
                    int nBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                    int contaEscolhida = 0;
                    for (int i = 0; i < contaPf.length; i++) {
                        if (nBuscado == contaPf[i].getIdConta()) {
                            contaEscolhida = i;
                            JOptionPane.showMessageDialog(null, "Conta encontrada!");
                            JOptionPane.showMessageDialog(null, "Aqui estão os dados do usuário" +
                                    "\n Nome: " + contaPf[i].getName() +
                                    "\n Número da conta: " + contaPf[i].getIdConta() +
                                    "\n CPF: " + contaPf[i].getnCPF() +
                                    "\n Email para contato: " + contaPf[i].getEmail() +
                                    "\n Saldo: " + contaPf[i].getSaldo());

                            // gerenciar a conta
                            boolean gerenciarPF = true;
                            while (gerenciarPF) {
                                int acaoDesejada = Integer
                                        .parseInt(JOptionPane.showInputDialog("Escolha a ação desejada" +
                                                "\n 1- Saque" +
                                                "\n 2- Depósito" +
                                                "\n 3- Empréstimo"));
                                if (acaoDesejada == 1) {
                                    contaPf[i].saque(acaoDesejada);
                                } else if (acaoDesejada == 2) {
                                    contaPf[i].deposito(acaoDesejada);
                                } else if (acaoDesejada == 3) {
                                    contaPf[i].emprestimo(acaoDesejada);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                                }
                            }
                            break;
                        }
                    }

                } else if (buscaConta == 2) {
                    int nBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                    int contaEscolhida = 0;
                    for (int i = 0; i < contaPj.length; i++) {
                        if (nBuscado == contaPj[i].getIdConta()) {
                            contaEscolhida = i;
                            JOptionPane.showMessageDialog(null, "Conta encontrada!");
                            JOptionPane.showMessageDialog(null, "Aqui estão os dados do usuário" +
                                    "\n Nome: " + contaPj[i].getName() +
                                    "\n Número da conta: " + contaPj[i].getIdConta() +
                                    "\n CPF: " + contaPj[i].getnCNPJ() +
                                    "\n Email para contato: " + contaPj[i].getEmail() +
                                    "\n Saldo: " + contaPj[i].getSaldo());

                            // gerenciar a conta
                            boolean gerenciarPJ = true;
                            while (gerenciarPJ) {
                                int acaoDesejada = Integer
                                        .parseInt(JOptionPane.showInputDialog("Escolha a ação desejada" +
                                                "\n 1- Saque" +
                                                "\n 2- Depósito" +
                                                "\n 3- Empréstimo"));
                                if (acaoDesejada == 1) {
                                    contaPj[i].saque(acaoDesejada);
                                } else if (acaoDesejada == 2) {
                                    contaPj[i].deposito(acaoDesejada);
                                } else if (acaoDesejada == 3) {
                                    contaPj[i].emprestimo(acaoDesejada);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                                }
                            }
                            break;
                        }
                    }
                }
            } else if (escolha == 3) {
                ligado = false;
                JOptionPane.showMessageDialog(null, "Obrigado por nos escolher!" +
                        "\n Até a próxima!");
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma opção válida");
            }
        }
    }
}