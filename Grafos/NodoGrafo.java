package Grafos;

public class NodoGrafo {
    Object dato;
    NodoGrafo siguiente;
    ListaAdyacencia lista;

    public NodoGrafo(Object dato){
        this.dato = dato;
        lista = new ListaAdyacencia();
        siguiente = null;
    }

    
}
