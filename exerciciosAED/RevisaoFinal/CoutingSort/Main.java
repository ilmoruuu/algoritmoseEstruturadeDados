package RevisaoFinal.CoutingSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3,41,52,26,38,57,9,49};

        int[] resultado = CoutingSort.ordenar(vetor);

        System.out.println(Arrays.toString(resultado));
    }
}
