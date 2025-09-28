package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void ordenar() {
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.setInfo(entrada);
        quickSort.ordenar();

        assertArrayEquals(esperado, quickSort.getInfo());
    }
}