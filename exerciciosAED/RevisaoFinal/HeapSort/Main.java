package RevisaoFinal.HeapSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3,41,52,26,38,57,9,49};

        Heap heap = new Heap(vetor);

        HeapSort.ordenar(heap);

        System.out.println(Arrays.toString(heap.getValores()));
    }
}