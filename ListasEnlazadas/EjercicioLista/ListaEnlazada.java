package EjercicioLista;

public class ListaEnlazada<T> {
    NodoLista<T> cabeza;
    NodoLista<T> cola;
    int dimension;

    public ListaEnlazada(){
        this.cabeza = null;
        this.cola = null;
        this.dimension = 0;
    }
    public boolean listaVacia(){
        return cabeza == null;
    }
    public void insertarNodo(T dato){
        NodoLista<T> nuevoNodo = new NodoLista<>(dato);
        if (listaVacia()) {
            this.cabeza = nuevoNodo;
            return;
        }
        if (cola == null) {
            this.cola = nuevoNodo;
            this.cola.siguiente = this.cabeza;
            return;            
        }
        nuevoNodo.siguiente = this.cola;
        this.cola = nuevoNodo;
        
    }
}
