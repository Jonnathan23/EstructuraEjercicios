package Arboles.BinarySearchThree;

public class Principal {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        /*
         * arbol.insertar(3, "Raiz");
         * arbol.insertar(4, "Hola");
         * arbol.insertar(2, 355);
         * arbol.insertar(1, 132);
         * arbol.insertar(5, "Mundo");
         */
        arbol.insertar(3, "Raiz");
        arbol.insertar(1, "Hola");
        arbol.insertar(2, 355);
        arbol.insertar(5, 132);
        arbol.insertar(4, "Mundo");

        // arbol.recorridoEnOrder(arbol.raiz);
        // System.out.println("Raiz: " + arbol.raiz.llave);

        /*if (arbol.buscar(7) != null) {
            System.out.println("Encontrado: " + arbol.buscar(7).llave);
        }*/

        System.out.println(arbol);
        System.out.println("FInalizoasd");

    }
}
