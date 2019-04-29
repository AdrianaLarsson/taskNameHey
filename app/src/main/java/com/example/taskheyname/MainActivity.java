package com.example.taskheyname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        TextView resultName = (TextView) findViewById(R.id.textViewShowName);
        resultName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstName = (EditText) findViewById(R.id.firstName);
                EditText secondName = (EditText) findViewById(R.id.secondName);

                TextView resultnames = (TextView) findViewById(R.id.textViewShowName);

                String nameOne = firstName.getText().toString();
                String nameTwo = secondName.getText().toString();

                String result = nameOne + " " + nameTwo;

                resultnames.setText("FAN VAD Du e BRA " + result + " ");
            }
        });

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText firstName = (EditText) findViewById(R.id.firstName);
                EditText secondName = (EditText) findViewById(R.id.secondName);

                TextView resultNames = (TextView) findViewById(R.id.textViewShowName);

                String nameOne = firstName.getText().toString();
                String nameTwo = secondName.getText().toString();

                String result = nameOne +  " "+ nameTwo;

                resultNames.setText("Hej " + result + "");


            }
        });
    }

    void loadActivityMain(View view){

        setContentView(R.layout.activity_main);
    }
    void loadTableViewLayout(View view){

        setContentView(R.layout.my_tableview_layout);
    }

    void loadMainMenu(View view){
        setContentView(R.layout.main_menu);


    }

    public void showNameTextView(View view) {
        TextView textViewShowName = (TextView) findViewById(R.id.textViewShowName);
        textViewShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextName = (EditText) findViewById(R.id.editTextName);

                TextView textViewShowName = (TextView) findViewById(R.id.textViewShowName);

                String name = editTextName.getText().toString();


                String nameRes = name;

                textViewShowName.setText("Hej " + nameRes + "");
            }
        });

    }
}
