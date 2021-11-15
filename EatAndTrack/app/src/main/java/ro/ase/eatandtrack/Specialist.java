package ro.ase.eatandtrack;

public class Specialist {

    private String nume;
    private String specializare;
    private String oras;

    public Specialist(String nume, String specializare, String oras) {
        this.nume = nume;
        this.specializare = specializare;
        this.oras = oras;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Specialist{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append(", oras='").append(oras).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

