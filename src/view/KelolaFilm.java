/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entity.Film;
import table.filmTable;
import DAO.filmDAO;
import control.filmControl;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Exception.*;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import org.apache.commons.io.*;

import java.awt.Color;
import javax.swing.JPanel;

public class KelolaFilm extends javax.swing.JFrame {
    private int xMouse, yMouse;
    
    private filmControl fC;
    filmTable TableModel1;
    File file;
    JFileChooser jfc;
    String action = null;
    
    int selectedId = 0;
    
    public KelolaFilm() {
        initComponents();
        setComponent(false);
        fC = new filmControl();
        showFilm();
    }

    public void showFilm(){
        filmTable.setModel(fC.showFilmbySearch(""));
    }
    
    public void setComponent(boolean value){
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
        addImgBtn.setEnabled(value);
        
        titleInput.setEnabled(value);
        genreInput.setEnabled(value);
        penulisInput.setEnabled(value);
        disInput.setEnabled(value);
        
        setEditDeleteBtn(value);
        addBtn.setEnabled(true);
    }
    
    public void clearText(){
        titleInput.setText("");
        genreInput.setText("");
        penulisInput.setText("");
        disInput.setText("");
        searchInput.setText("");
        lblFilm.setIcon(null);
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        delBtn.setEnabled(value);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        HelloAdmin = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        ButtonExit1 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        titleInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genreInput = new javax.swing.JTextField();
        penulisInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        disInput = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        lblFilm = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addImgBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        UserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLabelMouseClicked(evt);
            }
        });

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

        ButtonKelolaFilm.setBackground(new java.awt.Color(85, 65, 118));
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

        ButtonKelolaStudio.setBackground(new java.awt.Color(64, 43, 100));
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

        jPanel6.setBackground(new java.awt.Color(122, 72, 221));

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel3.setkGradientFocus(800);
        kGradientPanel3.setkStartColor(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 910, 90));

        HelloAdmin.setBackground(new java.awt.Color(204, 204, 204));
        HelloAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HelloAdmin.setForeground(new java.awt.Color(153, 153, 153));
        HelloAdmin.setText("HELLO ADMIN");
        Background.add(HelloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 200, 30));

        searchInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Background.add(searchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 291, -1));

        searchBtn.setBackground(new java.awt.Color(0, 51, 255));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        Background.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 90, -1));

        ButtonExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Exit Button.png"))); // NOI18N
        ButtonExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExit1MouseClicked(evt);
            }
        });
        Background.add(ButtonExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        kGradientPanel6.setkEndColor(new java.awt.Color(54, 33, 80));
        kGradientPanel6.setkGradientFocus(1);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Judul Film");

        titleInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        titleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Genre");

        genreInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreInputActionPerformed(evt);
            }
        });

        penulisInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Penulis");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Distributor");

        disInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        disInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disInputActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(122, 72, 221));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 153, 51));
        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(153, 0, 51));
        delBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 102, 102));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(51, 153, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        lblFilm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Daftar Film");

        addImgBtn.setBackground(new java.awt.Color(122, 72, 221));
        addImgBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addImgBtn.setForeground(new java.awt.Color(255, 255, 255));
        addImgBtn.setText("Add Image");
        addImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImgBtnActionPerformed(evt);
            }
        });

        filmTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(54, 33, 89)));
        filmTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        filmTable.setModel(new javax.swing.table.DefaultTableModel(
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
        filmTable.setGridColor(new java.awt.Color(64, 43, 100));
        filmTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        filmTable.setRowHeight(25);
        filmTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        filmTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        filmTable.setShowGrid(true);
        filmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmTable);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(kGradientPanel6Layout.createSequentialGroup()
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(penulisInput, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleInput)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genreInput)
                        .addComponent(disInput)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addBtn)
                                .addComponent(editBtn)
                                .addComponent(delBtn))
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)
                                .addComponent(genreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)
                                .addComponent(penulisInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelBtn)
                            .addComponent(saveBtn)
                            .addComponent(addImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        Background.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        action = "Edit";
        setComponent(true);
        addBtn.setEnabled(false);
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah Yakin Ingin Menghapus Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
                try{
                    fC.deleteDataFilm(selectedId);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                    clearText();
                    showFilm();
                    setComponent(false);
                    setEditDeleteBtn(false);
                    lblname.setText("");
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
            break;
            
            case 1:
            break;
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void addImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImgBtnActionPerformed
        jfc = new JFileChooser();
        if(jfc.showOpenDialog(lblFilm) == JFileChooser.APPROVE_OPTION){
            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            
            lblFilm.setIcon(imageIcon);
            lblname.setText(jfc.getSelectedFile().getName());
            
            file = new File(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_addImgBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
            try {
                if(action.equals("Tambah")){
                    if(lblname.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Tidak ada Poster Film");
                    }else{
                        Film f = new Film(titleInput.getText(),genreInput.getText(),penulisInput.getText(),disInput.getText(),lblname.getText());
                        fC.insertDataFilm(f);
                        String path;

                        path = new File(".").getCanonicalPath();
                        FileUtils.copyFileToDirectory(file, new File(path+"/image"));

                        clearText();
                        JOptionPane.showMessageDialog(null, "Berhasil Input Data "+titleInput.getText());
                        showFilm();
                    }
                    
                
                }else{
                    int clickedRow = filmTable.getSelectedRow();
                    TableModel tableModel = filmTable.getModel();

                    selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 5).toString());
                    Film f = new Film(selectedId ,titleInput.getText(),genreInput.getText(),penulisInput.getText(),disInput.getText(),lblname.getText());
                    fC.updateDataFilm(f);
                
                    if(lblname.getText().equalsIgnoreCase(tableModel.getValueAt(clickedRow, 4).toString())){

                    }else{
                        String path;
                        path = new File(".").getCanonicalPath();
                        FileUtils.copyFileToDirectory(file, new File(path+"/image"));
                    }
                    
                    clearText();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate ^-^");
                    showFilm();
                }
            
            }catch(IOException ex) {
                Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
            }catch (EmptyInputException e){
                e.showMessage();
            }
            
            showFilm();
            lblname.setText("");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void titleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleInputActionPerformed

    }//GEN-LAST:event_titleInputActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        action = "Tambah";
        setComponent(true);
        setEditDeleteBtn(false);
        clearText();
        lblname.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void filmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmTableMouseClicked
        setComponent(false);
        
        int row = filmTable.getSelectedRow();
        TableModel tableModel = filmTable.getModel();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        selectedId = Integer.parseInt(tableModel.getValueAt(row, 5).toString());          
        
        String path;
        
        try {
             path = new File(".").getCanonicalPath();
             Image image = toolkit.getImage(path + "/image/" + tableModel.getValueAt(row, 4).toString());
             Image imagedResized = image.getScaledInstance(200, 270, Image.SCALE_DEFAULT);
             ImageIcon icon = new ImageIcon(imagedResized);
             lblFilm.setIcon(icon);
             setEditDeleteBtn(true);
             cancelBtn.setEnabled(true);
             titleInput.setText(tableModel.getValueAt(row, 0).toString());
             genreInput.setText(tableModel.getValueAt(row, 1).toString());
             penulisInput.setText(tableModel.getValueAt(row, 2).toString());
             disInput.setText(tableModel.getValueAt(row, 3).toString());
             lblname.setText(tableModel.getValueAt(row, 4).toString());
        
        } catch (IOException ex) {
            Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_filmTableMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
        lblname.setText("");
        showFilm();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(false);
        setComponent(false);
        
        try{
            filmTable film = fC.showFilmbySearch(searchInput.getText());
            if(film.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data Tidak Ditemukan!", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                filmTable.setModel(film);
            }
            clearText();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void UserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLabelMouseClicked

    }//GEN-LAST:event_UserLabelMouseClicked

    private void ButtonKelolaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseClicked
        KelolaUser KU = new KelolaUser();
        this.dispose();
        KU.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaUserMouseClicked

    private void ButtonKelolaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseEntered
        setColor(ButtonKelolaUser);
        setColor(ButtonKelolaFilm);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaStudio);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonKelolaUserMouseEntered

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked
        try {
            BerandaAdmin beranda = new BerandaAdmin();
            this.dispose();
            beranda.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(KelolaFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonKelolaStudio);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonBerandaMouseEntered

    private void ButtonKelolaFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseClicked

    }//GEN-LAST:event_ButtonKelolaFilmMouseClicked

    private void ButtonKelolaFilmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseEntered
        setColor(ButtonKelolaFilm);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonKelolaStudio);
        resetColor(ButtonJadwal);
    }//GEN-LAST:event_ButtonKelolaFilmMouseEntered

    private void ButtonKelolaStudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseClicked
        KelolaStudio KS = new KelolaStudio();
        this.dispose();
        KS.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaStudioMouseClicked

    private void ButtonKelolaStudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseEntered
        setColor(ButtonKelolaStudio);
        setColor(ButtonKelolaFilm);
        resetColor(ButtonBeranda);
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
        setColor(ButtonKelolaFilm);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaStudio);
        resetColor(ButtonKelolaUser);
    }//GEN-LAST:event_ButtonJadwalMouseEntered

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        Login11 login = new Login11();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void genreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreInputActionPerformed
       
    }//GEN-LAST:event_genreInputActionPerformed

    private void disInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disInputActionPerformed
       
    }//GEN-LAST:event_disInputActionPerformed

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

    private void ButtonExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExit1MouseClicked
    
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
            java.util.logging.Logger.getLogger(KelolaFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new KelolaFilm().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BerandaLabel;
    private javax.swing.JLabel BerandaSimbol;
    private javax.swing.JPanel ButtonBeranda;
    private javax.swing.JLabel ButtonExit1;
    private javax.swing.JPanel ButtonJadwal;
    private javax.swing.JPanel ButtonKelolaFilm;
    private javax.swing.JPanel ButtonKelolaStudio;
    private javax.swing.JPanel ButtonKelolaUser;
    private javax.swing.JPanel ButtonLogOut;
    private javax.swing.JLabel Cinema22;
    private javax.swing.JLabel HelloAdmin;
    private javax.swing.JLabel JadwalLabel;
    private javax.swing.JLabel JadwalSimbol;
    private javax.swing.JSeparator LineTitle;
    private javax.swing.JLabel LogOutSimbol;
    private javax.swing.JLabel Logo22;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel StudioLabel;
    private javax.swing.JLabel StudioSimbol;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserSimbol;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addImgBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField disInput;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable filmTable;
    private javax.swing.JTextField genreInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JLabel lblFilm;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField penulisInput;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField titleInput;
    // End of variables declaration//GEN-END:variables
}
