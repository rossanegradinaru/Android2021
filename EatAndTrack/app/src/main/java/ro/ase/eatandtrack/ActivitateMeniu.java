package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivitateMeniu extends AppCompatActivity {

    private ListView listView;
    private RetetaAdapter retetaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_meniu);

        listView = findViewById(R.id.lvRetete);

        retetaAdapter = new RetetaAdapter(getList());
        listView.setAdapter(retetaAdapter);
    }

    private List<Reteta> getList(){
        ArrayList<Reteta> lista = new ArrayList<>();
        Reteta reteta = new Reteta(R.drawable.muffins, "Briose",550);
        Reteta reteta1 = new Reteta(R.drawable.avocado_salad, "Salata cu avocado",500);
        Reteta reteta2 = new Reteta(R.drawable.cookies, "Cookies",600);
        Reteta reteta3 = new Reteta(R.drawable.tagliatelle_quattro_formaggi, "Tagliatelle Quattro Formaggi",1000);

        lista.add(reteta);
        lista.add(reteta1);
        lista.add(reteta2);
        lista.add(reteta3);

        return lista;
    }
}