/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Magaza_gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Mehsullar extends javax.swing.JFrame {

   
    public Mehsullar() {
        initComponents();
       firma_ad_tap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Connection elaqe=null;
    Connection elaqe2=null;
    ResultSet resultSet=null;
    ResultSet resultSet2=null;
    Statement statement = null;
    
    PreparedStatement preparedStatement=null;
    PreparedStatement preparedStatement2=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtmehsulcedveli = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlrayonad = new javax.swing.JLabel();
        jlrayonseher = new javax.swing.JLabel();
        jTmehsuladi = new javax.swing.JTextField();
        jTmehsulreng = new javax.swing.JTextField();
        jTmehsulkodu = new javax.swing.JTextField();
        jlrayonkod = new javax.swing.JLabel();
        jlrayonseher1 = new javax.swing.JLabel();
        jTmehsulolcu = new javax.swing.JTextField();
        jlrayonseher2 = new javax.swing.JLabel();
        jTmehsulqiymet = new javax.swing.JTextField();
        jlrayonseher3 = new javax.swing.JLabel();
        jTmehsulcins = new javax.swing.JTextField();
        jlrayonseher4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jbsil = new javax.swing.JButton();
        jbelaveet = new javax.swing.JButton();
        jBdeyis = new javax.swing.JButton();
        jBtemizle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLaxrarisrayonadi = new javax.swing.JLabel();
        jTaxtariscins = new javax.swing.JTextField();
        jLmesaj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLaxrarisrayonadi1 = new javax.swing.JLabel();
        jTaxtarisfirma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtmehsulcedveli.setModel(new javax.swing.table.DefaultTableModel(
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
        jtmehsulcedveli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtmehsulcedveliMouseClicked(evt);
            }
        });
        jtmehsulcedveli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmehsulcedveliKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtmehsulcedveli);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlrayonad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonad.setText("Məhsul adı");

        jlrayonseher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonseher.setForeground(new java.awt.Color(51, 51, 51));
        jlrayonseher.setText("Rəng");

        jlrayonkod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonkod.setText("Məhsul kodu");

        jlrayonseher1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonseher1.setText("Ölçü");

        jlrayonseher2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonseher2.setText("Qiymət");

        jlrayonseher3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonseher3.setText("Cins");

        jlrayonseher4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlrayonseher4.setText("Firma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlrayonad)
                            .addComponent(jlrayonkod)
                            .addComponent(jlrayonseher))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTmehsulkodu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTmehsulreng)
                            .addComponent(jTmehsuladi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlrayonseher1)
                            .addComponent(jlrayonseher2)
                            .addComponent(jlrayonseher3)
                            .addComponent(jlrayonseher4))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTmehsulcins)
                            .addComponent(jTmehsulqiymet)
                            .addComponent(jTmehsulolcu)
                            .addComponent(jComboBox1, 0, 198, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlrayonad, jlrayonkod, jlrayonseher});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlrayonad)
                    .addComponent(jTmehsuladi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlrayonkod)
                    .addComponent(jTmehsulkodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlrayonseher)
                    .addComponent(jTmehsulreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlrayonseher1)
                    .addComponent(jTmehsulolcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlrayonseher2)
                    .addComponent(jTmehsulqiymet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlrayonseher3)
                    .addComponent(jTmehsulcins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlrayonseher4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlrayonad, jlrayonkod, jlrayonseher});

        jbsil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbsil.setText("Sil");
        jbsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsilActionPerformed(evt);
            }
        });

        jbelaveet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbelaveet.setForeground(new java.awt.Color(51, 51, 255));
        jbelaveet.setText("Əlavə elə");
        jbelaveet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbelaveetActionPerformed(evt);
            }
        });

        jBdeyis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBdeyis.setForeground(new java.awt.Color(0, 0, 255));
        jBdeyis.setText("Dəyiş");
        jBdeyis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeyisActionPerformed(evt);
            }
        });

        jBtemizle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtemizle.setForeground(new java.awt.Color(0, 0, 255));
        jBtemizle.setText("Təmizlə");
        jBtemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtemizleActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Geriyə get");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLaxrarisrayonadi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLaxrarisrayonadi.setText("Mehsul cins");

        jTaxtariscins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxtariscinsActionPerformed(evt);
            }
        });
        jTaxtariscins.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTaxtariscinsKeyReleased(evt);
            }
        });

        jLmesaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLmesaj.setText("M E S A J");

        jLaxrarisrayonadi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLaxrarisrayonadi1.setText("Firma");

        jTaxtarisfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxtarisfirmaActionPerformed(evt);
            }
        });
        jTaxtarisfirma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTaxtarisfirmaKeyReleased(evt);
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
                        .addComponent(jLaxrarisrayonadi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTaxtariscins, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLmesaj)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLaxrarisrayonadi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTaxtarisfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaxrarisrayonadi)
                    .addComponent(jTaxtariscins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaxrarisrayonadi1)
                    .addComponent(jTaxtarisfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLmesaj)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbsil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbelaveet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBdeyis)
                                .addGap(18, 18, 18)
                                .addComponent(jBtemizle)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBdeyis, jBtemizle, jbelaveet, jbsil});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsil, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbelaveet)
                    .addComponent(jBdeyis)
                    .addComponent(jBtemizle)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBdeyis, jBtemizle, jbelaveet, jbsil});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       elaqe=Vb_Elaqe.baglan();
       tableguncelle();
    }//GEN-LAST:event_formWindowOpened

    private void jtmehsulcedveliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtmehsulcedveliKeyReleased
        tabledoldur();
    }//GEN-LAST:event_jtmehsulcedveliKeyReleased

    private void jtmehsulcedveliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtmehsulcedveliMouseClicked
     tabledoldur();
    }//GEN-LAST:event_jtmehsulcedveliMouseClicked

    private void jBtemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtemizleActionPerformed
      temizle();
    }//GEN-LAST:event_jBtemizleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Menular m=new Menular();
     m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsilActionPerformed
       sil();
    }//GEN-LAST:event_jbsilActionPerformed

    private void jbelaveetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbelaveetActionPerformed
      daxilet(); 
    }//GEN-LAST:event_jbelaveetActionPerformed

    private void jBdeyisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeyisActionPerformed
    deyis();
    }//GEN-LAST:event_jBdeyisActionPerformed

    private void jTaxtariscinsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTaxtariscinsKeyReleased
       axtaris();
       
    }//GEN-LAST:event_jTaxtariscinsKeyReleased

    private void jTaxtariscinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxtariscinsActionPerformed
        // TODO add your handling code here:
        axtaris();
    }//GEN-LAST:event_jTaxtariscinsActionPerformed

    private void jTaxtarisfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxtarisfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxtarisfirmaActionPerformed

    private void jTaxtarisfirmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTaxtarisfirmaKeyReleased
        // TODO add your handling code here:
        axtaris_firma();
    }//GEN-LAST:event_jTaxtarisfirmaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mehsullar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mehsullar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mehsullar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mehsullar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mehsullar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdeyis;
    private javax.swing.JButton jBtemizle;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLaxrarisrayonadi;
    private javax.swing.JLabel jLaxrarisrayonadi1;
    private javax.swing.JLabel jLmesaj;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTaxtariscins;
    private javax.swing.JTextField jTaxtarisfirma;
    private javax.swing.JTextField jTmehsuladi;
    private javax.swing.JTextField jTmehsulcins;
    private javax.swing.JTextField jTmehsulkodu;
    private javax.swing.JTextField jTmehsulolcu;
    private javax.swing.JTextField jTmehsulqiymet;
    private javax.swing.JTextField jTmehsulreng;
    private javax.swing.JButton jbelaveet;
    private javax.swing.JButton jbsil;
    private javax.swing.JLabel jlrayonad;
    private javax.swing.JLabel jlrayonkod;
    private javax.swing.JLabel jlrayonseher;
    private javax.swing.JLabel jlrayonseher1;
    private javax.swing.JLabel jlrayonseher2;
    private javax.swing.JLabel jlrayonseher3;
    private javax.swing.JLabel jlrayonseher4;
    private javax.swing.JTable jtmehsulcedveli;
    // End of variables declaration//GEN-END:variables

    private void tableguncelle() {
       String tablegunncellesogusu="Select * From mehsul";
        try {
            preparedStatement=elaqe.prepareStatement(tablegunncellesogusu);
            resultSet=preparedStatement.executeQuery();
            jtmehsulcedveli.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException e) {
        }
    }

    private void tabledoldur() {
         int setirnomresi=jtmehsulcedveli.getSelectedRow();
       jTmehsuladi.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 1).toString());
       jTmehsulkodu.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 2).toString());
       jTmehsulreng.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 3).toString());
       jTmehsulolcu.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 4).toString());
       jTmehsulqiymet.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 5).toString());
       jTmehsulcins.setText(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 6).toString());
