package com.example.ejercicioslayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private void modificartexto(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bt= (Button) findViewById(R.id.);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modificartexto();
                TextView tvNumero;
                String email="";
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){

                }

                TextUtils.isEmpty(email);

                email.isEmpty();





            }
        });

    }
}