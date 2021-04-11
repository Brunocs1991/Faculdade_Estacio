package Empresa;
// classe abstrata empregado

public abstract class Empregado {

    private String nome;
    private String familia;

    public Empregado(String n, String f) {
        nome = n;
        familia = f;
    }

    public String getNome() {
        return nome;
    }

    public String getFamilia() {
        return familia;
    }

    @Override
    public String toString() {
        return nome + ' ' + familia;
    }

    public abstract double ganha();

}
