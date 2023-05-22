package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teamwork.modle.Pets;
import com.example.teamwork.viewmodle.Adapter;
import com.example.teamwork.viewmodle.DatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {



       // private User user;
        private TextView num1;
        private int posit,bol ;
        private ListView diseases2List;
        String [] diseases2;
        String selectedName;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            num1 = findViewById(R.id.num);

            diseases2List = findViewById(R.id.diseases2List);
            Bundle bundleIntent = getIntent().getExtras();

            if (bundleIntent != null) {
                posit = bundleIntent.getInt("num");

            }

            //num1.setText("Число: " +  posit);


            if (posit == 0) {
                String [] diseases2 = {"Бешенство", "Парвовирус", "Собачья чума", "Инфекнционный собачий гепатит", "Собачий грипп", "Отомикоз"};

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });


            } else
            if (posit == 1) {
                String[] diseases2 = {"Дисплазия тазобедренного сустава", "Болезнь Виллебранда", "Энтропион"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });

            } else
            if (posit == 2) {
                String[] diseases2 = {"Атопия", "Пиодермия", "Аллергический дерматит"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });

            } else
            if (posit == 3) {
                String[] diseases2 = {"Блохи", "Клещи", "Глисты"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });
            } else
            if (posit == 4) {
                String[] diseases2 = {"Oтравление", "Oстрый гастрит", "Хронический гастрит", "Колит", "Парапроктит", "Энтерит", "Гастроэнтерит", "Язва желудка"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;

                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });
            } else
            if (posit == 5) {
                String[] diseases2 = {"Сердечная недостаточность", "Кардиомиопатия", "Миокардит", "Эндокардит", "Инфаркт миокарда"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });
            } else
            if (posit == 6) {
                String[] diseases2 = {"Сердечная недостаточность", "Инфекционные заболевания", "Генетические заболевания", "Заболевания кожи", "Опухоли и рак", "Желудочно-кишечные заболевания", "Глазные болезни", "Ортопедические заболевания", "Вестибулярная болезнь", "Болезни сердца"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases2);
                diseases2List.setAdapter(adapter);
                diseases2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedItem = diseases2[position];
                        bol = position;
                        selectedName = selectedItem;
                        Intent intent = new Intent(SecondActivity.this, TextActivity.class);

                        intent.putExtra("bol", bol);
                        intent.putExtra("class", posit);
                        intent.putExtra("name", selectedName);
                        startActivity(intent);
                    }
                });

            }



        }


    }

