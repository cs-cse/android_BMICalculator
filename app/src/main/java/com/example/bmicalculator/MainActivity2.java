package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calculateBMI(View view) {
      EditText  getHeight=findViewById(R.id.getHeight);
      EditText getWeight=findViewById(R.id.getWeight);
    Button buttononCalc=findViewById(R.id.buttonCalc);
      TextView textView=findViewById(R.id.textView4);
      TextView  res=findViewById(R.id.res);
      String message=null;

       double w=Double.parseDouble(getWeight.getText().toString());
       double h=Double.parseDouble(getHeight.getText().toString());
        double sq=h*h;
        double resBMI = w/sq;

        textView.setText(String.valueOf(resBMI));

        if(resBMI<18.5){
            message="Underweight";
        }
        else if(resBMI>18.5 && resBMI<25){
            message="Normal";

        }
        else if(resBMI>25) {
            message="Overweight";
        }

    res.setText(message);
    }


}