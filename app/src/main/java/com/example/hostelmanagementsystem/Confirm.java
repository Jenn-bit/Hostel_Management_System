package com.example.hostelmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Confirm extends AppCompatActivity {

    private TextView namee,dobb,phh,eidd,pnamee,pphh,romm,doee, branchh,notess;
    private Button confirm;
    DatabaseReference reff;

    FirebaseDatabase rootnode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        Intent intent=getIntent();
        final String s=intent.getStringExtra(Removestud.EXTRA_ROOM);


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
        confirm=(Button)findViewById(R.id.searchh);


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

                Toast.makeText(Confirm.this, "Invalid Room Number", Toast.LENGTH_SHORT).show();
                return;

            }
       });

confirm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        rootnode=FirebaseDatabase.getInstance();
        reference=rootnode.getReference(s);


       /* String name=namee.getText().toString();
        String dob=dobb.getText().toString();
        String pname=pnamee.getText().toString();
        String ph=phh.getText().toString();
        String doe=doee.getText().toString();
        String eid=eidd.getText().toString();
        String pph=pphh.getText().toString();
        String notes=notess.getText().toString();
        String branch=branchh.getText().toString();
        String rom=romm.getText().toString();
*/
        String name="-";
        String dob="-";
        String pname="-";
        String ph="-";
        String doe="-";
        String eid="-";
        String pph="-";
        String notes="-";
        String branch="-";
        String rom="-";
        Userhelperclas help= new Userhelperclas(name,dob,eid,ph,pph,doe,notes,branch,rom,pname);
        reference.setValue(help);








        Intent intent=new Intent(Confirm.this,HomePage.class);
        startActivity(intent);
        Toast.makeText(Confirm.this, "Student Removed Successfully", Toast.LENGTH_SHORT).show();
        finish();


    }
});
    }
}
