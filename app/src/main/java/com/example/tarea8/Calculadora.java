package com.example.tarea8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Calculadora extends Fragment {
    private EditText etNum1, etNum2;
    private TextView tvResultado;
    private RadioButton rbSuma, rbResta, rbMulti, rbDivide;
    private Button btOperar;

    public Calculadora() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculadora, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etNum1 = (EditText) view.findViewById(R.id.etNum1);
        etNum2 = (EditText) view.findViewById(R.id.etNum2);
        tvResultado = (TextView) view.findViewById(R.id.tvResultado);
        rbSuma = (RadioButton) view.findViewById(R.id.rbSuma);
        rbResta = (RadioButton) view.findViewById(R.id.rbResta);
        rbMulti = (RadioButton) view.findViewById(R.id.rbMulti);
        rbDivide = (RadioButton) view.findViewById(R.id.rbDivide);
        btOperar = (Button) view.findViewById(R.id.btOperar);

        btOperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString())) {
                    Toast.makeText(getContext(), "Debes rellenar todos  campos", Toast.LENGTH_SHORT).show();
                } else {
                    double valor1 = Double.parseDouble(etNum1.getText().toString());
                    double valor2 = Double.parseDouble(etNum2.getText().toString());
                    

                    if (rbSuma.isChecked()) {

                        double suma = valor1 + valor2;
                        tvResultado.setText("Resultado: " + suma);

                    } else if (rbResta.isChecked()) {

                        double resta = valor1 - valor2;
                        tvResultado.setText("Resultado: " + resta);

                    } else if (rbMulti.isChecked()) {

                        double multi = valor1 * valor2;
                        tvResultado.setText("Resultado: " + multi);

                    } else if (rbDivide.isChecked()) {

                        if (!(valor1 == 0 || valor2 == 0)) {
                            double division = valor1 / valor2;
                            tvResultado.setText("Resultado: " + division);
                        } else {

                            tvResultado.setText("No es posible dividir entre 0");

                        }

                    } else {

                        Toast.makeText(getContext(), "No se ha seleccionado ninguna operación", Toast.LENGTH_LONG).show();
                    }

                }
            }


        });

    }


}