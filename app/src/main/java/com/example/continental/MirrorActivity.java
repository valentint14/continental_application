package com.example.continental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MirrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirror);

        ImageView m_up_arrow = (ImageView) findViewById(R.id.m_up_arrow);
        m_up_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MirrorActivity.this, "Hold to perform an action", Toast.LENGTH_SHORT).show();
            }
        });
        m_up_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
        ImageView m_down_arrow = (ImageView) findViewById(R.id.m_down_arrow);
        m_down_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MirrorActivity.this, "Hold to perform an action", Toast.LENGTH_SHORT).show();
            }
        });
        m_down_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
        ImageView m_right_arrow = (ImageView) findViewById(R.id.m_right_arrow);
        m_right_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MirrorActivity.this, "Hold to perform an action", Toast.LENGTH_SHORT).show();
            }
        });
        m_right_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
        ImageView m_left_arrow = (ImageView) findViewById(R.id.m_left_arrow);
        m_left_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MirrorActivity.this, "Hold to perform an action", Toast.LENGTH_SHORT).show();
            }
        });
        m_left_arrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { return true; }
        });
    }
}