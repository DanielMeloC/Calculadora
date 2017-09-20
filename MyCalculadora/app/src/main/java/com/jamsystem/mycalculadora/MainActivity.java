package com.jamsystem.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//variable//
    EditText num1, num2;
    Button suma, resta, mult, div;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1); //Alt + enter cast//
        num2 = (EditText) findViewById(R.id.num2);  //Alt + enter cast//

        suma = (Button) findViewById(R.id.sumar);   //Alt + enter cast//
        resta = (Button) findViewById(R.id.restar);  //Alt + enter cast to Android//
        mult  = (Button) findViewById(R.id. multiplicar);
        div  = (Button) findViewById(R.id.dividir);
        resultado = (TextView) findViewById(R.id.resultado);


        //Declarar los eventos//
        suma.setOnClickListener(this);   //Alt + enter Make to Android//
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);
        int rta=0;



        switch (v.getId()){
            case R.id.sumar:   // definir casos//
                rta=entero1+entero2;
                break;


            case R.id.restar:
                rta=entero1-entero2;
                break;


            case R.id.multiplicar:
                rta=entero1*entero2;
                break;


            case R.id.dividir:
                rta=entero1/entero2;

                break;
        }
         resultado.setText(""+rta);
    }

}
