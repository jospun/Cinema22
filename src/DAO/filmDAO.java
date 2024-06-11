/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Film;
import Connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class filmDAO{
 private DbConnection dbCon = new DbConnection();
    private Connection con;
    public void addMovie(Film movie) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "INSERT INTO film (title, genre, penulis, distributor, image) VALUES (?, ?, ?, ?, ?)")) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setString(3, movie.getPenulis());
            statement.setString(4, movie.getDistributor());
            statement.setString(5, movie.getImageFileName());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateMovie(Film movie) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "UPDATE film SET title=?, genre=?, penulis=?, distributor=?, image=? WHERE id=?")) {
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setString(3, movie.getPenulis());
            statement.setString(4, movie.getDistributor());
            statement.setString(5, movie.getImageFileName());
            statement.setInt(6, movie.getId());

            statement.executeUpdate();
            System.out.println("Updating Data...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMovie(int id) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("DELETE FROM film WHERE id=?")) {
            statement.setInt(1, id);

            statement.executeUpdate();
            System.out.println("Deleting Data...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Film getMovieById(int id) {
        Film movie = null;
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("SELECT * FROM film WHERE id=?")) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                movie = createMovieFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }

    public List<Film> getAllMovies() {
        List<Film> movies = new ArrayList<>();
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("SELECT * FROM film")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Film movie = createMovieFromResultSet(resultSet);
                movies.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }
    
    public List<Film> showFilmbySearch(String query){
        List<Film> listOfBook=new ArrayList<Film>();
         
        try(Connection con = dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement("select * from film where( id = "
        +"'"+query+"'" + "OR title like '%"+query+"%'"
        +"OR genre like '%"+query+"%'" +"OR penulis like '%"+query+"%'"+"OR distributor like '%"+query+"%'"
        +"OR image like '%"+query+"%')")){
             
            System.out.println("Mengambil Data Film...");
            ResultSet rs=statement.executeQuery();
         
        if(rs != null){
            while(rs.next()){
                Film book=new Film();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setGenre(rs.getString("genre"));
                book.setPenulis(rs.getString("penulis"));
                book.setDistributor(rs.getString("distributor"));
                book.setImageFileName(rs.getString("image")
                );
                listOfBook.add(book);
            }
        }
        
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return listOfBook;
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
    
    
}

