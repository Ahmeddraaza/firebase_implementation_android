package com.example.firebase_implementation;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class add_data extends AppCompatActivity {

    private EditText editTextFullName, editTextEmail, editTextCity, editTextCountry,  editTextMessage;
    private Button buttonSubmit;


    private DatabaseReference  databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextCity = findViewById(R.id.editTextCity);
        editTextCountry = findViewById(R.id.editTextCountry);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonSubmit = findViewById(R.id.buttonSubmit);


        databaseReference = FirebaseDatabase.getInstance().getReference("users");



        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });

}


    private void addUser(){
        String fullname = editTextFullName.getText().toString();
        String email = editTextEmail.getText().toString();
        String city = editTextCity.getText().toString().trim();
        String country = editTextCountry.getText().toString();
        String message = editTextMessage.getText().toString();


        String id = databaseReference.push().getKey();
        User user = new User(id, fullname, email, country,city, message);
        assert id != null;
        databaseReference.child(id).setValue(user);

        Toast.makeText(this, "User added", Toast.LENGTH_SHORT).show();

    }


    }

