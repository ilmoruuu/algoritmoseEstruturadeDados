package RevisaoFinal.QuickSort;

public class QuickSort {

    public static int[] ordenar(int[] valores, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particionar(valores, esquerda, direita);
            ordenar(valores, esquerda, pivo - 1);
            ordenar(valores, pivo + 1, direita);
        }
        return valores;
    }

    public static int particionar(int[] valores, int p, int r) {
        int x = valores[r];
        int i = p - 1;
        int temp;

        for (int j = p; j < r; j++) {
            if (valores[j] < x) {
                i++;
                temp = valores[i];
                valores[i] = valores[j];
                valores[j] = temp;
            }
        }

        temp = valores[i + 1];
        valores[i + 1] = valores[r];
        valores[r] = temp;

        return i + 1;
    }
}