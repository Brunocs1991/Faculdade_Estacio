package cursoandroid.com.aulawebservice_2.model;

import android.graphics.Bitmap;

public class Flor {
    private int florId;
    private String nome;
    private String categoria;
    private String instrucoes;
    private double preco;
    private String fotoString;
    private Bitmap fotoBitmap;

    public int getFlorId() {
        return florId;
    }

    public void setFlorId(int florId) {
        this.florId = florId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFotoString() {
        return fotoString;
    }

    public void setFotoString(String fotoString) {
        this.fotoString = fotoString;
    }

    public Bitmap getFotoBitmap() {
        return fotoBitmap;
    }

    public void setFotoBitmap(Bitmap fotoBitmap) {
        this.fotoBitmap = fotoBitmap;
    }
}
