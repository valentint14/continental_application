package com.example.continental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WindowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);

        ImageView w_up_arrow = (ImageView) findViewById(R.id.w_up_arrow);
        w_up_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { }
        });
        w_up_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
        ImageView w_down_arrow = (ImageView) findViewById(R.id.w_down_arrow);
        w_down_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { }
        });
        w_down_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
    }
}