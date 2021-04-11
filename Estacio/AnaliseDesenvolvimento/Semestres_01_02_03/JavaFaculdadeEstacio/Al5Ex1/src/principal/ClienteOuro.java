package principal;

public class ClienteOuro extends Cliente {

    private double limiteEspecial;

    public ClienteOuro(String n, int c, double l) {
        super(n, c);
        limiteEspecial = l;
    }

    /**
     * @return the limiteEspecial
     */
    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "  " + "Conta: " + getNumConta() + " " +"Limite: "+ getLimiteEspecial();
    }

}
