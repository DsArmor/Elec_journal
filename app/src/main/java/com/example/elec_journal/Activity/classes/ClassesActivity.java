package com.example.elec_journal.Activity.classes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;

public class ClassesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classes);
        Button list_classes= findViewById(R.id.list_classes);
        Button add_class = findViewById(R.id.add_class);
        Button back = findViewById(R.id.back_c);
        list_classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassesActivity.this, ListClassesActivity.class);
                startActivity(i);
            }
        });
        add_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassesActivity.this, AddClassActivity.class);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
