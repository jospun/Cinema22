package DAO;

import Entity.Studio;
import Connection.DbConnection;
import Entity.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class studioDAO {
    private DbConnection dbCon = new DbConnection();
    public void addStudio(Studio studio) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "INSERT INTO studio (nomor_studio, kapsitas, jenis_studio) VALUES (?, ?, ?)")) {
            statement.setString(1, studio.getNama());
            statement.setInt(2, studio.getKapasitas());
            statement.setString(3, studio.getJenis());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void editStudio(Studio studio) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "UPDATE `studio` SET nomor_studio = ?,kapsitas=?, jenis_studio=? where id = ?")) {
            statement.setString(1, studio.getNama());
            statement.setInt(2, studio.getKapasitas());
            statement.setString(3, studio.getJenis());
            statement.setInt(4, studio.getStudio().getId());
            statement.executeUpdate();
            System.out.println("Berhasil Update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void deleteStudio(int id) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("DELETE FROM studio WHERE id=?")) {
            statement.setInt(1, id);

            statement.executeUpdate();
            System.out.println("Deleting Data...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Studio> getAllStudio() {
        List<Studio> studio = new ArrayList<>();
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("SELECT * FROM studio")) {
            System.out.println("Mengambil Data Studio....");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Studio studios = createStudioFromResultSet(resultSet);
                studio.add(studios);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studio;
    }
    
    private Studio createStudioFromResultSet(ResultSet resultSet) throws SQLException {
        Studio movie = new Studio();
        movie.setId(resultSet.getInt("id"));
        movie.setNama(resultSet.getString("nomor_studio"));
        movie.setJenis(resultSet.getString("jenis_studio"));
        movie.setKapasitas(resultSet.getInt("kapsitas"));
        return movie;
    }
    
    public List<Date> showTanggal() {
    List<Date> dateList = new ArrayList<>();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    try (Connection con = dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement("SELECT * FROM studio");
         ResultSet resultSet = statement.executeQuery()) {
        

        while (resultSet.next()) {
            Calendar currentDate = (Calendar) resultSet.getDate("start_date").clone();

            while (currentDate.before(resultSet.getDate("end_date"))) {
                Date currentDateAsDate = (Date) currentDate.getTime();
                dateList.add(currentDateAsDate);

                currentDate.add(Calendar.DATE, 1);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return dateList;
}
}
