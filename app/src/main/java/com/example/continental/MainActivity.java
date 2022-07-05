package com.example.continental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Lock */
        ImageView lock = (ImageView) findViewById(R.id.lock);
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { }
        });
        lock.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        /* Window */
        ImageView window = (ImageView) findViewById(R.id.window);
        window.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openWindowActivity(); }
        });
        /* Mirror */
        ImageView mirror = (ImageView) findViewById(R.id.mirror);
        mirror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openMirrorActivity(); }
        });
        /* Lights */
        ImageView lights = (ImageView) findViewById(R.id.lights);
        lights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { }
        });
        lights.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
    }
    public void openWindowActivity() {
        Intent intent = new Intent(this, WindowActivity.class);
        startActivity(intent);
    }
    public void openMirrorActivity() {
        Intent intent = new Intent(this, MirrorActivity.class);
        startActivity(intent);
    }
}