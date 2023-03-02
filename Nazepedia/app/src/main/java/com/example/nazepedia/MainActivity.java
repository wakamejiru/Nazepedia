package com.example.nazepedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // レイアウト作成の際にインスタンスを作成
        Button StartButton  = findViewById(R.id.button);

        StartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // ここに遷移のコードを書く
            }
        });
    }
}