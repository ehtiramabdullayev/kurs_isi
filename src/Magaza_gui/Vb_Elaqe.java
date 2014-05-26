package Magaza_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Vb_Elaqe {
    public static Connection baglan(){
        try {
              Class.forName("com.mysql.jdbc.Driver");             
              Connection elaqe=DriverManager.getConnection("jdbc:mysql://localhost/magaza","root","");
//              JOptionPane.showMessageDialog(null,"Baza ile elaqe quruldu","MESAJ",JOptionPane.INFORMATION_MESSAGE);
                             return elaqe;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"XƏTA : "+e,"MESAJ",JOptionPane.ERROR_MESSAGE);
            return null;
        }

        
        
    }
    
}
