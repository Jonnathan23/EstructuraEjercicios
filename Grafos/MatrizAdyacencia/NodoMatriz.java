public class NodoMatriz<T> {
    private T elemento;
    private int numVerice;

    public NodoMatriz(T elemento) {
        this.elemento = elemento;
        this.numVerice = -1;
    }

    public boolean elementoIgual(NodoMatriz<T> nodo) { 
        return this.elemento.equals(nodo.elemento);
    }

    public void asignarVertice(int vertice){
        this.numVerice = vertice;
    }

    public T getElemento() {
        return this.elemento;
    }
}
