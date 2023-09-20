package Arboles.BinarySearchThreeOption2;

import org.w3c.dom.views.AbstractView;

public class NodoArbolBinario<T> {
    private T elemento;
    private int llave;
    private NodoArbolBinario<T> padre;
    private NodoArbolBinario<T> hijoIquierda;
    private NodoArbolBinario<T> hijoDerecha;

    public NodoArbolBinario(T elemento){
        this.elemento = elemento;
    }
    public T getElement(){
        return this.elemento;
    }
    public NodoArbolBinario<T> getPadre(){
        return this.padre;
    }
    public NodoArbolBinario<T> getHijoIzquierda(){
        return this.hijoIquierda;
    }

    public NodoArbolBinario<T> getHijoDerecha(){
        return this.hijoDerecha;
    }

    public void setHijoDerecha(NodoArbolBinario<T> hijoD){
        this.hijoDerecha = hijoD;
    }
    public void setHijoIzquierda(NodoArbolBinario<T> hijoI){
        this.hijoIquierda = hijoI;
    }
    public void setPadre(NodoArbolBinario<T> padre){
        this.padre = padre;
    }
}
