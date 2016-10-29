package com.example.tumudip.doconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Login starts here
        Button btnLogin = (Button) findViewById(R.id.login);
        EditText txtUsername = (EditText)findViewById(R.id.userName);
        EditText txtPassword = (EditText)findViewById(R.id.password);
        Button btnRegister = (Button) findViewById(R.id.register);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent register = new Intent("android.intent.action.SIGNUPACTIVITY");
                //SignUpActivity.this.startActivity(splashWindow);
                startActivity(register);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent splashWindow = new Intent("android.intent.action.SPLASHNEWACTIVITY");
                startActivity(splashWindow);
            }
        });
    }
}
