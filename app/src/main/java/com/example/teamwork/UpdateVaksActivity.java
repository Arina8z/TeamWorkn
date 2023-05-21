package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.example.teamwork.viewmodle.DBvakHelper;

/*public class UpdateVaksActivity extends AppCompatActivity {

    private EditText vaks;
    private EditText data;

    private Button updateBut;
    private Button deleteBut;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_vaks);
        vaks = findViewById(R.id.eventName);
        data = findViewById(R.id.eventDate);
        updateBut = findViewById(R.id.UpdVaks);
        deleteBut = findViewById(R.id.delVaks);
        // считывание данных из переданного намерения Intent
        Intent intent = getIntent();
        // запись этих данных на экран активности
        vaks.setText(intent.getStringExtra("vaks"));
        data.setText(intent.getStringExtra("data"));


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
            if (!TextUtils.isEmpty(vaks.getText().toString()) && !TextUtils.isEmpty(data.getText().toString())) {
                DBvakHelper database = new DBvakHelper(UpdateVaksActivity.this); // создание объекта БД в текущей активности

                // обработка кнопки
                switch (view.getId()) {
                    case R.id.UpdVaks:
                        // обновление заметки
                        database.updateVaks(vaks.getText().toString(), data.getText().toString(), id); // обновление записи в БД по id
                        break;
                    case R.id.delVaks:
                        // удаление заметки
                        database.deleteSingleItem(id); // удаление записи БД по id
                        break;
                }

                startActivity(new Intent(UpdateVaksActivity.this, VaksesActivity.class)); // переключение обратно в активность демонстрации всех записей
            } else { // иначе просто тост об отсутствии изменений
                Toast.makeText(UpdateVaksActivity.this, "Изменений не внесено", Toast.LENGTH_SHORT).show();
            }
        }
    };
}

*/

