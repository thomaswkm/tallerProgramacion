package com.mycompany.tallerprograuno;

import java.util.Scanner;

public class TallerPrograUno {

    public static void main(String[] args) {

        String[][] libros = new String[100][3];
        libros = agregarLibro(libros);
        
        mostrarLibros(libros);




    }

    public static String[][] agregarLibro(String[][] libros) {

        Scanner teclado = new Scanner(System.in);
        int validacion = 0;
        int contador = 0;
        int respuesta;

        do {

            System.out.println("¿Quieres agregar un libro? Si(0) No(1) ");
            respuesta = teclado.nextInt();
            if (respuesta == 0) {
                System.out.println("Introduce el título");
                String titulo = teclado.next();
                libros[contador][0] = titulo;
                System.out.println("Introduce el autor");
                String autor = teclado.next();
                libros[contador][1] = autor;
                System.out.println("Introduce la editorial");
                String editorial = teclado.next();
                libros[contador][2] = editorial;
                contador++;
            } else {
                validacion++;

            }

        } while (validacion == 0);

        return libros;
    }

    public static void mostrarLibros(String[][] libros) {
        
        try{
        for(int i = 0; i<libros.length;i++){
        
            System.out.print("Titulo: "+libros[i][0]);
            System.out.print(",Autor: "+libros[i][1]);
            System.out.print(",Editorial: "+libros[i][2]);
            System.out.println("");
        }}catch(Exception e){
        
        
        }
        

    }

}
