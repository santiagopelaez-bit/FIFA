package main.java.org.example.arbolbinario;


import main.java.org.example.arbolbinario.Colas.Cola;

public class Recorridos {

    public void preOrder(NodoBST nodo) {
        if (nodo == null) return;
        System.out.println(nodo.getCell());
        preOrder(nodo.getIzquierda());
        preOrder(nodo.getDerecho());
    }

    public void inOrder(NodoBST nodo) {
        if (nodo == null) return;
        inOrder(nodo.getIzquierda());
        System.out.println(nodo.getCell());
        inOrder(nodo.getDerecho());
    }

    public void postOrder(NodoBST nodo) {
        if (nodo == null) return;
        postOrder(nodo.getIzquierda());
        postOrder(nodo.getDerecho());
        System.out.println(nodo.getCell());
    }

    public void levelOrder(NodoBST nodo) {
        if (nodo == null) return;
        Cola cola = new Cola();
        cola.enqueue(nodo);
        int nivel = 1;
        while (!cola.isEmpty()) {
            int nivelCola = cola.getTamanio();
            System.out.println("Nivel " + nivel + ": ");
            for (int i = 0; i < nivelCola; i++) {
                NodoBST actual = cola.dequeue();
                System.out.print("[" + actual.getCell().getRanking() +
                        " - " + actual.getCell().getNombre() + "] ");
                if (actual.getIzquierda() != null) cola.enqueue(actual.getIzquierda());
                if (actual.getDerecho() != null) cola.enqueue(actual.getDerecho());
            }
            System.out.println();
            nivel++;
        }
    }

    // Selección el ranking FIFA mas alta
    public void favorito(NodoBST nodo) {
        if (nodo == null) return;
        NodoBST actual = nodo;
        while (actual.getIzquierda() != null)
            actual = actual.getIzquierda();
        System.out.println("Favorito del torneo:");
        System.out.println(actual.getCell());
    }

    // Selección mas debil
    public void weakest(NodoBST nodo) {
        if (nodo == null) return;
        NodoBST actual = nodo;
        while (actual.getDerecho() != null)
            actual = actual.getDerecho();
        System.out.println("Selección más débil:");
        System.out.println(actual.getCell());
    }

    // Reporte ordenado por ranking (inOrder)
    public void reporteOrdenado(NodoBST raiz) {
        System.out.println("Reporte ordenado por ranking FIFA");
        if (raiz == null) return;
        inOrder(raiz);
    }

    // Exportar estado (preOrder → permite reconstruir el árbol igual)
    public void exportarEstado(NodoBST raiz) {
        System.out.println("Exportar estado del torneo");
        if (raiz == null) return;
        preOrder(raiz);
    }

    // Diferencia de goles total (postOrder)
    public void diferenciaTG(NodoBST raiz) {
        System.out.println("Diferencia de goles total del torneo");
        if (raiz == null) {
            System.out.println("No hay selecciones.");
            return;
        }
        int total = calcularDiferencia(raiz);
        System.out.println("Diferencia total: " + total + " goles");
    }

    private int calcularDiferencia(NodoBST nodo) {
        if (nodo == null) return 0;
        return calcularDiferencia(nodo.getIzquierda()) +
                calcularDiferencia(nodo.getDerecho()) +
                (nodo.getCell().getGolesAF() - nodo.getCell().getGolesEC());
    }

    // Mostrar nivel por nivel
    public void vistaEstructural(NodoBST raiz) {
        System.out.println("Vista estructural del árbol");
        levelOrder(raiz);
    }
}

