package correcao.br.estudo.calculadora;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rafael Carvalho on 07/11/2017.
 */

public class SegundoGrau extends AppCompatActivity {

    private TextView delta, raizPositiva, raizNegativa;
    private Button btnResultado;
    private EditText editA, editB, editC;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_grau);

        btnResultado = (Button) findViewById(R.id.btnResultado);

        delta = (TextView) findViewById(R.id.delta);
        raizPositiva = (TextView) findViewById(R.id.raizPositiva);
        raizNegativa = (TextView) findViewById(R.id.raizNegativa);

        editA = (EditText) findViewById(R.id.num1);
        editB = (EditText) findViewById(R.id.num2);
        editC = (EditText) findViewById(R.id.num3);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getDelta(editA, editB, editC, delta);
                getRaizPositiva(editA, editB, editC, delta, raizPositiva);
                getRaizNegativa(editA, editB, editC, delta, raizNegativa);

            }
        });

    }
    public void getDelta(EditText ea, EditText eb, EditText ec, TextView tv){

        String a = ea.getText().toString();
        String b = eb.getText().toString();
        String c = ec.getText().toString();

        double da, db, dc, delta;
        try{
            da = Double.parseDouble(a);
            db = Double.parseDouble(b);
            dc = Double.parseDouble(c);

            delta = (db * db) - 4 * da * dc;

            tv.setText(String.valueOf(delta));

        }catch (NumberFormatException e){
            tv.setText("Erro ... ");
        }
    }
    public void getRaizPositiva(EditText ea, EditText eb, EditText ec, TextView tv, TextView tv1){

        String a = ea.getText().toString();
        String b = eb.getText().toString();
        String c = ec.getText().toString();

        try {
            double da, db, dc, delta;

            da = Double.parseDouble(a);
            db = Double.parseDouble(b);
            dc = Double.parseDouble(c);

            delta = Double.parseDouble(tv.getText().toString());

            if(delta < 0 ){
                tv1.setText("Delta é negativo");
            }else{
                double raizPositiva;
                raizPositiva = ((-db + Math.sqrt(delta)) / (2 * da));
                tv1.setText(String.valueOf(raizPositiva) );
            }
        } catch (Exception e) {
            tv.setText("Erro ...");
        }
    }
    public void getRaizNegativa(EditText ea, EditText eb, EditText ec, TextView tv, TextView tv1){

        String a = ea.getText().toString();
        String b = eb.getText().toString();
        String c = ec.getText().toString();

        try {
            double da, db, dc, delta;

            da = Double.parseDouble(a);
            db = Double.parseDouble(b);
            dc = Double.parseDouble(c);

            delta = Double.parseDouble(tv.getText().toString());

            if(delta < 0 ){
                tv1.setText("Delta é negativo");
            }else{
                double raizPositiva;
                raizPositiva = (( -db - Math.sqrt(delta) ) / (2 * da));
                tv1.setText(String.valueOf(raizPositiva) );
            }
        } catch (Exception e) {
            tv1.setText("Erro ... ");
        }
    }


}
