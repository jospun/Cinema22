/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import Entity.Film;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer Pc
 */
public class filmTable extends AbstractTableModel{
    private List<Film> listOfDomain = new ArrayList<Film>();
    
    public filmTable(List<Film> listOfDomain){
        this.listOfDomain=listOfDomain;
    }
    
    public void save(Film domain){
        listOfDomain.add(domain);
        
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
    public void edit(int rowIndex, Film updatedDomain) {
        listOfDomain.set(rowIndex, updatedDomain);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public Film findOne(int index){
        return listOfDomain.get(index);
    }

    public int getRowCount() {
        return listOfDomain.size();
    }

    public int getColumnCount() {
        return 5;
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:return "Judul";
            case 1:return "Genre";
            case 2:return "Penulis";
            case 3:return "Distributor";
            case 4:return "Image";
            default:return null;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Film domain=listOfDomain.get(rowIndex);
        
        switch(columnIndex){
            case 0:return domain.getTitle();
            case 1:return domain.getGenre();
            case 2:return domain.getPenulis();
            case 3:return domain.getDistributor();
            case 4:return domain.getImageFileName();
            case 5: return domain.getId();
            default:return null;
        }
    }
     
}
