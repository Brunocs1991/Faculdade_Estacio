package principal;


public class Cliente {

    private String nome;
    private int numConta;

    public Cliente(String n) {
        this(n, 0);
    }

    public Cliente(String n, int c) {
        nome = n;
        numConta = c;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public int getNumConta() {
        return numConta;
    }

    @Override
    public String toString() {
       return "Nome:" + getNome() + "  " + "Conta: " + getNumConta();
    }

}
