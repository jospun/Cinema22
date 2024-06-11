/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.tiketControl;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import table.tiketTable;


public class Riwayat extends javax.swing.JFrame {
    private int xMouse, yMouse;
    
    private tiketControl tC;
    tiketTable tb1;
    public Riwayat() throws SQLException {
        initComponents();
        tC = new tiketControl();
        jTable1.setModel(tC.showTiket());
        showTiket();
    }
    
    public void showTiket() throws SQLException{
        jTable1.setModel(tC.showTiketbySearch(""));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        ButtonPembelianTiket = new javax.swing.JPanel();
        TiketLabel = new javax.swing.JLabel();
        UserSimbol = new javax.swing.JLabel();
        ButtonBeranda = new javax.swing.JPanel();
        BerandaLabel = new javax.swing.JLabel();
        BerandaSimbol = new javax.swing.JLabel();
        Logo22 = new javax.swing.JLabel();
        Cinema22 = new javax.swing.JLabel();
        LineTitle = new javax.swing.JSeparator();
        ButtonLogOut = new javax.swing.JPanel();
        LogoutLabel = new javax.swing.JLabel();
        LogOutSimbol = new javax.swing.JLabel();
        ButtonRiwayat = new javax.swing.JPanel();
        BerandaLabel2 = new javax.swing.JLabel();
        BerandaSimbol2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        HelloAdmin = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(54, 33, 89));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPembelianTiket.setBackground(new java.awt.Color(64, 43, 100));
        ButtonPembelianTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPembelianTiketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonPembelianTiketMouseEntered(evt);
            }
        });

        TiketLabel.setBackground(new java.awt.Color(204, 204, 204));
        TiketLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TiketLabel.setForeground(new java.awt.Color(204, 204, 204));
        TiketLabel.setText("Pembelian Tiket");
        TiketLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiketLabelMouseClicked(evt);
            }
        });

        UserSimbol.setBackground(new java.awt.Color(204, 204, 204));
        UserSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserSimbol.setForeground(new java.awt.Color(204, 204, 204));
        UserSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Tiket.png"))); // NOI18N

        javax.swing.GroupLayout ButtonPembelianTiketLayout = new javax.swing.GroupLayout(ButtonPembelianTiket);
        ButtonPembelianTiket.setLayout(ButtonPembelianTiketLayout);
        ButtonPembelianTiketLayout.setHorizontalGroup(
            ButtonPembelianTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPembelianTiketLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(UserSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TiketLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        ButtonPembelianTiketLayout.setVerticalGroup(
            ButtonPembelianTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPembelianTiketLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(ButtonPembelianTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TiketLabel)
                    .addComponent(UserSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonPembelianTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 50));

        ButtonBeranda.setBackground(new java.awt.Color(64, 43, 100));
        ButtonBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBerandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonBerandaMouseEntered(evt);
            }
        });

        BerandaLabel.setBackground(new java.awt.Color(204, 204, 204));
        BerandaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BerandaLabel.setForeground(new java.awt.Color(204, 204, 204));
        BerandaLabel.setText("Beranda");

        BerandaSimbol.setBackground(new java.awt.Color(204, 204, 204));
        BerandaSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BerandaSimbol.setForeground(new java.awt.Color(204, 204, 204));
        BerandaSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icons Beranda.png"))); // NOI18N

        javax.swing.GroupLayout ButtonBerandaLayout = new javax.swing.GroupLayout(ButtonBeranda);
        ButtonBeranda.setLayout(ButtonBerandaLayout);
        ButtonBerandaLayout.setHorizontalGroup(
            ButtonBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonBerandaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BerandaSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BerandaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ButtonBerandaLayout.setVerticalGroup(
            ButtonBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonBerandaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(ButtonBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BerandaLabel)
                    .addComponent(BerandaSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        Logo22.setBackground(new java.awt.Color(204, 204, 204));
        Logo22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logo22.setForeground(new java.awt.Color(204, 204, 204));
        Logo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo 22.png"))); // NOI18N
        SidePanel.add(Logo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 60));

        Cinema22.setBackground(new java.awt.Color(204, 204, 204));
        Cinema22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Cinema22.setForeground(new java.awt.Color(204, 204, 204));
        Cinema22.setText("CINEMA 22");
        SidePanel.add(Cinema22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, -1));
        SidePanel.add(LineTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 10));

        ButtonLogOut.setBackground(new java.awt.Color(54, 33, 89));
        ButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseClicked(evt);
            }
        });

        LogoutLabel.setBackground(new java.awt.Color(204, 204, 204));
        LogoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutLabel.setForeground(new java.awt.Color(204, 204, 204));
        LogoutLabel.setText("Log Out");

        LogOutSimbol.setBackground(new java.awt.Color(204, 204, 204));
        LogOutSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutSimbol.setForeground(new java.awt.Color(204, 204, 204));
        LogOutSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Log Out.png"))); // NOI18N

        javax.swing.GroupLayout ButtonLogOutLayout = new javax.swing.GroupLayout(ButtonLogOut);
        ButtonLogOut.setLayout(ButtonLogOutLayout);
        ButtonLogOutLayout.setHorizontalGroup(
            ButtonLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonLogOutLayout.setVerticalGroup(
            ButtonLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonLogOutLayout.createSequentialGroup()
                .addGroup(ButtonLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutLabel)
                    .addComponent(LogOutSimbol))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        SidePanel.add(ButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 100, 30));

        ButtonRiwayat.setBackground(new java.awt.Color(85, 65, 118));
        ButtonRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRiwayatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonRiwayatMouseEntered(evt);
            }
        });

        BerandaLabel2.setBackground(new java.awt.Color(204, 204, 204));
        BerandaLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BerandaLabel2.setForeground(new java.awt.Color(204, 204, 204));
        BerandaLabel2.setText("Riwayat Pembelian");

        BerandaSimbol2.setBackground(new java.awt.Color(204, 204, 204));
        BerandaSimbol2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BerandaSimbol2.setForeground(new java.awt.Color(204, 204, 204));
        BerandaSimbol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RiwayatPembelianIcon.png"))); // NOI18N

        javax.swing.GroupLayout ButtonRiwayatLayout = new javax.swing.GroupLayout(ButtonRiwayat);
        ButtonRiwayat.setLayout(ButtonRiwayatLayout);
        ButtonRiwayatLayout.setHorizontalGroup(
            ButtonRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonRiwayatLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BerandaSimbol2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BerandaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        ButtonRiwayatLayout.setVerticalGroup(
            ButtonRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonRiwayatLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(ButtonRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BerandaLabel2)
                    .addComponent(BerandaSimbol2))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        Background.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 590));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel3.setkGradientFocus(800);
        kGradientPanel3.setkStartColor(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 840, 90));

        HelloAdmin.setBackground(new java.awt.Color(204, 204, 204));
        HelloAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HelloAdmin.setForeground(new java.awt.Color(153, 153, 153));
        HelloAdmin.setText("HELLO STAFF");
        Background.add(HelloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 200, 30));

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Exit Button.png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });
        Background.add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        kGradientPanel4.setkEndColor(new java.awt.Color(54, 33, 80));
        kGradientPanel4.setkGradientFocus(1);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Studio");

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(54, 33, 89)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(64, 43, 100));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(5);
        jTable1.setSelectionBackground(new java.awt.Color(122, 72, 221));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        searchInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        searchBtn.setBackground(new java.awt.Color(0, 51, 255));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        Background.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            tiketTable tb = tC.showTiketbySearch(searchInput.getText());
            if(tb.getRowCount() == 0){
                JOptionPane.showConfirmDialog(null, "Data Tidak Ditemukan!", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                jTable1.setModel(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void TiketLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiketLabelMouseClicked

    }//GEN-LAST:event_TiketLabelMouseClicked

    private void ButtonPembelianTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPembelianTiketMouseClicked
        TransaksiTiket vt = new TransaksiTiket();
        this.dispose();
        vt.setVisible(true);           
    }//GEN-LAST:event_ButtonPembelianTiketMouseClicked

    private void ButtonPembelianTiketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPembelianTiketMouseEntered
        resetColor(ButtonBeranda);
        setColor(ButtonPembelianTiket);
        setColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonPembelianTiketMouseEntered

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked
        BerandaStaff BS;
        try {
            BS = new BerandaStaff();
            this.dispose();
            BS.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        resetColor(ButtonPembelianTiket);
        setColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonBerandaMouseEntered

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        Login11 lg = new Login11();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void ButtonRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRiwayatMouseClicked

    private void ButtonRiwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseEntered
        resetColor(ButtonBeranda);
        resetColor(ButtonPembelianTiket);
        setColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonRiwayatMouseEntered

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

      void setColor(JPanel panel){
        panel.setBackground(new Color(85, 65, 118));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(64, 43, 100));
    }
    
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
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Riwayat().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BerandaLabel;
    private javax.swing.JLabel BerandaLabel2;
    private javax.swing.JLabel BerandaSimbol;
    private javax.swing.JLabel BerandaSimbol2;
    private javax.swing.JPanel ButtonBeranda;
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JPanel ButtonLogOut;
    private javax.swing.JPanel ButtonPembelianTiket;
    private javax.swing.JPanel ButtonRiwayat;
    private javax.swing.JLabel Cinema22;
    private javax.swing.JLabel HelloAdmin;
    private javax.swing.JSeparator LineTitle;
    private javax.swing.JLabel LogOutSimbol;
    private javax.swing.JLabel Logo22;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel TiketLabel;
    private javax.swing.JLabel UserSimbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    // End of variables declaration//GEN-END:variables
}
