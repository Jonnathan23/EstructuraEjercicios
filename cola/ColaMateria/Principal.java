class Principal {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.insertarNodo(36);
        cola.insertarNodo(56);
        cola.insertarNodo(76);
        cola.insertarNodo(26);
        cola.insertarNodo(16);
        cola.insertarNodo(96);

        System.out.println("Cola: " + cola.mostrarContenido() + "\nSize: " + cola.getSize());
        System.out.println("-----");
        System.out.println("Numero extraido: " + cola.extraer());
        System.out.println("Cola: " + cola.mostrarContenido() + "\nSize: " + cola.getSize());
        System.out.println("-----");
        System.out.println("Numero extraido: " + cola.extraer());
        System.out.println("Cola: " + cola.mostrarContenido() + "\nSize: " + cola.getSize());
    }
}