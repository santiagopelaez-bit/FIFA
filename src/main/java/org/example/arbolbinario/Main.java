package main.java.org.example.arbolbinario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinarioBusqueda bst = new ArbolBinarioBusqueda();
        Recorridos recorridos = new Recorridos();
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


        bst.InsertarSel(mar); //8
        bst.InsertarSel(eng); //4
        bst.InsertarSel(col); //13
        bst.InsertarSel(spa); //2
        bst.InsertarSel(bra); //6
        bst.InsertarSel(ger); //10
        bst.InsertarSel(eua); //16
        bst.InsertarSel(fra); //1
        bst.InsertarSel(arg); //3
        bst.InsertarSel(por); //5
        bst.InsertarSel(ned); //7
        bst.InsertarSel(bel); //9
        bst.InsertarSel(cro); //11
        bst.InsertarSel(sen); //14
        bst.InsertarSel(can); //30
        bst.InsertarSel(mex); //15

        int opcion = -1;
        do {
            System.out.println("------------Menú árbol mundial fuchibol------------");
            System.out.println("1. Mostrar reporte ordenado por ranking FIFA");
            System.out.println("2. Mostrar vista estructural por niveles");
            System.out.println("3. Agregar selección por ranking FIFA");
            System.out.println("4. Buscar selección por ranking fifa");
            System.out.println("5. Borrar selección por ranking FIFA");
            System.out.println("6. Mostrar favorito a ganar el mundial");
            System.out.println("7. Mostrar menos favorito a ganar el mundial");
            System.out.println("8. Mostrar diferencia total de goles");
            System.out.println("9. Mostrar cantidad de selecciones en el mundial");
            System.out.println("10. Mostrar altura del árbol");
            System.out.println("11. Preorder");
            System.out.println("12. Postorder");
            System.out.println("0. Salir de árbol mundial fuchibol");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    recorridos.reporteOrdenado(bst.getRaiz());
                    break;

                case 2:
                    recorridos.vistaEstructural(bst.getRaiz());
                    break;

                case 3:
                    System.out.println("Ingrese el ranking FIFA de la nueva selección: ");
                    int rank = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la nueva selección: ");
                    String sel = sc.nextLine();
                    System.out.println("Ingrese el grupo(A-L): ");
                    String gr = sc.nextLine();
                    System.out.println("Ingrese los Goles a favor: ");
                    int gaf = sc.nextInt();
                    System.out.println("Ingrese los Goles en contra: ");
                    int gec = sc.nextInt();
                    System.out.println("Ingrese los puntos de la selección nueva: ");
                    int poi = sc.nextInt();
                    sc.nextLine();
                    Seleccion seleccion = new Seleccion(rank, sel, gr, gaf, gec, poi);
                    bst.InsertarSel(seleccion);
                    System.out.println("Selección agregada correctamente");
                    break;

                case 4:
                    System.out.println("Ingrese el ranking FIFA de la seleccion a buscar");

                    int rankingBuscar = sc.nextInt();
                    Seleccion encontrada = bst.BuscarCell(rankingBuscar);

                    if (encontrada != null) {
                        System.out.println("Seleccion encontrada:");
                        System.out.println(encontrada);
                    } else {
                        System.out.println("No existe una seleccion con ese ranking.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el ranking a borrar: ");
                    int rankingBorrar = sc.nextInt();

                    bst.BorrarCell(rankingBorrar);
                    System.out.println("Operacion de borrado finalizada.");
                    break;

                case 6:
                    recorridos.favorito(bst.getRaiz());
                    break;

                case 7:
                    recorridos.weakest(bst.getRaiz());
                    break;

                case 8:
                    recorridos.diferenciaTG(bst.getRaiz());
                    break;

                case 9:
                    System.out.println("Cantidad de selecciones: " + bst.CellMax());
                    break;

                case 10:
                    System.out.println("Altura del arbol: " + bst.Altura());
                    break;

                case 11:
                    System.out.println("Recorrido preOrder:");
                    recorridos.preOrder(bst.getRaiz());
                    break;

                case 12:
                    System.out.println("Recorrido postOrder:");
                    recorridos.postOrder(bst.getRaiz());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }


            System.out.println("//////////////////////////////////");
            System.out.println("//////////////////////////////////");
            System.out.println("//////////////////////////////////");
        } while (opcion != 0);

        sc.close();
    }
}
