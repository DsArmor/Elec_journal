package com.example.elec_journal.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elec_journal.R;
import com.example.elec_journal.School;

public class ListClassesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_classes);
        TextView classes=findViewById(R.id.output_class);
        System.out.println(School.getNumClasses().length);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, School.getNumClasses());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Num of classes");
        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int num = 0;
                for (int i=0; i<School.classes.length; i++){
                    if (School.classes[i].Number.equals(spinner.getSelectedItem().toString())){
                        num=i;
                    }
                }
                classes.setText(School.getListClasses(num));
            }
            @SuppressLint("SetTextI18n")
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                classes.setText("Choose your class");
            }
        });
        Button back_to_class_view=findViewById(R.id.back_c_list);
        back_to_class_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}