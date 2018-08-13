package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonDelS;
    private Button buttonDelR;
    private Button buttonAddS;
    private Button buttonAddR;
    private EditText editTotal;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddR = (Button) findViewById(R.id.buttonAddR);
        buttonAddS = (Button) findViewById(R.id.buttonAddS);
        buttonDelR = (Button) findViewById(R.id.buttonDelR);
        buttonDelS = (Button) findViewById(R.id.buttonDelS);

        buttonDelS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
