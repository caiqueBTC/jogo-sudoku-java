package br.com.sudoku;

import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.inicializarComArgumentos(args);

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Bem-vindo ao Sudoku de Terminal ---");

        while (!tabuleiro.isResolvido()) {
            tabuleiro.exibir();

           
            try {
                System.out.print("\nDigite a linha: ");
                int linha = scanner.nextInt();

                System.out.print("Digite a coluna: ");
                int coluna = scanner.nextInt();

                System.out.print("Digite o número (valor): ");
                int valor = scanner.nextInt();

                if (tabuleiro.fazerJogada(linha, coluna, valor)) {
                    System.out.println("Jogada realizada com sucesso!");
                }

            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine(); 
            }
           
        }

        scanner.close();
        System.out.println("\n=============================================");
        System.out.println(" PARABÉNS! Você resolveu o Sudoku! ");
        System.out.println("=============================================");
        tabuleiro.exibir();
    }
}