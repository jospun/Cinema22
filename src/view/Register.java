/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.userControl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entity.User;
import Exception.EmptyInputException;
import java.util.*;

public class Register extends javax.swing.JFrame {
    private int xMouse, yMouse;
    
    private userControl uC;
    
    public Register() {
        initComponents();
        uC = new userControl();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        Background = new keeptoo.KGradientPanel();
        PanelSignIn = new javax.swing.JPanel();
        ButtonSignUp = new keeptoo.KGradientPanel();
        HelloLogin3 = new javax.swing.JLabel();
        SignUpLine = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TitleUsername = new javax.swing.JLabel();
        InputUsernameRegister = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        TitlePassword = new javax.swing.JLabel();
        InputPasswordRegister = new javax.swing.JTextField();
        ButtonSignIn = new keeptoo.KGradientPanel();
        HelloLogin5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        KonfirmasiPassword = new javax.swing.JLabel();
        InputKonfirmasiRegister = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TitleEmail = new javax.swing.JLabel();
        InputEmailRegister = new javax.swing.JTextField();
        HelloLogin8 = new javax.swing.JLabel();
        Brand = new javax.swing.JLabel();
        TagLine = new javax.swing.JLabel();
        box1 = new viewSwing.Box();
        TagLine2 = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        PanelLogin.setBackground(new java.awt.Color(0, 0, 0));
        PanelLogin.setForeground(new java.awt.Color(255, 255, 255));
        PanelLogin.setPreferredSize(new java.awt.Dimension(800, 500));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setkEndColor(new java.awt.Color(0, 204, 204));
        Background.setkGradientFocus(2000);
        Background.setkStartColor(new java.awt.Color(54, 33, 89));
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

        PanelSignIn.setBackground(new java.awt.Color(255, 255, 255));
        PanelSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonSignUp.setkEndColor(new java.awt.Color(204, 0, 204));
        ButtonSignUp.setkGradientFocus(200);
        ButtonSignUp.setkStartColor(new java.awt.Color(0, 204, 204));
        ButtonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSignUpMouseClicked(evt);
            }
        });

        HelloLogin3.setBackground(new java.awt.Color(255, 255, 255));
        HelloLogin3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HelloLogin3.setForeground(new java.awt.Color(255, 255, 255));
        HelloLogin3.setText("Sign Up");

        javax.swing.GroupLayout ButtonSignUpLayout = new javax.swing.GroupLayout(ButtonSignUp);
        ButtonSignUp.setLayout(ButtonSignUpLayout);
        ButtonSignUpLayout.setHorizontalGroup(
            ButtonSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSignUpLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(HelloLogin3)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        ButtonSignUpLayout.setVerticalGroup(
            ButtonSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelloLogin3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSignIn.add(ButtonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, 40));

        SignUpLine.setBackground(new java.awt.Color(255, 255, 255));
        SignUpLine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpLine.setForeground(new java.awt.Color(0, 153, 153));
        SignUpLine.setText("Already have an account?");
        PanelSignIn.add(SignUpLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TitleUsername.setBackground(new java.awt.Color(255, 255, 255));
        TitleUsername.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TitleUsername.setForeground(new java.awt.Color(0, 153, 153));
        TitleUsername.setText("Username");

        InputUsernameRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputUsernameRegister.setForeground(new java.awt.Color(102, 102, 102));
        InputUsernameRegister.setAlignmentX(1.5F);
        InputUsernameRegister.setAlignmentY(1.5F);
        InputUsernameRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        InputUsernameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TitleUsername)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(InputUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TitleUsername)
                .addGap(18, 18, 18)
                .addComponent(InputUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSignIn.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        TitlePassword.setBackground(new java.awt.Color(255, 255, 255));
        TitlePassword.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TitlePassword.setForeground(new java.awt.Color(0, 153, 153));
        TitlePassword.setText("Password");

        InputPasswordRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputPasswordRegister.setForeground(new java.awt.Color(102, 102, 102));
        InputPasswordRegister.setAlignmentX(1.5F);
        InputPasswordRegister.setAlignmentY(1.5F);
        InputPasswordRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        InputPasswordRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPasswordRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePassword)
                    .addComponent(InputPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TitlePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(InputPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelSignIn.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 60));

        ButtonSignIn.setkEndColor(new java.awt.Color(255, 153, 0));
        ButtonSignIn.setkGradientFocus(200);
        ButtonSignIn.setkStartColor(new java.awt.Color(0, 204, 204));
        ButtonSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSignInMouseClicked(evt);
            }
        });

        HelloLogin5.setBackground(new java.awt.Color(255, 255, 255));
        HelloLogin5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HelloLogin5.setForeground(new java.awt.Color(255, 255, 255));
        HelloLogin5.setText("Sign In");

        javax.swing.GroupLayout ButtonSignInLayout = new javax.swing.GroupLayout(ButtonSignIn);
        ButtonSignIn.setLayout(ButtonSignInLayout);
        ButtonSignInLayout.setHorizontalGroup(
            ButtonSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSignInLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(HelloLogin5)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        ButtonSignInLayout.setVerticalGroup(
            ButtonSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSignInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelloLogin5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSignIn.add(ButtonSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        KonfirmasiPassword.setBackground(new java.awt.Color(255, 255, 255));
        KonfirmasiPassword.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        KonfirmasiPassword.setForeground(new java.awt.Color(0, 153, 153));
        KonfirmasiPassword.setText("Konfirmasi Password");

        InputKonfirmasiRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputKonfirmasiRegister.setForeground(new java.awt.Color(102, 102, 102));
        InputKonfirmasiRegister.setAlignmentX(1.5F);
        InputKonfirmasiRegister.setAlignmentY(1.5F);
        InputKonfirmasiRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        InputKonfirmasiRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputKonfirmasiRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(KonfirmasiPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputKonfirmasiRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(KonfirmasiPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputKonfirmasiRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelSignIn.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        TitleEmail.setBackground(new java.awt.Color(255, 255, 255));
        TitleEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TitleEmail.setForeground(new java.awt.Color(0, 153, 153));
        TitleEmail.setText("Email");

        InputEmailRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputEmailRegister.setForeground(new java.awt.Color(102, 102, 102));
        InputEmailRegister.setAlignmentX(1.5F);
        InputEmailRegister.setAlignmentY(1.5F);
        InputEmailRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        InputEmailRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmailRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(TitleEmail)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(InputEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(TitleEmail)
                .addGap(18, 18, 18)
                .addComponent(InputEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSignIn.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 60));

        HelloLogin8.setBackground(new java.awt.Color(255, 255, 255));
        HelloLogin8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HelloLogin8.setForeground(new java.awt.Color(0, 153, 153));
        HelloLogin8.setText("SIGN UP TO CINEMA 22");
        PanelSignIn.add(HelloLogin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 20, 210, -1));

        Brand.setBackground(new java.awt.Color(255, 255, 255));
        Brand.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Brand.setForeground(new java.awt.Color(255, 255, 255));
        Brand.setText("CINEMA 22");

        TagLine.setBackground(new java.awt.Color(255, 255, 255));
        TagLine.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        TagLine.setForeground(new java.awt.Color(255, 255, 255));
        TagLine.setText("<html>  WATCH AND DON'T MISS IT <br> SHOW YOUR FAVORITE MOVIE");

        box1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/CinemaElement.png"))); // NOI18N

        TagLine2.setBackground(new java.awt.Color(255, 255, 255));
        TagLine2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        TagLine2.setForeground(new java.awt.Color(255, 255, 255));
        TagLine2.setText("NOW!");
        box1.add(TagLine2);
        TagLine2.setBounds(60, 0, 130, 64);

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Exit Button (White).png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Brand))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TagLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(PanelSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brand)
                .addGap(60, 60, 60)
                .addComponent(TagLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        PanelLogin.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y-yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void InputUsernameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameRegisterActionPerformed

    }//GEN-LAST:event_InputUsernameRegisterActionPerformed

    private void ButtonSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSignUpMouseClicked
        if(InputKonfirmasiRegister.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak Boleh Ada Inputan Yang Kosong!");
        }else if(uC.uniqueUser(InputUsernameRegister.getText(),InputEmailRegister.getText())) {
            JOptionPane.showMessageDialog(this, "Username Atau Email Telah Terpakai!");
        }else {
            
            try{
                if(InputKonfirmasiRegister.getText().equalsIgnoreCase(InputPasswordRegister.getText()) && InputEmailRegister.getText().contains("@")){
                    User us =  new User(InputUsernameRegister.getText(), InputKonfirmasiRegister.getText(), InputEmailRegister.getText());
                    uC.insertUser(us);
                    JOptionPane.showMessageDialog(this, "Berhasil Buat Akun!");
                    
                    Login11 login = new Login11();
                    this.dispose();
                    login.setVisible(true);
                }else if(!InputEmailRegister.getText().contains("@")){
                    JOptionPane.showMessageDialog(this, "Email Invalid!");
                }else{
                    JOptionPane.showMessageDialog(this, "Password Dan Konfirmasi Berbeda!");
                }    
            }catch(EmptyInputException e){
                e.showMessage();
            }
            
        }  
    }//GEN-LAST:event_ButtonSignUpMouseClicked

    private void ButtonSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSignInMouseClicked
        Login11 login = new Login11();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_ButtonSignInMouseClicked

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void InputEmailRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmailRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEmailRegisterActionPerformed

    private void InputPasswordRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPasswordRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPasswordRegisterActionPerformed

    private void InputKonfirmasiRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputKonfirmasiRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputKonfirmasiRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Register().setVisible(true);
            }
            
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Background;
    private javax.swing.JLabel Brand;
    private javax.swing.JLabel ButtonExit;
    private keeptoo.KGradientPanel ButtonSignIn;
    private keeptoo.KGradientPanel ButtonSignUp;
    private javax.swing.JLabel HelloLogin3;
    private javax.swing.JLabel HelloLogin5;
    private javax.swing.JLabel HelloLogin8;
    private javax.swing.JTextField InputEmailRegister;
    private javax.swing.JTextField InputKonfirmasiRegister;
    private javax.swing.JTextField InputPasswordRegister;
    private javax.swing.JTextField InputUsernameRegister;
    private javax.swing.JLabel KonfirmasiPassword;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelSignIn;
    private javax.swing.JLabel SignUpLine;
    private javax.swing.JLabel TagLine;
    private javax.swing.JLabel TagLine2;
    private javax.swing.JLabel TitleEmail;
    private javax.swing.JLabel TitlePassword;
    private javax.swing.JLabel TitleUsername;
    private viewSwing.Box box1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
