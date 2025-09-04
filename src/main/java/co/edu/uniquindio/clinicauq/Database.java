package co.edu.uniquindio.clinicauq;

import java.util.ArrayList;

public class Database {

    ArrayList<Mascota> mascotas = new ArrayList<>();
    ArrayList<Veterinario> veterinarios = new ArrayList<>();

    public Database() {
        mascotas.add(new Mascota("Amadeus", 9, "Pitbull"));
        mascotas.add(new Mascota("Athena", 3, "Rottweiler"));
        mascotas.add(new Mascota("Sacha", 7, "Doberman"));
        mascotas.add(new Mascota("Zeus", 1, "Pitbull"));


    }
}
