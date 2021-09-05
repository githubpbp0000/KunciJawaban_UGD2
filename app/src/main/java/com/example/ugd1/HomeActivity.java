package com.example.ugd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String npm = getIntent().getStringExtra("NPM");
        TextView tvWelcome = findViewById(R.id.tvWelcome);

        tvWelcome.setText("Selamat datang " + npm);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        RadioGroup rgOptions = findViewById(R.id.radioGroup);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer option = rgOptions.getCheckedRadioButtonId();
                Intent newInput = new Intent();
                RadioButton rb;

                switch (option){
                    case R.id.mudah:
                        rb = findViewById(R.id.mudah);
                        newInput.putExtra("answer", rb.getText());
                        setResult(101,newInput);
                        break;

                    case R.id.mudah_sekali:
                        rb = findViewById(R.id.mudah_sekali);
                        newInput.putExtra("answer", rb.getText());
                        setResult(102,newInput);
                        break;

                    case R.id.mudah_banget:
                        rb = findViewById(R.id.mudah_banget);
                        newInput.putExtra("answer", rb.getText());
                        setResult(103,newInput);
                        break;
                }

                finish();
            }
        });
    }
}