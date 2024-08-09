package EstrelaI.estruturas;

public class ListaLigada {

    private Elemento inicio;
    private Elemento cauda;

    public void inserirCauda(int valor) {
        Elemento e = new Elemento();
        e.setValor(valor);

        if (inicio == null) {
            inicio = e;
            cauda = e;
        } else {
            cauda.setProximo(e);
            cauda = e;
        }
    }

    public void inserirCabeca(int valor) {
        Elemento e = new Elemento();
        e.setValor(valor);

        if (inicio == null) {
            inicio = e;
            cauda = e;
        } else {
            e.setProximo(inicio);
            inicio = e;
        }
    }

}
