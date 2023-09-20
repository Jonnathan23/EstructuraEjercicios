package Grafos;

public class Arco {
    Object destino;
    float peso;
    Arco siguiente;

    public Arco(Object destino){
        this.destino = destino;
        siguiente = null;
    }

    public Arco(Object destino, float peso){
        this.destino = destino;
        this.peso = peso;
        siguiente = null;
    }
}
