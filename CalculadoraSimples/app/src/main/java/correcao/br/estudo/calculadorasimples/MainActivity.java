package correcao.br.estudo.calculadorasimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcSimples;
    private Button btnSegundoGrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcSimples = (Button) findViewById(R.id.btnCalculadoraSimples);
        btnSegundoGrau = (Button) findViewById(R.id.btnSugundoGrau);


        btnCalcSimples.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, CalculadoraSimples.class));
            }
        });
        btnSegundoGrau.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SegundoGrau.class));
            }
        });


    }
}
