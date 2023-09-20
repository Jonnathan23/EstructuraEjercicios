package ListaMateria;

public class Nodo {
    Object valor;
    Nodo siguiente;

    public Nodo( Object valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public void enlazarSiguiente (Nodo n){
        siguiente = n;
    }

    public Object obtenerValor(){
        return this.valor;
    }

    public Nodo obtenerSiguiente(){
        return this.siguiente;
    }
}
