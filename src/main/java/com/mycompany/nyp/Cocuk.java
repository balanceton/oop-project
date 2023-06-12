package com.mycompany.nyp;

import com.mycompany.nyp.Admin;
import java.io.Serializable;
import java.util.ArrayList;

public class Cocuk implements Serializable {
    private static final long serialVersionUID = 5786710503600013437L;
    private String name;
    private String nickname;
    private String password;
    private Admin admin;
    private int ID;
    ArrayList<Test> testler = new ArrayList<>();

    public ArrayList<Test> getTestler() {
        return testler;
    }

    public void setTestler(ArrayList<Test> testler) {
        this.testler = testler;
    }

    public Cocuk(String name, String nickname, String password) {
        this.name = name;
        this.nickname = nickname;
        this.password = password;
    }
    
    public Cocuk(){
        
    }
    
    

    public String getName() {
        return name;
    }
    
    public Admin getAdmin() {
        return admin;
    }

    public int getID() {
        return ID;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setID(int id) {
        ID = id;
    }

    public void setname(String str) {
        name = str;
    }

    public void setnickname(String str) {
        nickname = str;
    }

    public void setpassword(String str) {
        password = str;
    }
    
    public void setAdmin(Admin veli) {
        admin = veli;
    }

    @Override
    public String toString() {
        return "Cocuk{" + "name=" + name + ", nickname=" + nickname + ", password=" + password + ", ID=" + ID + ", testler=" + testler + '}';
    }
    
    
    

}
