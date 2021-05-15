package com.example.userfriendlycalculator;
//Author:Anthony
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    api_call wolframCall = new api_call();

    private EditText output;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.outputBox);
        output.setShowSoftInputOnFocus(false);
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.answerBox).equals(output.getText().toString())){
                    output.setText("");
                }
            }
        });
    }
    private void updateText(String stringToAdd){
        String pastString = output.getText().toString();
        int cursorPosition = output.getSelectionStart();
        String firstHalf = pastString.substring(0, cursorPosition);
        String secondHalf = pastString.substring(cursorPosition);
        output.setText(String.format("%s%s%s", firstHalf, stringToAdd, secondHalf));
        output.setSelection(cursorPosition + 1);

    }
    public void zerobutton(View view){
                updateText("0");
                }
    public void onebutton(View view){
        updateText("1");
    }
    public void twobutton(View view){
        updateText("2");
    }
    public void threebutton(View view){
        updateText("3");
    }
    public void fourbutton(View view){
        updateText("4");
    }
    public void fivebutton(View view){
        updateText("5");
    }
    public void sixbutton(View view){
        updateText("6");
    }
    public void sevenbutton(View view){
        updateText("7");
    }
    public void eightbutton(View view){
        updateText("8");
    }
    public void ninebutton(View view){
        updateText("9");
    }
    public void plusbutton(View view){
        updateText("+");
    }
    public void minusbutton(View view){
        updateText("-");
    }
    public void multiplybutton(View view){
        updateText("×");
    }
    public void dividebutton(View view){
        updateText("÷");
    }
    public void decimalbutton(View view){
        updateText(".");
    }
    public void exponentbutton(View view){
        updateText("^");
    }
    public void backspacebutton(View view){
        int cursorPosition = output.getSelectionStart();
        int textLength = output.getText().length();
        if(cursorPosition != 0 && textLength != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) output.getText();
            selection.replace(cursorPosition - 1, cursorPosition, "");
            output.setText(selection);
            output.setSelection(cursorPosition - 1);
        }
    }
    public void plusminusbutton(View view){
        updateText("-");
    }

    public void clearbutton(View view){
        output.setText("");

    }
    public void regularEqualbutton(View view){
        String userInput = output.getText().toString();
        userInput = userInput.replaceAll("÷", "/");
        userInput = userInput.replaceAll("×", "*");

        Expression exp = new Expression(userInput);

        String result = String.valueOf(exp.calculate());
        output.setText(result);
        output.setSelection(result.length());
    }
}