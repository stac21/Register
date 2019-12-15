package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String SPEC_FILE = "com.example.grant.register.specFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameEditText = findViewById(R.id.nameEditText);
        final EditText totalMoneyEditText = findViewById(R.id.totalMoneyEditText);
        final EditText totalFivesEditText = findViewById(R.id.totalFivesEditText);
        final EditText totalOnesEditText = findViewById(R.id.totalOnesEditText);
        final Button saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                int totalMoney = Integer.parseInt(totalMoneyEditText.getText().toString());
                int totalFives = Integer.parseInt(totalFivesEditText.getText().toString());
                int totalOnes = Integer.parseInt(totalOnesEditText.getText().toString());

                Specification specification = new Specification(name, totalMoney, totalFives,
                        totalOnes);

                // TODO: save specification to an ArrayList of specifications for use in a recyclerview


            }
        });
    }
}
