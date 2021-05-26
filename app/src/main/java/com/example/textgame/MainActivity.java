package com.example.textgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button startButton, instructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.start_button);
        instructions = (Button)findViewById(R.id.instructions_button);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Game started", Toast.LENGTH_SHORT).show();
                beginGame();
            }
        });
        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beginInstructions();
            }
        });

    }

    private void beginInstructions(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    private void beginGame(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}