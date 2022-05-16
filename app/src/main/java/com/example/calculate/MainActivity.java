package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String operator;
    String oldNumber;
    Boolean isNew = true;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
    }

    public void clickNumber(View view) {
        if (isNew) {
            editText1.setText("");
            isNew = false;
        }

        String number = editText1.getText().toString();
        switch (view.getId()) {

            case R.id.button1:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "1";
                break;
            case R.id.button2:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "2";
                break;
            case R.id.button3:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "3";
                break;
            case R.id.button4:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "4";
                break;
            case R.id.button5:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "5";
                break;
            case R.id.button6:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                }
                number = number + "6";
                break;
            case R.id.button7:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                } else {
                    number = number + "7";
                }
                break;
            case R.id.button8:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                } else {
                    number = number + "8";
                }
                break;
            case R.id.button9:
                if (zeroIsFirst(number)) {
                    number = number.substring(1);
                } else {
                    number = number + "9";
                }
                break;
            case R.id.button0:
                if (zeroIsFirst(number) && number.length() == 1) {
                    number = "0";
                } else {
                    number = number + "0";
                }
                break;
            case R.id.buttonDot:
                if (dotIsPresent(number)) {
                } else {
                    number = number + ".";
                }
                break;
            case R.id.negative:
                if (numberIsZero(number)) {
                    number = "0";
                } else {
                    if (notDoubleNegative(number)) {
                        number = number.substring(1);
                    } else {
                        number = "-" + number;
                    }
                }
                break;


        }
        editText1.setText(number);
    }

    private boolean zeroIsFirst(String number) {
        if (number.equals("")) {
            return true;
        } else if (number.charAt(0) == '0') {
            return true;
        } else {
            return false;
        }
    }

    private boolean numberIsZero(String number) {
        if (number.equals("0") || number.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public void operations(View view) {
        isNew = true;
        oldNumber = editText1.getText().toString();


        switch (view.getId()) {
            case R.id.buttonMinus:
                operator = "-";
                break;
            case R.id.buttonMulti:
                operator = "*";
                break;
            case R.id.buttonPlus:
                operator = "+";
                break;
            case R.id.buttonDiv:
                operator = "/";
                break;
        }
    }

    public void clickEqual(View view) {
        String newNumber = editText1.getText().toString();
        Double result = 0.0;
        switch (operator) {
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;

        }
        editText1.setText(result + "");
    }

    public void DelClick(View view) {
        editText1.setText("0");
        isNew = true;
    }

    private boolean dotIsPresent(String number) {
        if (number.indexOf(".") == -1) {
            return false;
        } else {
            return true;
        }
    }

    private boolean notDoubleNegative(String number) {
        if (number.indexOf("-") == -1) {
            return false;
        } else {
            return true;
        }
    }
}