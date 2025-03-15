package ContasBancarias;
import java.util.List;
import java.util.ArrayList;

public class CadastroDeContas {

    private List<Conta> contas;
    private int capacidade = 10;

    public CadastroDeContas(){
        this.capacidade = 10;
        this.contas = new ArrayList<>(this.capacidade);
    }

    public CadastroDeContas(int capacidadeContru){
        if (capacidadeContru < 5) {
            this.capacidade = 5;
            System.out.println("A quantidade foi alterada para 5, que é o mínimo");
        } else {
            this.capacidade = capacidadeContru;
        }
        this.contas = new ArrayList<>(this.capacidade);
    }

    public boolean cadastrar(Conta conta){
        if (this.contas.size() < capacidade){
            this.contas.add(conta);
            return true;
        }
        return false;
    }

    public Conta procurar(int numeroConta){
        for(Conta conta : this.contas){
            if (this.contas.getNumero() == numeroConta){
                return conta;
            }
        }
        return  null;
    }

    public boolean excluir (int numeroConta){
        Conta conta = procurar(numeroConta);
        if (conta != null) {
            this.contas.remove(contas);

        }
        return false;
    }

    public int qtdCadastradas(){
        return this.contas.size();
    }

}
