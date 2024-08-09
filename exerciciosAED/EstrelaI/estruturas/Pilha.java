package EstrelaI.estruturas;

public class Pilha {

    private int tamanho;
    private int topo;

    private Integer[] elementos;

    public Pilha(int tamanho) {
        this.topo = -1;
        this.tamanho = tamanho;
        this.elementos = new Integer[tamanho];
    }

    public void push(Integer valor) {
        if (topo < tamanho - 1) {
            elementos[++topo] = valor;
        } else {
            throw new OverflowException();
        }
    }

    public Integer pop() {
        if (topo >= 0) {
            return elementos[topo--];
        } else {
            throw new UnderflowException();
        }
    }



}
