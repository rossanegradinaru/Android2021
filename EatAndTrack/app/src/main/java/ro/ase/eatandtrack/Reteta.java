package ro.ase.eatandtrack;

public class Reteta {
    int imagine;
    String nume;
    int numarCalorii;

    public Reteta(int imagine, String nume, int numarCalorii) {
        this.imagine = imagine;
        this.nume = nume;
        this.numarCalorii = numarCalorii;
    }

    public int getImagine() {
        return imagine;
    }

    public void setImagine(int imagine) {
        this.imagine = imagine;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarCalorii() {
        return numarCalorii;
    }

    public void setNumarCalorii(int numarCalorii) {
        this.numarCalorii = numarCalorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("imagine='").append(imagine).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarCalorii=").append(numarCalorii);
        sb.append('}');
        return sb.toString();
    }
}
