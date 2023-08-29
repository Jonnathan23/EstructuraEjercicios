package Pila;

import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        //PUSH --> añade un elemento
        //Pop --> saca el elemento final
        //Peek --> visualiza el último elemento
        //Empty --> sabe si la pila está vacia (booleano)
    /*  Stack pila = new Stack<>();
        pila.push("Mundo");
        // [ "Mundo"]
        pila.push("Hola");
        // [ "Mundo", "Hola"]
        System.out.println(pila.pop());
        System.out.println(pila.peek());
    */

        // --------- PILA -----
    /*  Pila pila2 = new Pila(3);
        pila2.push("Hola");
        pila2.push("Mundo");
        System.out.println(pila2.peek());
    */  
        // ------- PILA DINAMICA -----
        PilaDinamica pila3 = new PilaDinamica();
        pila3.push("1");
        pila3.push("2");
        pila3.push("3");
        pila3.push("4");
        pila3.push("5");
        pila3.push("6");

        System.out.println(pila3.peek());

    }
}
