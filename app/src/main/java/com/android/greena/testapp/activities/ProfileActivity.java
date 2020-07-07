package com.android.greena.testapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.greena.testapp.R;
import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    private ImageView   imageView;
    private TextView    nameTextView;
    private TextView    ageTextView;
    private TextView    phoneTextView;
    private TextView    emailTextView;
    private TextView    locationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.profileImage);
        nameTextView = findViewById(R.id.profileName);
        ageTextView = findViewById(R.id.ageTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);
        locationTextView = findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        if (intent != null) {
            Glide.with(imageView.getContext())
                    .load(intent.getStringExtra("picture"))
                    .into(imageView);
            nameTextView.setText(intent.getStringExtra("name"));
            ageTextView.setText(intent.getStringExtra("age") + " years old");
            phoneTextView.setText(intent.getStringExtra("phone"));
            emailTextView.setText(intent.getStringExtra("email"));
            locationTextView.setText(intent.getStringExtra(""));
        }
    }
}