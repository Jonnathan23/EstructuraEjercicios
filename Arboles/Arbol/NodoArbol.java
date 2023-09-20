public class NodoArbol {
    int elemento;
    NodoArbol padre;
    NodoArbol hIzquierda;
    NodoArbol hDerecha;

    public NodoArbol(int elemento){
        this.elemento = elemento;
        this.padre = null;
        this.hIzquierda = null;
        this.hDerecha = null;
    }
}
