package com.example.activityejemplo2020;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class UtilidadGeneradora {

    public static LinearLayout generaPantalla(final Context ctx) {
        LinearLayout lay;
        LinearLayout.LayoutParams lp;
        TextView titulo;
        final EditText valor;
        Button btnSaludar;

        lay = new LinearLayout(ctx);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lay.setLayoutParams(lp);
        lay.setOrientation(LinearLayout.VERTICAL);
        titulo = new TextView(ctx);
        titulo.setText(ctx.getResources().getString(R.string.pregunta1));
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        titulo.setLayoutParams(lp);
        lay.addView(titulo);
        valor = new EditText(ctx);
        valor.setLayoutParams(lp);
        lay.addView(valor);
        btnSaludar = new Button(ctx);
        btnSaludar.setLayoutParams(lp);
        btnSaludar.setText("Saludar");
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Hola " + valor.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
        lay.addView(btnSaludar);
        return lay;
    }
}
