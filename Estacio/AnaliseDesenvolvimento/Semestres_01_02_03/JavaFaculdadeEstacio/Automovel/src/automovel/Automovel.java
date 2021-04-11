package automovel;

public class Automovel {

    private String modelo;
    private String cor;
    private int ano;
    private boolean estadoMotor;

    public Automovel(String modelo, String cor, int ano, boolean estadoMotor) {
        super();
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.estadoMotor = estadoMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(boolean estadoMotor) {
        this.estadoMotor = estadoMotor;
    }

    public void ligarMotor() {
        this.estadoMotor = true;

    }

    public void desligaMotor() {
        this.estadoMotor = false;
    }

    @Override
    public String toString() {
        return "Automovel [" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", estadoMotor=" + estadoMotor + ']';
    }

}
