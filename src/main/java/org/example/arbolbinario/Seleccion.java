package org.example.arbolbinario;

public class Seleccion {
    private int Ranking;
    private String Nombre;
    private String Grupo;
    private int GolesAF;
    private int GolesEC;
    private int puntos;

    public Seleccion(int ranking, String nombre, String grupo, int golesAF, int golesEC, int puntos) {
        Ranking = ranking;
        Nombre = nombre;
        Grupo = grupo;
        GolesAF = golesAF;
        GolesEC = golesEC;
        this.puntos = puntos;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public int getGolesAF() {
        return GolesAF;
    }

    public void setGolesAF(int golesAF) {
        GolesAF = golesAF;
    }

    public int getGolesEC() {
        return GolesEC;
    }

    public void setGolesEC(int golesEC) {
        GolesEC = golesEC;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void mostrar(){
        System.out.println("Ranking: " + Ranking);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Grupo: " + Grupo);
        System.out.println("Goles a favor: " + GolesAF);
        System.out.println("Goles en contra: " + GolesEC);
        System.out.println("Puntos: " + puntos);
    }

    // Metodo para que realmente se nos muestre info de la selección
    @Override
    public String toString() {
        return "Ranking: " + Ranking +
                ", Nombre: " + Nombre +
                ", Grupo: " + Grupo +
                ", Goles a favor: " + GolesAF +
                ", Goles en contra: " + GolesEC +
                ", Puntos: " + puntos;
    }
}
