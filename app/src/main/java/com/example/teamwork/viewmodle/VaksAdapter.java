package com.example.teamwork.viewmodle;
/*
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teamwork.R;
//import com.example.teamwork.UpdateVaksActivity;
import com.example.teamwork.modle.Vaks;

import java.util.ArrayList;
import java.util.List;

/*public class VaksAdapter extends RecyclerView.Adapter<VaksAdapter.ViewHolder> {

    private String id;
    DBvakHelper dbHelper;
    // поля адаптера
    private Context context; // поле для контекста
    private Activity activity; // поле для активности
    private List<Vaks> vaksList; // поле для всех записей
    private List<Vaks> newList; // поле для новой записи


    public void setItems(List<Vaks> vaks) {
        vaksList.addAll(vaks);
        notifyDataSetChanged();
    }

    public void clearItems() {
        vaksList.clear();
        notifyDataSetChanged();
    }

    // конструктор
    public VaksAdapter(Context context, Activity activity, List<Vaks> vaksList) {
        this.context = context;
        this.activity = activity;
        this.vaksList = vaksList;
        newList = new ArrayList<>(vaksList);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // трансформация layout-файла во View-элемент
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_vaks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.vaks.setText(vaksList.get(position).getVaks());
        holder.data.setText(vaksList.get(position).getData());

        holder.vLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // задание переключения на новый экран
                Intent intent = new Intent(context, UpdateVaksActivity.class);
                // передача данных в новую активити
                intent.putExtra("vaks", vaksList.get(position).getVaks());
                intent.putExtra("data", vaksList.get(position).getData());

                intent.putExtra("id", vaksList.get(position).getId());
                // старт перехода
                activity.startActivity(intent);
            }
        });
        dbHelper = new DBvakHelper(context.getApplicationContext());
        holder.delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String selectedItem = vaksList.getItemAtPosition(position).toString();
                // DBvakHelper database = new DBvakHelper(getApplicationContext());
                dbHelper.deleteSingleItem(id);



                //VaksAdapter.notifyDataSetChanged();


                return;
            }
            // RecyclerView.getAdapter.notify(id);
        });
    }

    @Override
    public int getItemCount() {
        return vaksList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final TextView data, vaks;
        final Button delButton, checkButton;
        ConstraintLayout vLayout;

        ViewHolder(@NonNull View view) {
            super(view);
            vaks = view.findViewById(R.id.vaksView);
            data = view.findViewById(R.id.dataView);
            vLayout = view.findViewById(R.id.vLayout);
            checkButton = view.findViewById(R.id.checkBox);
            delButton = view.findViewById(R.id.delButton);
        }

    }




}*/
