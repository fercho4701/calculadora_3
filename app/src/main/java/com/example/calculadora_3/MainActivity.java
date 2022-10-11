package com.example.calculadora_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView txtV;
    private CheckBox suma, divicion, resta, multiplicacion, cuadrado, radicacion;
    private Button validar, activar, desactivar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtV = findViewById(R.id.txtV);

        suma = findViewById(R.id.suma);
        multiplicacion = findViewById(R.id.multiplicacion);
        resta = findViewById(R.id.resta);
        divicion = findViewById(R.id.divicion);
        radicacion = findViewById(R.id.radicacion);
        cuadrado = findViewById(R.id.cuadrado);

        activar = findViewById(R.id.activar);
        desactivar = findViewById(R.id.desactivar);
        validar = findViewById(R.id.validar);
        desactivar = findViewById(R.id.desactivar);


        activar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.activar) {

                    suma.setChecked(true);
                    multiplicacion.setChecked(true);
                    radicacion.setChecked(true);
                    resta.setChecked(true);
                    divicion.setChecked(true);
                    cuadrado.setChecked(true);


                }


            }
        });


        desactivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.desactivar) {

                    suma.setChecked(false);
                    multiplicacion.setChecked(false);
                    radicacion.setChecked(false);
                    resta.setChecked(false);
                    divicion.setChecked(false);
                    cuadrado.setChecked(false);

                }


            }
        });




    }
    public void onclick(View view) {
        if (view.getId() == R.id.validar) {

            validar();


        }


    }
    public void validar(){

            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);
            String resu = "";
            if (suma.isChecked() == true) {

                int suma = nro1 + nro2;
                resu = "la suma es = " + suma;

            }
            if (resta.isChecked() == true) {

                int resta = nro1 - nro2;
                resu = resu + "la resta es = " + resta;


            } if (multiplicacion.isChecked() == true) {

                int multiplicacion = nro1 * nro2;
                resu = resu + "la multiplicación es = " + multiplicacion;


            } if (divicion.isChecked() == true) {

                double divicion = nro1 / nro2;
                resu = resu + "la divicion es = " + divicion;


            } if (cuadrado.isChecked() == true) {

                int exponencial = nro1*nro1;
                int exponencial1 = nro2*nro2;
                resu = resu + "la potencia 1 es = " + exponencial+" y de la 2 es = "+exponencial1;


            } if (radicacion.isChecked() == true) {

                double radicacion = Math.sqrt(nro1);
                double radicacion1 = Math.sqrt(nro2);
                resu = resu + "la raiz 1 es = " + radicacion+" la raiz 2 es = "+radicacion1;


            }
            txtV.setText(resu);






        }
    }









