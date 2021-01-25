package com.example.facciyorlyparrragaconvertidordelibras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class GRAMOS extends AppCompatActivity {

    TextView txtGramo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramos);

        txtGramo = (TextView) findViewById(R.id.txtGramo);
        Bundle bundle= this.getIntent().getExtras();
        txtGramo.setText(bundle.getString("dato"));




    }
}
