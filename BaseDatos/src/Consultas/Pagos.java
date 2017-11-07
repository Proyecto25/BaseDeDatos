package Consultas;

import ConexionBaseDatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Pagos {
    Connection con = null;
    public Pagos(){
        con = Conexion.ConnecrDb();
    }
    public float mensual(){
        float men=0;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Monto FROM TipoPago WHERE Tipo='Mensualidad'");
            if(rs.next()){
                men = rs.getFloat("Monto");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return men;
    }
    public float inscripcion(){
        float insc=0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Monto FROM TipoPago WHERE Tipo='Inscripcion'");
            if(rs.next()){
                insc = rs.getFloat("Monto");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return insc;
    }
    
    public boolean pagoCorriente(String cliente){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Monto FROM TipoPago WHERE Tipo='Inscripcion'");
            if(rs.next()){
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return true;
    }
}
