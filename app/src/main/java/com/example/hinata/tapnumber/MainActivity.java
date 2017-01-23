package com.example.hinata.tapnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView textView;

    String mondai;
    int[] hairetsu;
    int keta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.mondai);


        start();


    }

    public void start() {
        hairetsu = new int[4];
        Random random = new Random();

        hairetsu[0] = random.nextInt(4) + 1;
        hairetsu[1] = random.nextInt(4) + 1;
        hairetsu[2] = random.nextInt(4) + 1;
        hairetsu[3] = random.nextInt(4) + 1;

        mondai = String.valueOf(hairetsu[0])
                + String.valueOf(hairetsu[1])
                + String.valueOf(hairetsu[2])
                + String.valueOf(hairetsu[3]);

        textView.setText(mondai);
        keta = 0;


    }
}
