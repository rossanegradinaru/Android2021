package ro.ase.eatandtrack;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "masuratori")
public class Masuratori {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "dataMasuratorilor")
    private String data_masuratori;
    @ColumnInfo(name = "inaltime")
    private int inaltime; //cm
    @ColumnInfo(name = "procentGrasimeCorporala")
    private float procent_grasime_corporala; // (%)

    public Masuratori(String data_masuratori, int inaltime, float procent_grasime_corporala) {
        this.data_masuratori = data_masuratori;
        this.inaltime = inaltime;
        this.procent_grasime_corporala = procent_grasime_corporala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_masuratori() {
        return data_masuratori;
    }

    public void setData_masuratori(String data_masuratori) {
        this.data_masuratori = data_masuratori;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public float getProcent_grasime_corporala() {
        return procent_grasime_corporala;
    }

    public void setProcent_grasime_corporala(float procent_grasime_corporala) {
        this.procent_grasime_corporala = procent_grasime_corporala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masuratori{");
        sb.append("id=").append(id);
        sb.append(", data_masuratori='").append(data_masuratori).append('\'');
        sb.append(", inaltime=").append(inaltime);
        sb.append(", procent_grasime_corporala=").append(procent_grasime_corporala);
        sb.append('}');
        return sb.toString();
    }
}
