package com.bryankoproject.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by imbko on 8/3/2017.
 */
public class simpleCalc extends Fragment {
    private static final String TAG = "simpleCalc";

    private TextView result;
    private EditText num1, num2;
    private Button add, sub, mult, div;

    double calc;
    double intNum1, intNum2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.simple_calc,container,false);

        result = (TextView)view.findViewById(R.id.result);

        num1 = (EditText)view.findViewById(R.id.num1);
        num2 = (EditText)view.findViewById(R.id.num2);

        add = (Button) view.findViewById(R.id.add);
        sub = (Button)view.findViewById(R.id.sub);
        mult = (Button)view.findViewById(R.id.mult);
        div = (Button)view.findViewById(R.id.div);

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
                calc = intNum1 / intNum2;
                result.setText(String.valueOf(calc));

            }
        });

        return view;
    }
}
