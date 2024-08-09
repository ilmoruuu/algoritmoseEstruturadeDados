package RevisaoFinal.MergeSort;

public class MergeSort {
    public static int[] ordenar(int[] valores, int p, int r) {
        if (p >= r) {
            return valores;
        }
        int q = (p + r) / 2;
        ordenar(valores, p, q);
        ordenar(valores, q + 1, r);
        merge(valores, p, q, r);
        return valores;
    }

    public static int[] merge(int[] valores, int p, int q, int r) {
        int nE = q - p + 1;
        int nD = r - q;
        int[] esquerda = new int[nE];
        int[] direita = new int[nD];

        for (int x = 0; x < nE; x++) {
            esquerda[x] = valores[p + x];
        }

        for (int y = 0; y < nD; y++) {
            direita[y] = valores[q + y + 1];
        }

        int i = 0;
        int j = 0;
        int k = p;
        while (i < nE && j < nD) {
            if (esquerda[i] < direita[j]) {
                valores[k++] = esquerda[i++];
            } else {
                valores[k++] = direita[j++];
            }
        }

        while (i < nE) {
            valores[k++] = esquerda[i++];
        }
        while (j < nD) {
            valores[k++] = direita[j++];
        }
        return esquerda;
    }

}
