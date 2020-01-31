package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btn1 = findViewById(R.id.btn1);
        MyClickListener mcl = new MyClickListener();
        btn1.setOnClickListener(mcl);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("TAG", "========== anonymous class =========");
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.e("TAG", "Use this class to implement On Click Listener");
    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Log.e("TAG", "Button clicked by an inner class");

        }
    }

    public void myClick(View v){
        switch (v.getId()) {
            case R.id.btn4:
                Log.e("TAG", "btn4 =====");
                break;
            case R.id.btn5:
                Log.e("TAG", "btn5 =====");
                break;
        }
    }
}
