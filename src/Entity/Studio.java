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
public class Studio {
    private int kapasitas,id;
    private String nama,jenis,time;
    private Date start_date,end_date,date;
            
    private Film film;
    private Studio studio;

    public Studio(String nama, int kapasitas, String jenis, Date start_date, Date end_date, String time, Film film) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.jenis = jenis;
        this.start_date = start_date;
        this.end_date = end_date;
        this.time = time;
        this.film = film;
    }
    
    public Studio(String nama){
        this.nama = nama;
    }
    
    public Studio(int kapasitas, String jenis) {
        this.kapasitas = kapasitas;
        this.jenis = jenis;
    }

    public Studio(int kapasitas, String jenis, Studio studio) {
        this.kapasitas = kapasitas;
        this.jenis = jenis;
        this.studio = studio;
    }
    
    public Studio(Studio studio, Film film, Date start_date, Date end_date, String time) {
        this.studio = studio;
        this.film = film;
        this.start_date = start_date;
        this.end_date = end_date;
        this.time = time;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public Studio() {
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
    
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
}
