package com.example.elec_journal.Activity.learners;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;

public class ListLearnersActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_learners);
        TextView learners= findViewById(R.id.learners_list);
        for (int i = 0; i< School.learners.length; i++){
            learners.setText(learners.getText()+"\n\n"
                    +"Fio: "+ School.learners[i].FullName+"\n\t"
                    +"CardID: "+School.learners[i].CardID+"\n\t"
                    +"Position: "+School.learners[i].Position+"\n\t"
                    +"Mother: "+School.learners[i].Parents[0].FullName+"\t Phone: "+School.learners[i].Parents[0].Phone+"\n\t"
                    +"Father: "+School.learners[i].Parents[1].FullName+"\t Phone: "+School.learners[i].Parents[1].Phone+"\n\t"
            );
        }
        Button button=findViewById(R.id.back_l_list);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
