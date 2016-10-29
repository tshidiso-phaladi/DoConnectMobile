package com.example.tumudip.doconnect;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.signup);

        EditText txtName = (EditText)findViewById(R.id.input_name);
        EditText txtSurname = (EditText)findViewById(R.id.input_surname);
        EditText txtIdNumber = (EditText)findViewById(R.id.input_idNumber);
        EditText txtDOB = (EditText)findViewById(R.id.input_DOB);
        RadioGroup rdbGroupGender = (RadioGroup) findViewById(R.id.GenderRadioGroup);
        RadioButton rdbGender = (RadioButton)findViewById(rdbGroupGender.getCheckedRadioButtonId());
        EditText txtPostalAddress = (EditText)findViewById(R.id.input_address);
        EditText txtEmail = (EditText)findViewById(R.id.input_email);
        EditText txtPassword = (EditText)findViewById(R.id.input_password);
        EditText txtPasswordConfirm = (EditText)findViewById(R.id.input_passwordconfirm);
        Button btnSubmit = (Button)findViewById(R.id.btn_signup);
        TextView login = (TextView)findViewById(R.id.link_login);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Appointment Successfully Booked", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent signIn = new Intent("android.intent.action.MAIN");
                startActivity(signIn);
            }
        });
    }
}
