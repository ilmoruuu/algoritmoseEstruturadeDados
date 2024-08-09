package RevisaoFinal.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3,41,52,26,38,57,9,49};

        int[] resultado = QuickSort.ordenar(vetor,0,7);

        System.out.println(Arrays.toString(resultado));
    }
}
