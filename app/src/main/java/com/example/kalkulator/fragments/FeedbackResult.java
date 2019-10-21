package com.example.kalkulator.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kalkulator.R;
import com.example.kalkulator.util.FeedbackClass;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedbackResult extends Fragment {

    View view;
    FeedbackClass Feedback;
    TextView textNama, textUmur, textFeedback;


    public FeedbackResult() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_result, container, false);
        textNama = view.findViewById(R.id.nama);
        textUmur = view.findViewById(R.id.umur);
        textFeedback = view.findViewById(R.id.feedback);

        Bundle bundle = this.getArguments();

        Feedback = bundle.getParcelable("FeedbackClass");
        textNama.setText(Feedback.getNama());
        textFeedback.setText(String.valueOf(Feedback.getFeedback()));
        textUmur.setText(String.valueOf(Feedback.getUmur()));
        return view;
    }

}
