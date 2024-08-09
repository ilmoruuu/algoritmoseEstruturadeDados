package SimuladoAED;


public class Main7 extends Questao7 {
    public static void main(String[] args) {
        Questao7 fila = new Questao7();

        // Inserindo elementos na fila
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir(40);
        fila.inserir(50);

        // Removendo elementos da fila
        System.out.println("Removido: " + fila.remover());
        System.out.println("Removido: " + fila.remover());

        // Inserindo mais elementos na fila
        fila.inserir(60);
        fila.inserir(70);

        // Removendo mais elementos da fila
        System.out.println("Removido: " + fila.remover());
        System.out.println("Removido: " + fila.remover());
        System.out.println("Removido: " + fila.remover());
        System.out.println("Removido: " + fila.remover());

        // Tentando remover de uma fila vazia (vai lançar exceção)
        try {
            System.out.println("Removido: " + fila.remover());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}