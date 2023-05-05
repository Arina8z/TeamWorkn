package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button pets;
    private Button bolezni;
   // private Button zooshop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       pets = findViewById(R.id.pets);
        //zooshop = findViewById(R.id.zooshop);
        bolezni = findViewById(R.id.bolezni);

        pets.setOnClickListener(listener);
        bolezni.setOnClickListener(listener1);
       // zooshop.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), PetsActivity.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), DiseasesActivity.class);
            startActivity(intent);

        }
    };
}
   //        switch (view.getId()) {
   //             case R.id.bolezni:
     ///               Intent intentDiseases = new Intent(getApplicationContext(), DiseasesActivity.class);
      ////              startActivity(intentDiseases);
    //                break;
    //            case R.id.pets:
      //              Intent intentDoctors = new Intent(getApplicationContext(), PetsActivity.class);
      //              startActivity(intentDoctors);
     ////               break;
     //           case R.id.zooshop:
     //               Intent intentZooshop = new Intent(getApplicationContext(), ZooshopActivity.class);
     ///               startActivity(intentZooshop);
    //                break;
     //      //     case R.id.pharmacy:
     //           //    Intent intentPharmacy = new Intent(getApplicationContext(), PharmacyActivity.class);
     //           ////    startActivity(intentPharmacy);
     //       }
//
       //     Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
          //  startActivity(intent);

   //     }
   // };