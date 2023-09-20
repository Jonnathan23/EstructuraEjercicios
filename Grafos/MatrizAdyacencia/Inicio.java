public class Inicio{
    public static void main(String[] args) throws Exception {
        Matriz matAd = new Matriz(3);
        String n1, n2;
        n1 = "Hola"; 
        n2 = "Mundo";

        matAd.nuevoVertice(n1);
        matAd.nuevoVertice(n2);
        matAd.nuevoArco(n1, n2);

        
        System.out.println(matAd);
    }
}