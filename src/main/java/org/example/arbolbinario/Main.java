package org.example.arbolbinario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArbolBinarioBusqueda bst = new ArbolBinarioBusqueda();
        Seleccion fra = new Seleccion(1, "Francia", "I", 15, 4, 18);
        Seleccion spa = new Seleccion(2, "España", "H", 16, 2, 16);
        Seleccion arg = new Seleccion(3, "Argentina", "J", 13, 5, 18);
        Seleccion eng = new Seleccion(4, "Inglaterra", "L", 9, 2, 13);
        Seleccion por = new Seleccion(5, "Portugal", "K", 11, 5, 12);
        Seleccion bra = new Seleccion(6, "Brasil", "C", 20, 7, 18);
        Seleccion ned = new Seleccion(7, "Países Bajos", "F", 11, 7, 10);
        Seleccion mar = new Seleccion(8, "Marruecos", "C", 8, 6, 9);
        Seleccion bel = new Seleccion(9, "Bélgica", "G", 12, 9, 10);
        Seleccion ger = new Seleccion(10, "Alemania", "E", 20, 5, 18);
        Seleccion cro = new Seleccion(11, "Croacia", "L", 10, 5, 10);
        Seleccion col = new Seleccion(13, "Colombia", "K", 20, 0, 18);
        Seleccion sen = new Seleccion(14, "Senegal", "I", 9, 8, 8);
        Seleccion mex = new Seleccion(15, "México", "A", 6, 8, 5);
        Seleccion eua = new Seleccion(16, "Estados Unidos", "D", 10, 10, 7);
        Seleccion can = new Seleccion(30, "Canadá", "B", 4, 7, 4);


        bst.InsertarSel(mar); // 8
        bst.InsertarSel(eng); // 4
        bst.InsertarSel(col); // 13
        bst.InsertarSel(spa); // 2
        bst.InsertarSel(bra); // 6
        bst.InsertarSel(ger); // 10
        bst.InsertarSel(eua); // 16
        bst.InsertarSel(fra); // 1
        bst.InsertarSel(arg); // 3
        bst.InsertarSel(por); // 5
        bst.InsertarSel(ned); // 7
        bst.InsertarSel(bel); // 9
        bst.InsertarSel(cro); // 11
        bst.InsertarSel(sen); // 14
        bst.InsertarSel(can); // 30
        bst.InsertarSel(mex); // 15


    }
}
