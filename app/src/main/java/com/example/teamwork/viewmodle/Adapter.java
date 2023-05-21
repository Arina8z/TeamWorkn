package com.example.teamwork.viewmodle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.teamwork.OnePetActivity;
import com.example.teamwork.R;
import com.example.teamwork.UpdatePetsActivity;
import com.example.teamwork.modle.Pets;

import java.util.ArrayList;
import java.util.List;

    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        // поля адаптера
        private Context context; // поле для контекста
        private Activity activity; // поле для активности
        private List<Pets> petsList; // поле для всех записей
        private List<Pets> newList; // поле для новой записи
       // private int layout;

        // конструктор
        public Adapter(Context context, Activity activity/*,int imageView*/, List<Pets> petsList) {
            this.context = context;
            this.activity = activity;
            this.petsList = petsList;
           // this.layout = imageView;
            newList = new ArrayList<>(petsList);
        }

        // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Notebook
        @Override
        public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // трансформация layout-файла во View-элемент
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(view);
        }

        // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Notebook по определенной позиции
        @Override
        public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
            holder.name.setText(petsList.get(position).getName());
            holder.breed.setText(petsList.get(position).getBreed());
            //holder.description.setText(petsList.get(position).getDescription());
            //holder.imageView.setImageBitmap(petsList.get(position).getImageView());

            // обработаем нажатие на контейнер notes_recycler_view
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // задание переключения на новый экран
                    Intent intent = new Intent(context, UpdatePetsActivity.class);
                    // передача данных в новую активити
                    intent.putExtra("name", petsList.get(position).getName());
                    intent.putExtra("breed", petsList.get(position).getBreed());
                    intent.putExtra("description", petsList.get(position).getDescription());
                    intent.putExtra("id", petsList.get(position).getId());
                    //intent.putExtra("imageView", petsList.get(position).getImageView());
                    // старт перехода
                    activity.startActivity(intent);
                }
            });
        }

        // метод getItemCount() возвращает количество объектов в списке
        @Override
        public int getItemCount() {
            return petsList.size();
        }


        // созданный статический класс ViewHolder
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // поля представления
            TextView name, breed, description;
            ConstraintLayout mLayout;
            ImageView imageView;

            // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
            ViewHolder(@NonNull View view) {
                super(view);
                name = view.findViewById(R.id.petsName);
                breed = view.findViewById(R.id.petsBreed);
               // description = view.findViewById(R.id.petsDescr);
               // imageView = view.findViewById(R.id.petsResource);
                mLayout = view.findViewById(R.id.mLayout);
            }
        }
    }

