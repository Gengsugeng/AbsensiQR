package com.absensijti.absensiqr;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputUserId;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputUserId = findViewById(R.id.textInputUserId);
        textInputPassword = findViewById(R.id.textInputPassword);
    }

    private boolean validateUser(){
        String userId = textInputUserId.getEditText().getText().toString().trim();

        if (userId.isEmpty()){
            textInputUserId.setError("User Tidak Boleh Kosong");
            return false;
        } else {
            textInputUserId.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String password = textInputPassword.getEditText().getText().toString().trim();

        if (password.isEmpty()){
            textInputPassword.setError("User Tidak Boleh Kosong");
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }

    public void btnLogin(View v){
        if (!validateUser() | !validatePassword()){
            return;
        }
        String input = "User ID : "+textInputUserId.getEditText().getText().toString();
        input += "\n";
        input += "Password : " +textInputPassword.getEditText().getText().toString();

        Toast.makeText(this,input, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MahasiswaActivity.class);
        startActivity(intent);
    }
}
