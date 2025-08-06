package br.com.sudoku;

public class Tabuleiro {
    private final Celula[][] grid = new Celula[9][9];

    public Tabuleiro() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new Celula(0, false);
            }
        }
    }

    public void inicializarComArgumentos(String[] args) {
        for (String arg : args) {
            String[] partes = arg.split(";");
            String[] parteCoord = partes[0].split(",");
            String[] parteValor = partes[1].split(",");

            int linha = Integer.parseInt(parteCoord[0]);
            int coluna = Integer.parseInt(parteCoord[1]);
            int valor = Integer.parseInt(parteValor[0]);
            boolean fixo = Boolean.parseBoolean(parteValor[1]);

            if (linha >= 0 && linha < 9 && coluna >= 0 && coluna < 9) {
                grid[linha][coluna] = new Celula(valor, fixo);
            }
        }
    }

    public void exibir() {
        System.out.println("\n    0 1 2   3 4 5   6 7 8");
        System.out.println("  +-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            if (i == 3 || i == 6) {
                System.out.println("  |-------+-------+-------|");
            }
            System.out.print(i + " | ");
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j].getValor() == 0 ? ". " : grid[i][j].getValor() + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  +-------+-------+-------+");
    }

    public boolean fazerJogada(int linha, int coluna, int valor) {
        if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8 || valor < 1 || valor > 9) {
            System.out.println("Erro: Posição ou valor inválido. Use linhas/colunas de 0 a 8 e valores de 1 a 9.");
            return false;
        }
        if (grid[linha][coluna].isFixo()) {
            System.out.println("Erro: Você não pode alterar um número que já veio no tabuleiro, digite nas casa com (.)");
            return false;
        }
        if (!isJogadaValida(linha, coluna, valor)) {
            System.out.println("Erro: O número " + valor + " já existe na linha, coluna ou bloco 3x3.");
            return false;
        }

        grid[linha][coluna].setValor(valor);
        return true;
    }

    private boolean isJogadaValida(int linha, int coluna, int valor) {
        for (int i = 0; i < 9; i++) {
            if (grid[linha][i].getValor() == valor) return false;
            if (grid[i][coluna].getValor() == valor) return false;
        }

        int inicioLinhaBloco = linha - linha % 3;
        int inicioColunaBloco = coluna - coluna % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[inicioLinhaBloco + i][inicioColunaBloco + j].getValor() == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isResolvido() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j].getValor() == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}