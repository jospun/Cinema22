/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Entity.Film;
import control.filmControl;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Vriyas
 */
public class Slide4 extends javax.swing.JPanel {

    private filmControl fC;
    List<Film> listFilm = null;
    
    public Slide4() throws IOException {
        initComponents();
        fC = new filmControl();
        listFilm = fC.showListFilm();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        String path = new File(".").getCanonicalPath();
        Image image = toolkit.getImage(path + "/image/" + listFilm.get(1).getImageFileName().toString());
        Image imagedResized = image.getScaledInstance(270, 385, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(imagedResized);
        lblFilm.setIcon(icon);
        System.out.println("4");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilm = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFilm;
    // End of variables declaration//GEN-END:variables
}
