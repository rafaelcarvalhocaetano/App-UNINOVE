package correcao.br.estudo.calculadorauninove;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fernanda on 25/11/2017.
 */

public class CalculadoraSimples extends AppCompatActivity {


    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdc, btnSub, btnDiv, btnMult, btnPonto, btnIgual, btnLiButton;
    private TextView resultado;
    private double v1, v2, resultReal;
    private int operador;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_simples);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        resultado = (TextView) findViewById(R.id.tvResultado);
        btnAdc = (Button) findViewById(R.id.btnAdicao);
        btnDiv = (Button) findViewById(R.id.btnDivisao);
        btnMult = (Button) findViewById(R.id.btnMultiplicacao);
        btnSub = (Button) findViewById(R.id.btnSubtracao);
        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnLiButton = (Button) findViewById(R.id.btnLimpar);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"1";
                resultado.setText(num);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"2";
                resultado.setText(num);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"3";
                resultado.setText(num);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"4";
                resultado.setText(num);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"5";
                resultado.setText(num);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"6";
                resultado.setText(num);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"7";
                resultado.setText(num);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"8";
                resultado.setText(num);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"9";
                resultado.setText(num);

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +"0";
                resultado.setText(num);

            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = resultado.getText().toString();
                num = num +".";
                resultado.setText(num);

            }
        });
        btnAdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String num = resultado.getText().toString();
                    v1 = Double.parseDouble(num);

                }catch (NumberFormatException e){
                    String erro = "Erro no App ";
                    final Context cont = getApplication();
                    int tempo = Toast.LENGTH_SHORT;
                    Toast t = Toast.makeText(cont, erro, tempo);
                    t.show();
                    return;
                }
                resultado.setText("");
                operador = 1;
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String num = resultado.getText().toString();
                    v1 = Double.parseDouble(num);

                }catch (NumberFormatException e){
                    String erro = "Erro no App ";
                    final Context cont = getApplication();
                    int tempo = Toast.LENGTH_SHORT;
                    Toast t = Toast.makeText(cont, erro, tempo);
                    t.show();
                    return;
                }
                resultado.setText("");
                operador = 2;
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String num = resultado.getText().toString();
                    v1 = Double.parseDouble(num);

                }catch (NumberFormatException e){
                    String erro = "Erro no App ";
                    final Context cont = getApplication();
                    int tempo = Toast.LENGTH_SHORT;
                    Toast t = Toast.makeText(cont, erro, tempo);
                    t.show();
                    return;
                }
                resultado.setText("");
                operador = 3;
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String num = resultado.getText().toString();
                    v1 = Double.parseDouble(num);
                }catch (NumberFormatException e){
                    String erro = "Erro no App ";
                    final Context cont = getApplication();
                    int tempo = Toast.LENGTH_SHORT;
                    Toast t = Toast.makeText(cont, erro, tempo);
                    t.show();
                    return;
                }
                resultado.setText("");
                operador = 4;
            }
        });


        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String num2 = resultado.getText().toString();
                    v2 = Double.parseDouble(num2);

                }catch (NumberFormatException exp){
                    String erro = "Erro no App ";
                    final Context cont = getApplication();
                    int tempo = Toast.LENGTH_SHORT;
                    Toast t = Toast.makeText(cont, erro, tempo);
                    t.show();
                }
                resultado.setText("");
                if(operador == 1){
                    resultReal = v1 + v2;
                    resultado.setText(resultReal+"");
                }else  if(operador == 2){
                    resultReal = v1 - v2;
                    resultado.setText(resultReal+"");
                }else if(operador == 3){
                    if(v2 == 0){
                        resultado.setText("Não Divisivel por 0 ");
                    }else{
                        resultReal = v1 / v2;
                        resultado.setText(resultReal+"");
                    }

                }else if(operador == 4){
                    resultReal = v1 * v2;
                    resultado.setText(resultReal+"");
                }
            }
        });
        btnLiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
            }
        });
    }
}
