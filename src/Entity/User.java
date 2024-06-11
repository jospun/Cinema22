/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Exception.EmptyInputException;

/**
 *
 * @author M S I
 */
public class User {
    private String username,password,email;
    private int id;

    public User( String username, String password, String email) throws EmptyInputException{
        
        if(username.equalsIgnoreCase("") || password.equalsIgnoreCase("") ||
            email.equalsIgnoreCase("")){
            throw new EmptyInputException();
        } else {
        this.username = username;
        this.password = password;
        this.email = email;   
        }
        
    }

    public User(int id, String username, String password, String email) throws EmptyInputException {
         if(username.equalsIgnoreCase("") || password.equalsIgnoreCase("") ||
            email.equalsIgnoreCase("")){
            throw new EmptyInputException();
        } else {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;   
        }
        
    }
    
    

    public User() {
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
