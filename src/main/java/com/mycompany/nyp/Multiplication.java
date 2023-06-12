package com.mycompany.nyp;

import com.opencsv.CSVWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Multiplication extends javax.swing.JFrame {

    private Cocuk cocuk;
    private Test aTest;
    private int count = 0;
    private int firstNumber;
    private int secondNumber;
    LocalTime time1;
    LocalTime time2;
    LocalTime time3;
    LocalTime time4;
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static int dogru_sayisi = 0;
    private Soru soru;
    private Menu2 menu;

    static boolean state = true;

    public Multiplication() {
        initComponents();
    }

    public Multiplication(Test test, Cocuk aCocuk) {
        initComponents();
        aTest = test;
        this.cocuk = aCocuk;
        menu = new Menu2(aCocuk);
        Random rand = new Random();
        time1 = LocalTime.now(); // Teste başlama zamanı alındı
        time3 = LocalTime.now(); // Soruya başlama zamanı alındı
        aTest.setBaslama_zamani(time1); // Teste başlama zamanı set edildi
        firstNumber = rand.nextInt((aTest.getMin() - aTest.getMax()) + 1) + aTest.getMax(); // ilk soru için random sayı üretildi
        secondNumber = rand.nextInt((aTest.getMin() - aTest.getMax()) + 1) + aTest.getMax(); // ikinci '' '' '' ..
        soru = new Soru(); // Soru classından yeni soru oluşturuldu ve fieldları set edildi
        soru.setSayi1(firstNumber);
        soru.setSayi2(secondNumber);
        jButton3.setVisible(false); // Testi bitir butonu inaktif son soruya gelince aktif ohale gelecek
        // UI'a yazılma işlemleri:
        jLabel2.setText(count + 1 + ".Soru");
        jTextField1.setText(Integer.toString(secondNumber));
        jTextField2.setText(Integer.toString(firstNumber));
        jTextField5.setText("");
        jTextField4.setText("");

        state = true;

        Thread t = new Thread() {
            public void run() {
                // Timer başlıyor
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);
                            if (milliseconds >= 550) {
                                milliseconds = 0;
                                seconds++;
                            }
                            if (seconds >= 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes >= 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes = 0;
                                hours++;
                            }

                            milliseconds++;
                            saniye.setText(" : " + seconds);
                            dakika.setText(" : " + minutes);
                            saat.setText(" : " + hours);
                        } catch (Exception e) {

                        }

                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saniye = new javax.swing.JLabel();
        dakika = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText(" Sorular");

        jLabel2.setBackground(new java.awt.Color(0, 153, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("SORU");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("x");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("=");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Sonraki Soru");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        saat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saat.setText("00:");

        saniye.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saniye.setText("00");

        dakika.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dakika.setText("00:");

        jButton3.setText("Testi Bitir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dakika, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saniye, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saniye, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dakika, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Veli tarafından belirlenmiş soru sayısının sonuna gelindiğinde
        if (count >= aTest.getSoru_sayisi() - 1) {
            time2 = LocalTime.now(); // Testin bitme zamanı alındı
            time4 = LocalTime.now(); // Son sorunun bitme zamanı
            aTest.setBitis_zamani(time2); 
            Duration difference = Duration.between(time1, time2); // süre farkı hesaplandı
            aTest.setSure(difference); // süre farkı set edildi
            int max = aTest.getSoru_sayisi() * 2; // Süre skoru için değişken oluşturuldu
            int seconds = difference.toSecondsPart();
            aTest.setSure_skor(max * 100 / seconds);
            // Doğru ve yankış sayıları set edildi
            aTest.setDogru_sayisi(dogru_sayisi); 
            aTest.setYanlis_sayisi(aTest.getSoru_sayisi() - dogru_sayisi);
            // 100 üzerinden skor hesaplandı
            int dogru = aTest.getDogru_sayisi();
            int soru_count = aTest.getSoru_sayisi();
            float skor = ((float)dogru / soru_count);
            int skor2 = (int) (skor * 100);
            aTest.setSkor(skor2); //skor set edildi

            // bitirme süresi:
            soru.setSure(Duration.between(time3, time4));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            // LocalTime değişkenini Stringe çeviriyoruz
            String basla = aTest.getBaslama_zamani().format(formatter);
            String bitis = aTest.getBitis_zamani().format(formatter);

            //Duration değişkenini String çeviriyoruz
            String durationString = aTest.getSure().toString();

            //System.out.println(aTest);
            //System.out.print("Test bitti");
            jButton3.setVisible(true); // Son soru olduğu için testi bitir butonu aktif hale getirildi
            state = false;
            JLabel warningLabel = new JLabel("TESTİNİZ BİTTİ"); 
            warningLabel.setVisible(true);
            //Öğrenciye test sonuçlarını gösterme:
            JOptionPane.showMessageDialog(null, "Test skorun: " + aTest.getSkor()
            + "\nSoru sayısı: " + aTest.getSoru_sayisi() + "\nDogru sayısı: " + aTest.getDogru_sayisi()+
              "\nBitirme suresi: " + durationString.substring(2));
            
            //Dosyaya kaydetme
            try {
                String fileName = "Veliler.dat";
                ObjectOutputStream yazici = new ObjectOutputStream(
                        new FileOutputStream(fileName));
                yazici.writeObject(cocuk.getAdmin());
                yazici.close();
                System.out.println("Başarılı bir şekilde kaydedildi");
            } catch (IOException e) {
                System.out.println("HATA VAR");
                e.printStackTrace();
            }
            //Rapora kaydetme
            String filePath = "Rapor.csv";
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(filePath, true), ';', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
                String[] data = {cocuk.getName(), aTest.getName(), Integer.toString(aTest.getSoru_sayisi()),
                    Integer.toString(aTest.getDogru_sayisi()),
                    Integer.toString(aTest.getYanlis_sayisi()), basla, bitis, durationString.substring(2), ""
                };
                csvWriter.writeNext(data); // Test sonucunu rapor dosyasına ekliyoruz

                String[] rowData = new String[11];
                // Tüm soruları teker teker rapor dosyasına ekliyoruz
                for (Soru sorular : aTest.sorular) {
                    String sorulan_sayilar = sorular.getSayi1() + " X " + sorular.getSayi2();
                    String dogru_yanlis = sorular.isResult() ? "Dogru" : "Yanlis";
                    String soru_suresi = sorular.getSure().toString();

                    rowData[8] = sorulan_sayilar;
                    rowData[9] = dogru_yanlis;
                    rowData[10] = soru_suresi.substring(2);
                    // Excel dosyasına raporları ekliyoruz
                    csvWriter.writeNext(rowData);
                }

                System.out.println("Data written successfully!");
            } catch (IOException e) {
                System.out.println("Data couldn't written successfully!");
                e.printStackTrace();
            }

        } else {
            jLabel2.setText(count + 2 + ".Soru"); //UI soru sayısı
            // Yeni random sayılar oluşturuluyor
            Random rand = new Random();
            firstNumber = rand.nextInt(aTest.getMax());
            secondNumber = rand.nextInt(aTest.getMin());
            soru = new Soru();
            soru.setSayi1(firstNumber);
            soru.setSayi2(secondNumber);
            
            time3 = LocalTime.now(); //Soruya başlama zamanı
            //Oluşturulan sayılar set ediliyor
            jTextField1.setText(Integer.toString(secondNumber));
            jTextField2.setText(Integer.toString(firstNumber));
            jTextField5.setText("");
            jTextField4.setText("");
        }
        count++;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Cevapları hesaplar
        String firstNumber;
        String secondNumber;
        int answer;
        String answ1;
        //Sorulan soruları ui'dan alıp integera çeviriyoruz
        firstNumber = jTextField1.getText();
        secondNumber = jTextField2.getText();
        int fNumber = Integer.parseInt(firstNumber);
        int sNumber = Integer.parseInt(secondNumber);
        
        
        time4 = LocalTime.now(); //Sorunun çözümü bittiğindeki zaman
        soru.setSure(Duration.between(time3, time4)); //Soru çözme süresi
        
 
        answer = fNumber * sNumber;//Cevap hesaplanıyor
        answ1 = jTextField4.getText(); //Öğrencinin girdiği sayı alınıyor

        int answ2 = Integer.parseInt(answ1);
        // Girilen değerin doğru cevap olup olmadığı kontrol edilir
        if (answer == answ2) {
            jTextField5.setText("DOĞRU");
            dogru_sayisi++;
            soru.setResult(true);
        } else {
            jTextField5.setText("YANLIŞ");
            soru.setResult(false);
        }
        if (aTest.sorular == null) {
            //Sorular arrayListine yeni soru ekleniyor
            aTest.sorular = new ArrayList<Soru>();
        }
        aTest.sorular.add(soru);
        System.out.println(soru);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.dispose(); //Mevcut sekme kapanır
        menu = new Menu2(cocuk);
        menu.setVisible(true); //Menu açılır
    }//GEN-LAST:event_jButton3MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Multiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multiplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dakika;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel saat;
    private javax.swing.JLabel saniye;
    // End of variables declaration//GEN-END:variables
}
