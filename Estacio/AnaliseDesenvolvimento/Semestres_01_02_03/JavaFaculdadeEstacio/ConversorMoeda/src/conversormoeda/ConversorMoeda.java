package conversormoeda;

public final class ConversorMoeda {

    float moedareal;
    int operacao;
    float valorConv;

    public float getMoedareal() {
        return moedareal;
    }

    public void setMoedareal(float moedareal) {
        this.moedareal = moedareal;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public float getValorConv() {
        return valorConv;
    }

    public void setValorConv(float valorConv) {
        this.valorConv = valorConv;
    }

    public ConversorMoeda(float moedareal, int operacao) {
        this.moedareal = moedareal;
        this.operacao = operacao;

        switch (operacao) {
            case 1:
                setValorConv((float) (getMoedareal() * 3.93));
                break;
            case 2:
                setValorConv((float) (getMoedareal() * 4.43));
                break;
            case 3:
                setValorConv((float) (getMoedareal() * 20769.87));
                break;
        }

    }

    @Override
    public String toString() {
        return "Resultado: " + getValorConv();
    }
}
