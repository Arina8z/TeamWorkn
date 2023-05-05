package com.example.teamwork.modle;

public class Pets {

    private String id; // поле идентификатора записи в блокноте
    private String name; // поле заголовка записи в блокноте
    private String breed;
   // private String description; // поле описания записи в блокноте


    // конструктор
    public Pets(String id, String name, String breed) {

        this.id = id;
        this.name = name;
        this.breed = breed;
       // this.description = description;
    }



    // геттеры и сеттеры
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

    // public String getDescription() {
      // return description;
    //}

   // public void setDescription(String description) {
     //   this.description = description;
    //}
}

