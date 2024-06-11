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

public class Slide1 extends javax.swing.JPanel {
    private filmControl fC;
    List<Film> listFilm = null;
    
    public Slide1() throws IOException {
        initComponents();
        System.out.println("1");
        fC = new filmControl();
        System.out.println("1");
        listFilm = fC.showListFilm();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        String path = new File(".").getCanonicalPath();
        Image image = toolkit.getImage(path + "/image/" + listFilm.get(4).getImageFileName().toString());
        Image imagedResized = image.getScaledInstance(270, 385, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(imagedResized);
        lblFilm.setIcon(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilm = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFilm;
    // End of variables declaration//GEN-END:variables
}
