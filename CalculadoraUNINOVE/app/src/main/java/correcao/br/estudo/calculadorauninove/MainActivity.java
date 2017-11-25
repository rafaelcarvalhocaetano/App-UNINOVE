package correcao.br.estudo.calculadorauninove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSimples, btn2grau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSimples = (Button) findViewById(R.id.btn1);
        btn2grau = (Button) findViewById(R.id.btn2);


        btnSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CalculadoraSimples.class));
            }
        });
        btn2grau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SegundoGrau.class));
            }
        });

    }
}
