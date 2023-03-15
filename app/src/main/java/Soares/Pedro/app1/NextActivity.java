package Soares.Pedro.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent();
        //recebe o texto da interface interior
        String texto = intent.getStringExtra("Texto");
        //seleciona a label da interface
        TextView tvExibir = findViewById(R.id.tvExibir);
        //reescreve na label com o texto dado
        tvExibir.setText(texto);

    }
}