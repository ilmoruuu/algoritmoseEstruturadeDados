package RevisaoFinal.MergeSort;

public class MergeSortRecursivo {
    public static int[] mergeSort (int[] vetor, int[] vetorAuxiliar,int inicio,int fim){
        if(inicio>=fim){

            int metade = (inicio+fim)/2;
            mergeSort(vetor,vetorAuxiliar,inicio,metade);   //Esquerda//
            mergeSort(vetor,vetorAuxiliar,metade+1,fim);    //Direita//

            mesclar(vetor, vetorAuxiliar,inicio,metade,fim);

        }
        return vetor;
    }

    public static int[] mesclar(int[] vetor, int[] vetorAuxiliar,int inicio,int metade, int fim){
        for(int i = inicio; i <= fim; i++){
            vetorAuxiliar[i] = vetor[i];
        }

        int esquerda = inicio;
        int direita = metade+1;

        for(int i=inicio; i<=fim; i++){
            if(esquerda > metade) {
                vetor[i] = vetorAuxiliar[direita++];

            } else if (direita > fim) {
                vetor[i] = vetorAuxiliar[esquerda++];

            } else if (vetorAuxiliar[esquerda] < vetorAuxiliar[direita]) {
                vetor[i] = vetorAuxiliar[esquerda++];

            }else{
                vetor[i] = vetorAuxiliar[direita++];
            }
        }
        return vetor;
    }
}
