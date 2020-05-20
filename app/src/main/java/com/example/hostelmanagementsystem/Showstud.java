package com.example.hostelmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Showstud extends AppCompatActivity {

    private TextView namee,dobb,phh,eidd,pnamee,pphh,romm,doee, branchh,notess;
    private Button searchh;
    private EditText romie;

    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showstud);

        namee=(TextView)findViewById(R.id.namee);
        dobb=(TextView)findViewById(R.id.dobb);
        phh=(TextView)findViewById(R.id.phh);
        eidd=(TextView)findViewById(R.id.eidd);
        pnamee=(TextView)findViewById(R.id.pnamee);
        pphh=(TextView)findViewById(R.id.pphh);
        romm=(TextView)findViewById(R.id.romm);
        doee=(TextView)findViewById(R.id.doee);
        branchh=(TextView)findViewById(R.id.branchh);
        notess=(TextView)findViewById(R.id.notess);
        searchh=(Button)findViewById(R.id.searchh);
        romie=(EditText)findViewById(R.id.romie);


        searchh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s = romie.getText().toString();

                if (TextUtils.isEmpty(s)) {
                    Toast.makeText(Showstud.this, "Please enter room number", Toast.LENGTH_SHORT).show();
                    return;
                }



                    reff = FirebaseDatabase.getInstance().getReference().child(s);
                    reff.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            String name = dataSnapshot.child("name").getValue().toString();
                            String dob = dataSnapshot.child("dob").getValue().toString();
                            String ph = dataSnapshot.child("ph").getValue().toString();
                            String eid = dataSnapshot.child("eid").getValue().toString();
                            String pname = dataSnapshot.child("pname").getValue().toString();
                            String pph = dataSnapshot.child("pph").getValue().toString();
                            String doe = dataSnapshot.child("doe").getValue().toString();
                            String rom = dataSnapshot.child("rom").getValue().toString();
                            String branch = dataSnapshot.child("branch").getValue().toString();
                            String notes = dataSnapshot.child("notes").getValue().toString();

                            namee.setText("Name: " + name);
                            dobb.setText("Date Of Birth: " + dob);
                            eidd.setText("Email ID: " + eid);
                            phh.setText("Phone Number: " + ph);
                            pnamee.setText("Parent Name: " + pname);
                            pphh.setText("Phone Number: " + pph);
                            doee.setText("Date Of Entry: " + doe);
                            notess.setText("Additional Notes: " + notes);
                            romm.setText("Room Number: " + rom);
                            branchh.setText("Branch: " + branch);


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                            Toast.makeText(Showstud.this, "Invalid Room Number", Toast.LENGTH_SHORT).show();
                            return;

                        }
                    });

            }
        });
    }
}
