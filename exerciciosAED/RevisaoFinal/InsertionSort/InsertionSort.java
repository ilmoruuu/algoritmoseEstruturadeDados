package RevisaoFinal.InsertionSort;

public class InsertionSort {

    public static int[] insertionSort(int[] valores){
        int chave, j;

        for (int i = 1; i < valores.length; i++){
            chave = valores[i];
            j = i-1;

            while (j>=0 && valores[j] > chave){
                valores[j+1] = valores[j];
                j--;
            }

            valores [j+1] = chave;
        }
        return valores;
    }
}
