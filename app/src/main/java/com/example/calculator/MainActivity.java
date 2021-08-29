package com.example.calculator;

import org.mariuszgromada.math.mxparser.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    boolean plusisclicked=true;
    boolean eqlisclicked=false;
    boolean isnewop=true;
    boolean isclicked=true;
    String newNumber="" ;
    String oldNumber="";
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView=findViewById(R.id.textview_1);
        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              textView.setText("");
              op="";
              isnewop=true;
            }
        });
        Button cross=findViewById(R.id.cross);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textView.setText(textView.getText().subSequence(0, textView.length() - 1));
                }
                catch (Exception e){
                    textView.setText("");
                }
            }
        });
        Button equal=findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqlisclicked=true;
                try{
                    String userExpression=textView.getText().toString();

                    Expression exp=new Expression(userExpression);

                    String result=String.valueOf(exp.calculate());
                    textView.setText(result);

//                int length=textView.length();
//                newNumber =textView.getText().toString().substring(oldNumber.length()+1,length);
//                double result=0;
//                switch (op){
//                    case "+" :
//                        result=Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
//                        break;
//                    case "-" :
//                        result=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
//                        break;
//                    case "/" :
//                        result=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
//                        break;
//                    case "*" :
//                        result=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
//                        break;
//                }
//                textView.setText(textView.getText().toString()+"\n"+"="+result+"");
               }
                catch (Exception e){
                    textView.setText("ERROR");
                }
            }
        });
        Button mul=findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textView.setText(textView.getText()+"*");
            }
        });
        Button divide=findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"/");
            }
        });
        Button add=findViewById(R.id.plus);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"+");
            }
        });
        Button minus=findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"-");
            }
        });
        Button per=findViewById(R.id.percent);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textView.setText(Double.parseDouble(textView.getText().toString()) / 100 + "");
                }
                catch (Exception e){
                    textView.setText("");
                }
            }
        });
        Button plsmin=findViewById(R.id.plsmin);
        plsmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               
            }
        });
        Button button1 = findViewById(R.id.one);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });
        Button button2 = findViewById(R.id.two);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });
        Button button3 = findViewById(R.id.three);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });
        Button button4 = findViewById(R.id.four);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });
        Button button5 = findViewById(R.id.five);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });
        Button button6 = findViewById(R.id.six);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });
        Button button7 = findViewById(R.id.seven);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });
        Button button8 = findViewById(R.id.eight);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });
        Button button9 = findViewById(R.id.nine);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
        Button button0 = findViewById(R.id.zero);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });
        Button point=findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isclicked || eqlisclicked==false) textView.setText(textView.getText()+".");
                isclicked=false;
            }
        });
    }
}