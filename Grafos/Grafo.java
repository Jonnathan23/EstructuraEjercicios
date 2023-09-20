package Grafos;

public class Grafo {
    private NodoGrafo primero;
    private NodoGrafo ultimo;

    public Grafo() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean grafoVacio() {
        return primero == null;
    }

    public boolean existeVertice(Object dato) {
        boolean existe = false;
        if (!grafoVacio()) {
            NodoGrafo temporal = primero;
            while (temporal != null) {
                if (temporal.dato.toString().equals(dato.toString())) {
                    existe = true;
                    break;
                }
                temporal = temporal.siguiente;
            }
        }
        return existe;
    }

    public void nuevaArista(Object origen, Object destino) {
        if (existeVertice(origen) && existeVertice(destino)) {
            NodoGrafo posicion = primero;
            while (!posicion.dato.equals(origen.toString())) {
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevaAdyacencia(destino);
        }
    }

    public void nuevaArista(Object origen, Object destino, float peso) {
        if (existeVertice(destino) && existeVertice(destino)) {
            NodoGrafo posicion = primero;
            while (!posicion.dato.toString().equals(origen.toString())) {
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevaAdyacencia(destino, peso);
        }
    }

    public void nuevoNodo(Object dato) {
        if (!existeVertice(dato)) {
            NodoGrafo nodo = new NodoGrafo(dato);
            if (grafoVacio()) {
                primero = nodo;
                ultimo = nodo;
                return;
            }

            if (dato.toString().compareTo(primero.dato.toString()) <= 0) {
                nodo.siguiente = primero;
                primero = nodo;
            }
        }
    }

}
