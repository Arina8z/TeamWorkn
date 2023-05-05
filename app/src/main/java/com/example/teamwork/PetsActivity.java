package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.teamwork.modle.Pets;
import com.example.teamwork.viewmodle.Adapter;
import com.example.teamwork.viewmodle.DatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PetsActivity extends AppCompatActivity {

    //создание полей
    private RecyclerView recyclerView; // поле для списка RecyclerView
    //private FloatingActionButton fabAdd; // поле для кнопки добавить новую заметку
    private Button addPet;
    private Button delall;

    private List<Pets> petsList; // поле для контейнера списка заметок

    private DatabaseHelper database; // поле работы с БД
    private Adapter adapter; // поле для адаптера


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);


        // присваивание id полям
        recyclerView = findViewById(R.id.petsList);
        addPet = findViewById(R.id.addPet);
        delall= findViewById(R.id.delall);


        petsList = new ArrayList<>(); // выделение памяти и задание типа контейнера для списка заметок
        database = new DatabaseHelper(this); // выделение памяти и задание текущего контекста работы с БД



        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // задание структуры вывода данных в recyclerView
        adapter = new Adapter(this, PetsActivity.this, petsList); // инициализация адаптера и передача в рего данных из БД
        recyclerView.setAdapter(adapter); // передача в recyclerView адаптер

        // считывание данных из БД и запись их в коллекцию notesList
        fetchAllNotes();

        // обработка нажатия кнопки создания новой заметки
        addPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // переключение на новую активность
                startActivity(new Intent(PetsActivity.this, AddPetsActivity.class));
            }
        });
// обработка нажатия кнопки создания новой заметки
        delall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // переключение на новую активность
                //startActivity(new Intent(PetsActivity.this, AddPetsActivity.class));
                DatabaseHelper database = new DatabaseHelper(PetsActivity.this);

                database.deleteAllNotes();

                petsList.clear();
                adapter.notifyDataSetChanged();

            }
        });
    }

    // метод считывания из БД всех записей
    public void fetchAllNotes(){
        // чтение БД и запись данных в курсор
        Cursor cursor = database.readNotes();

        if (cursor.getCount() == 0) { // если данные отсутствую, то вывод на экран об этом тоста
            Toast.makeText(this, "Данных нет", Toast.LENGTH_SHORT).show();
        } else { // иначе помещение их в контейнер данных notesList
            while (cursor.moveToNext()){
                // помещение в контейнер notesList из курсора данных
                petsList.add(new Pets(cursor.getString(0), cursor.getString(1), cursor.getString(2)));
                /*, cursor.getString(3)*/
            }
        }

    }

}
