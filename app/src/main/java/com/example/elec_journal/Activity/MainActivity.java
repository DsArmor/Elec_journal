package com.example.elec_journal.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.elec_journal.Activity.learners.LearnersActivity;
import com.example.elec_journal.Activity.teachers.TeachersActivity;
import com.example.elec_journal.R;
import com.example.elec_journal.School;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView school_name=findViewById(R.id.school);
        school_name.setText(School.Name);
        Button teachers = findViewById(R.id.Teachers);
        Button learners = findViewById(R.id.Learners);
        Button classes = findViewById(R.id.Classes);
        Button electives = findViewById(R.id.Electives);
        Button sections = findViewById(R.id.Sections);
        Button employees = findViewById(R.id.Employees);
        Button journal = findViewById(R.id.Electrnic_journal);
        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TeachersActivity.class);
                startActivity(i);
            }
        });
        learners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LearnersActivity.class);
                startActivity(i);
            }
        });
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ClassesActivity.class);
                startActivity(i);
            }
        });
//        electives.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);
//            }
//        });
//        sections.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);
//            }
//        });
//        employees.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);
//            }
//        });
//        journal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);
//            }
//        });




    }
}