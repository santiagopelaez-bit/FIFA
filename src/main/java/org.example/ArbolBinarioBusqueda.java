package main.java.org.example;

public class ArbolBinarioBusqueda {
    private NodoBST raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public NodoBST getRaiz() {
        return raiz;
    }
    public void InsertarSel(Seleccion cell){
        raiz = insert(raiz, cell);

    }

    public int CellMax(){
        return contarArbol(raiz);
    }

    public int contarArbol(NodoBST nodo){
        if (nodo == null){
            return 0;
        }
        return 1 + contarArbol(nodo.getIzquierda()) + contarArbol(nodo.getDerecho());
    }
    public NodoBST insert(NodoBST nodo, Seleccion cell) {
        if (nodo == null) return new NodoBST(cell);
        if (cell.getRanking() < nodo.getCell().getRanking()) nodo.setIzquierda(insert(nodo.getIzquierda(), cell));
        else if (cell.getRanking() > nodo.getCell().getRanking()) nodo.setDerecho(insert(nodo.getDerecho(), cell));
        return nodo;
    }

    public Seleccion BuscarCell(int ranking){
        NodoBST resultado = search(raiz, ranking);
        return (resultado != null) ? resultado.getCell() : null;
    }

    public NodoBST search(NodoBST nodo, int  ranking) {
        if (nodo == null) return null;
        if (nodo.getCell().getRanking() == ranking) return nodo;
        if (ranking < nodo.getCell().getRanking()) return search(nodo.getIzquierda(), ranking);
        return search(nodo.getDerecho(), ranking);
    }

    public void BorrarCell(int ranking){
        if(search(raiz, ranking) == null)
            System.out.println("No se encuentra una seleccion con ese ranking >:(");
    else{
        raiz = delete(raiz, ranking);
        }
    }
    public NodoBST delete(NodoBST nodo, int ranking) {
        if (nodo == null) return null;
        if (ranking < nodo.getCell().getRanking()) nodo.setIzquierda(delete(nodo.getIzquierda(), ranking));
        else if (ranking > nodo.getCell().getRanking()) nodo.setDerecho(delete(nodo.getDerecho(), ranking));
        else {
            if (nodo.getIzquierda() == null & nodo.getDerecho() == null) return null;
            if (nodo.getIzquierda() == null) return nodo.getDerecho();
            if (nodo.getDerecho() == null) return nodo.getIzquierda();
            NodoBST sucesor = minim(nodo.getDerecho());
            nodo.setCell(sucesor.getCell());
            nodo.setDerecho( delete(nodo.getDerecho(), sucesor.getCell().getRanking()));

        }
        return nodo;
    }
    public int Altura(){
        return alturaArbol(raiz);
    }

    public int alturaArbol(NodoBST nodo){
        if (nodo == null) return 0;
        return 1+Math.max(alturaArbol(nodo.getIzquierda()), alturaArbol(nodo.getDerecho()));
    }

    public NodoBST minim(NodoBST nodo) {
        while(nodo.getIzquierda() != null) nodo = nodo.getIzquierda();
        return nodo;
    }
}
