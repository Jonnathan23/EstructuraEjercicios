package Arboles.BinarySearchThreeOption2;

public class ArbolBinarioBusqueda<T> {
    private NodoArbolBinario<T> raiz;

    public boolean isEmpty(){
        return (this.raiz == null)?true:false;
    }
    public NodoArbolBinario<T> getRaiz(){
        return this.raiz;
    }

    public boolean isRaiz( NodoArbolBinario<T> nodo){
        return raiz == nodo;
    }
    
    public boolean esHoja(NodoArbolBinario<T> nodo){
        return (nodo.getHijoIzquierda() == null) && (nodo.getHijoDerecha() == null);
    }
    
    public boolean esInterno(NodoArbolBinario<T> nodo){
        return !esHoja(nodo);
    }

    public void insertar(NodoArbolBinario<T> origen, T elemento){

        if (this.raiz == null) {
            this.raiz = new NodoArbolBinario<T>(elemento);
        }else if (origen == null) {
            System.out.println("El origen es nulo");
        }else{
            
        }

    }

}
