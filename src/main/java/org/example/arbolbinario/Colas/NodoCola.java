package main.java.org.example.arbolbinario.Colas;


import main.java.org.example.arbolbinario.NodoBST;

public class NodoCola {
    public NodoBST nodo;
    public NodoCola siguiente;

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
