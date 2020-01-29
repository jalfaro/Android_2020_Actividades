package com.example.activityejemplo2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtOperando1, txtOperando2;
    private Spinner spnOperacion;
    private TextView txtRespuesta;
    private Button btnOperacion;
    private LinearLayout lytRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOperando1 = findViewById(R.id.txtOp1);
        txtOperando2 = findViewById(R.id.txtOp2);
        spnOperacion = findViewById(R.id.spnOp);
        txtRespuesta = findViewById(R.id.txtRespuesta);
        btnOperacion = findViewById(R.id.btnOperar);
        lytRes = findViewById(R.id.lytResultado);
        btnOperacion.setOnClickListener(this);
        lytRes.setVisibility(View.GONE);
/*
        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Saludo Prueba", Toast.LENGTH_LONG).show();
            }
        });
 */
    }

    @Override
    public void onClick(View v) {
        String op1, op2;
        int resultado = 0;
        if (v.getId() == R.id.btnOperar) {
           // Toast.makeText(getBaseContext(), "Saludo Segunda Opcion", Toast.LENGTH_LONG).show();
            op1 = txtOperando1.getText().toString();
            op2 = txtOperando2.getText().toString();
            if (!op1.equals("") && !op2.equals("")) {
                if (spnOperacion.getSelectedItemPosition() == 0 ) { // +
                    resultado = Integer.parseInt(op1) + Integer.parseInt(op2);
                } else if (spnOperacion.getSelectedItemPosition() == 1) { // -
                    resultado = Integer.parseInt(op1) - Integer.parseInt(op2);
                } else if (spnOperacion.getSelectedItemPosition() == 2) { // *
                    resultado = Integer.parseInt(op1) * Integer.parseInt(op2);
                } else if (spnOperacion.getSelectedItemPosition() == 3) { // -
                    resultado = Integer.parseInt(op1) / Integer.parseInt(op2);
                }
                txtRespuesta.setText(resultado + "");
                txtOperando2.setText("");
                txtOperando1.setText("");
                lytRes.setVisibility(View.VISIBLE);
            } else  {
                Toast.makeText(getBaseContext(), "No es posible operar pues no hay dos numeros", Toast.LENGTH_LONG).show();
                lytRes.setVisibility(View.GONE);
            }
        }
    }
}
