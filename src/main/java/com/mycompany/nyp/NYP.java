package com.mycompany.nyp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class NYP {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        
        // Kullanıcı bilgileri dosyaya yazdırıldı. Bu koda dokunmayınız!
        //ArrayList<Admin> adminler = new ArrayList<>();
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("How many contacts will you enter? ");
        Integer contactCount = input.nextInt();
        input.nextLine();
        Admin[] admins = new Admin[contactCount];
        for (int i = 0; i < contactCount; i++) {
            admins[i] = new Admin(); 
            admins[i].setID(i+1);
            System.out.print("Velinin tam adı:");
            admins[i].setName(input.nextLine());
            System.out.print("Velinin mail adresi:");
            admins[i].setEmail(input.nextLine());
            System.out.print("Velinin giriş şifresi:");
            admins[i].setPassword(input.nextLine());
            System.out.print("Velinin çocuk sayisi:");
            admins[i].setCocukSayisi(input.nextInt());
            input.nextLine();
            Cocuk[] cocuklar = new Cocuk[admins[i].getCocukSayisi()];
            for (int j = 0; j < admins[i].getCocukSayisi(); j++) {
                cocuklar[j] = new Cocuk();
                System.out.print(j+1 + ".çocuğun idsini giriniz:");
                int id = input.nextInt();
                input.nextLine();
                cocuklar[j].setID(id);
                System.out.print(j+1 + ".çocuğun tam adını giriniz:");
                cocuklar[j].setname(input.nextLine());
                System.out.print(j+1 + ".çocuğun kullanıcı adını giriniz:");
                cocuklar[j].setnickname(input.nextLine());
                System.out.print(j+1 + ".çocuğun şifresini giriniz:");
                cocuklar[j].setpassword(input.nextLine());
                cocuklar[j].setAdmin(admins[i]);
                admins[i].setCocuk(cocuklar[j]);
            }
            input.close();
            try{
                String fileName = "Veliler.dat";
                ObjectOutputStream yazici = new ObjectOutputStream(
                       new FileOutputStream(fileName));
                
                for (Admin badmins : admins)
                    yazici.writeObject(badmins);
                yazici.close();
                System.out.println("Başarılı bir şekilde kaydedildi");
            } catch(IOException e){
                System.out.println("HATA VAR");
                e.printStackTrace();
            }
            
            try{
                String fileName = "Cocuklar.dat";
                ObjectOutputStream yazici = new ObjectOutputStream(
                       new FileOutputStream(fileName));
                
                for (Cocuk badmins : cocuklar)
                    yazici.writeObject(badmins);
                yazici.close();
                System.out.println("Başarılı bir şekilde kaydedildi");
            } catch(IOException e){
                System.out.println("HATA VAR");
                e.printStackTrace();
            }
           

        }
*/
       
    }
    
    public static Admin find(String email, String sifre) {
    	Admin aAdmin = new Admin();
    	String targetName = email;
        String targetPassword = sifre;
        String fileName = "Veliler.dat";
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            for (int i = 0; i < 1; i++) {
                Admin bAdmin = (Admin) input.readObject();
                if (targetName.equals(bAdmin.getEmail()) && targetPassword.equals(bAdmin.getPassword())) {
                    aAdmin = bAdmin;
                    break;
                } else {
                    aAdmin = null;
                }
                System.out.println("adminler:" + aAdmin);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("IOE HATA VAR");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(" SINIF HATA VAR");
            e.printStackTrace();
        }
    	return aAdmin;
    }
    
    public static Cocuk findCocuk(String nicknName, String sifre) {
    	Cocuk aCocuk = new Cocuk();
    	String targetName = nicknName;
        String targetPassword = sifre;
        String fileName = "Veliler.dat";
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            for (int i = 0; i < 1; i++) {
                Admin bAdmin = (Admin) input.readObject();
                for (Cocuk bCocuk : bAdmin.cocuklar) {
                    if (targetName.equals(bCocuk.getNickname()) && targetPassword.equals(bCocuk.getPassword())) {
                    	aCocuk = bCocuk;
                    	break;
                    } else {
                        aCocuk = null;
                    }
                }
                input.close();
            }
        } catch (IOException e) {
            System.out.println("8585IOE HATA VAR");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(" SINIF HATA VAR");
            e.printStackTrace();
        }
    	return aCocuk;
    }
    
    public static Admin findEbeveyn(String nicknName, String sifre) {
    	Admin aAdmin = new Admin();
    	String targetName = nicknName;
        String targetPassword = sifre;
        String fileName = "Veliler.dat";
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            for (int i = 0; i < 1; i++) {
                Admin bAdmin = (Admin) input.readObject();
                for (Cocuk bCocuk : bAdmin.cocuklar) {
                    if (targetName.equals(bCocuk.getNickname()) && targetPassword.equals(bCocuk.getPassword())) {
                    	aAdmin = bCocuk.getAdmin();
                    	break;
                    } else {
                    	aAdmin = null;
                    }
                }
                input.close();
            }
        } catch (IOException e) {
            System.out.println("8585IOE HATA VAR");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(" SINIF HATA VAR");
            e.printStackTrace();
        }
    	return aAdmin;
    }
    
    public static ArrayList<Cocuk> cocuguMu(String mail, String sifre) {
    	ArrayList<Cocuk> children = new ArrayList<>();
    	ArrayList<Cocuk> children2 = new ArrayList<>();
    	String targetName = mail;
        String targetPassword = sifre;
        String fileName = "Veliler.dat";
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            for (int i = 0; i < 1; i++) {
                Admin bAdmin = (Admin) input.readObject();
                if (targetName.equals(bAdmin.getEmail()) && targetPassword.equals(bAdmin.getPassword())) {
                    children2 = bAdmin.cocuklar;
                } else {
                	children = null;
                }
                children = children2;

                input.close();
            }
        } catch (IOException e) {
            System.out.println("8585IOE HATA VAR");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(" SINIF HATA VAR");
            e.printStackTrace();
        }
    	return children;
    }
}
