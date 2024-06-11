/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EmptyInputException extends Exception {
    
    public void showMessage(){
     JOptionPane.showMessageDialog(null, "Tidak Boleh Ada Inputan Yang Kosong", "Error", JOptionPane.ERROR_MESSAGE); 
    }
    
    public static boolean isEmpty(String Str) {
        if(Str.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
}
