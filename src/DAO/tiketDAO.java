/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.DbConnection;
import Entity.Film;
import Entity.Jadwal;
import Entity.Studio;
import Entity.Tiket;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import static java.awt.AWTEventMulticaster.add;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tiketDAO {
    private DbConnection dbCon = new DbConnection();
    
    public void inputTiket(Tiket t){
        try (java.sql.Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
             "INSERT INTO tiket (id_studio, id_film, tanggal, jumlah_tiket, time, harga) VALUES (?, ?, ?, ?, ?, ?)")) {      
            java.sql.Date sqlDate = new java.sql.Date(t.getJadwal().getDate().getTime());
            statement.setInt(1, t.getStudio().getId());
            statement.setInt(2, t.getFilm().getId());
            statement.setDate(3, sqlDate);
            statement.setInt(4, t.getTiket());
            statement.setString(5, t.getTime());
            statement.setDouble(6, t.getTiket() * 40000);
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateKursi(Tiket t, int temp){
        try (java.sql.Connection con = dbCon.makeConnection();
            PreparedStatement statement = con.prepareStatement(
            "UPDATE jadwal SET kursi = ? WHERE id_studio = ? and  id_film =? and jadwal = ? and time = ?")) {
            java.sql.Date sqlDate = new java.sql.Date(t.getJadwal().getDate().getTime());
            int sisa = temp - t.getTiket();
            statement.setInt(1, sisa);
            statement.setInt(2, t.getStudio().getId());
            statement.setInt(3, t.getFilm().getId());
            statement.setDate(4, sqlDate);
            statement.setString(5, t.getTime());
            
            statement.executeUpdate();
            System.out.println("Data Berhasil Diupdate");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Studio> showStudiobyFilm(int temp, Date tanggal) {
        List<Studio> stud = new ArrayList<>();
        try (java.sql.Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "SELECT DISTINCT s.* FROM jadwal AS j " +
                     "JOIN film AS f ON j.id_film = f.id " +
                     "JOIN studio AS s ON j.id_studio = s.id " +
                     "WHERE f.id = " + temp +" AND j.jadwal = ?")) {
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            statement.setString(1,dateFormat.format(tanggal));

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Studio s = new Studio();
                    s.setId(rs.getInt("id"));
                    s.setNama(rs.getString("nomor_studio"));
                    System.out.println(s.getId());
                    stud.add(s);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stud;
    }
    
    public List<String> showWaktu(int id, int film, Date tanggal) throws SQLException{
        List<String> str = new ArrayList<>();
        try (java.sql.Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "SELECT DISTINCT f.*, j.*, s.* FROM jadwal AS j " +
                     "JOIN film AS f ON j.id_film = f.id " +
                     "JOIN studio AS s ON j.id_studio = s.id " +
                     "WHERE f.id = " + id +" AND j.jadwal = ? AND s.id = "+ film)) {
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            statement.setString(1,dateFormat.format(tanggal));
            
            try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                
                    str.add(rs.getString("time"));
                
            }
          }
        }
        return str;
    }
    

    
   
    
     private Studio createStudioFromResultSet(ResultSet resultSet) throws SQLException {
        Studio movie = new Studio();
        movie.setId(resultSet.getInt("id"));
        movie.setNama(resultSet.getString("nomor_studio"));
        movie.setJenis(resultSet.getString("jenis_studio"));
        movie.setKapasitas(resultSet.getInt("kapsitas"));
        return movie;
    }
    
   public List<Jadwal>showJadwalbyFilm(int temp){
        List<Jadwal> ja = new ArrayList<>();
        Set<Date> uniqueTimes = new HashSet<>();
         try (Connection con = (Connection) dbCon.makeConnection(); 
             PreparedStatement statement = con.prepareStatement("SELECT f.*, j.* FROM jadwal as j JOIN film as f ON "
                     + "(j.id_film = f.id) WHERE f.id = "+ temp )) {
             
             ResultSet rs = statement.executeQuery();
             
             if(rs != null){
                 while (rs.next() ) {
                    Film f = new Film();
                    f.setId(rs.getInt("id_film"));
                    f.setTitle(rs.getString("title"));

                    Studio s = new Studio();
                    s.setId(rs.getInt("id_studio"));

                    Jadwal j = new Jadwal();
                    j.setFilm(f);
                    j.setStudio(s);
                    j.setDate(rs.getDate("jadwal"));
                    j.setTime(rs.getString("time"));
                    j.setKursi(rs.getInt("kursi"));
                    
                    Date time = (Date) j.getDate(); // Mendapatkan waktu dari Jadwal

                    // Memeriksa apakah waktu sudah ada dalam Set uniqueTimes
                    if (uniqueTimes.contains(time)) {
                    } else {
                        uniqueTimes.add(time); // Menambahkan waktu ke Set uniqueTimes
                        ja.add(j); // Menambahkan Jadwal ke daftar ja
                     }
               }
             }
             
         } catch (SQLException e) {
            e.printStackTrace();
        }
         return ja;
    }
    
    public List<Jadwal>showJadwal(){
        List<Jadwal> j = new ArrayList<>();
         try (Connection con = (Connection) dbCon.makeConnection(); 
             PreparedStatement statement = con.prepareStatement("SELECT * FROM jadwal ")) {
             
             ResultSet resultSet = statement.executeQuery();
             
             if(resultSet != null){
                 while (resultSet.next() ) {
                    Film f = new Film();
                    f.setId(resultSet.getInt("id_film"));
                    
                    Jadwal ja = new Jadwal();
                    ja.setDate(resultSet.getDate("jadwal"));
                    ja.setFilm(f);
                   j.add(ja);
               }
             }
             
         } catch (SQLException e) {
            e.printStackTrace();
        }
         return j;
    }
    
      public List<Jadwal> showJadwalTable(java.util.Date tanggal){
        List<Jadwal> listOfJadwal=new ArrayList();
         
        try(java.sql.Connection con = dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement("select s.*, f.*, j.* from jadwal as j JOIN film as f"
                 + " on f.id = j.id_film join studio as s on s.id = j.id_studio where j.jadwal = ?")){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            statement.setString(1, dateFormat.format(tanggal));
            System.out.println("Mengambil Data Jadwal...");
            ResultSet rs=statement.executeQuery();
         
        if(rs != null){
            while(rs.next()){
                Film f = new Film();
                f.setId(rs.getInt("id"));
                f.setTitle(rs.getString("title"));
                
                Studio s = new Studio();
                s.setId(rs.getInt("id"));
                s.setNama(rs.getString("nomor_studio"));
                
                Jadwal j = new Jadwal();
                j.setFilm(f);
                j.setStudio(s);
                j.setTime(rs.getString("time"));
                j.setKursi(rs.getInt("kursi"));
                
                listOfJadwal.add(j);
            }
        }
        
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return listOfJadwal;
    }   
    
    public List<Tiket >showTiket(){
        List<Tiket> T = new ArrayList<>();
      
         try (Connection con = (Connection) dbCon.makeConnection(); 
             PreparedStatement statement = con.prepareStatement("SELECT DISTINCT t.*,s.nomor_studio, f.title  FROM tiket  as t join studio s "
                   + "on t.id_studio = s.id join film f on t.id_film = f.id")){;
             
             ResultSet resultSet = statement.executeQuery();
             
             if(resultSet != null){
                 while (resultSet.next() ) {
                 
                Film f = new Film();
                f.setId(resultSet.getInt("id_film"));
                f.setTitle(resultSet.getString("title"));
                
                Studio s = new Studio();
                s.setId(resultSet.getInt("id_studio"));
                s.setNama(resultSet.getString("nomor_studio"));
                
                Jadwal j = new Jadwal();
                j.setTime(resultSet.getString("time"));
                
                Tiket t = new Tiket();
                t.setId(resultSet.getInt("id"));
                t.setDate(resultSet.getDate("tanggal"));
                t.setTiket(resultSet.getInt("jumlah_tiket"));
                t.setTime(resultSet.getString("time"));
                t.setHarga(resultSet.getDouble("harga"));
                
                t.setFilm(f);
                t.setJadwal(j);
                t.setStudio(s);
                T.add(t);
                   
                    
               }
             }
             
         } catch (SQLException e) {
            e.printStackTrace();
        }
         return T;
    }
    
    public List<Tiket >showTiketbySearch(String query) throws SQLException{
        List<Tiket> T = new ArrayList<>();
         try (Connection con = (Connection) dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement("SELECT t.*, f.title FROM tiket t JOIN film f ON "
                 + "t.id_film = f.id WHERE t.id = ? OR f.title LIKE ? OR t.tanggal = ?")) {
            statement.setString(1, query);
            statement.setString(2, "%" + query + "%");
            statement.setString(3, query);


             ResultSet resultSet = statement.executeQuery();
             
             if(resultSet != null){
                 while (resultSet.next() ) {
                 
                Film f = new Film();
                f.setId(resultSet.getInt("id_film"));
                f.setTitle(resultSet.getString("title"));
                
                Jadwal j = new Jadwal();
                j.setTime(resultSet.getString("time"));
                
                Tiket t = new Tiket();
                t.setId(resultSet.getInt("id"));
                t.setDate(resultSet.getDate("tanggal"));
                t.setTiket(resultSet.getInt("jumlah_tiket"));
                t.setTime(resultSet.getString("time"));
                t.setHarga(resultSet.getDouble("harga"));
                
                t.setFilm(f);
                t.setJadwal(j);
                T.add(t);
                   
                    
               }
             }
             
         } catch (SQLException e) {
            e.printStackTrace();
        }
         return T;
    }
    
    private Jadwal createJadwalFromResultSet(ResultSet resultSet) throws SQLException {
        Jadwal j = new Jadwal();
//        j(resultSet.getInt("id_film"));
        j.setDate(resultSet.getDate("jadwal"));
        return j;
    }
    
    public int getKursi(int id, int film, Date tanggal, String time){
        int kursi=0;
        
        try (Connection con = (Connection) dbCon.makeConnection();
            PreparedStatement statement = con.prepareStatement(
            "select kursi from jadwal WHERE id_studio = ? and  id_film =? and jadwal = ? and time = ?")) {
            statement.setInt(1, id);
            statement.setInt(2, film);
            statement.setDate(3, tanggal);
            statement.setString(4, time);
            
             ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
            kursi = resultSet.getInt("kursi");
            }
            return kursi;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kursi;
    }
    
    public int getTiket(int id_studio, int id_film, Date tanggal, String time) {
    int tiket = 0;
    
    try (java.sql.Connection con = dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement(
         "SELECT COUNT(*) FROM tiket WHERE tiket.id_studio = ? AND tiket.id_film = ? AND tiket.time = ? AND DATE(tiket.tanggal) = ?")) {
        
        statement.setInt(1, id_studio);
        statement.setInt(2, id_film);
        statement.setString(3, time);
        statement.setDate(4, tanggal);
        
        ResultSet resultSet = statement.executeQuery();
        
        if (resultSet.next()) {
            tiket = resultSet.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return tiket;
}

}
