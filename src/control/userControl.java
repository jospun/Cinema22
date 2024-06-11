/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DAO.userDAO;
import java.util.List;
import Entity.User;
import java.sql.SQLException;
import table.userTable;

public class userControl {
    private userDAO uDao = new userDAO();
    
    public List<User> showListUser(){
        return uDao.getAllUsers();
    }
    
    public void insertUser(User u){
        uDao.addUser(u);
    }
    
    public void updateDataUser(User u){
        uDao.updateUser(u);
    }
    
    public boolean loginUser(String nama, String pass) throws SQLException{
        return uDao.isValidUser(nama, pass);
    }
    
    public boolean uniqueUser(String nama, String email){
        return uDao.isUniqueUser(nama,email);
    }
    
    public void deleteDataUser(int id){
        uDao.deleteUser(id);
    }
    
    public userTable showUserbySearch(String query){
        List<User> film = uDao.showUserbySearch(query);
        userTable tableUser= new userTable(film);
       
        return tableUser;
    }
}
