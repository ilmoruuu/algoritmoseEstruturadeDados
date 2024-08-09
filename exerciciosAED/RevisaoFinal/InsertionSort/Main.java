package RevisaoFinal.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {7,0,9,3,1,4,6};

        int[] resultado = InsertionSort.insertionSort(vetor);

        System.out.println(Arrays.toString(resultado));
    }
}
