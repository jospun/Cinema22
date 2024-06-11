/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author M S I
 */
import DAO.filmDAO;
import java.util.List;
import Entity.Film;
import table.filmTable;

public class filmControl {
    private filmDAO fDao = new filmDAO();
    
    public List<Film> showListFilm(){
        return fDao.getAllMovies();
    }
    
    public void insertDataFilm(Film f){
        fDao.addMovie(f);
    }
    
    public void updateDataFilm (Film f){
        fDao.updateMovie(f);
    }
    
    public void deleteDataFilm(int id){
        fDao.deleteMovie(id);
    }
    
    public filmTable showFilmbySearch(String query){
        List<Film> film = fDao.showFilmbySearch(query);
        filmTable tableFilm = new filmTable(film);
       
        return tableFilm;
    }
    
}
