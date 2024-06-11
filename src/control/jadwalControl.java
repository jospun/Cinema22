/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.jadwalDAO;
import Entity.Film;
import Entity.Jadwal;
import Entity.Studio;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import table.jadwalTable;

/**
 *
 * @author M S I
 */
public class jadwalControl {
    private jadwalDAO jDao = new jadwalDAO();
         
    public void inputJadwal(Jadwal j) throws SQLException{
        jDao.inputJadwal(j);
    }
    
    public List<Studio> showStudiobyTanggal(Date tanggal){
        return jDao.showStudiobyJadwal(tanggal);
    }
    
    public List<Film> showFilmbyTanggal(Date tanggal){
        return jDao.showFilmbyJadwal(tanggal);
    }
    
    public List<Studio> allAvailStudio(Date tanggal){
        return jDao.getAvailableStudios(tanggal);
    }
    
    public void deleteJadwal(Date tanggal, int id_film, int id_studio, String time) throws SQLException{
        jDao.deleteJadwal(tanggal, id_film, id_studio, time);
    }
    
    public jadwalTable showJadwal(Date tanggal){
        List<Jadwal> jadwal = jDao.showJadwalTable(tanggal);
        jadwalTable tableJadwal = new jadwalTable(jadwal);
        
        return tableJadwal;
    }
}
