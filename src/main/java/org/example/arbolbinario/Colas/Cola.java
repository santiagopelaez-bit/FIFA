package main.java.org.example.arbolbinario.Colas;


import main.java.org.example.arbolbinario.NodoBST;

public class Cola {
    public NodoCola frente;
    public NodoCola ultimo;
    public int tamanio;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        tamanio = 0;
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
        tamanio++;
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
        tamanio--;
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

    public int getTamanio() {
        return tamanio;
    }
}
