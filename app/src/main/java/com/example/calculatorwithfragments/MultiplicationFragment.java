package com.example.calculatorwithfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MultiplicationFragment extends Fragment {
    EditText op1;
    EditText op2;
    TextView result;
    Button multiplicationButton;



    public MultiplicationFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_multiplication, container, false);

        op1 = view.findViewById(R.id.op1EditText);
        op2 = view.findViewById(R.id.op2EditText);
        result = view.findViewById(R.id.multiplicationResultTextView5);
        multiplicationButton = view.findViewById(R.id.multiplicationButton);

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer value1 = Integer.valueOf(op1.getText().toString());
                Integer value2 = Integer.valueOf(op2.getText().toString());
                Integer res = value1*value2;
                result.setText(res.toString());
            }
        });



       return view;
    }

}
