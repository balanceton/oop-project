package com.mycompany.nyp;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitTEST {

    @Test
    public void cocuguMu() {
        ArrayList<Cocuk> children = new ArrayList<>();
        children.add(new Cocuk("Ceren Colak", "ceros35", "123456"));
        children.add(new Cocuk("Elif Ozyurek", "cekya", "123456"));
        children.add(new Cocuk("Kaan Gundogan", "kaanlaki", "123456"));
        Admin parent1 = new Admin("Ibrahim Sahin", "ibrahim@gmail.com", "ibrahim21", 3, 1);
        children.get(0).setAdmin(parent1);
        children.get(1).setAdmin(parent1);
        children.get(2).setAdmin(parent1);
        assertEquals(children.size(), NYP.cocuguMu("ibrahim@gmail.com", "ibrahim21").size());
    }

    @Test
    public void ebeyniMi() {
        ArrayList<Cocuk> children = new ArrayList<>();
        children.add(new Cocuk("Ceren Colak", "ceros35", "123456"));
        children.add(new Cocuk("Elif OZyurek", "cekya", "123456"));
        children.add(new Cocuk("Kaan Gundogan", "kaanlaki", "123456"));
        children.add(new Cocuk("Ayse Kayabay", "aysee", "123456"));
        Admin parent1 = new Admin("Ibrahim Sahin", "ibrahim@gmail.com", "ibrahim20", 3, 1);
        children.get(0).setAdmin(parent1);
        children.get(1).setAdmin(parent1);
        children.get(2).setAdmin(parent1);
        assertEquals(parent1.getName(), NYP.findEbeveyn(children.get(0).getNickname(), children.get(0).getPassword()).getName());
    }

    @Test
    public void ebeveynBul() {
        ArrayList<Admin> parents = new ArrayList<>();
        Admin parent1 = new Admin("Ibrahim Sahin", "ibrahim@gmail.com", "ibrahim20", 3, 1);
        Admin parent2 = new Admin("Yeter Aggul", "yeteraggul@gmail.com", "asfeag", 4, 1);
        Admin parent3 = new Admin("Anskgnj", "lfşmadgksd@gmail.com", " wfösşdlg", 9, 8);

        parents.add(parent1);
        parents.add(parent2);
        parents.add(parent3);

        assertEquals(parent1.getName(), NYP.find("ibrahim@gmail.com", "ibrahim21").getName());
    }

    @Test
    public void cocukBul() {
        ArrayList<Cocuk> children = new ArrayList<>();
        children.add(new Cocuk("Ceren Colak", "ceros35", "123456"));
        children.add(new Cocuk("Elif OZyurek", "cekya", "123456"));
        children.add(new Cocuk("Kaan Gundogan", "kaanlaki", "123456"));
        children.add(new Cocuk("Ayse Kayabay", "aysee", "123456"));
        assertEquals(children.get(0).getName(), NYP.findCocuk("ceros35", "123456").getName());
    }

}
