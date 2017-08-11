package com.tngp17.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int sum = 0;
    private TextView tvSign;
    private TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSign = (TextView) findViewById(R.id.tvSign);
        tvNumber = (TextView) findViewById(R.id.tvNumber);

        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnEleven = (Button) findViewById(R.id.btnEleven);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvSign.setText("");
                tvNumber.setText("");
                sum = 0;
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


        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 1));
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 3));
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 5));
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 7));
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 9));
            }
        });
        btnEleven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvNumber.setText(cal(tvSign.getText().toString(), 11));
            }
        });


    }

    private String cal(String Sign, int num) {
        if (Sign.equals("+")) {
            return "" + (sum += num);
        }
        if (Sign.equals("-")) {
            int res = sum - num;
            if (res <= 0) {
                sum = 0;
                tvSign.setText("");
                return "" + sum;
            }
            return "" + (sum -= num);
        }
        if (Sign.equals("")) {
            return "";
        }

        return "" + sum;
    }
}

