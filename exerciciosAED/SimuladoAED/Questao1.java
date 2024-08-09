package SimuladoAED;

public class Questao1 {

    public static int buscaLinear (int [] vetor, int valor){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor){
                return i;

            }
        }
        return -1;
    }
}
