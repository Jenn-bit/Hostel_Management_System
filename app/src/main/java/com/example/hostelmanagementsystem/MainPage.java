package com.example.hostelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class MainPage extends AppCompatActivity {

    private EditText name;
    private EditText dob;
    private EditText room;
    private Button add;
    private TextInputLayout sname,Dob,Doe,pname,ph,pph;

    FirebaseDatabase rootnode;
    FirebaseDatabase subroot;
    DatabaseReference reference,ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        add=(Button)findViewById(R.id.button2);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootnode=FirebaseDatabase.getInstance();
                reference=rootnode.getReference("users");

                String namee=name.getText().toString();
                String dobb= dob.getText().toString();
                String roomm=room.getText().toString();



                subroot=FirebaseDatabase.getInstance();



                startActivity(new Intent(getApplicationContext(),fetchh.class));



            }
        });

    }
}
