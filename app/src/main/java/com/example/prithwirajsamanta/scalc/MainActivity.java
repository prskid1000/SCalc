package com.example.prithwirajsamanta.scalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText firstNumber;
    EditText secondNumber;
    TextView result;
    double num1, num2, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.editText);
        secondNumber = findViewById(R.id.editText2);
        result = findViewById(R.id.textView);
    }

    public void clear(View v){
        firstNumber.setText("");
        secondNumber.setText("");
        result.setText("");
    }

    public void sum(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = num1 + num2;
        result.setText(Double.toString(answer));
    }

    public void subtract(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = num1 - num2;
        result.setText(Double.toString(answer));
    }

    public void multiply(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = num1 * num2;
        result.setText(Double.toString(answer));
    }

    public void divide(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = num1 / num2;
        result.setText(Double.toString(answer));
    }

    public void modulus(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = num1 % num2;
        result.setText(Double.toString(answer));
    }

    public void exponent(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.exp(num1);
        result.setText(Double.toString(answer));
    }

    public void logarithem(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.log(num1);
        result.setText(Double.toString(answer));
    }

    public void fsin(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.sin(Math.toRadians(num1));
        result.setText(Double.toString(answer));
    }

    public void aasin(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.toDegrees(Math.asin(num1));
        result.setText(Double.toString(answer));
    }

    public void fcos(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.cos(Math.toRadians(num1));
        result.setText(Double.toString(answer));
    }

    public void aacos(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.toDegrees(Math.acos(num1));
        result.setText(Double.toString(answer));
    }

    public void ftan(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.tan(Math.toRadians(num1));
        result.setText(Double.toString(answer));
    }

    public void aatan(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.toDegrees(Math.atan(num1));
        result.setText(Double.toString(answer));
    }

    public void cube(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = num1 * num1 * num1;
        result.setText(Double.toString(answer));
    }

    public void square(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = num1 * num1;
        result.setText(Double.toString(answer));
    }

    public void squareroot(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.sqrt(num1);
        result.setText(Double.toString(answer));
    }

    public void powab(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        answer = Math.pow(num1, num2);
        result.setText(Double.toString(answer));
    }

    public void cuberoot(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        answer = Math.cbrt(num1);
        result.setText(Double.toString(answer));
    }
}
