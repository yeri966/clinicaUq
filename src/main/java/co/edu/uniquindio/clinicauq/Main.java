package co.edu.uniquindio.clinicauq;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        menuPrincipal(database.mascotas);
        menuMascotas(database.mascotas);


    }

    //funcion de menu principal
    public static void menuPrincipal(ArrayList<Mascota> mascotas) {
        int opcPrincipal;
        do {
            System.out.println("**** Menu ****");
            System.out.println("1. Menu Mascotas");
            System.out.println("2. menu Veterinario");
            System.out.println("3. Salir");

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la opcion");
            opcPrincipal = teclado.nextInt();

            switch (opcPrincipal) {
                case 1:
                    menuMascotas(mascotas);
                    break;
            }
        }
        while (opcPrincipal != 3);
    }

    //Funcion de Menu mascotas
    public static void menuMascotas(ArrayList<Mascota> mascotas) {
        int submenu;
        do {
            System.out.println("** Menu Mascostas ***");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Modificar mascota");
            System.out.println("3. Actualizar mascota");
            System.out.println("4. Eliminar mascota");
            System.out.println("5. Regresar");

            Scanner teclado = new Scanner(System.in);
            submenu = teclado.nextInt();

            switch (submenu){
                case 1:
                    agregarMascota(mascotas);
            }
        }
        while (submenu != 5);
    }

    public static void agregarMascota(ArrayList<Mascota> mascotas) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name = teclado.next();
        System.out.println("Ingrese la edad: ");
        int age = teclado.nextInt();
        System.out.println("Ingrese la raza");
        String race = teclado.next();

        Mascota m = new Mascota(name,age,race);
        mascotas.add(m);
    }

}
