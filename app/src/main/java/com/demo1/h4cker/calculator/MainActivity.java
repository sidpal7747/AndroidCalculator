package com.demo1.h4cker.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num;
    String op;
    boolean check = false;
    String str="";
    int n,temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText)findViewById(R.id.display);
        num.setText("0");
    }
    public void one(View v1){
        str += 1;
        num.setText(""+str);
        check = true;
    }
    public void two(View v1){
        str += 2;
        num.setText(""+str);
        check = true;
    }
    public void four(View v1){
        str += 4;
        num.setText(""+str);
        check = true;
    }
    public void five(View v1){
        str += 5;
        num.setText(""+str);
        check = true;
    }
    public void six(View v1){
        str += 6;
        num.setText(""+str);
        check = true;
    }
    public void seven(View v1){
        str += 7;
        num.setText(""+str);
        check = true;
    }
    public void eight(View v1){
        str += 8;
        num.setText(""+str);
        check = true;
    }
    public void nine(View v1){
        str += 9;
        num.setText(""+str);
        check = true;
    }
    public void zero(View v1){
        str += 0;
        num.setText(""+str);
        check = true;
    }
    public void three(View view){
        str += 3;
        num.setText("" + str);
        check = true;
    }
    public void plus(View v){
       add();
    }
    public void minus(View v){
        subtract();
    }
    public void mul(View v){
       multiply();
    }
    public void divide(View v){
        divide();
    }
    public void equal(View v2){
       switch (op){
           case "+":
               add();
               break;
           case "-":
               subtract();
               break;
           case "*":
               multiply();
               break;
           case "/":
               divide();
               break;

       }
    }
    public void add(){
        try {
            if(check){
            n = Integer.parseInt(num.getText().toString());
            temp += n;
            num.setText(""+temp);
                check = false;
            str = "";
        }}catch (Exception e){
            e.printStackTrace();
        }
        op = "+";
    }
    public void subtract(){
        try {
            if(check){
            n = Integer.parseInt(str);

                if(temp==0){
                    temp -= n;
                temp = Math.abs(temp);
                num.setText(""+temp);
            }else{
                temp -= n;
                num.setText(""+temp);
                }
        }}catch (Exception e){
            e.printStackTrace();
        }
        check = false;
        str = "";
        op = "-";
    }
    public void multiply(){
        try {
            if(check){
            n = Integer.parseInt(num.getText().toString());
            if(temp==0){
                temp = n;
                num.setText(""+n);
            }else {
                temp *= n;
                num.setText("" +temp);
            }
            check = false;
            str = "";
        }}catch (Exception e){
            e.printStackTrace();
        }
        op = "*";
    }
    public void divide(){
        try {
            if(check){
            n = Integer.parseInt(num.getText().toString());
                if(temp==0){
                temp = n;
            num.setText(""+n);
                }
                else {
                    temp /= n;
                    num.setText(""+temp);
                }
                check = false;
            str = "";
        }}catch (Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
        op = "/";
    }
    public void clear(View view){
        num.setText("0");
        str = "";
        temp = 0;

    }
}
