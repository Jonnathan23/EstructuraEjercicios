package ListaMateria;

public class Principal {
    public static void main(String[] args) {
        //Nodos enlazados sin lista
    /*  Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");

        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        System.out.println("Nodo 1: \n" + primer.obtenerValor().toString());
    */
        //Estructura de lista enlazada
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Está vacia: " + lista.vacia());
        lista.addPrimero("Jonnathan");
        lista.addPrimero(34);
        lista.addPrimero("Cristina");
        lista.addPrimero("Jupiter");
        lista.addPrimero(1);

        System.out.println("Primer elemento: " + lista.getValor(0));
        System.out.println("Ultimo elemento: " + lista.getValor(lista.getSize() - 1));
        System.out.println("Está vacia: " + lista.vacia());

    }
}
