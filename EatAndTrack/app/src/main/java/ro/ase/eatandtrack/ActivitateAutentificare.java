package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivitateAutentificare extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_autentificare);
        floatingActionButton = findViewById(R.id.fbtnFB1);
        floatingActionButton.setImageResource(R.drawable.fb);
    }
}