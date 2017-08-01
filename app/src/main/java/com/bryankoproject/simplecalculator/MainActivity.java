package com.bryankoproject.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button add, sub, mult, div;

    double calc;
    double intNum1, intNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mult = (Button)findViewById(R.id.mult);
        div = (Button)findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View res) {
                intNum1 = Integer.parseInt(num1.getText().toString());
                intNum2 = Integer.parseInt(num2.getText().toString());
                calc = intNum1 + intNum2;
                result.setText(String.valueOf(calc));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View res) {
                intNum1 = Integer.parseInt(num1.getText().toString());
                intNum2 = Integer.parseInt(num2.getText().toString());
                calc = intNum1 - intNum2;
                result.setText(String.valueOf(calc));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View res) {
                intNum1 = Integer.parseInt(num1.getText().toString());
                intNum2 = Integer.parseInt(num2.getText().toString());
                calc = intNum1 * intNum2;
                result.setText(String.valueOf(calc));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View res) {
                intNum1 = Integer.parseInt(num1.getText().toString());
                intNum2 = Integer.parseInt(num2.getText().toString());
                try {
                    calc = intNum1 / intNum2;
                    result.setText(String.valueOf(calc));
                } catch(Exception e) {
                    result.setText("Cannot divide");
                }
            }
        });
    }
}
