package com.example.elec_journal.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.Learner;
import com.example.elec_journal.Parent;
import com.example.elec_journal.R;
import com.example.elec_journal.School;
import com.example.elec_journal.Teacher;

import java.util.Arrays;

public class AddLearnerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_learner);
        Button add=findViewById(R.id.add_l);
        EditText CardID=findViewById(R.id.CardIDL);
        EditText Fio=findViewById(R.id.FirstLastNameL);
        EditText Position=findViewById(R.id.PositionL);
        TextView warning = findViewById(R.id.warn2);
        EditText Mother =findViewById(R.id.Mother);
        EditText Father = findViewById(R.id.Father);
        EditText MotherPhone = findViewById(R.id.MotherPhone);
        EditText FatherPhone = findViewById(R.id.FatherPhone);
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (CardID.getText().toString().equals("") || Fio.getText().toString().equals("") || Position.getText().toString().equals("")){
                    warning.setText("All fields must be filled");
                    CardID.setText("");
                    Fio.setText("");
                    Position.setText("");
                } else{
                    School.learners = Arrays.copyOf(School.learners, School.learners.length+1);
                    School.learners[School.learners.length-1]=new Learner();
                    School.learners[School.learners.length-1].CardID=Integer.parseInt(CardID.getText().toString());
                    School.learners[School.learners.length-1].FullName=Fio.getText().toString();
                    School.learners[School.learners.length-1].Position=Position.getText().toString();
                    School.learners[School.learners.length-1].Parents = Arrays.copyOf(School.learners[School.learners.length-1].Parents, School.learners.length+1);
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1]= new Parent();
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1].FullName=Mother.getText().toString();
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1].Phone=Integer.parseInt(MotherPhone.getText().toString());
                    School.learners[School.learners.length-1].Parents = Arrays.copyOf(School.learners[School.learners.length-1].Parents, School.learners.length+1);
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1]= new Parent();
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1].FullName=Father.getText().toString();
                    School.learners[School.learners.length-1].Parents[School.learners[School.learners.length-1].Parents.length-1].Phone=Integer.parseInt(FatherPhone.getText().toString());
                    finish();
                }
            }
        });

    }
}
