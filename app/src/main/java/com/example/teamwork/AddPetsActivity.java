package com.example.teamwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.teamwork.viewmodle.DatabaseHelper;

import java.io.IOException;

public class AddPetsActivity extends AppCompatActivity {

    static final int GALLERY_REQUEST = 1;
    // создание полей
    private EditText name, breed, description;
    private Button save,foto;
    private  ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pets);


        name = findViewById(R.id.klichka);
        breed = findViewById(R.id.poroda);
        description = findViewById(R.id.description);
        save = findViewById(R.id.save);
        //foto = findViewById(R.id.foto);
        imageView = findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
            }
        });

        // обработка нажатия кнопки
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // если исправленный текст не пустой, то обновление записи в БД
                if (!TextUtils.isEmpty(name.getText().toString()) && !TextUtils.isEmpty(breed.getText().toString()) && !TextUtils.isEmpty(description.getText().toString())){

                    DatabaseHelper database = new DatabaseHelper(AddPetsActivity.this); // создание объекта БД в текущей активности
                    database.addNotes(name.getText().toString(), breed.getText().toString(), description.getText().toString()); // создание записи в БД

                    // создание намерения переключения активности
                    Intent intent = new Intent(AddPetsActivity.this, PetsActivity.class); // переключение обратно в активность демонстрации всех записей
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // установления флага экономии ресурсов
                    startActivity(intent);

                    finish(); // при нажатии на кнопку назад действие уничтожается и проиходит переход в активность SecondActivity

                }  else { // иначе просто тост об отсутствии изменений
                    Toast.makeText(AddPetsActivity.this, "Необходимо заполнить оба поля", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        Bitmap bitmap = null;
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        switch(requestCode) {
            case GALLERY_REQUEST:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = imageReturnedIntent.getData();
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    imageView.setImageBitmap(bitmap);

                }
        }
    }
}

