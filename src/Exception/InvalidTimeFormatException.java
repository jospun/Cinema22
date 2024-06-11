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
public class InvalidTimeFormatException extends Exception {
    
    public InvalidTimeFormatException() {
        super();
    }
    
    public static boolean isValidTimeFormat(String timeStr) {
        String[] timePairs = timeStr.split(",");

        for (String pair : timePairs) {
            String[] timeParts = pair.split(":");
            if (timeParts.length != 2) {
                return false;
            }

            try {
                int hours = Integer.parseInt(timeParts[0]);
                int minutes = Integer.parseInt(timeParts[1]);

                if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                    return false;
                }

                if (timeParts[0].length() != 2 || timeParts[1].length() != 2) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

   public void showMessage(){
    JOptionPane.showMessageDialog(null, "Waktu Invalid", "Error", JOptionPane.ERROR_MESSAGE); 
   }
  
    
}


    
