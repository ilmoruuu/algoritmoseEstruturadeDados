package RevisaoFinal.CoutingSort;

import java.util.Arrays;

public class CoutingSort {

    public static int[] ordenar(int[] ent) {
        int n = ent.length;
        int max = Arrays.stream(ent).max().getAsInt();
        int[] ret = new int[n];
        int[] cont = new int[max + 1];
        //no algoritmo original deveríamos inicializar o vetor cont
        //em java não é necessário

        //contagem da quantidade de vezes que um elemento em ent aparece
        for (int i = 0; i < n; i++) {
            cont[ent[i]] = cont[ent[i]] + 1;
        }

        //cont[i] conterá a quantidade de elementos menores ou iguais a i
        for (int i = 1; i <= max; i++) {
            cont[i] = cont[i] + cont[i - 1];
        }

        //posicionar o elemento ent[j] em ret de acordo com a contagem
        //de elementos menores que ent[j]
        for (int j = n - 1; j >= 0; j--) {
            ret[cont[ent[j]] - 1] = ent[j];
            cont[ent[j]] = cont[ent[j]] - 1;
        }

        return ret;
    }

}