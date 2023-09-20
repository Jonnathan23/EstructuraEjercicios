package Grafos;

public class ListaAdyacencia {
    Arco primero;
    Arco ultimo;

    public ListaAdyacencia() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean vacia() {
        return primero == null;
    }

    public boolean adyacente(Object dato) {
        Arco actual = this.primero;

        while ((actual != null) && (!dato.toString().equals(actual.destino.toString()))) {
            actual = actual.siguiente;
        }

        return (actual != null) ? true : false;
    }

    public void nuevaAdyacencia(Object destino) {
        if (!adyacente(destino)) {
            Arco nodo = new Arco(destino);
            insertar(nodo,destino);
        }
    }
    
    public void nuevaAdyacencia(Object destino, float peso) {
        if (!adyacente(destino)) {
            Arco nodo = new Arco(destino, peso);
            insertar(nodo,destino);
        }
    }

    public void insertar(Arco nodo, Object destino){
        if (vacia()) {
            primero = nodo;
            ultimo = nodo;
            return;
        }
        if (destino.toString().compareTo(primero.destino.toString()) <=0) {
            nodo.siguiente = primero;
            primero = nodo;
            return;
        }
        if (destino.toString().compareTo(ultimo.toString()) > 0) {
            ultimo.siguiente = nodo;
            ultimo = nodo;
            return;
        }
        Arco posicion = primero;
        while(destino.toString().compareTo(posicion.destino.toString()) <=0){
            posicion = posicion.siguiente;
        }
        nodo.siguiente = posicion.siguiente;
        posicion.siguiente = nodo;

    }    

    
}
