package ListaMateria;

public class ListaEnlazada {
    private Nodo cabeza;
    private int size;

    public ListaEnlazada() {
        this.cabeza = null;
        this.size = 0;
    }
    public boolean vacia() {
        return (cabeza == null) ? true : false;
    }

    

    // -- Metodos
    public void addPrimero(Object obj) {
        if (cabeza == null) {
            cabeza = new Nodo(obj);

        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);

            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        this.size++;
    }    

    public void eliminarPrimero() {
        cabeza = cabeza.obtenerSiguiente();
        this.size--;
    }

    public void eliminarNodo(int indice) {
        if (indice == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int contador = 0;
            Nodo temp = cabeza;
            while (contador < (indice - 1)) {
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(
                temp.obtenerSiguiente().obtenerSiguiente()
            );

        }
        size--;

    }

    public void cortarLista(int index){
        int contador = 0;
        Nodo temporal = cabeza;

        while(contador < (index - 1)){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        this.size = index;
    }

    // -- get
    public int getSize() {
        return this.size;
    }

    public Nodo getCabeza() {
        return this.cabeza;
    }
    
    
    public Object getValor(int indice) {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < indice) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }
}
