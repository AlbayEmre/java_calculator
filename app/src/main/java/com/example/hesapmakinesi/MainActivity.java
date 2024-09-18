package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         number1Text = findViewById(R.id.Number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultText = findViewById(R.id.resulttextt);


    }

    public void sum(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }
        else
        {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 +number2;
            resultText.setText("Result :" + result);
        }

    }
    public void deduct(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }
        else
        {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result :" + result);
        }
    }

    public void multiplay(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }
        else
        {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 * number2;
        resultText.setText("Result :" + result);
        }
    }

    public void divide(View view)
    {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Lutfen bir deger giriniz.");
        }
        else if(number2Text.getText().toString().matches("0") )
        {
            resultText.setText("0 a bölünemez ");
        }
        else
        {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result :" + result);
        }
    }




}