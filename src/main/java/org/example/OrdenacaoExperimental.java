package org.example;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoExperimental {

    private static final int NUM_TESTES = 10;
    private static final int TAMANHO_ENTRADA = 10000;

    public static void main(String[] args) {

        long tempoBubble = 0;
        long tempoMerge = 0;
        long tempoQuick = 0;

        for (int i = 0; i < NUM_TESTES; i++) {
            Integer[] dados = gerarArrayAleatorio(TAMANHO_ENTRADA);

            // Bubble Sort
            BubbleSort<Integer> bubble = new BubbleSort<>();
            bubble.setInfo(Arrays.copyOf(dados, dados.length));
            long inicio = System.nanoTime();
            bubble.ordenar();
            long fim = System.nanoTime();
            tempoBubble += (fim - inicio);

            // Merge Sort
            MergeSort<Integer> merge = new MergeSort<>();
            merge.setInfo(Arrays.copyOf(dados, dados.length));
            inicio = System.nanoTime();
            merge.ordenar();
            fim = System.nanoTime();
            tempoMerge += (fim - inicio);

            // Quick Sort
            QuickSort<Integer> quick = new QuickSort<>();
            quick.setInfo(Arrays.copyOf(dados, dados.length));
            inicio = System.nanoTime();
            quick.ordenar();
            fim = System.nanoTime();
            tempoQuick += (fim - inicio);
        }

        double mediaBubble = tempoBubble / (NUM_TESTES * 1_000_000.0);
        double mediaMerge = tempoMerge / (NUM_TESTES * 1_000_000.0);
        double mediaQuick = tempoQuick / (NUM_TESTES * 1_000_000.0);

        System.out.printf("Tamanho da entrada: %d elementos\n", TAMANHO_ENTRADA);
        System.out.println("Número de testes por algoritmo: " + NUM_TESTES);
        System.out.printf("Tempo médio Bubble Sort: %.3f ms\n", mediaBubble);
        System.out.printf("Tempo médio Merge Sort:  %.3f ms\n", mediaMerge);
        System.out.printf("Tempo médio Quick Sort:  %.3f ms\n", mediaQuick);
    }

    private static Integer[] gerarArrayAleatorio(int tamanho) {
        Random rand = new Random();
        Integer[] array = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(100000);
        }
        return array;
    }
}

