package com.example.daypicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity  implements TimePickerDialog.OnTimeSetListener {

    EditText e1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyTimePicker myTimePicker = new MyTimePicker();
                myTimePicker.show(getSupportFragmentManager(),"Time picker");

            }
        });

    }
    public void onTimeSet(TimePicker view,int hours,int min){
        e1.setText(String.valueOf(hours)+":"+String.valueOf(min));
    }
}
