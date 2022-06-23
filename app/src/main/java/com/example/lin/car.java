package com.example.lin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class car extends AppCompatActivity {
    private Button b1,b2,b3,b4;
    private TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        b1 =(Button) findViewById(R.id.button8);
        b2 =(Button) findViewById(R.id.button9);
        b3 =(Button) findViewById(R.id.button10);
        b4 =(Button) findViewById(R.id.button12);
        t1 =(TextView)findViewById(R.id.textView7);
        t2 =(TextView)findViewById(R.id.textView8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("漢堡");
                int num1;
                num1= (int)(Math.random()*14)+1;
                if (num1 == 1){
                    t1.setText("牛肉漢堡");
                }
                else if (num1 == 2){
                    t1.setText("豬肉漢堡");
                }
                else if (num1 == 3){
                    t1.setText("火腿漢堡");
                }
                else if (num1 == 4){
                    t1.setText("培根漢堡");
                }
                else if (num1 == 5){
                    t1.setText("燻雞漢堡");
                }
                else if (num1 == 6) {
                    t1.setText("鮪魚漢堡");
                }
                else if (num1 == 7){
                    t1.setText("健康夾蛋");
                }
                else if (num1 == 8){
                    t1.setText("鐵板燒肉堡");
                }
                else if (num1 == 9){
                    t1.setText("香腸堡");
                }
                else if (num1 == 10){
                    t1.setText("沙拉堡");
                }
                else if (num1 == 11){
                    t1.setText("卡拉雞腿堡");
                }
                else if (num1 == 12){
                    t1.setText("熱狗");
                }
                else if (num1 == 13){
                    t1.setText("大亨堡");
                }
                else {
                    t1.setText("煎餃");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("吐司");
                int num1;
                num1= (int)(Math.random()*12)+1;
                if (num1 == 1){
                    t1.setText("牛肉");
                }
                else if (num1 == 2){
                    t1.setText("豬肉");
                }
                else if (num1 == 3){
                    t1.setText("火腿");
                }
                else if (num1 == 4){
                    t1.setText("培根");
                }
                else if (num1 == 5){
                    t1.setText("燻雞");
                }
                else if (num1 == 6) {
                    t1.setText("鮪魚");
                }
                else if (num1 == 7){
                    t1.setText("健康夾蛋");
                }
                else if (num1 == 8){
                    t1.setText("起司片");
                }
                else if (num1 == 9){
                    t1.setText("巧克力");
                }
                else if (num1 == 10){
                    t1.setText("奶酥");
                }
                else if (num1 == 11){
                    t1.setText("花生");
                }
                else {
                    t1.setText("香蒜");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("簡餐");
                int num1;
                num1= (int)(Math.random()*13)+1;
                if (num1 == 1){
                    t1.setText("紅燒牛腩飯");
                }
                else if (num1 == 2){
                    t1.setText("咖哩雞丁飯");
                }
                else if (num1 == 3){
                    t1.setText("鐵板豬柳飯");
                }
                else if (num1 == 4){
                    t1.setText("黑胡椒牛肉飯");
                }
                else if (num1 == 5){
                    t1.setText("飯類加荷包蛋");
                }
                else if (num1 == 6) {
                    t1.setText("義大利肉醬麵");
                }
                else if (num1 == 7){
                    t1.setText("黑胡椒鐵板麵");
                }
                else if (num1 == 8){
                    t1.setText("日式照燒麵");
                }
                else if (num1 == 9){
                    t1.setText("韓式肉醬麵");
                }
                else if (num1 == 10){
                    t1.setText("滑蛋義大利肉醬麵");
                }
                else if (num1 == 11){
                    t1.setText("滑蛋黑胡椒鐵板麵");
                }
                else if (num1 == 12){
                    t1.setText("滑蛋日式照燒麵");
                }
                else {
                    t1.setText("滑蛋韓式肉醬麵");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("飲品");
                int num1;
                num1= (int)(Math.random()*9)+1;
                if (num1 == 1){
                    t1.setText("烏龍綠茶");
                }
                else if (num1 == 2){
                    t1.setText("烏龍奶綠");
                }
                else if (num1 == 3){
                    t1.setText("紅茶");
                }
                else if (num1 == 4){
                    t1.setText("奶茶");
                }
                else if (num1 == 5){
                    t1.setText("可可亞");
                }
                else if (num1 == 6) {
                    t1.setText("美式咖啡");
                }
                else if (num1 == 7){
                    t1.setText("可口可樂");
                }
                else if (num1 == 8){
                    t1.setText("雪碧汽水");
                }
                else {
                    t1.setText("梅子可樂");
                }

            }
        });
    }
}