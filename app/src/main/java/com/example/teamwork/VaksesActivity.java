package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teamwork.modle.Vaks;
import com.example.teamwork.viewmodle.DBvakHelper;
import com.example.teamwork.viewmodle.VaksAdapter;

import java.util.ArrayList;
import java.util.List;

public class VaksesActivity extends AppCompatActivity {

    private RecyclerView recyclerView; // поле для списка RecyclerView
    //private FloatingActionButton fabAdd; // поле для кнопки добавить новую заметку
    private Button addVaks;
    private Button delall;
    private EditText vaks;
    private EditText data;

    private List<Vaks> vaksList; // поле для контейнера списка заметок

    private DBvakHelper database; // поле работы с БД
    private VaksAdapter adapter; // поле для адаптера

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaks);



        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                int mYear = year;
                int mMonth = month;
                int mDay = dayOfMonth;
                String selectedDate = new StringBuilder().append(mDay).append("-").append(mMonth + 1)
                        .append("-").append(mYear)
                        .append(" ").toString();
                Toast.makeText(getApplicationContext(), selectedDate, Toast.LENGTH_LONG).show();
                String data;
                data  = selectedDate;
            }
        });


        recyclerView = findViewById(R.id.vaksRecyclerView);
        addVaks = findViewById(R.id.addVaks);
        //delall= findViewById(R.id.delall);


        vaksList = new ArrayList<>(); // выделение памяти и задание типа контейнера для списка заметок
        database = new DBvakHelper(this); // выделение памяти и задание текущего контекста работы с БД



        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // задание структуры вывода данных в recyclerView
        adapter = new VaksAdapter(this, VaksesActivity.this, vaksList); // инициализация адаптера и передача в рего данных из БД
        recyclerView.setAdapter(adapter); // передача в recyclerView адаптер

        vaks = findViewById(R.id.newVaks);
        data = findViewById(R.id.Date);

        // обработка нажатия кнопки создания новой заметки
        addVaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(vaks.getText().toString()) && !TextUtils.isEmpty(data.getText().toString())) {

                    DBvakHelper database = new DBvakHelper(VaksesActivity.this);
                    database.addVaks(vaks.getText().toString(), data.getText().toString());

                    vaks.setText(null);
                    data.setText(null);
                    fetchAllVaks();
                    //recyclerView.notify();
                    // переключение на новую активность
                    // startActivity(new Intent(PetsActivity.this, AddPetsActivity.class));
                }  else { // иначе просто тост об отсутствии изменений
                    Toast.makeText(VaksesActivity.this, "Необходимо заполнить оба поля", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // считывание данных из БД и запись их в коллекцию notesList

        fetchAllVaks();
    }
    // метод считывания из БД всех записей
    public void fetchAllVaks(){
        // чтение БД и запись данных в курсор
        Cursor cursor = database.readVaks();


        if (cursor.getCount() == 0) { // если данные отсутствую, то вывод на экран об этом тоста
            Toast.makeText(this, "Данных нет", Toast.LENGTH_SHORT).show();
        } else { // иначе помещение их в контейнер данных notesList
            while (cursor.moveToNext()){
                // помещение в контейнер notesList из курсора данных
                vaksList.add(new Vaks(cursor.getString(0), cursor.getString(1), cursor.getString(2)));

            }
        }

    }


}

