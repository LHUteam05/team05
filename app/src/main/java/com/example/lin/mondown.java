package com.example.lin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mondown extends AppCompatActivity {

    private Button b1;
    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mondown);
        b1 =(Button) findViewById(R.id.button7);
        i1 =(ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1;
                num1= (int)(Math.random()*7)+1;
                if (num1 == 1){
                    i1.setImageResource(R.drawable.food1);

                }
                else if (num1 == 2){
                    i1.setImageResource(R.drawable.food2);
                }
                else if (num1 == 3){
                    i1.setImageResource(R.drawable.food3);
                }
                else if (num1 == 4){
                    i1.setImageResource(R.drawable.food4);
                }
                else if (num1 == 5){
                    i1.setImageResource(R.drawable.food5);
                }
                else if (num1 == 6){
                    i1.setImageResource(R.drawable.food6);
                }
                else {
                    i1.setImageResource(R.drawable.food7);
                }
            }
        });
    }
}