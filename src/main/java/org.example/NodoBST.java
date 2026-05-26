package main.java.org.example;

public class NodoBST {
    private Seleccion cell;
    private NodoBST izquierda;
    private NodoBST derecho;

    public NodoBST(Seleccion cell) {
        this.cell = cell;
        this.izquierda = null;
        this.derecho = null;
    }

    public Seleccion getCell() {
        return cell;
    }

    public void setCell(Seleccion cell) {
        this.cell = cell;
    }

    public NodoBST getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoBST izquierda) {
        this.izquierda = izquierda;
    }

    public NodoBST getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBST derecho) {
        this.derecho = derecho;
    }
}
