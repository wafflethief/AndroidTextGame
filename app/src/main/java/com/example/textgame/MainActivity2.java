package com.example.textgame;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Pair;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private Button nextButton;
    private EditText editText1;
    private ImageView imageView1, imageView2;
    private TextView textView;
    int stage;
    Hashtable<Integer, String> answers;
    List<Pair<Integer, Integer>> images;//Hashtable<Integer, Pair> images;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        stage = 0;
        answers = new Hashtable<Integer, String>();
        images = new ArrayList<>();

        answers.put(0, "breadwinner");
        answers.put(1, "lemonade");
        answers.put(2, "world peace");
        answers.put(3, "cardiac arrest");
        images.add(new Pair(R.drawable.lemon, R.drawable.first_aid));
        images.add(new Pair(R.drawable.world, R.drawable.peas));
        images.add(new Pair(R.drawable.heart, R.drawable.arrest));

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
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
                if(stage < answers.size()) {
                    if (s.toString().compareTo(answers.get(stage)) == 0) {
                        Toast.makeText(MainActivity2.this, "correct", Toast.LENGTH_SHORT).show();
                        s.clear();
                        imageView1.setImageResource(images.get(stage).first);
                        imageView2.setImageResource(images.get(stage).second);
                        stage++;
                    }
                }
                else{
                    Toast.makeText(MainActivity2.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
