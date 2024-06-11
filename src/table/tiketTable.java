/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import Entity.Film;
import Entity.Tiket;
import Entity.User;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class tiketTable extends AbstractTableModel{
    
   private List<Tiket> listOfDomain = new ArrayList<Tiket>();
    
    public tiketTable(List<Tiket> listOfDomain){
        this.listOfDomain=listOfDomain;
    }
    
    public void save(Tiket domain){
        listOfDomain.add(domain);
        
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    

    public Tiket findOne(int index){
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
            case 0: return "Tanggal";
            case 1: return "Judul";
            case 2: return "Time";
            case 3:return "Tiket";
            case 4: return "Harga";
            default:return null;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Tiket domain=listOfDomain.get(rowIndex);
        
        switch(columnIndex){ 
             
            case 0: return domain.getDate();
            case 1: return domain.getFilm().getTitle();
            case 2: return domain.getTime();
            case 3: return domain.getTiket();
            case 4: return domain.getHarga();
            default:return null;
        }
    }
    
}
