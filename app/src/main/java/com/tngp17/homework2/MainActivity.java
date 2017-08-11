package com.tngp17.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvSign = (TextView) findViewById(R.id.tvSign);
        final TextView tvNumber = (TextView) findViewById(R.id.tvNumber);

        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnEleven = (Button) findViewById(R.id.btnEleven);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("1");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("3");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("5");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("7");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("9");
            }
        });
        btnEleven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText("11");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvSign.setText("+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvSign.setText("-");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvSign.setText("");
                tvNumber.setText("");
            }
        });
    }
}
