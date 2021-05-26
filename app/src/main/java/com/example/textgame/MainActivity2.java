package com.example.textgame;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Dictionary;

public class MainActivity2 extends AppCompatActivity {
    private Button nextButton;
    private EditText editText1;
    private ImageView imageView1, imageView2;
    private TextView textView;
    int stage;
    Dictionary dict;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*ImageView imageView1 = new ImageView(this);
        imageView1.setImageResource(R.drawable.bread);*/
        stage = 0;

        imageView1 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (EditText)findViewById(R.id.edit_text1);

        // Listeners

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().compareTo("cheese")==0){
                    Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
