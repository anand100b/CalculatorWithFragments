package com.example.calculatorwithfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdditionFragment additionFragment = new AdditionFragment();

        this.getSupportFragmentManager().beginTransaction()
                .replace(R.id.additionFragmentContainer, additionFragment)
                .commit();

        MultiplicationFragment multiplicationFragment = new MultiplicationFragment();

        this.getSupportFragmentManager().beginTransaction()
                .replace(R.id.multiplicationFragmentContainer, multiplicationFragment)
                .commit();

    }
}
