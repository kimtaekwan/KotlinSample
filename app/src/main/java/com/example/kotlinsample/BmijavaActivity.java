package com.example.kotlinsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmijavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.result_Label);
        bmiButton = findViewById(R.id.bmiButton);


        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tall Field 값
                String tall = tallField.getText().toString();
                //weight Field 값
                String weight = weightField.getText().toString();

                //BMI 계산
                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0,2);
                resultLabel.setText("키"+tall+". 체중"+weight+". BMI "+bmi);
            }
        });
    }
}