package com.example.activityejemplo2020;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class Ejemplo2Activity extends AppCompatActivity {
    /*
    private LinearLayout lay;
    private LinearLayout.LayoutParams lp;
    private TextView titulo;
    private EditText valor;
    private Button btnSaludar;
*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        lay = new LinearLayout(this);
        lp = new LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        lay.setLayoutParams(lp);
        lay.setOrientation(LinearLayout.VERTICAL);
        titulo = new TextView(this);
        titulo.setText("Ingrese un Nombre");
        lp = new LinearLayout.LayoutParams(MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        titulo.setLayoutParams(lp);
        lay.addView(titulo);
        valor = new EditText(this);
        valor.setLayoutParams(lp);
        lay.addView(valor);
        btnSaludar = new Button(this);
        btnSaludar.setLayoutParams(lp);
        btnSaludar.setText("Saludar");
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hola " + valor.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
        lay.addView(btnSaludar);

         */
        setContentView(UtilidadGeneradora.generaPantalla(this));
    }
}
