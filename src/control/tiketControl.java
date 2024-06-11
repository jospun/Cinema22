/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.tiketDAO;
import Entity.Jadwal;
import Entity.Studio;
import Entity.Tiket;
import Entity.User;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import table.tiketTable;

public class tiketControl {
    private tiketDAO tDao = new tiketDAO();
    
    public List<Jadwal>showJadwal(int id){
        return tDao.showJadwalbyFilm(id);
        
    }
    
    public List<String> showWaktu(int id, int film, Date tanggal) throws SQLException{
        return tDao.showWaktu(id, film, (java.sql.Date) tanggal);
    }
    
    public List<String> showOneWaktu(int id, int film, Date tanggal) throws SQLException{
        return tDao.showWaktu(id, film, (java.sql.Date) tanggal);
    }
    
    public void insertTiket(Tiket t){
        tDao.inputTiket(t);
    }
    
    public void updateKursi(Tiket t, int temp){
        tDao.updateKursi(t, temp);
    }
    
    public List<Studio> showStudio(int id,Date tanggal){
        return tDao.showStudiobyFilm(id, (java.sql.Date) tanggal);
    }
    
    public List<Jadwal>showAllJadwal(){
        return tDao.showJadwal();
    }
    
    public tiketTable showTiket(){
        List<Tiket> tiket = tDao.showTiket();
        tiketTable tableTiket = new tiketTable(tiket);
        
        return tableTiket;
    }
    
     public tiketTable showTiketbySearch(String query) throws SQLException{
        List<Tiket> tiket = tDao.showTiketbySearch(query);
        tiketTable tableTiket = new tiketTable(tiket);
        
        return tableTiket;
    }
    
    public int getKursi(int id, int film, Date tanggal, String time){
        return tDao.getKursi(id, film, (java.sql.Date) tanggal, time);
    }
    
    public int getTiket(int id_studio, int id_film, Date tanggal, String time) {
    return tDao.getTiket(id_studio, id_film, new java.sql.Date(tanggal.getTime()), time);
}
     
}
