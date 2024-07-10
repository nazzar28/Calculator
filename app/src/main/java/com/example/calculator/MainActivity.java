package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);

        Button answerButton = findViewById(R.id.answerButton);

        TextView incorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);

        TextView correctAnswer = findViewById(R.id.textViewCorrectAnswer);


        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editTextAnswer.getText().toString();
                //int number = Integer.parseInt(text);
                if(text.equals("15")){
                    correctAnswer.setVisibility(View.VISIBLE);
                    incorrectAnswer.setVisibility(View.GONE);
                }else{
                    incorrectAnswer.setVisibility(View.VISIBLE);
                    correctAnswer.setVisibility(View.GONE);
                }
            }
        });


    }
}