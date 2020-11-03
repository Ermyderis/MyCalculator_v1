package com.example.mycalculator_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonDot, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonCE, buttonDEL, buttonDivision, buttonMultiplication, buttonroot, buttonMinus, buttonPlus, buttonEqual;
    TextView screen;
    boolean isNewOp = true;
    boolean oneDot = true;
    int todel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);

    }


    public void numberEvent(View view) {
        String number = screen.getText().toString();
    if(number.length()<10 || number.length() < 0) {
        if (isNewOp)
            screen.setText("");
        isNewOp = false;
         number = screen.getText().toString();
        switch (view.getId()) {
            case R.id.button0:
                number += "0";


                break;
            case R.id.button1:
                number += "1";

                break;
            case R.id.button2:
                number += "2";

                break;
            case R.id.button3:
                number += "3";

                break;
            case R.id.button4:
                number += "4";

                break;
            case R.id.button5:
                number += "5";

                break;
            case R.id.button6:
                number += "6";

                break;
            case R.id.button7:
                number += "7";

                break;
            case R.id.button8:
                number += "8";

                break;
            case R.id.button9:
                number += "9";
                break;
            case R.id.buttonDot:
                int find = 3;
                for(int i = 0; i < number.length(); i++) {
                    System.out.println(number.charAt(i));
                    String current = Character.toString(number.charAt(i));
                    if (current.contains(".")){
                        find = 1;
                        break;

                    } else find = 0;

                }
                if(find == 0){
                    number += ".";
                }

                break;
            case R.id.buttonPlusMinus:
                if (("-" + number).equals(number)) {
                    number = "+" + number;
                } else number = "-" + number;
                break;



        }

        screen.setText(number);
        System.out.println(number.length());

    }
    }

    public void acEvent(View view) {
        screen.setText("0");
        isNewOp = true;
        oneDot = true;
    }

    public void numberDel(View view) {
        String number = screen.getText().toString();

            number = number.substring(0, number.length() - 1);
            screen.setText(number);
            if(number.length() == 0) {
                screen.setText("0");
                isNewOp = true;


        }



        System.out.println(number.length());
    }

    public void numbersignchange(View view) {
        String number = screen.getText().toString();
        float f=Float.parseFloat(number);
        f = f * (-1);
        number = String.valueOf(f);
        screen.setText(number);
    }
}