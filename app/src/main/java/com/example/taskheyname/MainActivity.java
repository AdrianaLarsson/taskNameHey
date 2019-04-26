package com.example.taskheyname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView resultName = (TextView) findViewById(R.id.resultName);
        resultName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstName = (EditText) findViewById(R.id.firstName);
                EditText secondName = (EditText) findViewById(R.id.secondName);

                TextView resultnames = (TextView) findViewById(R.id.resultName);

                String nameOne = firstName.getText().toString();
                String nameTwo = secondName.getText().toString();

                String result = nameOne + nameTwo;

                resultnames.setText("FAN VAD E BRA" + result + "");
            }
        });

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText firstName = (EditText) findViewById(R.id.firstName);
                EditText secondName = (EditText) findViewById(R.id.secondName);

                TextView resultNames = (TextView) findViewById(R.id.resultName);

                String nameOne = firstName.getText().toString();
                String nameTwo = secondName.getText().toString();

                String result = nameOne + nameTwo;

                resultNames.setText("Hej " + result + "");


            }
        });
    }




}
