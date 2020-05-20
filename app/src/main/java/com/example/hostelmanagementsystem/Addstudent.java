package com.example.hostelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Addstudent  extends AppCompatActivity {

    private TextInputEditText Sname,Dname,Phname,Ename,Pname,Phname1,Notesss,Dname1,Rname;
    Button Add;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstudent);

        Sname= findViewById(R.id.snamee);
        Dname= findViewById(R.id.dnamee);
        Phname= findViewById(R.id.phnamee);
        Ename= findViewById(R.id.enamee);
        Pname= findViewById(R.id.pnamee);
        Phname1= findViewById(R.id.phnamee1);
        Notesss= findViewById(R.id.notesss);
        Dname1=findViewById(R.id.dnamee1);
        Rname=findViewById(R.id.rnamee);
        Add=findViewById(R.id.add);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode=FirebaseDatabase.getInstance();

                String name= Sname.getText().toString();
                String dob= Dname.getText().toString();
                String ph= Phname.getText().toString();
                String eid= Ename.getText().toString();
                String pname= Pname.getText().toString();
                String pph= Phname1.getText().toString();
                String notes= Notesss.getText().toString();
                String doe= Dname1.getText().toString();
                String rom= Rname.getText().toString();
                String branch="";
                reference= rootNode.getReference(rom);


                Userhelperclas helperlass= new Userhelperclas(name,dob,eid,ph,pph,doe,notes,branch,rom,pname);
                reference.setValue(helperlass);Intent intent=new Intent(Addstudent.this,HomePage.class);

                startActivity(intent);
                finish();
                Toast.makeText(Addstudent.this, "Student Added Successfully!", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
