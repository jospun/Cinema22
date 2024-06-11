/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author M S I
 */
import java.util.Date;

public class Tiket {
    private int id,tiket;
    private double harga;
    private String time;
    private Jadwal jadwal;
    private Film film;
    private Studio studio;
    private Date date;

    public Tiket(int id, int tiket, double harga, String time, Jadwal jadwal, Film film, Studio studio, Date date) {
        this.id = id;
        this.date = date;
        this.tiket = tiket;
        this.harga = harga;
        this.time = time;
        this.jadwal = jadwal;
        this.film = film;
        this.studio = studio;
    }

    public Tiket() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiket() {
        return tiket;
    }

    public void setTiket(int tiket) {
        this.tiket = tiket;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
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
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public Date getDate(){
        return this.date;
    }

    
    
}
