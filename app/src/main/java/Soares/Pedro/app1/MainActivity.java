package Soares.Pedro.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //seleciono o botão da interface main
        Button btnEnviar =findViewById(R.id.btnEnviar);
        //crio o evento de clique
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //o que acontece ao clicar no botao
            public void onClick(View view) {
                //seleciono a caixa de texto
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //armazeno o texto dentro da caixa de texto
                String Texto = etDigiteAqui.getText().toString();
                //passa pra próxima interface
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                //escreve no meio da tela, a informação da caixa de texto
                intent.putExtra("Texto", Texto);
                startActivity(intent);
            }
        });
    }
}