package com.example.elec_journal.Activity.teachers;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;

import org.w3c.dom.Text;

public class ListTeachersActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_teachers);
        TextView teachers= findViewById(R.id.teachers_list);
        for (int i=0; i< School.teachers.length; i++){
            teachers.setText(teachers.getText()+"\n\n"
                    +"Fio: "+ School.teachers[i].FullName+"\n\t"
                    +"CardID: "+School.teachers[i].CardID+"\n\t"
                    +"Position: "+School.teachers[i].Position+"\n\t"
                    +"Qualification: "+School.teachers[i].Qualification);
        }
        Button button=findViewById(R.id.back_t_list);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
