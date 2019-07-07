package com.example.a21_point_health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AjouterPressionActivity extends AppCompatActivity {

    private Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_pression);

        btn = (Button)findViewById(R.id.boutonenvoi);
        btn2 = (Button)findViewById(R.id.boutonenvoi2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AjouterPressionActivity.this, HomeActivity.class);
                AjouterPressionActivity.this.startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AjouterPressionActivity.this, HomeActivity.class);
                AjouterPressionActivity.this.startActivity(intent);

            }
        });
    }
}
