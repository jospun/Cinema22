/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class BerandaStaff extends javax.swing.JFrame {
   
    private int xMouse, yMouse;
    
    public BerandaStaff() throws IOException {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        slideshow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(), new Slide4(), new Slide5());
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
        box1 = new viewSwing.Box();
        Cinema25 = new javax.swing.JLabel();
        Cinema27 = new javax.swing.JLabel();
        Cinema26 = new javax.swing.JLabel();
        Cinema23 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        box3 = new viewSwing.Box();
        Cinema28 = new javax.swing.JLabel();
        Cinema29 = new javax.swing.JLabel();
        Cinema30 = new javax.swing.JLabel();
        Cinema24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        slideshow1 = new viewSlideShow.Slideshow();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BackgroundFocusLost(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(54, 33, 89));
        SidePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                SidePanelMouseDragged(evt);
            }
        });
        SidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SidePanelMousePressed(evt);
            }
        });
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

        ButtonBeranda.setBackground(new java.awt.Color(85, 65, 118));
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

        ButtonRiwayat.setBackground(new java.awt.Color(64, 43, 100));
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

        box1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/BerandaAS.png"))); // NOI18N

        Cinema25.setBackground(new java.awt.Color(204, 204, 204));
        Cinema25.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        Cinema25.setForeground(new java.awt.Color(255, 255, 255));
        Cinema25.setText("Admin");
        box1.add(Cinema25);
        Cinema25.setBounds(110, 200, 160, 60);

        Cinema27.setBackground(new java.awt.Color(204, 204, 204));
        Cinema27.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        Cinema27.setForeground(new java.awt.Color(255, 255, 255));
        Cinema27.setText("Welcome");
        Cinema27.setToolTipText("");
        box1.add(Cinema27);
        Cinema27.setBounds(20, 140, 200, 60);

        Cinema26.setBackground(new java.awt.Color(255, 255, 255));
        Cinema26.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Cinema26.setForeground(new java.awt.Color(255, 255, 255));
        Cinema26.setText("Add latest movies now!");
        box1.add(Cinema26);
        Cinema26.setBounds(40, 280, 190, 20);

        Cinema23.setBackground(new java.awt.Color(255, 255, 255));
        Cinema23.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Cinema23.setForeground(new java.awt.Color(255, 255, 255));
        Cinema23.setText("Check, this week's favorite movies");
        box1.add(Cinema23);
        Cinema23.setBounds(0, 310, 270, 20);

        Background.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        kGradientPanel4.setkEndColor(new java.awt.Color(54, 33, 80));
        kGradientPanel4.setkGradientFocus(1);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        box3.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/BerandaAS.png"))); // NOI18N

        Cinema28.setBackground(new java.awt.Color(204, 204, 204));
        Cinema28.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        Cinema28.setForeground(new java.awt.Color(255, 255, 255));
        Cinema28.setText("Staff");
        box3.add(Cinema28);
        Cinema28.setBounds(70, 200, 150, 60);

        Cinema29.setBackground(new java.awt.Color(204, 204, 204));
        Cinema29.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        Cinema29.setForeground(new java.awt.Color(255, 255, 255));
        Cinema29.setText("Welcome");
        Cinema29.setToolTipText("");
        box3.add(Cinema29);
        Cinema29.setBounds(20, 140, 200, 60);

        Cinema30.setBackground(new java.awt.Color(255, 255, 255));
        Cinema30.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Cinema30.setForeground(new java.awt.Color(255, 255, 255));
        Cinema30.setText("Many interesting films for sale");
        box3.add(Cinema30);
        Cinema30.setBounds(10, 280, 250, 20);

        Cinema24.setBackground(new java.awt.Color(255, 255, 255));
        Cinema24.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        Cinema24.setForeground(new java.awt.Color(255, 255, 255));
        Cinema24.setText("Check, this week's favorite movies");
        box3.add(Cinema24);
        Cinema24.setBounds(0, 310, 270, 20);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        slideshow1.setBackground(new java.awt.Color(85, 65, 118));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        Background.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPembelianTiketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPembelianTiketMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonPembelianTiket);
        resetColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonPembelianTiketMouseEntered

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked

    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        resetColor(ButtonPembelianTiket);
        resetColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonBerandaMouseEntered

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        Login11 lg = new Login11();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void TiketLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiketLabelMouseClicked

    }//GEN-LAST:event_TiketLabelMouseClicked

    private void BackgroundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackgroundFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BackgroundFocusLost

    private void ButtonPembelianTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPembelianTiketMouseClicked
        TransaksiTiket vt = new TransaksiTiket();
        this.dispose();
        vt.setVisible(true); 
    }//GEN-LAST:event_ButtonPembelianTiketMouseClicked

    private void SidePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidePanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_SidePanelMousePressed

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void SidePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_SidePanelMouseDragged

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        slideshow1.back();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        slideshow1.next();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseClicked
        try {
            Riwayat R = new Riwayat();
            this.dispose();
            R.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(BerandaStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonRiwayatMouseClicked

    private void ButtonRiwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonRiwayat);
        resetColor(ButtonPembelianTiket);
    }//GEN-LAST:event_ButtonRiwayatMouseEntered

    void setColor(JPanel panel){
        panel.setBackground(new Color(85, 65, 118));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(64, 43, 100));
    }
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
            java.util.logging.Logger.getLogger(BerandaStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BerandaStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BerandaStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BerandaStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new BerandaStaff().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(BerandaStaff.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Cinema23;
    private javax.swing.JLabel Cinema24;
    private javax.swing.JLabel Cinema25;
    private javax.swing.JLabel Cinema26;
    private javax.swing.JLabel Cinema27;
    private javax.swing.JLabel Cinema28;
    private javax.swing.JLabel Cinema29;
    private javax.swing.JLabel Cinema30;
    private javax.swing.JLabel HelloAdmin;
    private javax.swing.JSeparator LineTitle;
    private javax.swing.JLabel LogOutSimbol;
    private javax.swing.JLabel Logo22;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel TiketLabel;
    private javax.swing.JLabel UserSimbol;
    private viewSwing.Box box1;
    private viewSwing.Box box3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private viewSlideShow.Slideshow slideshow1;
    // End of variables declaration//GEN-END:variables
}
