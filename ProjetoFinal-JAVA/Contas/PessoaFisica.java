/**
 * PessoaFisica
 */
public class PessoaFisica extends Conta {
    // atributos
    String nCPF;
    String email;

    // construtores
    public PessoaFisica() {
    }

    public PessoaFisica(String nCPF, String email) {
        this.nCPF = nCPF;
        this.email = email;
    }

    public PessoaFisica(String name, String nCPF, String email) {
        super(name);
        this.nCPF = nCPF;
        this.email = email;
    }

    public PessoaFisica(String name, int idConta, double saldo, String nCPF, String email) {
        super(name, idConta, saldo);
        this.nCPF = nCPF;
        this.email = email;
    }

    // gets and sets
    public String getnCPF() {
        return nCPF;
    }

    public void setnCPF(String nCPF) {
        this.nCPF = nCPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}