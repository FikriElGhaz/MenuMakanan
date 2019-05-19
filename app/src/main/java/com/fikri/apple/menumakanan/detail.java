package com.fikri.apple.menumakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class detail extends AppCompatActivity {

    WebView web;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costom);

        web = findViewById(R.id.web);
        foto = findViewById(R.id.imgMakanan);

        Intent detail = getIntent();
        detail.getIntExtra("Posisi", 0);
        String link = detail.getStringExtra("Link");
        int gambar = detail.getIntExtra("foto", 0);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(link);
        foto.setImageResource(gambar);





    }
}
