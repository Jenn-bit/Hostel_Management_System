package com.example.hostelmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityLogin extends AppCompatActivity {

    private EditText email;
    private EditText pass;
    private Button register;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.password1);
        register=(Button)findViewById(R.id.register);
        firebaseAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emaill=email.getText().toString().toString();
                String passs=pass.getText().toString().toString();

                if(TextUtils.isEmpty(emaill)) {
                    Toast.makeText(ActivityLogin.this, "Please enter email id", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(passs)) {
                    Toast.makeText(ActivityLogin.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(passs.length()<6){
                    Toast.makeText(ActivityLogin.this, "Password is too short", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.signInWithEmailAndPassword(emaill, passs)
                       .addOnCompleteListener(ActivityLogin.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(getApplicationContext(),HomePage.class));
                                    Toast.makeText(ActivityLogin.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                                    finish();

                                } else {

                                    Toast.makeText(ActivityLogin.this, "Authentication failed", Toast.LENGTH_SHORT).show();

                                }

                                // ...
                            }
                        });

            }
        });

    }
}
