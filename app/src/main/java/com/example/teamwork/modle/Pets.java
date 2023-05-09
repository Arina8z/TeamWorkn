package com.example.teamwork.modle;

import android.widget.ImageView;

public class Pets {

    private String id; // поле идентификатора записи в блокноте
    private String name; // поле заголовка записи в блокноте
    private String breed;
    private String description; // поле описания записи в блокноте
    private ImageView imageView;


    // конструктор
    public Pets(String id, String name, String breed, String description/*, int imageView*/) {

        this.id = id;
        this.name = name;
        this.breed = breed;
        this.description = description;
        //this.imageView = imageView;
    }


   // public int getImageView() {
     //   return imageView;
    //}

    //public void setImageView(int imageView) {
      //  this.imageView = imageView;
    //}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

     public String getDescription() {
       return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

