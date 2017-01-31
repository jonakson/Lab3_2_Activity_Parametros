package com.example.jcalzado.lab3_2_activity_parametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class VisorWeb extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_web);

        webView = (WebView) findViewById(R.id.webView);

        Bundle b = getIntent().getExtras();
        String direccion = b.getString("url");
        webView.loadUrl("http://" + direccion);
    }

    public void salir (View v) {
        finish();
    }
}
