package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class ActivitateAdaugareMasuratori extends AppCompatActivity {

    private MasuratoriDao masuratoriDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_adaugare_masuratori);

        Masuratori m1 = new Masuratori("01/01/2021",170,19.6f);
        Masuratori m2 = new Masuratori("01/02/2021",170,22.6f);
        Masuratori m3 = new Masuratori("01/03/2021",170,23.3f);
        Masuratori m4 = new Masuratori("01/04/2021",170,21.5f);
        Masuratori m5 = new Masuratori("01/05/2021",170,25.9f);

        masuratoriDao = DatabaseAccess.getInstance(this).getDatabase().masuratoriDao();

        masuratoriDao.insertAll(m1);
        masuratoriDao.insertAll(m2);
        masuratoriDao.insertAll(m3);
        masuratoriDao.insertAll(m4);
        masuratoriDao.insertAll(m5);

        List<Masuratori> lista1 = masuratoriDao.getAll();
        List<Masuratori> lista2 = masuratoriDao.getAllProcent();
        masuratoriDao.delete(m5);

        Log.v("operatii",lista1.toString());
        Log.v("operatii",lista2.toString());


    }
}