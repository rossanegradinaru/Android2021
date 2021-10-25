package ro.ase.eatandtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivitateAutentificare extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;

    User user;
    EditText etEmail, etPassword;

    Button btnAutentificare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_autentificare);
        floatingActionButton = findViewById(R.id.fbtnFB1);
        floatingActionButton.setImageResource(R.drawable.fb);

        etEmail = findViewById(R.id.etEmail1);
        etPassword = findViewById(R.id.etParola1);

        btnAutentificare = findViewById(R.id.btnIntraInCont);

        user = new User();

        btnAutentificare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){
                    user.setEmail(etEmail.getText().toString());
                    user.setPassword(etPassword.getText().toString());

                    Toast.makeText(ActivitateAutentificare.this,user.toString(),
                            Toast.LENGTH_LONG).show();

                    Bundle bundle = new Bundle();
                    bundle.putParcelable("OK",user);

                    Intent intent = new Intent();
                    intent.putExtra("UserBundle",bundle);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });

    }

    private boolean isValid(){
        if(etEmail.getText().toString().isEmpty()){
            Toast.makeText(ActivitateAutentificare.this,"Campul nu este completat",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if(etPassword.getText().toString().isEmpty()){
            Toast.makeText(ActivitateAutentificare.this, "Campul nu este completat",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if(!isEmailValid(etEmail.getText().toString())){
            Toast.makeText(ActivitateAutentificare.this,"Email-ul nu respecta formatul",
                    Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    public boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}