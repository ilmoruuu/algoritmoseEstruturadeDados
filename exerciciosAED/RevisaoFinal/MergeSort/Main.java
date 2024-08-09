package RevisaoFinal.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3,41,52,26,38,57,9,49};
        int[] vetorAuxiliar = new int[vetor.length];

        int[] resultadoUm = MergeSort.ordenar(vetor,0,7);
        int[] resultadoDois = MergeSortRecursivo.mergeSort(vetor,vetorAuxiliar,0,7);

        System.out.println(Arrays.toString(resultadoUm));
        System.out.println(Arrays.toString(resultadoDois));
    }
}
