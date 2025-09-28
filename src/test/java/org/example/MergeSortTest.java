package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void ordenar() {
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.setInfo(entrada);
        mergeSort.ordenar();

        assertArrayEquals(esperado, mergeSort.getInfo());
    }
}