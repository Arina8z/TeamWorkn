package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teamwork.viewmodle.DatabaseHelper;

public class UpdatePetsActivity extends AppCompatActivity {
    // создание полей
    private EditText name, breed, description;
    private Button updateBut, deleteBut;
    private String id;
    private int imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_pets);

        // присваивание id полям
        name = findViewById(R.id.klichkaR);
        breed = findViewById(R.id.porodaR);
        description = findViewById(R.id.descriptionR);
       // imageView = findViewById(R.id.imageView);

        updateBut = findViewById(R.id.updbut);
        deleteBut = findViewById(R.id.delbut);

        // считывание данных из переданного намерения Intent
        Intent intent = getIntent();
        // запись этих данных на экран активности
        name.setText(intent.getStringExtra("name"));
        breed.setText(intent.getStringExtra("breed"));
        description.setText(intent.getStringExtra("description"));
        //imageView.setImageBitmap(intent.getStringExtra("imageView"));

        id = intent.getStringExtra("id");

        // обработка нажатия кнопки
        updateBut.setOnClickListener(listener);
        deleteBut.setOnClickListener(listener);
    }

    // задание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // если исправленный текст не пустой, то обновление записи в БД
            if (!TextUtils.isEmpty(name.getText().toString()) && !TextUtils.isEmpty(breed.getText().toString()) && !TextUtils.isEmpty(description.getText().toString())) {
                DatabaseHelper database = new DatabaseHelper(UpdatePetsActivity.this); // создание объекта БД в текущей активности

                // обработка кнопки
                switch (view.getId()) {
                    case R.id.updbut:
                        // обновление заметки
                        database.updateNotes(name.getText().toString(), breed.getText().toString(), description.getText().toString(), id); // обновление записи в БД по id
                        break;
                    case R.id.delbut:
                        // удаление заметки
                        database.deleteSingleItem(id); // удаление записи БД по id
                        break;
                }

                startActivity(new Intent(UpdatePetsActivity.this, PetsActivity.class)); // переключение обратно в активность демонстрации всех записей
            } else { // иначе просто тост об отсутствии изменений
                Toast.makeText(UpdatePetsActivity.this, "Изменений не внесено", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
