package com.example.elec_journal.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;
import com.example.elec_journal.Teacher;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.net.ssl.SSLHandshakeException;

public class AddTeacherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_teacher);
        Button add=findViewById(R.id.add);
        EditText CardID=findViewById(R.id.CardID);
        EditText Fio=findViewById(R.id.FirstLastName);
        EditText Position=findViewById(R.id.Position);
        EditText Qualification = findViewById(R.id.Qualification);
        TextView warning = findViewById(R.id.warn1);
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (CardID.getText().toString().equals("") || Fio.getText().toString().equals("") || Position.getText().toString().equals("") || Qualification.getText().toString().equals("")){
                    warning.setText("All fields must be filled");
                    CardID.setText("");
                    Fio.setText("");
                    Position.setText("");
                    Qualification.setText("");
                } else{
                    School.teachers = Arrays.copyOf(School.teachers, School.teachers.length+1);
                    School.teachers[School.teachers.length-1]=new Teacher();
                    School.teachers[School.teachers.length-1].CardID=Integer.parseInt(CardID.getText().toString());
                    School.teachers[School.teachers.length-1].Fio=Fio.getText().toString();
                    School.teachers[School.teachers.length-1].Position=Position.getText().toString();
                    School.teachers[School.teachers.length-1].Qualification=Qualification.getText().toString();
                    finish();
                }
            }
        });

    }
}
