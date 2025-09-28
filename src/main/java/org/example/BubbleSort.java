package org.example;

public class BubbleSort<T extends Comparable<T>> extends  OrdenacaoAbstract<T> {

    public void ordenar(){
        T[] info = getInfo();
        int i, j;
        int n = getInfo().length;

        for ( i = n -1; i > 1; i--) {
            for ( j = 0; j <= i-1; j++) {
                if (getInfo()[j].compareTo(getInfo()[j + 1]) > 0) {
                    trocar(j, j+1);
                }
            }
        }
    }
}
