/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author M S I
 */
public class Jadwal {
    private int kursi;
    private Date date;
    private String time;
    private Film film;
    private Studio studio;

    public Jadwal(int kursi, Date date, String time, Film film, Studio studio) {
        this.kursi = kursi;
        this.date = date;
        this.time = time;
        this.film = film;
        this.studio = studio;
    }
    
    public Jadwal(String time){
        this.time = time;
    }
    
    @Override
    public String toString(){
        return date.toString();
    }
    
    public Jadwal() {
    }
    
    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
    
    

   

    
    
}
