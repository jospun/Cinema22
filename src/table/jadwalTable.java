/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import Entity.Jadwal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class jadwalTable extends AbstractTableModel {
    private List<Jadwal> listOfDomain = new ArrayList<Jadwal>();
    
    public jadwalTable(List<Jadwal> listOfDomain){
        this.listOfDomain=listOfDomain;
    }

    public int getRowCount() {
        return listOfDomain.size();
    }

    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:return "Nama Film";
            case 1:return "Nama Studio";
            case 2:return "time";
            case 3:return "kursi";
            default:return null;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Jadwal domain=listOfDomain.get(rowIndex);
        
        switch(columnIndex){
            case 0:return domain.getFilm().getTitle();
            case 1:return domain.getStudio().getNama();
            case 2:return domain.getTime();
            case 3: return domain.getKursi();
            default:return null;
        }
    }
}
