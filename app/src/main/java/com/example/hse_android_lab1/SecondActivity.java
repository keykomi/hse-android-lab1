package com.example.hse_android_lab1;

import android.graphics.Color;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends Activity {
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        layout = findViewById(R.id.layout);

        String color = getIntent().getStringExtra("COLOR");
        if (color != null) {
            switch (color) {
                case "red":
                    layout.setBackgroundColor(Color.RED);
                    break;
                case "green":
                    layout.setBackgroundColor(Color.GREEN);
                    break;
                case "blue":
                    layout.setBackgroundColor(Color.BLUE);
                    break;
            }
        }
    }
}
