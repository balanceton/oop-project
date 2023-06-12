package com.mycompany.nyp;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Test implements Serializable{
    private static final long serialVersionUID =  -8492046119801999947L;
    private String name;
    private int soru_sayisi;
    private int max;
    private int min;
    private int dogru_sayisi;
    private int yanlis_sayisi;
    private LocalTime baslama_zamani;
    private LocalTime bitis_zamani;
    private Duration  sure;
    ArrayList<Soru> sorular;
    private int skor;
    private int sure_skor;
    
    public Test(int soru_sayisi, int max, int min) {
        this.soru_sayisi = soru_sayisi;
        this.max = max;
        this.min = min;
    }
    public Test() {
    }

    public int getSure_skor() {
        return sure_skor;
    }

    public void setSure_skor(int sure_skor) {
        this.sure_skor = sure_skor;
    }
    
    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Duration  getSure() {
        return sure;
    }

    public void setSure(Duration sure) {
        this.sure = sure;
    }

    public int getDogru_sayisi() {
        return dogru_sayisi;
    }

    public void setDogru_sayisi(int dogru_sayisi) {
        this.dogru_sayisi = dogru_sayisi;
    }

    public int getYanlis_sayisi() {
        return yanlis_sayisi;
    }

    public void setYanlis_sayisi(int yanlis_sayisi) {
        this.yanlis_sayisi = yanlis_sayisi;
    }

    public LocalTime getBaslama_zamani() {
        return baslama_zamani;
    }

    public void setBaslama_zamani(LocalTime baslama_zamani) {
        this.baslama_zamani = baslama_zamani;
    }

    public LocalTime getBitis_zamani() {
        return bitis_zamani;
    }

    public void setBitis_zamani(LocalTime bitis_zamani) {
        this.bitis_zamani = bitis_zamani;
    }
    
    
    public int getSoru_sayisi() {
        return soru_sayisi;
    }

    public void setSoru_sayisi(int soru_sayisi) {
        this.soru_sayisi = soru_sayisi;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Test{" + "name=" + name + ", soru_sayisi=" + soru_sayisi + ", max=" + max + ", min=" + min + ", dogru_sayisi=" + dogru_sayisi + ", yanlis_sayisi=" + yanlis_sayisi + ", baslama_zamani=" + baslama_zamani + ", bitis_zamani=" + bitis_zamani + ", sure=" + sure + ", sorular=" + sorular + ", skor=" + skor + ", sure_skor=" + sure_skor + '}';
    }

    
    
    

    
    
}