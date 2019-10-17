package com.example.kalkulator.fragments;


import android.content.Context;
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
public class PersegiFragment extends Fragment {

    EditText input_sisi;
    TextView hasilPersegi;
    Button hitung_Persegi;
    double sisi, hsk;


    public PersegiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_persegi, container, false);
        input_sisi =  view.findViewById(R.id.edt_sisi);
        hasilPersegi = view.findViewById(R.id.tv_result_persegi);
        hitung_Persegi = view.findViewById(R.id.btn_calculate_persegi);


        hitung_Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi = Double.valueOf(input_sisi.getText().toString());
                hsk = (sisi * sisi);
                hasilPersegi.setText(NumberFormat.getInstance().format(hsk));
            }
        });
        return view;
    }




}
