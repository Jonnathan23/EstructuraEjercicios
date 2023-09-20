import java.security.PublicKey;

public class ArbolBinarioDos {
    NodoArbol raizA;

    public ArbolBinarioDos() {
        this.raizA = null;
    }

    public boolean arbolVacio() {
        return raizA == null;
    }

    public void insertarNodo(NodoArbol nodoA, int elemento) {

        if (arbolVacio()) {
            NodoArbol nuevoNodo = new NodoArbol(elemento);
            this.raizA = nuevoNodo;
            return;
        }
        if (nodoA == null) {
            return;
        }

        if (elemento > nodoA.elemento) {
            if (nodoA.hDerecha == null) {
                NodoArbol nuevoNodo = new NodoArbol(elemento);
                nuevoNodo.padre = nodoA;
                nodoA.hDerecha = nuevoNodo;
                return;
            } else {
                insertarNodo(nodoA.hDerecha, elemento);
            }
        } else if (elemento < nodoA.elemento) {
            if (nodoA.hIzquierda == null) {
                NodoArbol nuevoNodo = new NodoArbol(elemento);
                nuevoNodo.padre = nodoA;
                nodoA.hIzquierda = nuevoNodo;
                return;
            } else {
                insertarNodo(nodoA.hIzquierda, elemento);
            }
        }
    }

    public void in_Order(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        // IRD
        in_Order(nodo.hIzquierda);
        System.out.println(nodo.elemento);
        in_Order(nodo.hDerecha);
    }

    public void pre_Order(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }

        // RID
        System.out.println(nodo.elemento);
        pre_Order(nodo.hIzquierda);
        pre_Order(nodo.hDerecha);
    }

    public void pos_Order(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        // IDR

        pos_Order(nodo.hIzquierda);
        pos_Order(nodo.hDerecha);
        System.out.println(nodo.elemento);
    }

    public NodoArbol encontrarNodo(NodoArbol nodo, int valor) {
        if (nodo == null) {
            return null;
        }
        if (nodo.elemento == valor) {
            return nodo;
        }

        NodoArbol izquierda = encontrarNodo(nodo.hIzquierda, valor);
        NodoArbol derecha = encontrarNodo(nodo.hDerecha, valor);

        return (izquierda == null) ? derecha : izquierda;

    }

    public void eliminar(int valor) {
        if (arbolVacio()) {
            return;
        }
        NodoArbol nodoEliminar = encontrarNodo(raizA, valor);
        if (nodoEliminar == null) {
            return;
        }
        eliminarNodo(nodoEliminar);   

    }

    public void eliminarNodo(NodoArbol nodoEliminar) {
        // Dos hijos
        if (nodoEliminar.hDerecha != null && nodoEliminar != null) {
            NodoArbol nMenor = minimo(nodoEliminar.hDerecha);
            nodoEliminar.elemento = nMenor.elemento;
            eliminarNodo(nMenor);
        }
        //Un hijo

    }

    public NodoArbol minimo(NodoArbol nodo) {
        if (nodo == null) {
            return null;
        }
        if (nodo.hIzquierda != null) {
            return minimo(nodo.hIzquierda);
        } else {
            return nodo;
        }

    }

}
