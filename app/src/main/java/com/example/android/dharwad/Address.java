package com.example.android.dharwad;

public class Address {

    private String disc;
    private String area;


    Address(String area, String disc) {
        this.area = area;
        this.disc = disc;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }


}
