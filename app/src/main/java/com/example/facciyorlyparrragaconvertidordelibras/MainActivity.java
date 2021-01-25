package com.example.facciyorlyparrragaconvertidordelibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText txtLibra;
    Button btnConvertir;
    int nn;
    double resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLibra = (EditText) findViewById(R.id.txtLibra);
        btnConvertir = (Button) findViewById(R.id.btnConvertir);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GRAMOS.class);
                nn= Integer.parseInt(txtLibra.getText().toString());
                resul= (453.592)* nn;
                String este= String.valueOf(resul);
                Bundle bundle = new Bundle();
                bundle.putString("dato",este);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
