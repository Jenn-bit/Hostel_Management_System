package com.example.hostelmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class fetchh extends AppCompatActivity {


    private TextView nam;
    private TextView doo;
    private TextView roo;
    private Button but;
    DatabaseReference reff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetchh);
        nam = (TextView) findViewById(R.id.textView11);
        doo = (TextView) findViewById(R.id.textView12);
        roo = (TextView) findViewById(R.id.textView13);
        but = (Button) findViewById(R.id.button4);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff = FirebaseDatabase.getInstance().getReference().child("users");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String name = dataSnapshot.child("name").getValue().toString();
                        String dob = dataSnapshot.child("dob").getValue().toString();
                        String room = dataSnapshot.child("room").getValue().toString();


                        nam.setText(name);
                        doo.setText(dob);
                        roo.setText(room);


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }


                });

            }
        });
    }
}

