/**
 * PessoaJuridica
 */
public class PessoaJuridica extends Conta {
    // atributos
    String nCNPJ;
    String email;

    // construtor
    public PessoaJuridica() {
    };

    public PessoaJuridica(String name, int idConta, double saldo, String nCNPJ) {
        super(name, idConta, saldo);
        this.nCNPJ = nCNPJ;
    }

    // getters and setters
    public String getnCNPJ() {
        return nCNPJ;
    }

    public void setnCNPJ(String nCNPJ) {
        this.nCNPJ = nCNPJ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
