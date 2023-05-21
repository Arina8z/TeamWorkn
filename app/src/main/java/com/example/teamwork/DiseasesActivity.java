package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DiseasesActivity extends AppCompatActivity {
    ListView diseasesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        String[] diseases = { "Инфекционные заболевания", "Генетические заболевания", "Заболевания кожи", "Паразиты", "Желудочно-кишечные заболевания", "Болезни сердца"};


        // получаем элемент ListView
        ListView diseasesList = findViewById(R.id.diseasesList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, diseases);

        // устанавливаем для списка адаптер
        diseasesList.setAdapter(adapter);

        diseasesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = diseases[position];
                int num = position;
                Intent intent = new Intent(DiseasesActivity.this, SecondActivity.class);

                intent.putExtra("num", num);
                startActivity(intent);
            }
        });

    }

}
/*
    private ListView diseasesList;
    private TextView diseasesOut;
    private String[] arrayDiseases = {"Блохи", "Инфекционные заболевания", "Генетические заболевания", "Заболевания кожи", "Опухоли и рак", "Желудочно-кишечные заболевания", "Глазные болезни"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        diseasesList = findViewById(R.id.diseasesList);
        diseasesOut = findViewById(R.id.diseasesOut);


        //ArrayList<String> diseases = new ArrayList<String>();
        // diseases.add(0, "Блохи");
        //diseases.add(1, "Инфекционные заболевания");
        //diseases.add(2, "Генетические заболевания");
        //diseases.add(3, "Заболевания кожи");
        //diseases.add(4, "Опухоли и рак");
        //diseases.add(5, "Желудочно-кишечные заболевания");
        //diseases.add(6, "Глазные болезни");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayDiseases);


        diseasesList.setAdapter(adapter);

        diseasesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedItem = arrayDiseases[position];
                diseasesOut.setText(selectedItem);
            }
        });


    }

 /*   @Override
    public void onClick(View view) {
        public View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch (view.getId()) {
                case: R.id.diseases;

                }
            }


        };
    }
}*/