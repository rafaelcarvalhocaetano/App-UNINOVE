package correcao.br.estudo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSimples, btnSegundoGrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegundoGrau = (Button) findViewById(R.id.btnSegundoGrau);
        btnSimples = (Button) findViewById(R.id.btnSimples);


        btnSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CalculadoraSimples.class));
            }
        });

        btnSegundoGrau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SegundoGrau.class));
            }
        });








    }
}
