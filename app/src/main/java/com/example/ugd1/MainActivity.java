package com.example.ugd1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNPM = findViewById(R.id.etNPM);
        EditText etPassword = findViewById(R.id.etPassword);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                etNPM.setText("");
                etPassword.setText("");
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNPM.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Username Atau Password Kosong",Toast.LENGTH_LONG).show();
                }
                else if(etNPM.getText().toString().equals("1807XXXX") && etPassword.getText().toString().equals("wendy")){
                    Toast.makeText(MainActivity.this,"Username Atau Password Benar",Toast.LENGTH_LONG).show();
                    Intent moveHome = new Intent(MainActivity.this,HomeActivity.class);
                    moveHome.putExtra("NPM",etNPM.getText());

                    startActivityForResult(moveHome,401);
                }
                else{
                    Toast.makeText(MainActivity.this,"Username Atau Password Salah",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView tvResult = findViewById(R.id.tvAnswer);
        String result = data.getStringExtra("answer");
        tvResult.setText(result);

        if(requestCode == 401){
            if(resultCode == 101){
                tvResult.setBackgroundColor(Color.rgb(150,0,0));
            }else if(resultCode == 102){
                tvResult.setBackgroundColor(Color.rgb(0,150,0));
            }else{
                tvResult.setBackgroundColor(Color.rgb(0,0,150));
            }
        }
    }
}