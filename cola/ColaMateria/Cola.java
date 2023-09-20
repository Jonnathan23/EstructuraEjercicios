public class Cola {
    private NodeClass inicioCola;
    private NodeClass finalCola;
    private String colaContent;
    private int size;

    public Cola() {
        this.inicioCola = null;
        this.finalCola = null;
        this.colaContent = "";
        this.size = 0;
    }

    public boolean colaVacia() {
        return (inicioCola == null);
    }

    public void insertarNodo(int dato) {
        NodeClass newNode = new NodeClass();
        newNode.element = dato;
        newNode.nextNode = null;

        if (colaVacia()) {
            this.inicioCola = newNode;
            finalCola = newNode;            
        } else {
            finalCola.nextNode = newNode;
            finalCola = newNode;
        }
        this.size++;
        actualizarContenido();

    }

    public int extraer() {
        if (!colaVacia()) {
            int informacion = inicioCola.element;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.nextNode;
            }
            this.size--;
            actualizarContenido();
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    private void actualizarContenido() {
        NodeClass recorrido = this.inicioCola;
        this.colaContent = "";

        while (recorrido != null) {            
            this.colaContent += recorrido.element + " ";
            recorrido = recorrido.nextNode;
        }
        String cadena[] = this.colaContent.split(" ");
        this.colaContent = "";

        for (int i = cadena.length - 1; i >= 0; i--) {
            this.colaContent += cadena[i] + " ";
        }        
    }

    public String mostrarContenido() {
        actualizarContenido();
        return this.colaContent;
    }

    public int getSize() {
        return this.size;
    }
}
