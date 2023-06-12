package com.mycompany.nyp;

import java.io.Serializable;
import java.time.Duration;

public class Soru implements Serializable {
    
    private transient int sayi1;
    private transient int sayi2;
    private transient boolean result;
    private transient Duration sure;

    public Soru() {
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Duration getSure() {
        return sure;
    }

    public void setSure(Duration sure) {
        this.sure = sure;
    }

    @Override
    public String toString() {
        return "Soru{" + "sayi1=" + sayi1 + ", sayi2=" + sayi2 + ", result=" + result + ", sure=" + sure + '}';
    }
}
