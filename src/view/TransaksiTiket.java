/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entity.Film;
import Entity.Jadwal;
import Entity.Studio;
import Entity.Tiket;
import Exception.EmptyInputException;
import control.filmControl;
import control.jadwalControl;
import control.studioControl;
import control.tiketControl;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import table.tiketTable;

import java.awt.Color;
import javax.swing.JPanel;

public class TransaksiTiket extends javax.swing.JFrame {
    private int xMouse, yMouse;
    
    private filmControl fC;
    private jadwalControl jC;
    private tiketControl tC;
    private studioControl StudioControl;
    String action = null;
    List<Film> listFilm = null;
    List<Studio> listStudio = null;
    List<Jadwal> listJadwal = null;
    List<String> listWaktu = null;
    
    public TransaksiTiket() {
        initComponents();
        fC = new filmControl();
        StudioControl = new studioControl();
        jC = new jadwalControl();
        tC = new tiketControl();
        setStudioToDropdown();
        DropDownTanggal.removeAllItems();
        DropDownStudio.removeAllItems();
    }
    
    public void setFilmToDropdown(){
        listFilm = fC.showListFilm();
        
        for(int i = 0; i < listFilm.size(); i++){
            DropDownFilm.addItem(listFilm.get(i));
        }
        
        int i = DropDownFilm.getSelectedIndex();
        String path;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
       
        try{
            path = new File(".").getCanonicalPath();
             Image image = toolkit.getImage(path + "/image/" + listFilm.get(i).getImageFileName().toString());
             Image imagedResized = image.getScaledInstance(210, 350, Image.SCALE_DEFAULT);
             ImageIcon icon = new ImageIcon(imagedResized);
             lblFilm.setIcon(icon);
        }catch(IOException ex) {
            Logger.getLogger(KelolaFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setAllTanggalToDropdown(){
        listJadwal = tC.showAllJadwal();
        
        for(int i = 0; i < listJadwal.size(); i++){ 
            DropDownTanggal.addItem(listJadwal.get(i));
        }
    }
    
    public void setTimeToDropdown(int id, int film, Date date) throws SQLException{
        listWaktu = tC.showWaktu(id, film, date);
        
        if(listWaktu.isEmpty()){
            listWaktu = tC.showOneWaktu(id, film, date);
        }
        
        for(int i = 0; i < listWaktu.size(); i++){
            DropDownWaktu.addItem(listWaktu.get(i));
        }
    }
    
    public void setWaktuTayangToDropdown(int id) {
        DropDownTanggal.removeAllItems();
        listJadwal = tC.showJadwal(id);
        
        for(int i = 0; i < listJadwal.size(); i++){
            DropDownTanggal.addItem(listJadwal.get(i));
        }
    }
    
    public void setStudiobyFilmToDropdown(int id, Date date){
        listStudio = tC.showStudio(id, date);
        
        for(int i = 0; i < listStudio.size(); i++){
            DropDownStudio.addItem(listStudio.get(i));
        }
    }
    
    public void setStudioToDropdown(){
        listStudio = StudioControl.showListStudio();
        
        for(int i = 0; i < listStudio.size(); i++){
            DropDownStudio.addItem(listStudio.get(i));
        }
    }
    
    public void clearTextSet(){
        tiketDewasa.setText("");
        DropDownFilm.setSelectedItem(ABORT);
        DropDownStudio.setSelectedItem(ABORT);
        DropDownWaktu.setSelectedItem(ABORT);
        DropDownTanggal.setSelectedItem(ABORT);
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
        JumlahTiketLabel = new javax.swing.JLabel();
        tiketDewasa = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblTayang = new javax.swing.JLabel();
        lblWaktu = new javax.swing.JLabel();
        lblStudio = new javax.swing.JLabel();
        lblJumlah = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DropDownFilm = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        DropDownTanggal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        DropDownWaktu = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        DropDownStudio = new javax.swing.JComboBox<>();
        lblFilm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        ButtonPembelianTiket.setBackground(new java.awt.Color(85, 65, 118));
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

        kGradientPanel4.setkEndColor(new java.awt.Color(54, 33, 80));
        kGradientPanel4.setkGradientFocus(1);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        JumlahTiketLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JumlahTiketLabel.setText("Jumlah Tiket");

        tiketDewasa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tiketDewasa.setPreferredSize(new java.awt.Dimension(50, 50));
        tiketDewasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiketDewasaActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(51, 153, 0));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(255, 102, 102));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Movie Name        : ");

        jLabel6.setText("Tanggal Tayang   : ");

        jLabel7.setText("Waktu Tayang     :");

        jLabel8.setText("Studio                 :");

        jLabel9.setText("Jumlah Tiket        :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Total Harga       :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Invoice Pembelian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTayang, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(147, 147, 147))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTayang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Judul Film");

        DropDownFilm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DropDownFilm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DropDownFilmItemStateChanged(evt);
            }
        });
        DropDownFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DropDownFilmMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DropDownFilmMouseReleased(evt);
            }
        });
        DropDownFilm.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                DropDownFilmInputMethodTextChanged(evt);
            }
        });
        DropDownFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownFilmActionPerformed(evt);
            }
        });
        DropDownFilm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DropDownFilmPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tanggal Tayang");

        DropDownTanggal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DropDownTanggal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DropDownTanggalItemStateChanged(evt);
            }
        });
        DropDownTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownTanggalActionPerformed(evt);
            }
        });
        DropDownTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DropDownTanggalPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Waktu Tayang");

        DropDownWaktu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DropDownWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownWaktuActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Studio");

        DropDownStudio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DropDownStudio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DropDownStudioItemStateChanged(evt);
            }
        });
        DropDownStudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownStudioActionPerformed(evt);
            }
        });
        DropDownStudio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DropDownStudioPropertyChange(evt);
            }
        });

        lblFilm.setBackground(new java.awt.Color(54, 33, 89));
        lblFilm.setForeground(new java.awt.Color(54, 33, 89));
        lblFilm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(JumlahTiketLabel)
                        .addGap(18, 18, 18)
                        .addComponent(tiketDewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DropDownWaktu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DropDownTanggal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DropDownFilm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DropDownStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelBtn))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelBtn)
                            .addComponent(SaveBtn))
                        .addGap(82, 82, 82))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(lblFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DropDownFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(DropDownTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(DropDownWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(DropDownStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahTiketLabel)
                    .addComponent(tiketDewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        Background.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 860, 510));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Studio");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        resetColor(ButtonBeranda);
        setColor(ButtonPembelianTiket);
        resetColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonPembelianTiketMouseEntered

    private void ButtonBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseClicked
        BerandaStaff bs = null;
        try {
            bs = new BerandaStaff();
        } catch (IOException ex) {
            Logger.getLogger(TransaksiTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        bs.setVisible(true);
    }//GEN-LAST:event_ButtonBerandaMouseClicked

    private void ButtonBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBerandaMouseEntered
        setColor(ButtonBeranda);
        setColor(ButtonPembelianTiket);
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

    private void ButtonRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseClicked
        Riwayat R;
        try {
            R = new Riwayat();
            this.dispose();
            R.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonRiwayatMouseClicked

    private void ButtonRiwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRiwayatMouseEntered
        resetColor(ButtonBeranda);
        setColor(ButtonPembelianTiket);
        setColor(ButtonRiwayat);
    }//GEN-LAST:event_ButtonRiwayatMouseEntered

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        DropDownFilm.removeAllItems();
        setFilmToDropdown();
        AddBtn.setEnabled(false);
        lblNama.setText("");
        lblTayang.setText("");
        lblWaktu.setText("");
        lblStudio.setText("");
        lblJumlah.setText("");
        lblHarga.setText("");
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DropDownWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownWaktuActionPerformed

    }//GEN-LAST:event_DropDownWaktuActionPerformed

    private void DropDownTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DropDownTanggalPropertyChange

    }//GEN-LAST:event_DropDownTanggalPropertyChange

    private void DropDownTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownTanggalActionPerformed

    }//GEN-LAST:event_DropDownTanggalActionPerformed

    private void DropDownTanggalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DropDownTanggalItemStateChanged
        DropDownStudio.removeAllItems();

        if(DropDownFilm.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex1 = DropDownFilm.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex1);

        if(DropDownTanggal.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex2 = DropDownTanggal.getSelectedIndex();
        Jadwal selectedTanggal = listJadwal.get(selectedIndex2);

        setStudiobyFilmToDropdown(selectedFilm.getId(),selectedTanggal.getDate());
    }//GEN-LAST:event_DropDownTanggalItemStateChanged

    private void DropDownFilmPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DropDownFilmPropertyChange

    }//GEN-LAST:event_DropDownFilmPropertyChange

    private void DropDownFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownFilmActionPerformed

    }//GEN-LAST:event_DropDownFilmActionPerformed

    private void DropDownFilmInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_DropDownFilmInputMethodTextChanged

    }//GEN-LAST:event_DropDownFilmInputMethodTextChanged

    private void DropDownFilmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DropDownFilmMouseReleased

    }//GEN-LAST:event_DropDownFilmMouseReleased

    private void DropDownFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DropDownFilmMouseClicked

    }//GEN-LAST:event_DropDownFilmMouseClicked

    private void DropDownFilmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DropDownFilmItemStateChanged
        DropDownTanggal.removeAllItems();
        int i = DropDownFilm.getSelectedIndex();

        if(DropDownFilm.getSelectedIndex() == -1){
            return;
        }

        String path;
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        try{
            path = new File(".").getCanonicalPath();
            Image image = toolkit.getImage(path + "/image/" + listFilm.get(i).getImageFileName().toString());
            Image imagedResized = image.getScaledInstance(210, 350, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(imagedResized);
            lblFilm.setIcon(icon);
        }catch(IOException ex) {
            Logger.getLogger(KelolaFilm.class.getName()).log(Level.SEVERE, null, ex);
        }

        int selectedIndex2 = DropDownFilm.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex2);
        System.out.println(selectedFilm.getId());

        setWaktuTayangToDropdown(selectedFilm.getId());
    }//GEN-LAST:event_DropDownFilmItemStateChanged

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        DropDownTanggal.removeAllItems();
        DropDownStudio.removeAllItems();
        DropDownWaktu.removeAllItems();
        DropDownFilm.removeAllItems();
        tiketDewasa.setText("");
        lblFilm.setIcon(null);
        lblNama.setText("");
        lblTayang.setText("");
        lblWaktu.setText("");
        lblStudio.setText("");
        lblJumlah.setText("");
        lblHarga.setText("");
        //clearTextSet();
        AddBtn.setEnabled(true);
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        int jumlah = 0;
        int selectedIndex = DropDownFilm.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex);

        int selectedIndex2 = DropDownStudio.getSelectedIndex();
        Studio selectedStudio = listStudio.get(selectedIndex2);
        System.out.println(selectedStudio.getId());

        int selectedIndex3 = DropDownTanggal.getSelectedIndex();
        Jadwal selectedJadwal = listJadwal.get(selectedIndex3);

        int selected = DropDownWaktu.getSelectedIndex();
        String selectedWaktu = listWaktu.get(selected);

        try{
            Tiket t = new Tiket();
            t.setFilm(selectedFilm);
            t.setJadwal(selectedJadwal);
            t.setStudio(selectedStudio);
            System.out.println(selectedWaktu);

            int temp = tC.getKursi( selectedStudio.getId(), selectedFilm.getId(), selectedJadwal.getDate(),selectedWaktu);

            if(tiketDewasa.getText().isEmpty()){
                throw new EmptyInputException();
            }else{
                jumlah = (Integer.parseInt(tiketDewasa.getText()));
                if(temp - jumlah <0){
                    
                   JOptionPane.showMessageDialog(null, "Jumlah Kursi Sudah Habis", "Error", JOptionPane.ERROR_MESSAGE); 

                    return;
                }
            }

            t.setTiket(jumlah);
            System.out.println();
            t.setTime(selectedWaktu);
            tC.insertTiket(t);
            tC.updateKursi(t, temp);
            lblNama.setText(selectedFilm.getTitle());
            lblTayang.setText(selectedJadwal.getDate().toString());
            lblWaktu.setText(selectedWaktu);
            lblStudio.setText(selectedStudio.getNama());
            lblJumlah.setText(tiketDewasa.getText());
            lblHarga.setText(Double.toString(jumlah*40000));

            tiketDewasa.setText("");
            DropDownTanggal.removeAllItems();
            DropDownStudio.removeAllItems();
            DropDownWaktu.removeAllItems();
            DropDownFilm.removeAllItems();
            tiketDewasa.setText("");
            lblFilm.setIcon(null);
            //clearTextSet();
            AddBtn.setEnabled(true);
        }catch(EmptyInputException e) {
            e.showMessage();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Inputan Jumlah Tiket Harus Berupa Angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void tiketDewasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiketDewasaActionPerformed

    }//GEN-LAST:event_tiketDewasaActionPerformed

    private void DropDownStudioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DropDownStudioItemStateChanged

    }//GEN-LAST:event_DropDownStudioItemStateChanged

    private void DropDownStudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownStudioActionPerformed
        DropDownWaktu.removeAllItems();

        if(DropDownFilm.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex = DropDownFilm.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex);

        if(DropDownTanggal.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex2 = DropDownTanggal.getSelectedIndex();
        Jadwal selectedTanggal = listJadwal.get(selectedIndex2);

        if(DropDownStudio.getSelectedIndex() == -1){
            return;
        }
        Studio selectedStudio = (Studio) DropDownStudio.getSelectedItem();

        try {
            System.out.println(selectedFilm.getId() +" "+ selectedStudio.getId() + " " +selectedTanggal.getDate());
            setTimeToDropdown(selectedFilm.getId(),selectedStudio.getId() ,selectedTanggal.getDate());
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DropDownStudioActionPerformed

    private void DropDownStudioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DropDownStudioPropertyChange
        DropDownWaktu.removeAllItems();

        if(DropDownFilm.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex = DropDownFilm.getSelectedIndex();
        Film selectedFilm = listFilm.get(selectedIndex);

        if(DropDownTanggal.getSelectedIndex() == -1){
            return;
        }

        int selectedIndex2 = DropDownTanggal.getSelectedIndex();
        Jadwal selectedTanggal = listJadwal.get(selectedIndex2);

        if(DropDownStudio.getSelectedIndex() == -1){
            return;
        }
        Studio selectedStudio = (Studio) DropDownStudio.getSelectedItem();

        try {
            System.out.println(selectedFilm.getId() +" "+ selectedStudio.getId() + " " +selectedTanggal.getDate());
            setTimeToDropdown(selectedFilm.getId(),selectedStudio.getId() ,selectedTanggal.getDate());
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DropDownStudioPropertyChange

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
            java.util.logging.Logger.getLogger(TransaksiTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TransaksiTiket().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
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
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel Cinema22;
    private javax.swing.JComboBox<Film> DropDownFilm;
    private javax.swing.JComboBox<Studio> DropDownStudio;
    private javax.swing.JComboBox<Jadwal> DropDownTanggal;
    private javax.swing.JComboBox<String> DropDownWaktu;
    private javax.swing.JLabel HelloAdmin;
    private javax.swing.JLabel JumlahTiketLabel;
    private javax.swing.JSeparator LineTitle;
    private javax.swing.JLabel LogOutSimbol;
    private javax.swing.JLabel Logo22;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel TiketLabel;
    private javax.swing.JLabel UserSimbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lblFilm;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblStudio;
    private javax.swing.JLabel lblTayang;
    private javax.swing.JLabel lblWaktu;
    private javax.swing.JTextField tiketDewasa;
    // End of variables declaration//GEN-END:variables
}
