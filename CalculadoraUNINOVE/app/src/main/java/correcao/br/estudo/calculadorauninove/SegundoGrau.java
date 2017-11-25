package correcao.br.estudo.calculadorauninove;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by fernanda on 25/11/2017.
 */

public class SegundoGrau extends AppCompatActivity {

    private EditText numA, numB, numC;
    private TextView x1, x2, delta;
    private Button ok;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_grau);

        numA = (EditText) findViewById(R.id.valorA);
        numB = (EditText) findViewById(R.id.valorB);
        numC = (EditText) findViewById(R.id.valorC);
        ok = (Button) findViewById(R.id.btnOk);
        x1 = (TextView) findViewById(R.id.x1);
        x2 = (TextView) findViewById(R.id.x2);
        delta = (TextView) findViewById(R.id.delta);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtendoDelta(numA, numB, numC, delta);
                x1(numA, numB, numC, delta, x1);
                x2(numA, numB, numC, delta, x2);
            }
        });


    }
    public void obtendoDelta(EditText edtA, EditText edtB, EditText edtC, TextView tv){

        String a = edtA.getText().toString();
        String b = edtB.getText().toString();
        String c = edtC.getText().toString();

        double deltaA, deltaB, deltaC, deltaAlfa;
        try{
            deltaA = Double.parseDouble(a);
            deltaB = Double.parseDouble(b);
            deltaC = Double.parseDouble(c);

            deltaAlfa = (deltaB * deltaB) - 4 * deltaA * deltaC;

            tv.setText(String.valueOf(deltaAlfa));

        }catch (NumberFormatException e){
            tv.setText("Ocorreu um erro !!! ");
        }
    }
    public void x1(EditText edtA, EditText edtB, EditText edtC, TextView tv, TextView tv1){

        String a = edtA.getText().toString();
        String b = edtB.getText().toString();
        String c = edtC.getText().toString();

        try {
            double deltaA, deltaB, deltaC, deltaAlfa;

            deltaA = Double.parseDouble(a);
            deltaB = Double.parseDouble(b);
            deltaC = Double.parseDouble(c);

            deltaAlfa = Double.parseDouble(tv.getText().toString());

            if(deltaAlfa < 0 ){
                tv1.setText("Delta é negativo");
            }else{
                double raizPositiva;
                raizPositiva = ((-deltaB + Math.sqrt(deltaAlfa)) / (2 * deltaA));
                tv1.setText(String.valueOf(raizPositiva) );
            }
        } catch (Exception e) {
            tv.setText("Ocorreu um Erro !!! ");
        }
    }
    public void x2(EditText ea, EditText eb, EditText ec, TextView tv, TextView tv1){

        String a = ea.getText().toString();
        String b = eb.getText().toString();
        String c = ec.getText().toString();

        try {
            double deltaA, deltaB, deltaC, deltaAlfa;

            deltaA = Double.parseDouble(a);
            deltaB = Double.parseDouble(b);
            deltaC = Double.parseDouble(c);

            deltaAlfa = Double.parseDouble(tv.getText().toString());

            if(deltaAlfa < 0 ){
                tv1.setText("Delta é negativo");
            }else{
                double raizPositiva;
                raizPositiva = (( -deltaB - Math.sqrt(deltaAlfa) ) / (2 * deltaA));
                tv1.setText(String.valueOf(raizPositiva) );
            }
        } catch (Exception e) {
            tv1.setText("Ocorreu um Erro !!! ");
        }
    }

}
