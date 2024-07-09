package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView user_input, output;
    AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSubs, btn_Divide, btn_Multiply, btnAC, btn_Equal;
    double result, stored_data;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        user_input = findViewById(R.id.user_input);
        output = findViewById(R.id.output);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubs = findViewById(R.id.btnSubs);
        btn_Multiply = findViewById(R.id.btn_Multiply);
        btn_Divide = findViewById(R.id.btn_Divide);
        btnAC = findViewById(R.id.btnAC);
        btn_Equal = findViewById(R.id.btn_Equal);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "1");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "2");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "3");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "4");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "5");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "6");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "7");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "8");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "9");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText().toString() + "0");
                stored_data = Integer.parseInt(user_input.getText().toString());
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(user_input.getText().toString());
                user_input.setText("");
                operator = "+";
            }
        });

        btnSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(user_input.getText().toString());
                user_input.setText("");
                operator = "-";
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(user_input.getText().toString());
                user_input.setText("");
                operator = "*";
            }
        });

        btn_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(user_input.getText().toString());
                user_input.setText("");
                operator = "/";
            }
        });

        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operator) {
                    case "+":
                        result += stored_data;
                        output.setText(String.valueOf(result));
                        break;

                    case "-":
                        result -= stored_data;
                        output.setText(String.valueOf(result));
                        break;

                    case "*":
                        result *= stored_data;
                        output.setText(String.valueOf(result));
                        break;

                    case "/":
                        result /= stored_data;
                        output.setText(String.valueOf(result));
                        break;

                    default:
                        System.out.println("Invalid...");
                        break;
                }
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText("");
                output.setText("");
            }
        });
    }
}