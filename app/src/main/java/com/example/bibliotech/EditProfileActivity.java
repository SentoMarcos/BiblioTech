package com.example.bibliotech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfileditar); // Set the layout for this activity
    }
    public void onClick(View view) {
        // Open the EditProfileActivity when the "editar" ImageView is clicked
        Intent intent = new Intent(EditProfileActivity.this, perfilActivity.class);
        startActivity(intent);
    }
}
