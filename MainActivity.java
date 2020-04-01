package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView idtext;//MainActivity Global Value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtext=(TextView)findViewById(R.id.editText);

    }

    public void on1(View v){

        Toast.makeText(getApplicationContext(),idtext.getText().toString()
        +"  has logged in",Toast.LENGTH_SHORT).show();

    }

    public void on2(View v){

        Toast.makeText(getApplicationContext(),"go on sign up page",Toast.LENGTH_SHORT).show();

    }


}
