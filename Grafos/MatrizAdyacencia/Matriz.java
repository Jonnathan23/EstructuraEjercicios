
public class Matriz {
    private int nVerctices;
    private NodoMatriz[] vertices;
    private int[][] matriz;

    public Matriz(int dimension) {
        this.matriz = new int[dimension][dimension];
        this.vertices = new NodoMatriz[dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                this.matriz[i][j] = 0;
            }
        }
        this.nVerctices = 0;

    }

    public <T> void nuevoVertice(T element) {
        boolean existe = numVertice(element) >= 0;
        if (!existe) {
            NodoMatriz<T> nuevoVertice = new NodoMatriz<T>(element);
            nuevoVertice.asignarVertice(nVerctices);
            vertices[nVerctices++] = nuevoVertice;
        }
    }

    public <T> void nuevoArco(T ver1, T ver2) throws Exception {
        int vUno, vDos;
        vUno = numVertice(ver1);
        vDos = numVertice(ver2);
        if (vUno < 0 || vDos < 0)
            throw new Exception("El vertice no existe");
        matriz[vUno][vDos] = 1;
        matriz[vDos][vUno] = 1;
    }

    public <T> int numVertice(T element) {
        NodoMatriz<T> nodo = new NodoMatriz<T>(element);
        boolean encontrado = false;
        int i = 0;
        for (; (i < nVerctices) && !encontrado;) {
            encontrado = this.vertices[i].elementoIgual(nodo);
            if (!encontrado)
                i++;
        }
        return (i < nVerctices) ? i : -1;

    }

    public <T> boolean adyacencia(T elementA, T elementB) throws Exception {
        int vA, vB;
        vA = numVertice(elementA);
        vB = numVertice(elementB);

        if (vA < 0 || vB < 0)
            throw new Exception("Vertice no existe");

        return matriz[vA][vB] == 1;
    }
}
