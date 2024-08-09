package SimuladoAED;

public class Questao3 {

    public static int buscaBinaria (int[] vetor, int inicio, int fim, int valor){

        if (inicio > fim){
            return -1;
        }

        int meio = (inicio+fim)/2;

        if (vetor [meio] == valor){
            return meio;

        } else if (valor > vetor[meio]){
            return buscaBinaria(vetor, meio+1,fim,valor);

        } else {
            return buscaBinaria(vetor, inicio, meio-1, valor);

        }
    }
}
