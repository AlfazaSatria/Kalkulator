package com.example.kalkulator.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.kalkulator.R;
import com.example.kalkulator.util.FeedbackClass;


public class Feedback extends Fragment implements View.OnClickListener {
    View view;
    Button button;
    EditText textNama, textUmur, textFeedback;



    public Feedback() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback, container, false);

        textNama = view.findViewById(R.id.fieldNama);
        textUmur = view.findViewById(R.id.fieldUmur);
        textFeedback = view.findViewById(R.id.fieldFeedback);
        button = view.findViewById(R.id.buttonSendFeedback);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String nama = textNama.getText().toString();
        int umur = Integer.parseInt(textUmur.getText().toString());
        String isifeedback = textFeedback.getText().toString();


        FeedbackClass feedback = new FeedbackClass(nama, isifeedback, umur);
        Bundle bundle = new Bundle();
        bundle.putParcelable("Feedback", feedback);
        Fragment Result = new FeedbackResult();
        Result.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, Result);
        fragmentTransaction.commit();
    }


}
