package com.example.userfriendlycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.outputBox);

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
}