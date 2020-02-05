package com.wangsummer.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button first;
    Button second;
    TextView tv;
    Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first= findViewById(R.id.clickButton);
        tv = findViewById(R.id.thetext);


        first.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Hello person");
                count++;
                tv.setText("Hello Mr.Tra!" + " You clicked this many times: " + count);

            }

        });

        second = findViewById(R.id.clickButton2);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method(v);
            }
        });



    }

    public void method(View view) {
        System.out.println("Hello dad!");
    }
}
