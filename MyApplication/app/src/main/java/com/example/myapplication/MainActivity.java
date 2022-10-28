package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

              EditText firstnumber = findViewById(R.id.firstnumber);
              EditText secondnumber = findViewById(R.id.secondnumber);
              Button calculate = findViewById(R.id.calculate);
              TextView total = findViewById(R.id.total);


              calculate.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      String one = firstnumber.getText().toString();
                      String two = secondnumber.getText().toString();

                      int x = Integer.parseInt(one);
                      int y = Integer.parseInt(two);

                      int z = x + y;

                      total.setText(z + "");
                  }
              });

    }
}