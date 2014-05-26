/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Magaza_gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yashar
 */
public class Firmalar extends javax.swing.JFrame {

    /**
     * Creates new form nomreler
     */
    public Firmalar() {
        initComponents();
        setTitle("Firmalar Cədvəli");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTfirmacedveli = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlfirmaunvani = new javax.swing.JLabel();
        jTfirmatelefon = new javax.swing.JTextField();
        jtfirmaunvan = new javax.swing.JTextField();
        jtfirmaadi = new javax.swing.JTextField();
        jlfirmaadi = new javax.swing.JLabel();
        jlfirmatelefon = new javax.swing.JLabel();
        jlyaranmatarixi = new javax.swing.JLabel();
        jtfirmayaranmatarixi = new javax.swing.JTextField();
        jlfirmasayti = new javax.swing.JLabel();
        jtfirmasayti = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlfirmaaxtaris = new javax.swing.JLabel();
        jlaxtarismusterisoyad = new javax.swing.JLabel();
        jtfirmaaxtarisad = new javax.swing.JTextField();
        jtfirmaaxtarisyaranmaili = new javax.swing.JTextField();
        jlnomreIL = new javax.swing.JLabel();
        jtfirmaaxtarisunvan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlnomreIL1 = new javax.swing.JLabel();
        jtfirmaaxtarisfirmasayti = new javax.swing.JTextField();
        jlnomreIL2 = new javax.swing.JLabel();
        jtfirmaaxtaristelefon = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTfirmacedveli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTfirmacedveli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfirmacedveliMouseClicked(evt);
            }
        });
        jTfirmacedveli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfirmacedveliKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTfirmacedveli);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlfirmaunvani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfirmaunvani.setForeground(new java.awt.Color(51, 51, 51));
        jlfirmaunvani.setText("Firma ünvan");

        jlfirmaadi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfirmaadi.setText("Firma adı");

        jlfirmatelefon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfirmatelefon.setText("Firma Telefon");

        jlyaranmatarixi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlyaranmatarixi.setText("Yaranma Tarixi");

        jlfirmasayti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfirmasayti.setText("Firmanın Saytı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlfirmatelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(jlfirmaadi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlfirmaunvani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlyaranmatarixi)
                    .addComponent(jlfirmasayti))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfirmasayti, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(jtfirmayaranmatarixi)
                    .addComponent(jtfirmaunvan)
                    .addComponent(jTfirmatelefon)
                    .addComponent(jtfirmaadi))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlfirmaadi)
                    .addComponent(jtfirmaadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlfirmaunvani)
                    .addComponent(jtfirmaunvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlfirmatelefon)
                    .addComponent(jTfirmatelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlyaranmatarixi)
                    .addComponent(jtfirmayaranmatarixi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfirmasayti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlfirmasayti))
                .addGap(22, 22, 22))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 102));
        jButton1.setText("Geriyə qayıt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("Daxil etmək");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setText("Təmizlə");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlfirmaaxtaris.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfirmaaxtaris.setText("Firma adı");

        jlaxtarismusterisoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlaxtarismusterisoyad.setText("Firma ünvan");

        jtfirmaaxtarisad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfirmaaxtarisadKeyReleased(evt);
            }
        });

        jtfirmaaxtarisyaranmaili.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfirmaaxtarisyaranmailiKeyReleased(evt);
            }
        });

        jlnomreIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnomreIL.setText("Yaranma ili");

        jtfirmaaxtarisunvan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfirmaaxtarisunvanKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("M E S A J");

        jlnomreIL1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnomreIL1.setText("Firma saytı");

        jtfirmaaxtarisfirmasayti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfirmaaxtarisfirmasaytiKeyReleased(evt);
            }
        });

        jlnomreIL2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnomreIL2.setText("Firma telefon");

        jtfirmaaxtaristelefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfirmaaxtaristelefonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlnomreIL1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jtfirmaaxtarisfirmasayti))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlfirmaaxtaris, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlaxtarismusterisoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlnomreIL, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfirmaaxtarisad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfirmaaxtarisunvan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtfirmaaxtarisyaranmaili)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 149, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlnomreIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jtfirmaaxtaristelefon)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlaxtarismusterisoyad, jlfirmaaxtaris, jlnomreIL});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfirmaaxtarisad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlfirmaaxtaris))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfirmaaxtarisunvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaxtarismusterisoyad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfirmaaxtarisyaranmaili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlnomreIL))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnomreIL1)
                    .addComponent(jtfirmaaxtarisfirmasayti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnomreIL2)
                    .addComponent(jtfirmaaxtaristelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlaxtarismusterisoyad, jlfirmaaxtaris, jlnomreIL});

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Dəyiş");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("                 Axtarış ");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(31, 31, 31)
                                .addComponent(jButton5)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      elaqe=Vb_Elaqe.baglan();
      tableguncelle();
    }//GEN-LAST:event_formWindowOpened

    private void jTfirmacedveliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfirmacedveliKeyReleased
    tabledoldur();
    }//GEN-LAST:event_jTfirmacedveliKeyReleased

    private void jTfirmacedveliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfirmacedveliMouseClicked
    tabledoldur();
    }//GEN-LAST:event_jTfirmacedveliMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Menular m=new Menular();
       m.setVisible(true);               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       temizle();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtfirmaaxtarisunvanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfirmaaxtarisunvanKeyReleased
    axtaris(); 
    }//GEN-LAST:event_jtfirmaaxtarisunvanKeyReleased

    private void jtfirmaaxtarisadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfirmaaxtarisadKeyReleased
     axtaris();
    }//GEN-LAST:event_jtfirmaaxtarisadKeyReleased

    private void jtfirmaaxtarisyaranmailiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfirmaaxtarisyaranmailiKeyReleased
       axtaris();
    }//GEN-LAST:event_jtfirmaaxtarisyaranmailiKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        daxilet();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       deyis();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sil();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtfirmaaxtarisfirmasaytiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfirmaaxtarisfirmasaytiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfirmaaxtarisfirmasaytiKeyReleased

    private void jtfirmaaxtaristelefonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfirmaaxtaristelefonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfirmaaxtaristelefonKeyReleased
    Connection elaqe=null;
    ResultSet resultSet=null;
    PreparedStatement preparedStatement=null;
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Firmalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Firmalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Firmalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Firmalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Firmalar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTfirmacedveli;
    private javax.swing.JTextField jTfirmatelefon;
    private javax.swing.JLabel jlaxtarismusterisoyad;
    private javax.swing.JLabel jlfirmaadi;
    private javax.swing.JLabel jlfirmaaxtaris;
    private javax.swing.JLabel jlfirmasayti;
    private javax.swing.JLabel jlfirmatelefon;
    private javax.swing.JLabel jlfirmaunvani;
    private javax.swing.JLabel jlnomreIL;
    private javax.swing.JLabel jlnomreIL1;
    private javax.swing.JLabel jlnomreIL2;
    private javax.swing.JLabel jlyaranmatarixi;
    private javax.swing.JTextField jtfirmaadi;
    private javax.swing.JTextField jtfirmaaxtarisad;
    private javax.swing.JTextField jtfirmaaxtarisfirmasayti;
    private javax.swing.JTextField jtfirmaaxtaristelefon;
    private javax.swing.JTextField jtfirmaaxtarisunvan;
    private javax.swing.JTextField jtfirmaaxtarisyaranmaili;
    private javax.swing.JTextField jtfirmasayti;
    private javax.swing.JTextField jtfirmaunvan;
    private javax.swing.JTextField jtfirmayaranmatarixi;
    // End of variables declaration//GEN-END:variables

    private void tableguncelle() {
        String tablegunncellesogusu="Select * from firma";
        try {
            preparedStatement=elaqe.prepareStatement(tablegunncellesogusu);
            resultSet=preparedStatement.executeQuery();
            jTfirmacedveli.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException e) {
        }
    }

    private void tabledoldur() {
       int setirnomresi=jTfirmacedveli.getSelectedRow();
       jtfirmaadi.setText(jTfirmacedveli.getModel().getValueAt(setirnomresi,1).toString());
       jtfirmaunvan.setText(jTfirmacedveli.getModel().getValueAt(setirnomresi, 2).toString());
       jTfirmatelefon.setText(jTfirmacedveli.getModel().getValueAt(setirnomresi, 3).toString());
       jtfirmayaranmatarixi.setText(jTfirmacedveli.getModel().getValueAt(setirnomresi, 4).toString());
       jtfirmasayti.setText(jTfirmacedveli.getModel().getValueAt(setirnomresi, 5).toString());
       
    }

    private void deyis() {
          try {
                   String deyis="UPDATE firma SET "
                           + "firma_adi=?,"
                           + "firma_unvani=?,"
                            + "firma_telefonu=?,"
                           + "firma_yaranma_ili=?," 
                           + "firma_sayti=?"  
                          + "WHERE id=?";
       preparedStatement=elaqe.prepareStatement(deyis);
       preparedStatement.setString(1,jtfirmaadi.getText());
       preparedStatement.setString(2,jtfirmaunvan.getText());
       preparedStatement.setString(3,jTfirmatelefon.getText());
       preparedStatement.setString(4, jtfirmayaranmatarixi.getText());
       preparedStatement.setString(5, jtfirmasayti.getText());
       int setirnomresi=jTfirmacedveli.getSelectedRow();
       preparedStatement.setString(6,jTfirmacedveli.getModel().getValueAt(setirnomresi,0).toString());
       preparedStatement.executeUpdate();
       tableguncelle();
       temizle();
        JOptionPane.showMessageDialog(null,"Deyisiklik edilmisdir","MESAJ",JOptionPane.INFORMATION_MESSAGE); 
        } catch (HeadlessException | SQLException e) {
         JOptionPane.showMessageDialog(null,"XETA :  "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
        private void daxilet() {
        try {
             String insert="INSERT INTO firma(firma_adi,firma_unvani,firma_telefonu,firma_yaranma_ili,firma_sayti)"+
 "values ("
                     + "'"+jtfirmaadi.getText()+"'"
                     + ",'"+jtfirmaunvan.getText()+"'"
                     + ",'"+jTfirmatelefon.getText()+"'"
                     + ",'"+jtfirmayaranmatarixi.getText()+"'"
                     + ",'"+jtfirmasayti.getText()+"')";             
        preparedStatement=elaqe.prepareStatement(insert);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Melumat bazaya elave olundu !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE);
        tableguncelle();
        temizle();
        } catch (SQLException e) {
           
        }
          }
    
    
    
    
         private void sil() {
        int x=JOptionPane.showConfirmDialog(rootPane,"Ə m i n s i n i z m i ? ","MESAJ",JOptionPane.WARNING_MESSAGE);
        if(x==JOptionPane.YES_OPTION){
            try {
          String sil="DELETE FROM firma WHERE id=?" ;
          preparedStatement=elaqe.prepareStatement(sil);
          int setirnomresi=jTfirmacedveli.getSelectedRow();
          preparedStatement.setString(1, jTfirmacedveli.getModel().getValueAt(setirnomresi,0).toString());
          preparedStatement.execute();
          JOptionPane.showMessageDialog(null,"Melumat bazadan silindi !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE); 
          tableguncelle();
          temizle();
            } catch (HeadlessException | SQLException e) {
                  JOptionPane.showMessageDialog(null,"XETA :  "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
            }   
        }
        else{
           JOptionPane.showMessageDialog(null,"Melumat bazadan silinmedi !!!","MESAJ",JOptionPane.ERROR_MESSAGE);  
        }
    }
        
        
        
    
    private void temizle() {
        jtfirmaadi.setText(null);
        jTfirmatelefon.setText(null);
        jtfirmayaranmatarixi.setText(null);
        jtfirmaunvan.setText(null);
        jtfirmasayti.setText(null);
    }

    private void axtaris() {
          try {
            temizle();
     String sorgu="SELECT* FROM firma WHERE (firma_adi LIKE ? AND firma_unvani LIKE ? AND firma_yaranma_ili LIKE ? AND firma_telefonu LIKE ? AND firma_sayti LIKE ? )";
     preparedStatement=elaqe.prepareStatement(sorgu);
     preparedStatement.setString(1, jtfirmaaxtarisad.getText()+"%");
     preparedStatement.setString(2,jtfirmaaxtarisunvan.getText()+"%");
     preparedStatement.setString(3, jtfirmaaxtarisyaranmaili.getText()+"%");
     preparedStatement.setString(4, jtfirmaaxtaristelefon.getText()+"%");
     preparedStatement.setString(5, jtfirmaaxtarisfirmasayti.getText()+"%");
     resultSet=preparedStatement.executeQuery();
     jTfirmacedveli.setModel(DbUtils.resultSetToTableModel(resultSet));
     if(jTfirmacedveli.getRowCount()>0){
         jLabel3.setText("Bazadaki melumatlar tapildi"); 
         jLabel3.setForeground(Color.BLUE);
     }
     else{
             jLabel3.setText("Bazada bele melumat yoxdur");
             jLabel3.setForeground(Color.red);
        }
    
        } catch (SQLException e) {
          
        }
    }
}
