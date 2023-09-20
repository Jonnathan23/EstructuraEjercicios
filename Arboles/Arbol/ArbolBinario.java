public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    public void insertarNodo(NodoArbol nodoBase, int valor) {
        if (arbolVacio()) {
            NodoArbol nodo = new NodoArbol(valor);
            this.raiz = nodo;
            return;
        }
        if (nodoBase == null) {
            return;
        }
        if (valor > nodoBase.elemento) {
            if (nodoBase.hDerecha == null) {
                NodoArbol nuevoNodo = new NodoArbol(valor);
                nuevoNodo.padre = nodoBase;
                nodoBase.hDerecha = nuevoNodo;
            } else {
                insertarNodo(nodoBase.hDerecha, valor);
            }
        } else if (valor < nodoBase.elemento) {
            if (nodoBase.hIzquierda == null) {
                NodoArbol nuevoNodo = new NodoArbol(valor);
                nuevoNodo.padre = nodoBase;
                nodoBase.hIzquierda = nuevoNodo;
            } else {
                insertarNodo(nodoBase.hIzquierda, valor);
            }
        }

    }

    public void inOrder(NodoArbol nodoBase) {
        if (nodoBase == null) {
            return;
        }
        inOrder(nodoBase.hIzquierda);
        System.out.println(nodoBase.elemento);
        inOrder(nodoBase.hDerecha);
    }

    public void preOrder(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.elemento);
        preOrder(nodo.hIzquierda);
        preOrder(nodo.hDerecha);
    }

    public void postOrder(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        postOrder(nodo.hIzquierda);
        postOrder(nodo.hDerecha);
        System.out.println(nodo.elemento);
    }

    public NodoArbol buscar(NodoArbol nodo, int valor) {
        if (nodo == null) {
            return null;
        }
        if (nodo.elemento == valor) {
            return nodo;
        }

        NodoArbol izquierda = buscar(nodo.hIzquierda, valor);
        NodoArbol derecha = buscar(nodo.hDerecha, valor);

        return (izquierda == null) ? derecha : izquierda;
    }

    public void eliminarNodo(NodoArbol nodo, int dato) {
        if (buscar(nodo, dato) == null) {
            return;
        }
        // Si es hoja
        if (nodo.hIzquierda == null && nodo.hDerecha == null) {
            if (nodo.elemento == this.raiz.elemento) {
                this.raiz = null;
                return;
            }
            if (nodo.padre.hIzquierda.elemento == nodo.elemento) {
                nodo.padre.hIzquierda = null;
                return;
            }
            nodo.padre.hDerecha = null;
            return;
        }

        // Si tiene un solo hijo
        // Hijo Izquierdo
        if (nodo.hDerecha == null) {
            if (nodo.elemento == this.raiz.elemento) {
                this.raiz = nodo.hIzquierda;
                return;
            }
            if (nodo.padre.hIzquierda.elemento == nodo.elemento) {
                nodo.padre.hIzquierda = nodo.hIzquierda;
                return;
            }
            nodo.padre.hDerecha = nodo.hIzquierda;
            return;
        }
        // Hijo derecho
        if (nodo.hIzquierda == null) {
            if (nodo.elemento == this.raiz.elemento) {
                this.raiz = nodo.hDerecha;
                return;
            }
            if (nodo.padre.hIzquierda.elemento == nodo.elemento) {
                nodo.padre.hIzquierda = nodo.hDerecha;
                return;
            }
            nodo.padre.hDerecha = nodo.hDerecha;
            return;
        }
        // Tiene hijos el condenado
        NodoArbol remplazo = obtenerRemplazo(nodo);

        if (nodo.elemento == this.raiz.elemento) {
            this.raiz = remplazo;
        } else if (nodo.padre.hIzquierda.elemento == nodo.elemento) {
            nodo.padre.hIzquierda = remplazo;
        } else {
            nodo.padre.hDerecha = remplazo;
        }
        remplazo.hIzquierda = nodo.hIzquierda;

    }

    public NodoArbol obtenerRemplazo(NodoArbol nodoR){
        if (nodoR == null) {
            
            return null;
        }


    }
}
