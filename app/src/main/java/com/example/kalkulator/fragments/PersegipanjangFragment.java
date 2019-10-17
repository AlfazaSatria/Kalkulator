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
public class PersegipanjangFragment extends Fragment {
    EditText input_panjang;
    EditText input_lebar;
    TextView hasilPersegipanjang;
    Button btn_calculate_persegipanjang;
    double panjang,lebar,hspp;


    public PersegipanjangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_persegipanjang, container, false);
        input_lebar =  view.findViewById(R.id.edt_width);
        input_panjang = view.findViewById(R.id.edt_length);
        btn_calculate_persegipanjang = view.findViewById(R.id.btn_calculate_persegipanjang);
        hasilPersegipanjang = view.findViewById(R.id.tv_result_persegipanjang);

        btn_calculate_persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.valueOf(input_panjang.getText().toString());

                lebar = Double.valueOf(input_lebar.getText().toString());
                hspp =(panjang * lebar);
                hasilPersegipanjang.setText(NumberFormat.getInstance().format(hspp));

            }

        });
        return view;
    }

}
