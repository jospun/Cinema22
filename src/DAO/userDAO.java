/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.User;
import Connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDAO {
 private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void addUser(User us) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "INSERT INTO user ( `email`, `username`, `password`) VALUES (?, ?, ?)")) {
            statement.setString(1, us.getEmail());
            statement.setString(2, us.getUsername());
            statement.setString(3, us.getPassword());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateUser(User us) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement(
                     "UPDATE user SET `email`=?,`username`=?,`password`=? WHERE id=?")) {
            statement.setString(1, us.getEmail());
            statement.setString(2, us.getUsername());
            statement.setString(3, us.getPassword());
            statement.setInt(4, us.getId());

            statement.executeUpdate();
            System.out.println("Updating Data...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("DELETE FROM user WHERE id=?")) {
            statement.setInt(1, id);

            statement.executeUpdate();
            System.out.println("Deleting Data...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean isValidUser(String username, String password) {
        try (Connection connection = dbCon.makeConnection()) {
            String query = "SELECT * FROM user WHERE username = ? AND password = ? ";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            
                while(resultSet.next()){
                    String storedPassword = resultSet.getString("password");
                    if(storedPassword.equals(password)){
                        return true;
                    }
                }
                    
               
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean isUniqueUser(String username, String email) {
        try (Connection connection = dbCon.makeConnection()) {
            String query = "SELECT * FROM user WHERE username = ? OR email = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, email);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public List<User> getAllUsers() {
        List<User> movies = new ArrayList<>();
        try (Connection con = dbCon.makeConnection();
             PreparedStatement statement = con.prepareStatement("SELECT * FROM user")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User movie = createUserFromResultSet(resultSet);
                movies.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }
    
    public List<User> showUserbySearch(String query){
        List<User> listOfBook=new ArrayList<User>();
         
        try(Connection con = dbCon.makeConnection();
         PreparedStatement statement = con.prepareStatement("select * from user where( id = "
        +"'"+query+"'" + "OR email like '%"+query+"%'"
        +"OR username like '%"+query+"%'" +"OR password like '%"+query+"%')")){
             
            System.out.println("Mengambil Data User...");
            ResultSet rs=statement.executeQuery();
         
        if(rs != null){
            while(rs.next()){
                User us = new User();
                us.setId(rs.getInt("id"));
                us.setEmail(rs.getString("email"));
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                listOfBook.add(us);
            }
        }
        
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return listOfBook;
    }    
    
    
    private User createUserFromResultSet(ResultSet resultSet) throws SQLException {
        User us = new User();
        us.setId(resultSet.getInt("id"));
        us.setEmail(resultSet.getString("email"));
        us.setUsername(resultSet.getString("username"));
        us.setPassword(resultSet.getString("password"));
        
        return us;
    }
}
