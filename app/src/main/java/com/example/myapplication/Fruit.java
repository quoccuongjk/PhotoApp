package com.example.myapplication;

import java.io.Serializable;

public class Fruit implements Serializable {
    String ten;
    String link;
    String mota;

    public Fruit(String ten, String link, String mota)  {
        this.ten = ten;
        this.link = link;
        this.mota = mota;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
