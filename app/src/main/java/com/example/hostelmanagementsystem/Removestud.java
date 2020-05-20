package com.example.hostelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Removestud extends AppCompatActivity {

    public static final String EXTRA_ROOM="com.exapmle.hostelmanagementsystem.EXTRA_ROOM";

    private TextInputEditText one,two;
    private Button bye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_removestud);

        one=(TextInputEditText) findViewById(R.id.one);
        two=(TextInputEditText) findViewById(R.id.two);
        bye=(Button)findViewById(R.id.bye);

        bye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String twoo=two.getText().toString();

                Intent intent=new Intent(Removestud.this,Confirm.class);
                intent.putExtra(EXTRA_ROOM,twoo);
                startActivity(intent);
                finish();


            }
        });

    }
}
