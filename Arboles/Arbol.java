package Arboles;

public class Arbol {
    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int key, Object obj) {
        Nodo nodo = new Nodo(key);
        nodo.valor = obj;

        if (this.raiz == null) {
            raiz = nodo;
        } else {
            Nodo temp = raiz;
            while(temp != null){
                nodo.padre = temp;
                if(nodo.llave >= temp.llave){
                    temp = temp.hijoDer;
                }else{
                    temp = temp.hijoIzq;
                }

            }
            if(nodo.llave < nodo.padre.llave){
                nodo.padre.hijoIzq = nodo;
            }
            else{
                nodo.padre.hijoDer = nodo;
            }
        }

    }

    public void recorridoInOrder(Nodo x){
        if (x != null) {
            recorridoInOrder(x.hijoIzq);
            System.out.println(x.llave);
        }
    }

    private class Nodo {
        public Nodo padre;
        public Nodo hijoDer;
        public Nodo hijoIzq;

        public int llave;
        public Object valor;

        public Nodo(int llave) {
            this.padre = null;
            this.hijoDer = null;
            this.hijoIzq = null;
            this.llave = llave;
            this.valor = null;
        }
    }
}
