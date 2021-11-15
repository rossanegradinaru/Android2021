package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivitateSpecialisti extends AppCompatActivity {

    private ListView listView;
    private SpecialistAdapter adapter;
    private JSONRead jsonRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_specialisti);

        listView = findViewById(R.id.lvSpecialisti);

        adapter = new SpecialistAdapter(createList());
        listView.setAdapter(adapter);

        jsonRead=new JSONRead();

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                jsonRead.read("https://pastebin.com/raw/ZxSMAya5", new IResponse() {
                    @Override
                    public void onSuccess(List<Specialist> list) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                adapter.updateList(list);
                            }
                        });


                    }

                    @Override
                    public void onError(String errorMessage) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(ActivitateSpecialisti.this, errorMessage, Toast.LENGTH_LONG).show();
                            }
                        });

                    }
                });

            }
        });

        thread.start();
    }

    private List<Specialist> createList(){
        ArrayList<Specialist> lista = new ArrayList<>();

        Specialist specialist = new Specialist("Aurel Solea","Antrenor personal","Cluj-Napoca");
        lista.add(specialist);

        return lista;
    }
}