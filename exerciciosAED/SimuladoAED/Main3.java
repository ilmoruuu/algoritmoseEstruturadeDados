package SimuladoAED;

public class Main3 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int valor = 30;

        int resultado = Questao3.buscaBinaria(vetor, 0, vetor.length - 1, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
        } else {
            System.out.println("Valor não encontrado no vetor.");
        }
    }
}