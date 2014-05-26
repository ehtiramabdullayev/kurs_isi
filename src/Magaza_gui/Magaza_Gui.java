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
public class Magaza_Gui extends javax.swing.JFrame {
    public Magaza_Gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbmusteriSIL = new javax.swing.JButton();
        jbmusterideyis = new javax.swing.JButton();
        jbmusteridaxilet = new javax.swing.JButton();
        jbmusteriformtemizle = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jmagazasayt = new javax.swing.JTextField();
        jmagazaunvani = new javax.swing.JTextField();
        jlmagazaadi = new javax.swing.JLabel();
        jlmusterisoyad = new javax.swing.JLabel();
        jlmagazatelefon = new javax.swing.JLabel();
        jmagazatel = new javax.swing.JTextField();
        jmagazaadi = new javax.swing.JTextField();
        jlmagazasayt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbmusteriSIL.setBackground(new java.awt.Color(255, 255, 0));
        jbmusteriSIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbmusteriSIL.setForeground(new java.awt.Color(255, 0, 0));
        jbmusteriSIL.setText("Silmək");
        jbmusteriSIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmusteriSILActionPerformed(evt);
            }
        });

        jbmusterideyis.setBackground(new java.awt.Color(255, 255, 0));
        jbmusterideyis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbmusterideyis.setForeground(new java.awt.Color(0, 0, 255));
        jbmusterideyis.setText("Dəyişmək");
        jbmusterideyis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmusterideyisActionPerformed(evt);
            }
        });

        jbmusteridaxilet.setBackground(new java.awt.Color(255, 255, 0));
        jbmusteridaxilet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbmusteridaxilet.setForeground(new java.awt.Color(51, 51, 255));
        jbmusteridaxilet.setText("Daxil Etmək");
        jbmusteridaxilet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmusteridaxiletActionPerformed(evt);
            }
        });

        jbmusteriformtemizle.setBackground(new java.awt.Color(255, 255, 51));
        jbmusteriformtemizle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbmusteriformtemizle.setForeground(new java.awt.Color(255, 0, 0));
        jbmusteriformtemizle.setText("Təmizləmək");
        jbmusteriformtemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmusteriformtemizleActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Magaza adi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Magaza unvan");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Mesaj");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlmagazaadi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlmagazaadi.setForeground(new java.awt.Color(51, 51, 255));
        jlmagazaadi.setText("Magaza adi");

        jlmusterisoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlmusterisoyad.setForeground(new java.awt.Color(51, 51, 255));
        jlmusterisoyad.setText("Magaza unvan");

        jlmagazatelefon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlmagazatelefon.setForeground(new java.awt.Color(51, 51, 255));
        jlmagazatelefon.setText("Magaza telefon");

        jlmagazasayt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlmagazasayt.setForeground(new java.awt.Color(51, 51, 255));
        jlmagazasayt.setText("Magaza sayt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlmagazaadi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlmusterisoyad)
                    .addComponent(jlmagazatelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlmagazasayt))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmagazaadi, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jmagazaunvani)
                    .addComponent(jmagazatel)
                    .addComponent(jmagazasayt))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlmagazaadi, jlmagazasayt, jlmagazatelefon, jlmusterisoyad});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmagazaadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlmagazaadi))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlmusterisoyad)
                    .addComponent(jmagazaunvani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlmagazatelefon)
                    .addComponent(jmagazatel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlmagazasayt)
                    .addComponent(jmagazasayt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlmagazaadi, jlmagazasayt, jlmagazatelefon, jlmusterisoyad});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jmagazaadi, jmagazasayt, jmagazatel, jmagazaunvani});

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Geriyə qayıtmaq");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("          Axtarış");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbmusteriSIL, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbmusterideyis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbmusteridaxilet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbmusteriformtemizle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbmusteriSIL, jbmusteridaxilet, jbmusterideyis, jbmusteriformtemizle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbmusteriSIL, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmusterideyis)
                    .addComponent(jbmusteridaxilet)
                    .addComponent(jbmusteriformtemizle)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jbmusteriSIL, jbmusteridaxilet, jbmusterideyis, jbmusteriformtemizle});

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection elaqe=null;
ResultSet resultSet=null;
PreparedStatement preparedStatement=null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      elaqe=Vb_Elaqe.baglan();
      tableguncelle();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   tabledoldur();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
         tabledoldur();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       axtaris();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        axtaris();
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jbmusteridaxiletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmusteridaxiletActionPerformed
        daxilet();
    }//GEN-LAST:event_jbmusteridaxiletActionPerformed

    private void jbmusteriformtemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmusteriformtemizleActionPerformed
      temizle();
    }//GEN-LAST:event_jbmusteriformtemizleActionPerformed

    private void jbmusterideyisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmusterideyisActionPerformed
      deyis();
    }//GEN-LAST:event_jbmusterideyisActionPerformed

    private void jbmusteriSILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmusteriSILActionPerformed
      sil();
    }//GEN-LAST:event_jbmusteriSILActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menular m=new Menular();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Magaza_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magaza_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magaza_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magaza_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Magaza_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbmusteriSIL;
    private javax.swing.JButton jbmusteridaxilet;
    private javax.swing.JButton jbmusterideyis;
    private javax.swing.JButton jbmusteriformtemizle;
    private javax.swing.JLabel jlmagazaadi;
    private javax.swing.JLabel jlmagazasayt;
    private javax.swing.JLabel jlmagazatelefon;
    private javax.swing.JLabel jlmusterisoyad;
    private javax.swing.JTextField jmagazaadi;
    private javax.swing.JTextField jmagazasayt;
    private javax.swing.JTextField jmagazatel;
    private javax.swing.JTextField jmagazaunvani;
    // End of variables declaration//GEN-END:variables

    private void tableguncelle() {
        String tablegunncellesogusu="Select * From magaza";
        try {
            preparedStatement=elaqe.prepareStatement(tablegunncellesogusu);
            resultSet=preparedStatement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
        }
    }

    private void tabledoldur() {
          int setirnomresi=jTable1.getSelectedRow();
       jmagazaadi.setText(jTable1.getModel().getValueAt(setirnomresi,1).toString());
       jmagazaunvani.setText(jTable1.getModel().getValueAt(setirnomresi,2).toString()); 
       jmagazatel.setText(jTable1.getModel().getValueAt(setirnomresi,3).toString());  
       jmagazasayt.setText(jTable1.getModel().getValueAt(setirnomresi,4).toString()); 
      
    }

    private void axtaris()  {
        try {
            temizle();
     String sorgu="SELECT* FROM magaza WHERE magaza_adi LIKE ? AND magaza_unvani LIKE ? ";
     preparedStatement=elaqe.prepareStatement(sorgu);
     preparedStatement.setString(1,jTextField1.getText()+"%");
     preparedStatement.setString(2,jTextField2.getText()+"%");
     resultSet=preparedStatement.executeQuery();
     jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
     if(jTable1.getRowCount()>0){
         jLabel5.setText("Bazadaki melumatlar tapildi"); 
         jLabel5.setForeground(Color.BLUE);
     }
     else{
             jLabel5.setText("Bazada bele melumat yoxdur");
             jLabel5.setForeground(Color.red);
        }
    
        } catch (SQLException e) {
          
        }
   }

    private void daxilet() {
        try {
             String insert="INSERT INTO magaza(magaza_adi,magaza_unvani,magaza_tel,magaza_sayt)"+
 "values ("
                     + "'"+jmagazaadi.getText()+"'"
                     + ",'"+jmagazaunvani.getText()+"'"
                     + ",'"+jmagazatel.getText()+"'"
                     + ",'"+jmagazasayt.getText()+"')";             
        preparedStatement=elaqe.prepareStatement(insert);
        preparedStatement.execute();
        JOptionPane.showMessageDialog(null,"Melumat bazaya elave olundu !!!","MESAJ",JOptionPane.INFORMATION_MESSAGE);
        tableguncelle();
        temizle();
        } catch (SQLException e) {
           
        }
          }

    private void temizle() {
                jmagazaadi.setText(null);
                jmagazaunvani.setText(null);
                jmagazatel.setText(null);
                jmagazasayt.setText(null);
    }

    private void deyis() {
        try {
                   String deyis="UPDATE magaza.magaza SET "
                           + "magaza_adi=?,"
                           + "magaza_unvani=?,"
                           + "magaza_tel=?,"
                           + "magaza_sayt=?"
                           + "WHERE id=?";
       preparedStatement=elaqe.prepareStatement(deyis);
       preparedStatement.setString(1,jmagazaadi.getText());
       preparedStatement.setString(2, jmagazaunvani.getText());
       preparedStatement.setString(3, jmagazatel.getText());
       preparedStatement.setString(4, jmagazasayt.getText());
       int setirnomresi=jTable1.getSelectedRow();
       preparedStatement.setString(5, jTable1.getModel().getValueAt(setirnomresi,0).toString());
       preparedStatement.executeUpdate();
       tableguncelle();
       temizle();
        JOptionPane.showMessageDialog(null,"Deyisiklik edilmisdir","MESAJ",JOptionPane.INFORMATION_MESSAGE); 
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"XETA :  "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
        }

    }

    private void sil() {
        int x=JOptionPane.showConfirmDialog(rootPane,"Ə m i n s i n i z m i ? ","MESAJ",JOptionPane.WARNING_MESSAGE);
        if(x==JOptionPane.YES_OPTION){
            try {
          String sil="DELETE FROM magaza WHERE id=?" ;
          preparedStatement=elaqe.prepareStatement(sil);
          int setirnomresi=jTable1.getSelectedRow();
          preparedStatement.setString(1, jTable1.getModel().getValueAt(setirnomresi,0).toString());
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
 }
