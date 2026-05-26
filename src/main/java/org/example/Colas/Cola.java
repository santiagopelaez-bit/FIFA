package main.java.org.example.Colas;

import main.java.org.example.NodoBST;

public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
    }

    public boolean isEmpty() {
        if (frente == null) {
            return true;
        }
        return false;
    }

    public void enqueue(NodoBST nodo) {
        NodoCola nuevo = new NodoCola(nodo);
        if (isEmpty()) {
            this.frente = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
    }

    public NodoBST dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La lista esta vacia");
        }
        NodoBST data = frente.getNodo();
        frente = frente.getSiguiente();
        if (frente == null) {
            ultimo = null;
        }
        return data;
    }

    public NodoBST peek() {
        if (isEmpty()) {
            throw new RuntimeException("La lista esta vacia");
        }
        NodoBST data = frente.getNodo();
        return data;
    }

    public void imprimir() {
        NodoCola actual = frente;
        System.out.println("Frente ---> ultimo");
        while (actual != null) {
            System.out.println(actual.getNodo());
            if (actual.getSiguiente() != null) {
                System.out.println(" ");
            }
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}
