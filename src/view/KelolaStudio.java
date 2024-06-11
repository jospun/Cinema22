/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entity.Film;
import Entity.Studio;

import DAO.studioDAO;
import DAO.filmDAO;

import control.filmControl;
import control.studioControl;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;

import Exception.EmptyInputException;
import java.io.IOException;

public class KelolaStudio extends javax.swing.JFrame {
   private int xMouse, yMouse;
    
   List<Studio> listStudio1;
   private studioControl sC; 
   int no=0;
   int temp [] ;
   String act =null;

    public KelolaStudio() {
        initComponents();
        sC = new studioControl();
        setComponentStud(false);
        SaveBtn.setEnabled(false);
        studioDropdown.setEnabled(true);
        clearTextStud();
        setStudioToDropdown2();
    }
    
    public void setStudioToDropdown2(){
        listStudio1 = sC.showListStudio();
        
        for(int i = 0; i < listStudio1.size(); i++){
            studioDropdown.addItem(listStudio1.get(i));
        }
    }

    public void setComponentStud(boolean value){
        studioDropdown.setEnabled(value);
        kapInput.setEnabled(value);
        jenisInput.setEnabled(value);
        namaInput.setEnabled(value);
    }
    
    public void clearTextStud(){
        kapInput.setText("");
        jenisInput.setText("");
        namaInput.setText("");
        studioDropdown.removeAllItems();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        SidePanel = new javax.swing.JPanel();
        ButtonKelolaUser = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        UserSimbol = new javax.swing.JLabel();
        ButtonBeranda = new javax.swing.JPanel();
        BerandaLabel = new javax.swing.JLabel();
        BerandaSimbol = new javax.swing.JLabel();
        ButtonKelolaFilm = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ButtonKelolaStudio = new javax.swing.JPanel();
        StudioLabel = new javax.swing.JLabel();
        StudioSimbol = new javax.swing.JLabel();
        ButtonJadwal = new javax.swing.JPanel();
        JadwalLabel = new javax.swing.JLabel();
        JadwalSimbol = new javax.swing.JLabel();
        Logo22 = new javax.swing.JLabel();
        Cinema22 = new javax.swing.JLabel();
        LineTitle = new javax.swing.JSeparator();
        ButtonLogOut = new javax.swing.JPanel();
        LogoutLabel = new javax.swing.JLabel();
        LogOutSimbol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        HelloAdmin = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        ButtonExit = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        studioDropdown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kapInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jenisInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
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

        cancelBtn.setBackground(new java.awt.Color(255, 102, 102));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        Background.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        EditBtn.setBackground(new java.awt.Color(255, 153, 51));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        Background.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 70, -1));

        SaveBtn.setBackground(new java.awt.Color(51, 153, 0));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        Background.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 70, -1));

        delBtn.setBackground(new java.awt.Color(153, 0, 51));
        delBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        Background.add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

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

        ButtonKelolaUser.setBackground(new java.awt.Color(64, 43, 100));
        ButtonKelolaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonKelolaUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonKelolaUserMouseEntered(evt);
            }
        });

        UserLabel.setBackground(new java.awt.Color(204, 204, 204));
        UserLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(204, 204, 204));
        UserLabel.setText("Kelola User");

        UserSimbol.setBackground(new java.awt.Color(204, 204, 204));
        UserSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserSimbol.setForeground(new java.awt.Color(204, 204, 204));
        UserSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icons User.png"))); // NOI18N

        javax.swing.GroupLayout ButtonKelolaUserLayout = new javax.swing.GroupLayout(ButtonKelolaUser);
        ButtonKelolaUser.setLayout(ButtonKelolaUserLayout);
        ButtonKelolaUserLayout.setHorizontalGroup(
            ButtonKelolaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonKelolaUserLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(UserSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ButtonKelolaUserLayout.setVerticalGroup(
            ButtonKelolaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonKelolaUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonKelolaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserLabel)
                    .addComponent(UserSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonKelolaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 50));

        ButtonBeranda.setBackground(new java.awt.Color(64, 43, 100));
        ButtonBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBerandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonBerandaMouseEntered(evt);
            }
        });

        BerandaLabel.setBackground(new java.awt.Color(64, 43, 100));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BerandaLabel)
                    .addComponent(BerandaSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        ButtonKelolaFilm.setBackground(new java.awt.Color(64, 43, 100));
        ButtonKelolaFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonKelolaFilmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonKelolaFilmMouseEntered(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Kelola Film");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icons Movie.png"))); // NOI18N

        javax.swing.GroupLayout ButtonKelolaFilmLayout = new javax.swing.GroupLayout(ButtonKelolaFilm);
        ButtonKelolaFilm.setLayout(ButtonKelolaFilmLayout);
        ButtonKelolaFilmLayout.setHorizontalGroup(
            ButtonKelolaFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonKelolaFilmLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ButtonKelolaFilmLayout.setVerticalGroup(
            ButtonKelolaFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonKelolaFilmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonKelolaFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonKelolaFilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        ButtonKelolaStudio.setBackground(new java.awt.Color(85, 65, 118));
        ButtonKelolaStudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonKelolaStudioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonKelolaStudioMouseEntered(evt);
            }
        });

        StudioLabel.setBackground(new java.awt.Color(204, 204, 204));
        StudioLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudioLabel.setForeground(new java.awt.Color(204, 204, 204));
        StudioLabel.setText("Kelola Studio");

        StudioSimbol.setBackground(new java.awt.Color(204, 204, 204));
        StudioSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudioSimbol.setForeground(new java.awt.Color(204, 204, 204));
        StudioSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icons Studio.png"))); // NOI18N

        javax.swing.GroupLayout ButtonKelolaStudioLayout = new javax.swing.GroupLayout(ButtonKelolaStudio);
        ButtonKelolaStudio.setLayout(ButtonKelolaStudioLayout);
        ButtonKelolaStudioLayout.setHorizontalGroup(
            ButtonKelolaStudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonKelolaStudioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(StudioSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StudioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        ButtonKelolaStudioLayout.setVerticalGroup(
            ButtonKelolaStudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonKelolaStudioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonKelolaStudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudioLabel)
                    .addComponent(StudioSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonKelolaStudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        ButtonJadwal.setBackground(new java.awt.Color(64, 43, 100));
        ButtonJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonJadwalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonJadwalMouseEntered(evt);
            }
        });

        JadwalLabel.setBackground(new java.awt.Color(204, 204, 204));
        JadwalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JadwalLabel.setForeground(new java.awt.Color(204, 204, 204));
        JadwalLabel.setText("Penjadwalan Harian");

        JadwalSimbol.setBackground(new java.awt.Color(204, 204, 204));
        JadwalSimbol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JadwalSimbol.setForeground(new java.awt.Color(204, 204, 204));
        JadwalSimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icons Schedule.png"))); // NOI18N

        javax.swing.GroupLayout ButtonJadwalLayout = new javax.swing.GroupLayout(ButtonJadwal);
        ButtonJadwal.setLayout(ButtonJadwalLayout);
        ButtonJadwalLayout.setHorizontalGroup(
            ButtonJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonJadwalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JadwalSimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JadwalLabel)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ButtonJadwalLayout.setVerticalGroup(
            ButtonJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonJadwalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JadwalLabel)
                    .addComponent(JadwalSimbol))
                .addGap(18, 18, 18))
        );

        SidePanel.add(ButtonJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

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
        HelloAdmin.setText("HELLO ADMIN");
        Background.add(HelloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 200, 30));

        addBtn.setBackground(new java.awt.Color(122, 72, 221));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        Background.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 70, -1));

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

        studioDropdown.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studioDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studioDropdownActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Studio");

        namaInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Kapasitas");

        kapInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kapInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapInputActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Jenis Studio");

        jenisInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jenisInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kapInput, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studioDropdown, javax.swing.GroupLayout.Alignment.TRAILING, 0, 290, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaInput, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(72, 72, 72)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studioDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(kapInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        Background.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponentStud(false);
        clearTextStud();
        SaveBtn.setEnabled(false);
        EditBtn.setEnabled(true);
        addBtn.setEnabled(true);
        delBtn.setEnabled(true);
        setStudioToDropdown2();
        studioDropdown.setEnabled(true);      
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        setComponentStud(true);
        studioDropdown.setEnabled(false);
        studioDropdown.removeAllItems();
        act = "Tambah";
        SaveBtn.setEnabled(true);
        addBtn.setEnabled(false);
        EditBtn.setEnabled(true);
        delBtn.setEnabled(false);
    }//GEN-LAST:event_addBtnActionPerformed

    private void kapInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapInputActionPerformed

    }//GEN-LAST:event_kapInputActionPerformed

    private void jenisInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisInputActionPerformed
   
    }//GEN-LAST:event_jenisInputActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        setComponentStud(true);
        act = "Edit";
        studioDropdown.setEnabled(true);
        studioDropdown.removeAllItems();
        setStudioToDropdown2();
        SaveBtn.setEnabled(true);
        EditBtn.setEnabled(false);
        addBtn.setEnabled(true);
        delBtn.setEnabled(true);
    }//GEN-LAST:event_EditBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        Studio s = new Studio();
        
        try{
            
        if(!EmptyInputException.isEmpty(namaInput.getText()) ||
           !EmptyInputException.isEmpty(kapInput.getText()) ||
           !EmptyInputException.isEmpty(jenisInput.getText())){
             throw new EmptyInputException();
        }else {
            
                if(act.equalsIgnoreCase("Tambah")){
                    s.setNama(namaInput.getText());
                    s.setKapasitas(Integer.parseInt(kapInput.getText()));
                    s.setJenis(jenisInput.getText());
                    clearTextStud();
                    sC.insertStudio(s);
                    JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Studio!");
                    studioDropdown.removeAllItems();
      
                }else if(act.equalsIgnoreCase("Edit")){
                    int selectedIndex2 = studioDropdown.getSelectedIndex();
                    Studio selectedStudio = listStudio1.get(selectedIndex2);
                    s.setStudio(selectedStudio);
                    s.setNama(namaInput.getText());
                    s.setKapasitas(Integer.parseInt(kapInput.getText()));
                    s.setJenis(jenisInput.getText());
                    sC.editStudio(s);
                    JOptionPane.showMessageDialog(this, "Berhasil Mengubah Studio!");
                    clearTextStud();
                    studioDropdown.removeAllItems();
                    setStudioToDropdown2();

                }
            }
        } catch (EmptyInputException e){
            e.showMessage();
        } catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Inputan Kapasitas Harus Berupa Angka", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked
        BerandaAdmin beranda = null;
       try {
           beranda = new BerandaAdmin();
       } catch (IOException ex) {
           Logger.getLogger(KelolaStudio.class.getName()).log(Level.SEVERE, null, ex);
       }
        this.dispose();
        beranda.setVisible(true);
    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonKelolaStudio);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonBerandaMouseEntered

    private void ButtonKelolaFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseClicked
        KelolaFilm KF = new KelolaFilm();
        this.dispose();
        KF.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaFilmMouseClicked

    private void ButtonKelolaFilmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseEntered
        setColor(ButtonKelolaFilm);
        setColor(ButtonKelolaStudio);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonKelolaFilmMouseEntered

    private void ButtonKelolaStudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseClicked

    }//GEN-LAST:event_ButtonKelolaStudioMouseClicked

    private void ButtonKelolaStudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseEntered
        setColor(ButtonKelolaStudio);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonKelolaStudioMouseEntered

    private void ButtonJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonJadwalMouseClicked
        PenjadwalanHarian PH = new PenjadwalanHarian();
        this.dispose();
        PH.setVisible(true);
    }//GEN-LAST:event_ButtonJadwalMouseClicked

    private void ButtonJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonJadwalMouseEntered
        setColor(ButtonJadwal);
        setColor(ButtonKelolaStudio);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaUser);
    }//GEN-LAST:event_ButtonJadwalMouseEntered

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        Login11 login = new Login11();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void studioDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studioDropdownActionPerformed
  
    }//GEN-LAST:event_studioDropdownActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        setComponentStud(false);
        int selectedIndex2 = studioDropdown.getSelectedIndex();
        Studio selectedStudio = listStudio1.get(selectedIndex2);
        sC.deleteStudio(selectedStudio.getId());
        JOptionPane.showMessageDialog(this, "Berhasil Menghapus Studio!");
        studioDropdown.removeAllItems();
        studioDropdown.setEnabled(true);
        setStudioToDropdown2(); 
    }//GEN-LAST:event_delBtnActionPerformed

    private void ButtonKelolaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseEntered
        setColor(ButtonKelolaUser);
        setColor(ButtonKelolaStudio);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonKelolaUserMouseEntered

    private void SidePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidePanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_SidePanelMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void SidePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_SidePanelMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void ButtonKelolaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseClicked
        // TODO add your handling code here:
        KelolaUser KU = new KelolaUser();
        this.dispose();
        KU.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaUserMouseClicked

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
            java.util.logging.Logger.getLogger(KelolaStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new KelolaStudio().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BerandaLabel;
    private javax.swing.JLabel BerandaSimbol;
    private javax.swing.JPanel ButtonBeranda;
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JPanel ButtonJadwal;
    private javax.swing.JPanel ButtonKelolaFilm;
    private javax.swing.JPanel ButtonKelolaStudio;
    private javax.swing.JPanel ButtonKelolaUser;
    private javax.swing.JPanel ButtonLogOut;
    private javax.swing.JLabel Cinema22;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel HelloAdmin;
    private javax.swing.JLabel JadwalLabel;
    private javax.swing.JLabel JadwalSimbol;
    private javax.swing.JSeparator LineTitle;
    private javax.swing.JLabel LogOutSimbol;
    private javax.swing.JLabel Logo22;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel StudioLabel;
    private javax.swing.JLabel StudioSimbol;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserSimbol;
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jenisInput;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField kapInput;
    private javax.swing.JTextField namaInput;
    private javax.swing.JComboBox<Studio> studioDropdown;
    // End of variables declaration//GEN-END:variables
}
