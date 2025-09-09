package co.edu.uniquindio.clinicauq;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Conexion a una sola instancia "Singlenton"
        Database database = Database.getInstance();
        menuPrincipal(database.mascotas);
    }

    //funcion de menu principal
    public static void menuPrincipal(ArrayList<Mascota> mascotas) {
        int opcPrincipal;

        do {
            System.out.println("** MENU PRINCIPAL **");
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
                case 2:
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
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Contar Pitbulls");
            System.out.println("3. Regresar");

            Scanner teclado = new Scanner(System.in);
            submenu = teclado.nextInt();

            switch (submenu){
                case 1:
                    agregarMascota(mascotas);
                    break;
                case 2:
                    mostrarMascotas(mascotas);
                    break;
                case 3:
                    contarPitbull(mascotas);
                    break;
            }
        }
        while (submenu != 3);
    }

    public static int buscarPosicion(ArrayList<Mascota>mascotas, String name) {
        int index = 0;
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).equals(name)) {
                index = i;
                return index;
            }
        }
        return -1;
    }
    //Funcion de agregar mascota
    public static void agregarMascota(ArrayList<Mascota> mascotas) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name = teclado.next().toLowerCase();
        System.out.println("Ingrese la edad: ");
        int age = teclado.nextInt();
        System.out.println("Ingrese la raza");
        String race = teclado.next();

        Mascota m = new Mascota.Builder().name(name).age(age).race(race).build();
        mascotas.add(m);

        System.out.println("Se agrego la mascota: " + name + "\n");
    }

    public static void mostrarMascotas(ArrayList<Mascota>mascotas){
        for(Mascota m : mascotas){
            System.out.println(m.toString());
        }
    }

    public static void contarPitbull(ArrayList<Mascota>mascotas){
        int cont=0;
        for (Mascota m:mascotas){
            if(m.getRace().toLowerCase().equals("pitbull")){
                cont++;
            }
        }
        System.out.println("Hay " + cont + " Pitbull" );
    }
}