//       jComboBox1.getSelectedIndex(jtmehsulcedveli.getModel().getValueAt(setirnomresi, 4).toString());
     
    }

    private void temizle() {
       jTmehsuladi.setText(null);
       jTmehsulkodu.setText(null);
       jTmehsulreng.setText(null);
       jTmehsulolcu.setText(null);
       jTmehsulqiymet.setText(null);
       jTmehsulcins.setText(null);
       
       
    }

    private void sil() {
        int x=JOptionPane.showConfirmDialog(rootPane,"Ə m i n s i n i z m i ? ","MESAJ",JOptionPane.WARNING_MESSAGE);
        if(x==JOptionPane.YES_OPTION){
            try {
          String sil="DELETE FROM mehsul WHERE id=?" ;
          preparedStatement=elaqe.prepareStatement(sil);
          int setirnomresi=jtmehsulcedveli.getSelectedRow();
          preparedStatement.setString(1,jtmehsulcedveli.getModel().getValueAt(setirnomresi,0).toString());
          preparedStatement.execute();
          JOptionPane.showMessageDialog(null,"Melumat bazadan silindi !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE); 
          tableguncelle();
          temizle();
            } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,"XETA :  "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
            }   
        }
        else{
           JOptionPane.showMessageDialog(null,"Melumat bazadan silinmedi !!!","MESAJ",JOptionPane.ERROR_MESSAGE);  
        }
    }

    private void elaveet() {
            try {
             String insert="INSERT INTO mehsul(mehsul_adi,mehsul_kodu,reng,olcu,qiymet,cins,firma)"+
 "values ("
                     + "'"+jTmehsuladi.getText()+"'"
                     + ",'"+jTmehsulkodu.getText()+"'"
                     + ",'"+jTmehsulreng.getText()+"'"
                     + ",'"+jTmehsulolcu.getText()+"'"
                     + ",'"+jTmehsulqiymet.getText()+"'"
                     + ",'"+jTmehsulcins.getText()+"')";             
        preparedStatement=elaqe.prepareStatement(insert);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Melumat bazaya elave olundu !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE);
        tableguncelle();
        temizle();
        } catch (SQLException e) {
           
        }
    }
    
    
    
    
    private void daxilet() {
        try {
             String insert="INSERT INTO mehsul(mehsul_adi,mehsul_kodu,reng,olcu,qiymet,cins,firma)"+
 "values ("
                     + "'"+jTmehsuladi.getText().toString()+"'"
                     + ",'"+jTmehsulkodu.getText().toString()+"'"
                     + ",'"+jTmehsulreng.getText().toString()+"'"
                     + ",'"+jTmehsulolcu.getText().toString()+"'"
                     + ",'"+jTmehsulqiymet.getText().toString()+"'"
                     + ",'"+jTmehsulcins.getText().toString()+"'"
                     + ",'"+jComboBox1.getSelectedItem().toString()+"')";             
        preparedStatement=elaqe.prepareStatement(insert);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Melumat bazaya elave olundu !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE);
        tableguncelle();
        temizle();
        } catch (SQLException e) {
           
        }
          }

    private void deyis() {
        try {
                   String deyis="UPDATE mehsul SET "
                           + "mehsul_adi=?,"
                           + "mehsul_kodu=?,"
                           + "reng=?,"
                           + "olcu=?,"
                           + "qiymet=?,"
                           + "cins=?,"   
                           + "firma=?"  
                          + "WHERE id=?";
       preparedStatement=elaqe.prepareStatement(deyis);
       preparedStatement.setString(1,jTmehsuladi.getText());
       preparedStatement.setString(2,jTmehsulkodu.getText());
       preparedStatement.setString(3,jTmehsulreng.getText());
       preparedStatement.setString(4,jTmehsulolcu.getText());
       preparedStatement.setString(5,jTmehsulqiymet.getText());
       preparedStatement.setString(6,jTmehsulcins.getText());
       preparedStatement.setString(7,jComboBox1.getSelectedItem().toString());
       int setirnomresi=jtmehsulcedveli.getSelectedRow();
       preparedStatement.setString(8, jtmehsulcedveli.getModel().getValueAt(setirnomresi,0).toString());
       preparedStatement.executeUpdate();
       tableguncelle();
       temizle();
        JOptionPane.showMessageDialog(null,"Deyisiklik edilmisdir","MESAJ",JOptionPane.INFORMATION_MESSAGE); 
        } catch (HeadlessException | SQLException e) {
         JOptionPane.showMessageDialog(null,"XETA :  "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
   
    
    private void firma_ad_tap() {     
        
            String sor = "Select * from firma " ;
            try {
                Class.forName("com.mysql.jdbc.Driver");
            elaqe2 = DriverManager.getConnection("jdbc:mysql://localhost/magaza",
                    "root", "");
            preparedStatement2=elaqe2.prepareStatement(sor);
            resultSet2= preparedStatement2.executeQuery();

            while (resultSet2.next()) {
                String shopName = resultSet2.getString("firma_adi");
                jComboBox1.addItem(shopName);
                

            }
            } catch (Exception e) {
            e.printStackTrace();
        } }
    
    
      
    
    
    

    private void axtaris() {
        try {
            temizle();
     String sorgu="SELECT count(mehsul_adi) as Sayi,  cins FROM `mehsul` WHERE `cins` = ? ";
     preparedStatement=elaqe.prepareStatement(sorgu);
     preparedStatement.setString(1,jTaxtariscins.getText().toString());
     resultSet=preparedStatement.executeQuery();
     jtmehsulcedveli.setModel(DbUtils.resultSetToTableModel(resultSet));
     if(jtmehsulcedveli.getRowCount()>0){
         jLabel1.setText("Bazadaki melumatlar tapildi"); 
         jLabel1.setForeground(Color.BLUE);
     }
     else{
             jLabel1.setText("Bazada bele melumat yoxdur");
             jLabel1.setForeground(Color.red);
        }
    
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    
    
    
    
       private void axtaris_firma() {
        try {
            temizle();
     String sorgu="SELECT `qiymet` as Qiymet, `mehsul_adi` , `cins` FROM `mehsul` WHERE `firma` = ? ";
     preparedStatement=elaqe.prepareStatement(sorgu);
     preparedStatement.setString(1,jTaxtarisfirma.getText().toString());
     resultSet=preparedStatement.executeQuery();
     jtmehsulcedveli.setModel(DbUtils.resultSetToTableModel(resultSet));
     if(jtmehsulcedveli.getRowCount()>0){
         jLabel1.setText("Bazadaki melumatlar tapildi"); 
         jLabel1.setForeground(Color.BLUE);
     }
     else{
             jLabel1.setText("Bazada bele melumat yoxdur");
             jLabel1.setForeground(Color.red);
        }
    
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
}
