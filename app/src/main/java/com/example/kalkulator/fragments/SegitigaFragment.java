package com.example.kalkulator.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulator.R;

import java.text.NumberFormat;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaFragment extends Fragment {
    EditText input_alas;
    EditText input_tinggi;
    TextView hasilSegitiga;
    Button btn_calculate_segitiga;
    double alas,tinggi,hss;


    public SegitigaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_segitiga, container, false);
        input_alas =  view.findViewById(R.id.edt_alas);
        input_tinggi = view.findViewById(R.id.edt_tinggi);
        btn_calculate_segitiga = view.findViewById(R.id.btn_calculate_segitiga);
        hasilSegitiga = view.findViewById(R.id.tv_result_segitiga);

        btn_calculate_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alas = Double.valueOf(input_alas.getText().toString());

                tinggi = Double.valueOf(input_tinggi.getText().toString());
                hss =(0.5* alas * tinggi);
                hasilSegitiga.setText(NumberFormat.getInstance().format(hss));

            }

        });
        return view;
    }

}
