package correcao.br.estudo.calculadora;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Developer on 07/11/2017.
 */

public class CalculadoraSimples extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnDividir, btnSubtrair, btnMultiplicar, btnSomar, btnLimpar, btnCalcular, btnPonto, btnIgual;
    private TextView txt;
    private double op1, op2, res;
    private int op;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_simples);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnCalcular = (Button) findViewById(R.id.btnIgual);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnIgual = (Button) findViewById(R.id.btnIgual);


        txt = (TextView) findViewById(R.id.txt);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"1";
                txt.setText(cap);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"2";
                txt.setText(cap);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"3";
                txt.setText(cap);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"4";
                txt.setText(cap);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"5";
                txt.setText(cap);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"6";
                txt.setText(cap);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"7";
                txt.setText(cap);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"8";
                txt.setText(cap);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"9";
                txt.setText(cap);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap=cap+"0";
                txt.setText(cap);
            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cap = txt.getText().toString();
                cap = cap+".";
                txt.setText(cap);
            }
        });

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String aux = txt.getText().toString();
                    op1 = Double.parseDouble(aux);

                }catch (NumberFormatException e){
                    return;
                }
                txt.setText("");
                op = 1;
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String aux = txt.getText().toString();
                    op1 = Double.parseDouble(aux);

                }catch (NumberFormatException e){
                    return;
                }
                txt.setText("");
                op = 2;
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String aux = txt.getText().toString();
                    op1 = Double.parseDouble(aux);

                }catch (NumberFormatException e){
                    return;
                }
                txt.setText("");
                op = 3;
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String aux = txt.getText().toString();
                    op1 = Double.parseDouble(aux);

                }catch (NumberFormatException e){
                    return;
                }
                txt.setText("");
                op = 4;
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                   txt.setText("");

                }catch (NumberFormatException e){
                    return;
                }
                txt.setText("");
                op = 5;
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String aux2 = txt.getText().toString();
                    op2 = Double.parseDouble(aux2);
                }catch (NumberFormatException e){

                }
                txt.setText("");

                switch (op){
                    case 1:
                        res = op1 + op2;
                        txt.setText(" "+res);
                        break;
                    case 2:
                        res = op1 - op2;
                        txt.setText(" "+res);
                        break;
                    case 3:
                        res = op1 * op2;
                        txt.setText(" "+res);
                        break;
                    case 4:
                        if(op2 == 0){
                            txt.setText("Número não divisor por 0");
                        }else{
                            res = op1 / op2;
                            txt.setText(" "+res);
                        }
                        break;
                    default:
                        txt.setText("Operador invalido");
                }
            }
        });
    }
}
