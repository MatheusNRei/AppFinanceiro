package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int op;
    Button     BttnCalc,BttnClear;
    Double      CDIBaseCalc,CDIRealCalc,Tax;
    EditText   CDIBase,CDIReal;
    RadioGroup RadGroupOp;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BttnCalc    = findViewById(R.id.BttnCalc);
        BttnClear   = findViewById(R.id.BttnClear);
        CDIBase  = findViewById(R.id.CDIBase);
        CDIReal  = findViewById(R.id.CDIReal);
        RadGroupOp  = findViewById(R.id.RadGroupOp);
        RadGroupOp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.Rad180) {
                    op = 1;
                    Tax=22.5; //Valor de Imposto
                    CDIBaseCalc=Double.parseDouble(CDIBase.getText().toString().trim()); //Transfere o valor de CDIBase para uma variavel
                    CDIRealCalc= (CDIBaseCalc)*(1-(Tax)/100);//Calcula o CDI Real
                    CDIReal.setText(Double.toString(CDIRealCalc));//Exibe no o CDI Real no campo apropriado
                }
                    else if (i== R.id.Rad360) {
                        op=2;
                        Tax=20.0; //Valor de Imposto
                        CDIBaseCalc=Double.parseDouble(CDIBase.getText().toString().trim()); //Transfere o valor de CDIBase para uma variavel
                        CDIRealCalc= (CDIBaseCalc)*(1-(Tax)/100); //Calcula o CDI Real
                        CDIReal.setText(Double.toString(CDIRealCalc)); //Exibe no o CDI Real no campo apropriado
                    }
                    else if (i==R.id.Rad720) {
                        op = 3;
                        Tax=17.5; //Valor de Imposto
                        CDIBaseCalc=Double.parseDouble(CDIBase.getText().toString().trim()); //Transfere o valor de CDIBase para uma variavel
                        CDIRealCalc= (CDIBaseCalc)*(1-(Tax)/100); //Calcula o CDI Real
                        CDIReal.setText(Double.toString(CDIRealCalc)); //Exibe no o CDI Real no campo apropriado
                    }
                    else {
                        op=4;
                        Tax=15.0; //Valor de Imposto
                        CDIBaseCalc=Double.parseDouble(CDIBase.getText().toString().trim()); //Transfere o valor de CDIBase para uma variavel
                        CDIRealCalc= (CDIBaseCalc)*(1-(Tax)/100); //Calcula o CDI Real
                        CDIReal.setText(Double.toString(CDIRealCalc)); //Exibe no o CDI Real no campo apropriado
                    }

            }
        });
    }


    }

