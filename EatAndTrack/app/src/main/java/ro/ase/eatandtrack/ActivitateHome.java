package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitateHome extends AppCompatActivity {

   private Button btnRetete,btnSpecialisti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_home);

        btnRetete = findViewById(R.id.btnRetete);
        btnSpecialisti = findViewById(R.id.btnSpecialisti);

        btnRetete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitateHome.this,ActivitateMeniu.class);
                startActivity(intent);
                finish();
            }
        });

        btnSpecialisti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitateHome.this,ActivitateSpecialisti.class);
                startActivity(intent);
                finish();
            }
        });
    }


}