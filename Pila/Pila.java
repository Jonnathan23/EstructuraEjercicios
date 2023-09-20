package Pila;

import java.util.Stack;

public class Pila {
    private String arreglo[];
    private int maxSize;
    private int posicion;

    public Pila(int maxSize) {
        this.maxSize = maxSize;
        this.arreglo = new String[this.maxSize];
        this.posicion = 0;
    }

    public boolean empty() {
        return posicion == 0;
    }

    public void push(String str) {
        if (posicion < maxSize) {
            arreglo[posicion] = str;
            posicion++;
        }
    }

    public String peek() {
        if (posicion > 0) {
            return arreglo[posicion - 1];
        } else {
            return null;
        }
    }

    public String pop() {
        String temp = null;
        if (posicion > 0) {
            temp = arreglo[posicion - 1];
            arreglo[posicion - 1] = null;
            posicion--;
        }
        return temp;
    }
}