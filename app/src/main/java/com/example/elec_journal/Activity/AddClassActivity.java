package com.example.elec_journal.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.Class;
import com.example.elec_journal.Learner;
import com.example.elec_journal.R;
import com.example.elec_journal.School;
import com.example.elec_journal.Teacher;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddClassActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_class);
        RadioGroup teachers_group=(RadioGroup)findViewById(R.id.teachers_group);
        RadioButton[] teachers=new RadioButton[School.teachers.length];
        for (int i=0; i< School.teachers.length; i++){
            teachers[i]=new RadioButton(this);
            teachers[i].setText(School.teachers[i].FullName);
            teachers_group.addView(teachers[i]);
        }
        LinearLayout learners_group=(LinearLayout)findViewById(R.id.learners_group);
        CheckBox[] learners=new CheckBox[School.learners.length];
        for (int i=0; i< School.learners.length;i++){
            learners[i]=new CheckBox(this);
            learners[i].setText(School.learners[i].FullName);
            learners_group.addView(learners[i]);
        }
        Button add_class=(Button)findViewById(R.id.add_c);
        add_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                School.classes = Arrays.copyOf(School.classes, School.classes.length+1);
                School.classes[School.classes.length-1]= new Class();
                for (int i=0; i<teachers.length; i++){
                    if (teachers[i].isChecked()){
                        School.classes[School.classes.length-1].ClassTeacher= new Teacher();
                        School.classes[i].ClassTeacher=School.teachers[i];
                    }
                }
                for (int i=0; i<learners.length; i++){
                    if (learners[i].isChecked()){
                        School.classes[School.classes.length-1].Learners =  Arrays.copyOf( School.classes[School.classes.length-1].Learners,  School.classes[School.classes.length-1].Learners.length+1);
                        School.classes[School.classes.length-1].Learners[School.classes[School.classes.length-1].Learners.length-1]=new Learner();
                        School.classes[School.classes.length-1].Learners[School.classes[School.classes.length-1].Learners.length-1]=School.learners[i];
                    }
                }
                finish();
            }
        });
    }

}
