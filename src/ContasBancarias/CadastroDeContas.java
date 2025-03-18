package ContasBancarias;
import java.util.List;
import java.util.ArrayList;

public class CadastroDeContas {

    private List<Conta> contas;
    private int capacidade = 10;

    public CadastroDeContas() {
        this.capacidade = 10;
        this.contas = new ArrayList<>(this.capacidade);
    }

    public CadastroDeContas(int capacidadeContru) {
        if (capacidadeContru < 5) {
            this.capacidade = 5;
            System.out.println("A capacidade foi alterada para 5, que é o mínimo.");
        } else {
            this.capacidade = capacidadeContru;
        }
        this.contas = new ArrayList<>(this.capacidade);
    }

    public boolean cadastrarConta(Conta conta) {
        if (this.contas.size() < 5) {
            System.out.println("Não é possível cadastrar novas contas, pois o número mínimo de 5 contas não foi atingido.");
            return false;
        } else if (this.contas.size() < capacidade) {
            this.contas.add(conta);
            return true;
        } else {
            System.out.println("Capacidade máxima de contas atingida.");
            return false;
        }
    }

    public void verificarQtdContas() {
        if (this.contas.size() < 5) {
            System.out.println("Não é possível continuar. O número de contas cadastradas é inferior a 5.");
        } else {
            System.out.println("O número de contas cadastradas é suficiente: " + this.contas.size());
        }
    }

    public void verificarContas() {
        if (this.contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
        } else {
            System.out.println("Contas cadastradas:");
            for (Conta conta : this.contas) {
                System.out.println("Número da Conta: " + conta.getNumeroConta());
            }
        }
    }

    public int qtdCadastradas() {
        return this.contas.size();
    }
}
