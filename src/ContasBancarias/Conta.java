package ContasBancarias;

public class Conta {

    private Double saldo;
    private String numeroConta;

    Conta() {
    }

    Conta(Double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    Conta(int numeroConta) {
        this.numeroConta = String.valueOf(numeroConta);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
