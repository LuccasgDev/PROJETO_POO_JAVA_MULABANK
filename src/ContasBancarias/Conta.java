package ContasBancarias;

public class Conta {

      private Double saldo;
      private String numeroConta;
//    private Integer qtdContasCadastradas = 0;
//    private static final Integer qtdContasMinimas = 5;

    Conta(){

    }
    Conta(Double saldo, String numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;

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
