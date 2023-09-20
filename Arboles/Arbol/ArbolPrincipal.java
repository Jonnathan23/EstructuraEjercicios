public class ArbolPrincipal {
    public static void main(String[] args) {
        /*
         * NodoArbol raiz = new NodoArbol(6);
         * NodoArbol n1 = new NodoArbol(4);
         * NodoArbol n2 = new NodoArbol(1);
         * NodoArbol n3 = new NodoArbol(5);
         * NodoArbol n4 = new NodoArbol(8);
         * NodoArbol n6 = new NodoArbol(9);
         * 
         * raiz.hIzquierda = n1;
         * raiz.hDerecha = n4;
         * 
         * n1.hIzquierda = n2;
         * n1.hDerecha = n3;
         * 
         * n4.hDerecha = n6;
         */

        ArbolBinarioDos arbol = new ArbolBinarioDos();
        arbol.insertarNodo(null, 10);
        arbol.insertarNodo(arbol.raizA, 6);
        arbol.insertarNodo(arbol.raizA, 15);
        arbol.insertarNodo(arbol.raizA, 3);
        arbol.insertarNodo(arbol.raizA, 8);
        arbol.insertarNodo(arbol.raizA, 7);
        arbol.insertarNodo(arbol.raizA, 9);
        arbol.insertarNodo(arbol.raizA, 12);
        arbol.insertarNodo(arbol.raizA, 20);
        arbol.insertarNodo(arbol.raizA, 30);

        System.out.println("In-order");
        arbol.in_Order(arbol.raizA);
        System.out.println("Pre-order");
        arbol.pre_Order(arbol.raizA);
        System.out.println("Pos-order");
        arbol.pos_Order(arbol.raizA);
        System.out.println("---");
        NodoArbol encontrarNodo = arbol.encontrarNodo(arbol.raizA, 6);
        System.out.println("Nodo: " + encontrarNodo.elemento +
                "\nDerecha: " + encontrarNodo.hDerecha.elemento +
                "\nIzquierda: " + encontrarNodo.hIzquierda.elemento);
        System.out.println("FINALZO");
    }
}