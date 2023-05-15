package com.example.teamwork.modle;

public class Vaks {
    private  String id;
    private String vaks;
    private String data;
    // private LocalDate date;


    public Vaks(String id, String vaks, String data /*LocalDate date, LocalTime time*/) {
        this.id = id;
        this.vaks = vaks;
        this.data = data;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVaks()
    {
        return vaks;
    }

    public void setVaks(String vaks)
    {
        this.vaks = vaks;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String date)
    {
        this.data = date;
    }


}


