package com.example.shinyo.calculator_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtA, txtB;
    TextView txtRes;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate the views and buttons
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtRes = findViewById(R.id.txtRes);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        // Implement the OnClickListener for each button
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intAdd();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intSub();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intMul();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intDiv();
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intMod();
            }
        });
    }

    private void intAdd() {
        String strA = txtA.getText().toString();
        String strB = txtB.getText().toString();

        try {
            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);
            long res = (long)A + (long)B;
            txtRes.setText(res + "");
        } catch (NumberFormatException e) {
            txtRes.setText("The number is invalid, please re-enter");
        }
    }
    private void intSub() {
        String strA = txtA.getText().toString();
        String strB = txtB.getText().toString();

        try {
            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);
            long res = (long)A - (long)B;
            txtRes.setText(res + "");
        } catch (NumberFormatException e) {
            txtRes.setText("The number is invalid, please re-enter");
        }
    }
    private void intMul() {
        String strA = txtA.getText().toString();
        String strB = txtB.getText().toString();

        try {
            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);
            long res = (long)A * (long)B;
            txtRes.setText(res + "");
        } catch (NumberFormatException e) {
            txtRes.setText("The number is invalid, please re-enter");
        }
    }
    private void intDiv() {
        String strA = txtA.getText().toString();
        String strB = txtB.getText().toString();

        try {
            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);
            long res = (long)A / (long)B;
            txtRes.setText(res + "");
        } catch (NumberFormatException e) {
            txtRes.setText("The number is invalid, please re-enter");
        }
    }
    private void intMod() {
        String strA = txtA.getText().toString();
        String strB = txtB.getText().toString();

        try {
            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);
            long res = (long)A % (long)B;
            txtRes.setText(res + "");
        } catch (NumberFormatException e) {
            txtRes.setText("The number is invalid, please re-enter");
        }
    }
}


