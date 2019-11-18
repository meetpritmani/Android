package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1, n2;
Button b1;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // addition
        n1=(EditText) findViewById(R.id.editText3);
        n2=(EditText) findViewById(R.id.editText4);
        b1=(Button) findViewById(R.id.button);
        tv1=(TextView) findViewById(R.id.textView);

        //Click Event
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1 = Integer.parseInt(n1.getText().toString()) ;
                Integer no2 = Integer.parseInt(n2.getText().toString()) ;
                Integer sum = no1 + no2;
                tv1.setText(sum.toString());

            }
        });
    }
}
