package co.edu.uniquindio.clinicauq;

import java.util.ArrayList;

public class Database {

    private static Database instancia;

    ArrayList<Mascota> mascotas = new ArrayList<>();
    ArrayList<Veterinario> veterinarios = new ArrayList<>();

    private Database() {
        mascotas.add(new Mascota.Builder().name("Amadeus").age(9).race("Pitbull").build());
        mascotas.add(new Mascota.Builder().name("Athena").age(3).race("Rottweilrt").build());
        mascotas.add(new Mascota.Builder().name("Sacha").age(7).race("Doberman").build());
        mascotas.add(new Mascota.Builder().name("Zeus").age(1).race("Pitbull").build());
    }

    public static Database getInstance() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }
}
