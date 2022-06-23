package com.example.lin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class coffee extends AppCompatActivity {

    private Button b1;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        b1 =(Button) findViewById(R.id.coffee);
        t1 =(TextView)findViewById(R.id.textView5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1;
                num1= (int)(Math.random()*14)+1;
                if (num1 == 1){
                    t1.setText("雞排飯");
                }
                else if (num1 == 2){
                    t1.setText("蒜泥白肉飯");
                }
                else if (num1 == 3){
                    t1.setText("雞球飯");
                }
                else if (num1 == 4){
                    t1.setText("雞柳飯");
                }
                else if (num1 == 5){
                    t1.setText("滷肉飯");
                }
                else if (num1 == 6) {
                    t1.setText("無骨油雞飯");
                }
                else if (num1 == 7){
                    t1.setText("龍華排骨飯");
                }
                else if (num1 == 8){
                    t1.setText("炸醬麵");
                }
                else if (num1 == 9){
                    t1.setText("擔仔麵");
                }
                else if (num1 == 10){
                    t1.setText("牛肉麵");
                }
                else if (num1 == 11){
                    t1.setText("牛肉湯麵");
                }
                else if (num1 == 12){
                    t1.setText("水餃10顆");
                }
                else if (num1 == 13){
                    t1.setText("牛肉湯餃");
                }
                else {
                    t1.setText("自助餐");
                }
            }
        });
    }
}