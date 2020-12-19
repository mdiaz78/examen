package com.example.examen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio1 extends AppCompatActivity {

    private EditText etNumero;
    private Button btnEvaluar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio1);

        etNumero = findViewById(R.id.et_number);
        btnEvaluar = findViewById(R.id.btn_evaluate);
        tvResultado = findViewById(R.id.tv_result);

        btnEvaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etNumero.getText().length()==0){
                    Toast.makeText(btnEvaluar.getContext(),
                            getString(R.string.ejercicio1_error),
                            Toast.LENGTH_LONG)
                            .show();
                    etNumero.requestFocus();
                    return;
                }
                calcula();
            }
        });
    }

    private void calcula(){
        int numero = Integer.parseInt(etNumero.getText().toString());
        boolean flag=false;
        for(int i =2; i < numero; i++){
            if(numero % i==0){
                flag=true;
            }
        }
        if(flag==true){
            tvResultado.setText(getString(R.string.ejercicio1_no));
        } else {
            tvResultado.setText(getString(R.string.ejercicio1_yes));
        }

    }
}
