package com.alam.medicalcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    Button btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.tv1);
        et=(EditText)findViewById(R.id.et1);
        rg=(RadioGroup)findViewById(R.id.rg1);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        btn=(Button)findViewById(R.id.btn1);
        iv=(ImageView)findViewById(R.id.iv1);



    }
}
