/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.DbConnection;
import Entity.Film;
import Entity.Jadwal;
import DAO.studioDAO;
import DAO.filmDAO;
import Entity.Studio;
import static java.awt.AWTEventMulticaster.add;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author M S I
 */
public class jadwalDAO {
    
    private DbConnection dbCon = new DbConnection();
    
    public void inputJadwal(Jadwal J) throws SQLException {
        

        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                "INSERT INTO jadwal (jadwal, id_studio, id_film, time, kursi) VALUES (?,?,?,?,?)")) {
                java.sql.Date sqlDate = new java.sql.Date(J.getDate().getTime());
                
                statement.setDate(1, sqlDate);
                statement.setInt(2, J.getStudio().getId());
                statement.setInt(3, J.getFilm().getId());
                statement.setString(4, J.getTime());
                statement.setInt(5, J.getStudio().getKapasitas());

                statement.executeUpdate();
                System.out.println("Updating Jadwal Success");
                }            
    }
    
    public void deleteJadwal(Date tanggal, int id_film, int id_studio, String time) throws SQLException {
        
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                "DELETE FROM jadwal where jadwal = ? AND id_film = ? AND id_studio = ? AND time = ?")) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                statement.setString(1, dateFormat.format(tanggal));
                statement.setInt(2, id_film);
                statement.setInt(3, id_studio);
                statement.setString(4, time);
                
                statement.executeUpdate();
                System.out.println("Deleting Jadwal Success");
                
            } catch (SQLException e) {
            e.printStackTrace();
        }            
    }
    
    public List<Studio>getAvailableStudios(Date tanggal) {
        List<Studio> availableStudios = new ArrayList<>();

        try (Connection con = dbCon.makeConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM studio WHERE id NOT IN (SELECT id_studio FROM jadwal WHERE jadwal = ?)")) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            statement.setString(1, dateFormat.format(tanggal));

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Studio studio = createStudioFromResultSet(resultSet);
                availableStudios.add(studio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return availableStudios;
    }


    
    public List<Studio> showStudiobyJadwal(Date tanggal){
        List<Studio> studio = new ArrayList<>();
        Set<String> uniqueStudio = new HashSet<>();
         try (Connection con = dbCon.makeConnection(); 
             PreparedStatement statement = con.prepareStatement("SELECT DISTINCT s.*, j.* FROM jadwal as j join studio as s on (j.id_studio = s.id) WHERE j.jadwal = ?")) {
             
             DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             statement.setString(1, dateFormat.format(tanggal));
             
             ResultSet resultSet = statement.executeQuery();
             
             while (resultSet.next()) {
                Studio studios = createStudioFromResultSet(resultSet);
                String stud = studios.getNama();
                if(uniqueStudio.contains(stud)){
                }else{
                    uniqueStudio.add(stud);
                    studio.add(studios);
                }
            }
         } catch (SQLException e) {
            e.printStackTrace();
        }
         
        return studio;
    }
    
    public List<Film> showFilmbyJadwal(Date tanggal){
        List<Film> film = new ArrayList<>();
        Set<String> uniqueFilm = new HashSet<>();
         try (Connection con = dbCon.makeConnection(); 
             PreparedStatement statement = con.prepareStatement("SELECT f.*, j.* FROM jadwal as j join film as f on (j.id_film = f.id) WHERE j.jadwal = ?")) {
             
             DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             statement.setString(1, dateFormat.format(tanggal));
             
             ResultSet resultSet = statement.executeQuery();
             
             while (resultSet.next()) {
                Film films = createMovieFromResultSet(resultSet);
                String title = films.getTitle();
                if(uniqueFilm.contains(title)){
                }else{
                    uniqueFilm.add(title);
                    film.add(films);
                }
            }
         } catch (SQLException e) {
            e.printStackTrace();
        }
         
        return film;
    }
    
    private Studio createStudioFromResultSet(ResultSet resultSet) throws SQLException {
        Studio movie = new Studio();
        movie.setId(resultSet.getInt("id"));
        movie.setNama(resultSet.getString("nomor_studio"));
        movie.setJenis(resultSet.getString("jenis_studio"));
        movie.setKapasitas(resultSet.getInt("kapsitas"));
        return movie;
    }
    
    private Film createMovieFromResultSet(ResultSet resultSet) throws SQLException {
        Film movie = new Film();
        movie.setId(resultSet.getInt("id"));
        movie.setTitle(resultSet.getString("title"));
        movie.setGenre(resultSet.getString("genre"));
        movie.setPenulis(resultSet.getString("penulis"));
        movie.setDistributor(resultSet.getString("distributor"));
        movie.setImageFileName(resultSet.getString("image"));
        return movie;
    }
    
    public List<Jadwal> showJadwalTable(Date tanggal){
        List<Jadwal> listOfJadwal=new ArrayList();
         
        try(Connection con = dbCon.makeConnection();
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

    private void add(Jadwal j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
