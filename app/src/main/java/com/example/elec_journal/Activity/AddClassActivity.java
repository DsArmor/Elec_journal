package com.example.elec_journal.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;

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
        Button add_class=findViewById(R.id.back_c);
        add_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<teachers.length; i++){
                    if (teachers[i].isChecked()){

                    }
                }
                for (int i=0; i<learners.length; i++){
                    if (learners[i].isChecked()){

                    }
                }
                finish();
            }
        });
    }

}
