/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.studioDAO;
import Entity.Film;
import Entity.Studio;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author M S I
 */
public class studioControl {
    private studioDAO sDao = new studioDAO();
    
    public List<Studio> showListStudio(){
        return sDao.getAllStudio();
    }
    
    public void insertStudio (Studio s){
        sDao.addStudio(s);
    }
    
    public void editStudio(Studio s){
        sDao.editStudio(s);
    }
    
    public void deleteStudio(int i){
        sDao.deleteStudio(i);
    }
    
}
