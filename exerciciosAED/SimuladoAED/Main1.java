package SimuladoAED;

public class Main1 {
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50};
        int valor = 30;

        int resultado = Questao1.buscaLinear(vetor, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
        } else {
            System.out.println("Valor não encontrado no vetor.");
        }
    }
}