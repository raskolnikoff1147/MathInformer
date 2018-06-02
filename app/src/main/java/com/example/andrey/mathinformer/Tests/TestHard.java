package com.example.andrey.mathinformer.Tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class TestHard extends AppCompatActivity {

    RadioButton rb_q1, rb_q2, rb_q3, rb_q4, rb_q5, rb_q6, rb_q7, rb_q8, rb_q9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hard);

        rb_q1 = findViewById(R.id.hard_rb1);
        rb_q2 = findViewById(R.id.hard_rb2);
        rb_q3 = findViewById(R.id.hard_rb3);
        rb_q4 = findViewById(R.id.hard_rb4);
        rb_q5 = findViewById(R.id.hard_rb5);
        rb_q6 = findViewById(R.id.hard_rb6);
        rb_q7 = findViewById(R.id.hard_rb7);
        rb_q8 = findViewById(R.id.hard_rb8);
        rb_q9 = findViewById(R.id.hard_rb9);
    }

    public void showResult(View view){
        int result = score();
        String message = "Результат: " + result + "/9\n";

        if (result > 6){
            Toast toast = Toast.makeText(getApplicationContext(),
                    message + "Поздравляю! Отличный результат!", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    message + "Попробуй снова, у тебя все получится!", Toast.LENGTH_LONG);
            toast.show();
        }

    }

    public int score(){
        int score = 0;

        if (rb_q1.isChecked()) score++;
        if (rb_q2.isChecked()) score++;
        if (rb_q3.isChecked()) score++;
        if (rb_q4.isChecked()) score++;
        if (rb_q5.isChecked()) score++;
        if (rb_q6.isChecked()) score++;
        if (rb_q7.isChecked()) score++;
        if (rb_q8.isChecked()) score++;
        if (rb_q9.isChecked()) score++;

        return score;
    }
}