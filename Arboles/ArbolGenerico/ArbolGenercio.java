public class ArbolGenercio<T> {
    NodoA<T> raiz;

    public ArbolGenercio() {
        this.raiz = null;
    }

    public boolean arbolVacio() {
        return this.raiz == null;
    }

    public <U extends Comparable> void insertarNodo(NodoA<T> nodoA, U valor) {
        if (arbolVacio()) {
            NodoA<T> nuevoNodo = new NodoA<>(valor);
            this.raiz = nuevoNodo;
            return;
        }

        if (nodoA == null) {
            return;
        }

        if (valor.compareTo(nodoA.elemento) > 0) {
            if (nodoA.hDerecha == null) {
                NodoA<T> nuevoNodo = new NodoA<>(valor);
                nuevoNodo.padre = nodoA;
                nodoA.hDerecha = nuevoNodo;
                return;
            } else {
                insertarNodo(nodoA.hDerecha, valor);
            }
        } else if (valor.compareTo(nodoA.elemento) < 0) {
            if (nodoA.hIzquierda == null) {
                NodoA<T> nuevoNodo = new NodoA<>(valor);
                nuevoNodo.padre = nodoA;
                nodoA.hIzquierda = nuevoNodo;
                return;
            } else {
                insertarNodo(nodoA.hIzquierda, valor);
            }
        }

    }

    public void inOrder(NodoA<T> nodo) {
        if (nodo == null) {
            return;
        }

        inOrder(nodo.hIzquierda);
        System.out.println(nodo.elemento.toString());
        inOrder(nodo.hDerecha);
    }

    public void preOrder(NodoA<T> nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.elemento.toString());
        preOrder(nodo.hIzquierda);
        preOrder(nodo.hDerecha);
    }

    public void postOrder(NodoA<T> nodo) {
        if (nodo == null) {
            return;
        }
        postOrder(nodo.hIzquierda);
        postOrder(nodo.hDerecha);
        System.out.println(nodo.elemento.toString());
    }

    public <U extends Comparable> NodoA<T> buscarNodoA(NodoA<T> nodo, U valor){
        if (nodo == null) {
            return null;
        }

        if (valor.compareTo(nodo.elemento) == 0) {
            return nodo;
        }

        NodoA<T> izquierda = buscarNodoA(nodo.hIzquierda, valor);
        NodoA<T> derecha = buscarNodoA(nodo.hDerecha, valor);

        return (izquierda == null)?derecha:izquierda;
    }

    //public 
}
