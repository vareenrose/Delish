package com.vareen.delish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText AdmName;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AdmName = (EditText)findViewById(R.id.etAdmName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(AdmName.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String AdmName, String Password){
        if ((AdmName.equals("Admin")) && (Password.equals("12345"))){

            Intent intent = new Intent (LoginActivity.this, AdmSetup.class);
            startActivity(intent);
        }

    }
}
