package mario;

public class Mario {

    private int velocidade;
    private int vidas;
    private String tamanho;

    public void correr() {
        velocidade = velocidade + 1;
    }

    public void parar() {
        velocidade = 0;
    }

    public void crescer() {
        if (tamanho.equals("Pequeno")) {
            tamanho = "Normal";
        } else {
            tamanho = "Grande";
        }
    }

    public void diminuir() {
        if (tamanho.equals("Grande")) {
            tamanho = "Normal";
        } else {
            tamanho = "Pequeno";
        }
    }
}
