package com.example.jcalzado.lab3_2_activity_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUrl = (EditText) findViewById(R.id.inputUrl);
    }

    public void abrirWeb (View v) {
        Intent i = new Intent(this,VisorWeb.class);
        i.putExtra("url",inputUrl.getText().toString());
        startActivity(i);
    }
}
