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
public class Film {
    private int id;
    private String title;
    private String genre;
    private String penulis;
    private String distributor;
    private String imageFileName;

    public Film(int id, String title, String genre, String penulis, String distributor, String imageFileName) throws EmptyInputException{
        if(title.equalsIgnoreCase("") || penulis.equalsIgnoreCase("")
           || genre.equalsIgnoreCase("") || distributor.equalsIgnoreCase("")){
        throw new EmptyInputException();  
        } else {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.penulis = penulis;
        this.distributor = distributor;
        this.imageFileName = imageFileName;
    }   }

    public Film(String title, String genre, String penulis, String distributor, String imageFileName) throws EmptyInputException {
        if(title.equalsIgnoreCase("") || penulis.equalsIgnoreCase("")
           || genre.equalsIgnoreCase("") || distributor.equalsIgnoreCase("")){
        throw new EmptyInputException();  
        } else {
        this.title = title;
        this.genre = genre;
        this.penulis = penulis;
        this.distributor = distributor;
        this.imageFileName = imageFileName;  
        }
       
    }

    @Override
    public String toString(){
        return title;
    }
    
    public Film() {
        
    }
    
    public Film(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    
    
}

