package RevisaoFinal.HeapSort;

public class HeapSort {

    public static void ordenar(Heap h) {
        int n = h.getTam();
        for (int i = n - 1; i > 0; i--) {
            h.trocar(0, i);
            h.decrementarTam();
            h.heapificar(0);
        }
    }
}
