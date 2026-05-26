package main.java.org.example.Colas;

import main.java.org.example.NodoBST;

public class NodoCola {
    private NodoBST nodo;
    private NodoCola siguiente;

    public NodoCola(NodoBST data) {
        this.nodo = data;
    }

    public NodoBST getNodo() {
        return nodo;
    }

    public void setNodo(NodoBST nodo) {
        this.nodo = nodo;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
