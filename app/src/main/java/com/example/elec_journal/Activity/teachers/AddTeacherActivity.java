package com.example.elec_journal.Activity.teachers;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;
import com.example.elec_journal.Teacher;

import java.util.Arrays;

public class AddTeacherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_teacher);
        Button add=findViewById(R.id.add_t);
        EditText CardID=findViewById(R.id.CardIDT);
        EditText Fio=findViewById(R.id.FirstLastNameT);
        EditText Position=findViewById(R.id.PositionT);
        EditText Qualification = findViewById(R.id.QualificationT);
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
                    School.teachers[School.teachers.length-1].FullName=Fio.getText().toString();
                    School.teachers[School.teachers.length-1].Position=Position.getText().toString();
                    School.teachers[School.teachers.length-1].Qualification=Qualification.getText().toString();
                    finish();
                }
            }
        });

    }
}
