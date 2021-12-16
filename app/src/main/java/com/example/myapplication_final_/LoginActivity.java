package com.example.myapplication_final_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
    }

        public void loginProcess(View v)
        {
            String uid = userid.getText().toString();
            String upass = userpass.getText().toString();
            if (uid.equals("lhj") && upass.equals("0000")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "로그인 정보가 다릅니다", Toast.LENGTH_SHORT).show();
                userid.setText("");
                userpass.setText("");
            }
        }
    }

