/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entity.Film;
import Entity.Jadwal;
import Entity.Studio;
import Exception.EmptyInputException;
import control.filmControl;
import control.jadwalControl;
import control.studioControl;
import java.sql.SQLException;
import Exception.InvalidTimeFormatException;
import control.tiketControl;

import table.jadwalTable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.TableModel;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JPanel;

public class PenjadwalanHarian extends javax.swing.JFrame {
    private int xMouse, yMouse;
    
    private filmControl fC;
    private studioControl sC; 
    private jadwalControl jC;
    private tiketControl tC = new tiketControl();
    List<Film> listFilm = null;
    List<Studio> listStudio = null;
    String action = null;
    
    public PenjadwalanHarian() {
        initComponents();
        
        sC = new studioControl();
        fC = new filmControl();
        jC = new jadwalControl();
        AddBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        delBtn.setEnabled(false);
        timeInput.setEnabled(false);
        showJadwal();
        setFilmToDropdown();
        //setFilmToDropdown();
        //setStudioToDropdown();
    }
    
    public void showJadwal(){
        tableJadwal.setModel(jC.showJadwal(start.getDate()));
    }
    
    public void setFilmToDropdown(){
        listFilm = fC.showListFilm();
        
        for(int i = 0; i < listFilm.size(); i++){
            filmDropDown.addItem(listFilm.get(i));
        }
    }
    
    public void setStudiobyTanggalDd(Date tanggal){
        listStudio = jC.showStudiobyTanggal(tanggal);
        
        for (int i = 0; i < listStudio.size(); i++) {
            studioDropdown.addItem(listStudio.get(i));
        }
    }
    
    public void setFilmbyTanggalDd(Date tanggal){
        listFilm = jC.showFilmbyTanggal(tanggal);
        
        for (int i = 0; i < listFilm.size(); i++) {
            filmDropDown.addItem(listFilm.get(i));
        }
    }
    
