package Arboles.BinarySearchThree;

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
            while (temp != null) {
                nodo.padre = temp;
                if (nodo.llave >= temp.llave) {
                    temp = temp.hijoDer;
                } else {
                    temp = temp.hijoIzq;
                }

            }
            if (nodo.llave < nodo.padre.llave) {
                nodo.padre.hijoIzq = nodo;
            } else {
                nodo.padre.hijoDer = nodo;
            }
        }        
    }

    public Nodo buscar(int key) {
        if (this.raiz == null) {
            return null;
        }
        if (key == this.raiz.llave) {
            return this.raiz;
        }

        Nodo temp = this.raiz;
        while (temp.llave != key) {
            System.out.println("Temp: " + temp.llave);
            if (key >= temp.llave) {
                temp = temp.hijoDer;
            } else if (key < temp.llave) {
                temp = temp.hijoIzq;
            }

            if (temp == null) {
                System.out.println("No se ha encontrado coincidencias");
                return null;
            }

        }
        return temp;

    }

    public void eliminar(int key) {
        if (this.raiz == null) {
            return;
        }
        if (this.raiz.llave == key) {
            System.out.println("No se puede eliminar la raiz!");
            return;
        }
        Nodo temp = this.raiz;
        while(temp.llave != key ){
            if (key > temp.llave) {
                temp = temp.hijoDer;
            }else if (key < temp.llave) {
                temp = temp.hijoIzq;
            }

            if (temp == null) {
                System.out.println("No se han encontrado coincidencias!");
                return;
            }            
        }

    }

    public void recorridoEnOrder(Nodo x) {
        if (x != null) {
            recorridoEnOrder(x.hijoIzq);
            System.out.println("Nodo actual: " + x.llave);
            recorridoEnOrder(x.hijoDer);
        }
    }

    public class Nodo {
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
