package co.edu.uniquindio.clinicauq;

public class Mascota {
    private String name;
    private int age;
    private String race;

    private Mascota(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.race = builder.race;
    }

    public static class Builder {
        private String name;
        private int age;
        private String race;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder race(String race) {
            this.race = race;
            return this;
        }

        public Mascota build() {
            return new Mascota(this);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + race;
    }
}
