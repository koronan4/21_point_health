package com.example.a21_point_health;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Firebase connection Success", Toast.LENGTH_LONG).show();

        btn = (Button)findViewById(R.id.boutonenvoi);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });





    }
    public void btnRegistration_Click(View v){
        Intent i = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(i);

    }

    public void btnLogin_Click(View v){
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

    }


}
