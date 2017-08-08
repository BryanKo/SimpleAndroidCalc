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
public class btnCalc extends Fragment {
    private static final String TAG = "btnCalc";

    private Button btnClear, btnPosNeg, btnMod, btnDel,
                   btnSeven, btnEight, btnNine, btnDiv,
                   btnFour, btnFive, btnSix, btnMult,
                   btnOne, btnTwo, btnThree, btnSub,
                   btnZero, btnDec, btnEqual, btnAdd;

    private TextView txtInsert, txtPrev;

    private double var1, var2, result;

    private String currVar;

    private boolean add, sub, mult, div, mod, equal;

    public void eqCheck() {
        if (equal == true) {
            txtPrev.setText("Ans="+result+"");
            txtInsert.setText(null);
            equal = false;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.btn_calc,container,false);

        btnClear = (Button) view.findViewById(R.id.btnClear);
        btnPosNeg = (Button) view.findViewById(R.id.btnPosNeg);
        btnMod = (Button) view.findViewById(R.id.btnMod);
        btnDel = (Button) view.findViewById(R.id.btnDel);

        btnSeven = (Button) view.findViewById(R.id.btnSeven);
        btnEight = (Button) view.findViewById(R.id.btnEight);
        btnNine = (Button) view.findViewById(R.id.btnNine);
        btnDiv = (Button) view.findViewById(R.id.btnDiv);

        btnFour = (Button) view.findViewById(R.id.btnFour);
        btnFive = (Button) view.findViewById(R.id.btnFive);
        btnSix = (Button) view.findViewById(R.id.btnSix);
        btnMult = (Button) view.findViewById(R.id.btnMult);

        btnOne = (Button) view.findViewById(R.id.btnOne);
        btnTwo = (Button) view.findViewById(R.id.btnTwo);
        btnThree = (Button) view.findViewById(R.id.btnThree);
        btnSub = (Button) view.findViewById(R.id.btnSub);

        btnZero = (Button) view.findViewById(R.id.btnZero);
        btnDec = (Button) view.findViewById(R.id.btnDec);
        btnEqual = (Button) view.findViewById(R.id.btnEqual);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);

        txtInsert = (TextView) view.findViewById(R.id.txtInsert);
        txtPrev = (TextView) view.findViewById(R.id.txtPrev);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInsert.setText(null);
            }
        });
        btnPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                var1 = var1 * -1;
                txtInsert.setText(var1+"");
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                mod=true;
                txtInsert.setText(null);
                txtPrev.setText(var1+"%");
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*var1 = Double.parseDouble(txtInsert.getText()+"");*/
                currVar = txtInsert.getText().toString();
                currVar = currVar.substring(0, currVar.length() - 1);
                txtInsert.setText(currVar+"");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"9");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                div=true;
                txtInsert.setText(null);
                txtPrev.setText(var1+"/");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"6");
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                mult=true;
                txtInsert.setText(null);
                txtPrev.setText(var1+"*");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"3");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                sub=true;
                txtInsert.setText(null);
                txtPrev.setText(var1+"-");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqCheck();
                txtInsert.setText(txtInsert.getText()+"0");
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInsert.setText(txtInsert.getText()+".");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txtInsert.getText()+"");
                if (add == true) {
                    txtInsert.setText(var1+var2+"");
                    txtPrev.append(var2+"=");
                    add = false;
                } else if (sub == true) {
                    txtInsert.setText(var1-var2+"");
                    txtPrev.append(var2+"=");
                    sub = false;
                } else if (mult == true) {
                    txtInsert.setText(var1*var2+"");
                    txtPrev.append(var2+"=");
                    mult = false;
                } else if (div == true) {
                    txtInsert.setText(var1/var2+"");
                    txtPrev.append(var2+"=");
                    div = false;
                } else if (mod == true) {
                    txtInsert.setText(var1%var2+"");
                    txtPrev.append(var2+"=");
                    mod = false;
                }
                result = Double.parseDouble(txtInsert.getText()+"");
                equal = true;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(txtInsert.getText()+"");
                add=true;
                txtInsert.setText(null);
                txtPrev.setText(var1+"+");
            }
        });

        return view;
    }
}
