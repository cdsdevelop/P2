package android.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    EditText etu, etp;
    Button btl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etu = findViewById(R.id.etu);
        etp = findViewById(R.id.etp);
        btl = findViewById(R.id.btl);



        
        btl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etu.getText().toString().equals("gph@abc.com") && etp.getText().toString().equals("12345"))
                {

                    Intent i = new Intent(MainActivity.this,lpactivity.class);
                    startActivity(i);
                }

                else{

                    Toast.makeText(getApplicationContext(), "incorrect details", Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}