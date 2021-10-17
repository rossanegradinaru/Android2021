package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCreareCont;
    private TextView tvAutentificare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreareCont=findViewById(R.id.btnCreareCont);
        btnCreareCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ActivitateCreareCont.class);
                startActivity(intent);
            }
        });

        tvAutentificare=findViewById(R.id.tvAutentificare);
        tvAutentificare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ActivitateAutentificare.class);
                startActivity(intent);
            }
        });
    }
}