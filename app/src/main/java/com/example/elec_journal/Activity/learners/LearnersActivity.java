package com.example.elec_journal.Activity.learners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;

public class LearnersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learners);
        Button list_learners= findViewById(R.id.list_learners);
        Button add_learners = findViewById(R.id.add_learner);
        Button back = findViewById(R.id.back_l);
        list_learners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnersActivity.this, ListLearnersActivity.class);
                startActivity(i);
            }
        });
        add_learners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnersActivity.this, AddLearnerActivity.class);
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

