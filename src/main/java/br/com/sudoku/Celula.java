package br.com.sudoku;

public class Celula {
    private int valor;
    private final boolean fixo;

    public Celula(int valor, boolean fixo) {
        this.valor = valor;
        this.fixo = fixo;
    }

    public int getValor() {
        return valor;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}