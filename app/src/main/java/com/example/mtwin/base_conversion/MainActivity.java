package com.example.mtwin.base_conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static Button convert;
    static EditText number;
    static EditText originalBase;
    static EditText finalBase;
    static TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert = (Button) findViewById(R.id.calculate);
        number = (EditText) findViewById(R.id.input_number);
        originalBase = (EditText) findViewById(R.id.base1);
        finalBase = (EditText) findViewById(R.id.base2);
        output = (TextView) findViewById(R.id.output_number);
    }

    public void onClick(View v){
        ConvertToDecimal converter;
        converter = new ConvertToDecimal();
        converter.ConvertToDecimal(String.valueOf(number.getText()), Integer.valueOf(String.valueOf(originalBase.getText())));
        output.setText(String.valueOf(converter.outputDecimal()));
    }
}
