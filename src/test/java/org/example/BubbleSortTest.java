package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void ordenar(){
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

        BubbleSort<Integer> bolha = new BubbleSort<>();
        bolha.setInfo(entrada);
        bolha.ordenar();

        assertArrayEquals(esperado, bolha.getInfo());
    }

}