package RevisaoFinal.HeapSort;

import java.util.Arrays;

public class Heap {

    private int[] valores;
    private int tam;

    public Heap(int[] valores) {
        this.valores = Arrays.stream(valores).toArray();
        this.tam = valores.length;
        construirHeap();
    }

    public void construirHeap() {
        for (int i = this.tam / 2; i >= 0; i--) {
            heapificar(i);
        }
    }

    public void heapificar(int i) {
        int e = esquerda(i);
        int d = direita(i);
        int maior;

        if (e < this.tam && this.valores[e] > this.valores[i]) {
            maior = e;
        } else {
            maior = i;
        }

        if (d < this.tam && this.valores[d] > this.valores[maior]) {
            maior = d;
        }

        if (maior != i) {
            trocar(i, maior);
            heapificar(maior);
        }
    }

    public int esquerda(int i) {
        return 2 * i + 1;
    }

    public int direita(int i) {
        return 2 * i + 2;
    }

    public int pai(int i) {
        return i / 2;
    }

    public void trocar(int i, int j) {
        int temp = this.valores[j];
        this.valores[j] = this.valores[i];
        this.valores[i] = temp;
    }

    public int getTam() {
        return this.tam;
    }

    public void decrementarTam() {
        this.tam--;
    }

    public int[] getValores() {
        return Arrays.stream(this.valores).toArray();
    }
}