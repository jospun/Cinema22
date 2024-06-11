/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import javax.swing.table.AbstractTableModel;
import Entity.User;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author M S I
 */
public class userTable extends AbstractTableModel{
    
    private List<User> listOfDomain = new ArrayList<User>();
    
    public userTable(List<User> listOfDomain){
        this.listOfDomain=listOfDomain;
    }
    
    public void save(User domain){
        listOfDomain.add(domain);
        
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
    public void edit(int rowIndex, User updatedDomain) {
        listOfDomain.set(rowIndex, updatedDomain);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public User findOne(int index){
        return listOfDomain.get(index);
    }

    public int getRowCount() {
        return listOfDomain.size();
    }

    public int getColumnCount() {
        return 3;
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:return "id";
            case 1:return "Email";
            case 2:return "Username";
            default:return null;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        User domain=listOfDomain.get(rowIndex);
        
        switch(columnIndex){
            case 0:return domain.getId();
            case 1:return domain.getEmail();
            case 2:return domain.getUsername();
            case 3: return domain.getPassword();
            default:return null;
        }
    }
}
