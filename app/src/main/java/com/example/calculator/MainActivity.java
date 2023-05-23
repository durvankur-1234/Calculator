package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCalculation;
    private TextView txtResult;

    private enum OPERATOR  { PLUS, SUBTRACT, MULTIPLY , DIVIDE , EQUAL};

    private String currentNumber ;
    private String StringNumberAtLeft ;
    private String StringNumberAtRight;
    private OPERATOR operator;
    private int calculationResult ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentNumber = "";
        calculationResult = 0;


        txtCalculation = findViewById(R.id.txtCalculations);
        txtResult = findViewById(R.id.txtResult);

        findViewById(R.id.btn7).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn8).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn9).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnPlus).setOnClickListener(MainActivity.this);

        findViewById(R.id.btn4).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn5).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn6).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnSubtract).setOnClickListener(MainActivity.this);

        findViewById(R.id.btn1).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn2).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn3).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnMultiply).setOnClickListener(MainActivity.this);

        findViewById(R.id.btnC).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn0).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnDivide).setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case (R.id.btn7):
                numberIsTapped(7);
             break;

            case (R.id.btn8):
                numberIsTapped(8);
                break;

            case (R.id.btn9):
                numberIsTapped(9);
                break;

            case (R.id.btnPlus):
                break;

            case (R.id.btn4):
                numberIsTapped(4);
                break;

            case (R.id.btn5):
                numberIsTapped(5);
                break;

            case (R.id.btn6):
                numberIsTapped(6);
                break;

            case (R.id.btnSubtract):

                break;

            case (R.id.btn1):
                numberIsTapped(1);
                break;

            case (R.id.btn2):
                numberIsTapped(2);
                break;

            case (R.id.btn3):
                numberIsTapped(3);
                break;

            case (R.id.btnMultiply):
                break;

            case (R.id.btnC):
                break;

            case (R.id.btn0):
                numberIsTapped(0);
                break;

            case (R.id.btnDivide):
                break;

        }




    }


    private void numberIsTapped(int tappedNumber){

        currentNumber += String.valueOf(tappedNumber);
        txtResult.setText(currentNumber);

    }
}