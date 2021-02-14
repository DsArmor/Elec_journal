package com.example.elec_journal.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;

public class TeachersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachers);
        Button list_teachers= findViewById(R.id.list_teachers);
        Button add_teacher = findViewById(R.id.add_teacher);
        Button back = findViewById(R.id.back_t);
        list_teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TeachersActivity.this, ListTeachersActivity.class);
                startActivity(i);
            }
        });
        add_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TeachersActivity.this, ListTeachersActivity.class);
                startActivity(i);
            }
        });
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(TeachersActivity.this, .class);
//                startActivity(i);
//            }
//        });
    }
}
