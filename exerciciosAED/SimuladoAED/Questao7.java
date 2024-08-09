package SimuladoAED;

public class Questao7 {

    private int [] vetor = new int[10];
    private int incio = 0;
    private int fim = 0;
    private int nIntens = 0;

    public void inserir(int valor) {
        if (nIntens < vetor.length){
            nIntens++;
            vetor[fim++] = valor;

            if (fim >= vetor.length){
                fim = 0;
            }

        } else{
            throw new RuntimeException("overflow");
        }
    }

    public int remover (){
        if (nIntens > 0){
            int valor = vetor[incio++];
            nIntens --;
            if (incio >= vetor.length) {
                incio = 0;

            }
            return valor;

        } else {
            throw new RuntimeException("underflow");
        }
    }
}
