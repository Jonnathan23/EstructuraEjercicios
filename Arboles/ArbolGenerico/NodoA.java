public class NodoA<T> {
    T elemento;
    NodoA<T> hIzquierda;
    NodoA<T> hDerecha;
    NodoA<T> padre;

    public NodoA(T elemento) {
        this.elemento = elemento;
        this.hIzquierda = null;
        this.hDerecha = null;
        this.padre = null;
    }
}