    public void setStudioToDropdown(Date tanggal){
        listStudio = jC.allAvailStudio(tanggal);
        
        for(int i = 0; i < listStudio.size(); i++){
            studioDropdown.addItem(listStudio.get(i));
        }
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
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        HelloAdmin = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        start = new com.toedter.calendar.JDateChooser();
        lblfilm = new javax.swing.JLabel();
        filmDropDown = new javax.swing.JComboBox<>();
        lblfilm2 = new javax.swing.JLabel();
        studioDropdown = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        timeInput = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableJadwal = new javax.swing.JTable();

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

        ButtonJadwal.setBackground(new java.awt.Color(85, 65, 118));
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
        jLabel1.setText("Date");

        start.setBackground(new java.awt.Color(204, 204, 255));
        start.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        start.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                startAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        start.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startPropertyChange(evt);
            }
        });

        lblfilm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblfilm.setText("Film");

        filmDropDown.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        filmDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmDropDownActionPerformed(evt);
            }
        });

        lblfilm2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblfilm2.setText("Studio");

        studioDropdown.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studioDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studioDropdownActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setText("Jam");

        timeInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        saveBtn.setBackground(new java.awt.Color(51, 153, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
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

        delBtn.setBackground(new java.awt.Color(153, 0, 51));
        delBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(122, 72, 221));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Jadwal Tayang");

        tableJadwal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(54, 33, 89)));
        tableJadwal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        tableJadwal.setGridColor(new java.awt.Color(64, 43, 100));
        tableJadwal.setRowHeight(25);
        tableJadwal.setRowMargin(5);
        tableJadwal.setSelectionBackground(new java.awt.Color(122, 72, 221));
        tableJadwal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableJadwal.setShowGrid(true);
        jScrollPane2.setViewportView(tableJadwal);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studioDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblfilm2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblfilm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filmDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timeInput)))))
                .addGap(61, 61, 61)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblfilm)
                        .addGap(18, 18, 18)
                        .addComponent(filmDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblfilm2)
                        .addGap(18, 18, 18)
                        .addComponent(studioDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTime)
                        .addGap(18, 18, 18)
                        .addComponent(timeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(cancelBtn)
                            .addComponent(delBtn)))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
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

    private void ButtonKelolaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseEntered
        setColor(ButtonKelolaUser);
        setColor(ButtonJadwal);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaStudio);
    }//GEN-LAST:event_ButtonKelolaUserMouseEntered

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked
        BerandaAdmin beranda = null;
        try {
            beranda = new BerandaAdmin();
        } catch (IOException ex) {
            Logger.getLogger(PenjadwalanHarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        beranda.setVisible(true);
    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonJadwal);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaStudio);
    }//GEN-LAST:event_ButtonBerandaMouseEntered

    private void ButtonKelolaFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseClicked
        KelolaFilm KF = new KelolaFilm();
        this.dispose();
        KF.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaFilmMouseClicked

    private void ButtonKelolaFilmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaFilmMouseEntered
        setColor(ButtonKelolaFilm);
        setColor(ButtonJadwal);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaUser);
        resetColor(ButtonKelolaStudio);
    }//GEN-LAST:event_ButtonKelolaFilmMouseEntered

    private void ButtonKelolaStudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseClicked
        KelolaStudio KS = new KelolaStudio();
        this.dispose();
        KS.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaStudioMouseClicked

    private void ButtonKelolaStudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaStudioMouseEntered
        setColor(ButtonKelolaStudio);
        setColor(ButtonJadwal);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaUser);
    }//GEN-LAST:event_ButtonKelolaStudioMouseEntered

    private void ButtonJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonJadwalMouseClicked

    }//GEN-LAST:event_ButtonJadwalMouseClicked

    private void ButtonJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonJadwalMouseEntered
        setColor(ButtonJadwal);
        resetColor(ButtonBeranda);
        resetColor(ButtonKelolaFilm);
        resetColor(ButtonKelolaStudio);
        resetColor(ButtonKelolaUser);
    }//GEN-LAST:event_ButtonJadwalMouseEntered

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        Login11 login = new Login11();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void UserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLabelMouseClicked

    }//GEN-LAST:event_UserLabelMouseClicked

    private void BackgroundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackgroundFocusLost

    }//GEN-LAST:event_BackgroundFocusLost

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        action = "Tambah";
        studioDropdown.setEnabled(true);
        studioDropdown.removeAllItems();
        setStudioToDropdown(start.getDate());
       
        if(studioDropdown.getItemCount() == 0){
            System.out.println("Data Tidak ada");
        }
        
        filmDropDown.setEnabled(true);
        filmDropDown.removeAllItems();
        setFilmToDropdown();
        timeInput.setEnabled(true);
        delBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        showJadwal();
        AddBtn.setEnabled(false);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int selectedIndex = filmDropDown.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex);
        int selectedIndex2 = studioDropdown.getSelectedIndex();
        Studio selectedStudio = listStudio.get(selectedIndex2);

        try {
          
            if(tC.getTiket(selectedStudio.getId(), selectedFilm.getId(), start.getDate(),timeInput.getText()) > 0){
                System.out.println(tC.getTiket(selectedStudio.getId(), selectedFilm.getId(), start.getDate(),timeInput.getText()));
                JOptionPane.showMessageDialog(null, "Tidak Dapat Menghapus Jadwal Karena Ada Tiket Terkait", "Error", JOptionPane.ERROR_MESSAGE); 
            } else {
            jC.deleteJadwal(start.getDate(), selectedFilm.getId() ,selectedStudio.getId(),timeInput.getText());
            studioDropdown.removeAllItems();
            studioDropdown.setEnabled(true);
            filmDropDown.removeAllItems();
            filmDropDown.setEnabled(true);
            start.setDate(null);
            AddBtn.setEnabled(false);
            saveBtn.setEnabled(false);
            delBtn.setEnabled(false);
            timeInput.setText("");
            timeInput.setEnabled(false);
            showJadwal();    
            }
           
        }catch(SQLException ex) {
            Logger.getLogger(PenjadwalanHarian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
         int selectedIndex = filmDropDown.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex);

        int selectedIndex2 = studioDropdown.getSelectedIndex();
        Studio selectedStudio = listStudio.get(selectedIndex2);
            
            try {
                if(timeInput.getText().isEmpty()){
                    throw new EmptyInputException(); 
                }else{
                    if(!InvalidTimeFormatException.isValidTimeFormat(timeInput.getText())){
                       throw new InvalidTimeFormatException(); 
                    } else if(timeInput.getText().contains(",")) { 
                        String[] times = timeInput.getText().split(",");

                        for (String time : times) {
                            Jadwal j = new Jadwal();
                            j.setStudio(selectedStudio);
                            j.setFilm(selectedFilm);
                            j.setDate(start.getDate());
                            j.setTime(time);
                            jC.inputJadwal(j);
                        }    
                            studioDropdown.removeAllItems();
                            filmDropDown.removeAllItems();
                            studioDropdown.setEnabled(false);
                            filmDropDown.setEnabled(false);
                            timeInput.setText("");
                            showJadwal();
                            action = null;
                            saveBtn.setEnabled(false);
                            timeInput.setEnabled(false);
                        } else {
                           Jadwal j = new Jadwal();
                        
                            j.setStudio(selectedStudio);
                            j.setFilm(selectedFilm);
                            j.setDate(start.getDate());
                            j.setTime(timeInput.getText());
                            jC.inputJadwal(j);
                            studioDropdown.removeAllItems();
                            filmDropDown.removeAllItems();
                            studioDropdown.setEnabled(false);
                            filmDropDown.setEnabled(false);
                            timeInput.setText("");
                            showJadwal();
                            action = null;
                            saveBtn.setEnabled(false);
                            timeInput.setEnabled(false);
                        
                } 
                }
                    
            }catch(SQLException ex){
                Logger.getLogger(KelolaStudio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EmptyInputException e){
                e.showMessage();
            } catch (InvalidTimeFormatException e){
                e.showMessage();
            }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        action = null;
        start.setDate(null);
        studioDropdown.removeAllItems();
        filmDropDown.removeAllItems();
        studioDropdown.addItem(new Studio("Pilih Tanggal"));
        filmDropDown.addItem(new Film("Pilih Tanggal"));
        timeInput.setText("");
        timeInput.setEnabled(false);
        saveBtn.setEnabled(false);
        AddBtn.setEnabled(false);
        delBtn.setEnabled(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void startAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_startAncestorAdded

    }//GEN-LAST:event_startAncestorAdded

    private void startPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_startPropertyChange
        Date date = start.getDate();
        
        if(date == null) {
            studioDropdown.addItem(new Studio("Pilih tanggal"));
            studioDropdown.setEnabled(false);
            filmDropDown.addItem(new Film("Pilih tanggal"));
            filmDropDown.setEnabled(false);
            return;
        }
        
        if(action == null){
            studioDropdown.removeAllItems();
            studioDropdown.setEnabled(true);
            filmDropDown.removeAllItems();
            filmDropDown.setEnabled(true);

            setStudiobyTanggalDd(date);
            setFilmbyTanggalDd(date);
            showJadwal();
            timeInput.setText("");
            timeInput.setEnabled(true);
            AddBtn.setEnabled(true);
            delBtn.setEnabled(true);
        }else{
            studioDropdown.setEnabled(true);
            studioDropdown.removeAllItems();
            delBtn.setEnabled(false);
            setStudioToDropdown(start.getDate());
            if(studioDropdown.getItemCount() == 0){
                System.out.println("Data Tidak ada");
            }
            filmDropDown.setEnabled(true);
            filmDropDown.removeAllItems();
            showJadwal();
        }
    }//GEN-LAST:event_startPropertyChange

    private void filmDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmDropDownActionPerformed

    }//GEN-LAST:event_filmDropDownActionPerformed

    private void ButtonKelolaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonKelolaUserMouseClicked
        KelolaUser KU = new KelolaUser();
        this.dispose();
        KU.setVisible(true);
    }//GEN-LAST:event_ButtonKelolaUserMouseClicked

    private void studioDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studioDropdownActionPerformed

    }//GEN-LAST:event_studioDropdownActionPerformed

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
            java.util.logging.Logger.getLogger(PenjadwalanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjadwalanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjadwalanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjadwalanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new PenjadwalanHarian().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
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
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JComboBox<Film> filmDropDown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblfilm;
    private javax.swing.JLabel lblfilm2;
    private javax.swing.JButton saveBtn;
    private com.toedter.calendar.JDateChooser start;
    private javax.swing.JComboBox<Studio> studioDropdown;
    private javax.swing.JTable tableJadwal;
    private javax.swing.JTextField timeInput;
    // End of variables declaration//GEN-END:variables
}
