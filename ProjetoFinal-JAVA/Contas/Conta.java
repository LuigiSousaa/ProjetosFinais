public abstract class  Conta {
    // atributos
    String name;
    int idConta;
    double saldo;

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
    
}
