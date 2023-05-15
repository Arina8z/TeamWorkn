package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnePetActivity extends AppCompatActivity {

    private TextView name;
    private TextView breed;
    private TextView description;
    private Button updateBtn, graftBtn;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_pet);
        name = findViewById(R.id.namePet);
        breed = findViewById(R.id.breedPet);
        description = findViewById(R.id.descriptionPet);

        updateBtn = findViewById(R.id.update);
        graftBtn = findViewById(R.id.privivka);
        updateBtn.setOnClickListener(listener);
        graftBtn.setOnClickListener(listener1);



        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        breed.setText(intent.getStringExtra("breed"));
        description.setText(intent.getStringExtra("description"));

        id = intent.getStringExtra("id");

    }

    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(OnePetActivity.this, VaksesActivity.class);
            intent.putExtra("name",name.getText().toString());
            intent.putExtra("breed",breed.getText().toString());
            intent.putExtra("description",description.getText().toString());
            intent.putExtra("id",id.toString());


            startActivity(intent);

        }
    };

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(OnePetActivity.this, UpdatePetsActivity.class);
            intent.putExtra("name",name.getText().toString());
            intent.putExtra("breed",breed.getText().toString());
            intent.putExtra("description",description.getText().toString());
            intent.putExtra("id",id.toString());


            startActivity(intent);

        }
    };

}