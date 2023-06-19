import javax.swing.JOptionPane;

public abstract class Conta {
    // atributos
    String name;
    int idConta = 1000;
    double saldo = 0;

    // costrutores
    public Conta() {
    };

    public Conta(String name) {
        this.name = name;
    }

    public Conta(String name, int idConta, double saldo) {
        this.name = name;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    // gets and sets
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos próprios
    public void saque(int valor) {
        valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja sacar?"));
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Seu saque foi concluído!" + "\n Saldo: " + getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "É impossível sacar um valor maior do que há na conta");
        }
    }

    public void deposito(int valor) {
        valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Seu depósito foi concluído!" + "\n Saldo: " + getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível depositar um valor negativo");
        }
    }

    public void emprestimo(int valor) {
        valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja emprestar?"));
        if (valor <= 100000 && valor > 0) {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Seu empréstimo foi cocluído!" + "\n Saldo: " + getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Impossível sacar este valor");
        }
    }

}
