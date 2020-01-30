package br.com.alura.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import br.com.alura.aluraviagens.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "ALURA VIAGENS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        setTitle(TITULO_APPBAR);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostraListaPacotes();
            }
        }, 2000);

    }

    private void mostraListaPacotes() {
        Intent intent = new Intent(SplashScreenActivity.this, ListaPacotesActivity.class);
        startActivity(intent);
    }
}
