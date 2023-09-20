public class PrincipalArbol {
    public static void main(String[] args) {
        ArbolGenercio<Double> arbol = new ArbolGenercio<>();
        /*
         * arbol.insertarNodo(null,6);
         * arbol.insertarNodo(arbol.raiz,4);
         * arbol.insertarNodo(arbol.raiz,1);
         * arbol.insertarNodo(arbol.raiz,5);
         * arbol.insertarNodo(arbol.raiz,8);
         * arbol.insertarNodo(arbol.raiz,9);
         */
        arbol.insertarNodo(null, 6.02);
        arbol.insertarNodo(arbol.raiz, 4.02);
        arbol.insertarNodo(arbol.raiz, 1.02);
        arbol.insertarNodo(arbol.raiz, 5.02);
        arbol.insertarNodo(arbol.raiz, 8.02);
        arbol.insertarNodo(arbol.raiz, 9.02);

        System.out.println("In-Order");
        arbol.inOrder(arbol.raiz);
        System.out.println("-------" +
                "\nPre-Order");
        arbol.preOrder(arbol.raiz);
        System.out.println("-------" +
                "\nPost-Order");
        arbol.postOrder(arbol.raiz);
        System.out.println("\nNodo: " + arbol.buscarNodoA(arbol.raiz, 5.02).elemento.toString());

    }
}