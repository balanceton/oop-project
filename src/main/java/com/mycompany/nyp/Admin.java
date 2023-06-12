package com.mycompany.nyp;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable {

    private static final long serialVersionUID = -72342406655971960L;
    private String name;
    private String email;
    private String password;
    private int cocuk_sayisi;
    ArrayList<Cocuk> cocuklar = new ArrayList<>();
    private int ID;

    public Admin() {

    }

    public Admin(String name, String email, String password, int cocuk_sayisi, int ID) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cocuk_sayisi = cocuk_sayisi;
        this.ID = ID;
    }

    public ArrayList<Cocuk> getCocuklar() {
        return cocuklar;
    }

    public void setCocuk(Cocuk cocuk) {
        cocuklar.add(cocuk);
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getCocukSayisi() {
        return cocuk_sayisi;
    }

    public void setName(String ad) {
        name = ad;
    }

    public void setEmail(String Email) {
        email = Email;
    }

    public void setPassword(String sifre) {
        password = sifre;
    }

    public void setCocukSayisi(int count) {
        cocuk_sayisi = count;
    }

    @Override
    public String toString() {
        return "Admin{" + "name=" + name + ", email=" + email + ", password=" + password + ", cocuk_sayisi=" + cocuk_sayisi + ", cocuklar=" + cocuklar + ", ID=" + ID + '}';
    }

    

}
