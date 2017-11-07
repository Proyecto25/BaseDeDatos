package Consultas;

import ConexionBaseDatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente {
    DefaultTableModel modeloMCliente;
    Connection con = null;
    Object datos[];
    String columnas[];
    
    public Cliente(){//Constructor
        con = Conexion.ConnecrDb();
    }
    
    public DefaultTableModel verClientes(){//Método para enviar la lista de clientes
        int nC = 0;
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idCliente, Nombres, Apellidos, CUI, Direccion, Municipio, al.Aldea, cas.Caserio FROM Cliente c LEFT JOIN Caserio cas ON c.Caserio_ID = cas.idCaserio LEFT JOIN Aldea al ON c.Aldea_idAldea = al.idAldea ORDER BY idCliente ASC");
            ResultSetMetaData rsMeta=rs.getMetaData();
            nC=rsMeta.getColumnCount();
            datos = new Object[nC];//Número de columnas para rellenar las filas
            columnas = new String[nC];
            for(int i=1; i<=nC; i++){
                columnas[i-1]=rsMeta.getColumnName(i);
            }
            columnas[0] = "No.";
            columnas[4] = "Dirección";
            modeloMCliente = new DefaultTableModel(null, columnas){
            @Override
                public boolean isCellEditable (int fila, int columna) {
                    return false;
                }
            };
            while(rs.next()){
                for(int i=0; i<nC; i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloMCliente.addRow(datos);
            }         
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        }  
        return modeloMCliente;
    }
    
    public DefaultTableModel verCDpi(String cadBuscar){//Búscar cliente por dpi
        con = Conexion.ConnecrDb();
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idCliente, Nombres, Apellidos, CUI, Direccion, Municipio, al.Aldea, cas.Caserio FROM Cliente c LEFT JOIN Caserio cas ON c.Caserio_ID = cas.idCaserio LEFT JOIN Aldea al ON c.Aldea_idAldea = al.idAldea WHERE CUI LIKE '"+cadBuscar+"%'");
            while(rs.next()){
                for(int i=0; i<modeloMCliente.getColumnCount(); i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloMCliente.addRow(datos);
            }           
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        } 
        return modeloMCliente;
    }
    
    public DefaultTableModel verCNombre(String cadBuscar){//Búscar cliente por nombre
        con = Conexion.ConnecrDb();
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idCliente, Nombres, Apellidos, CUI, Direccion, Municipio, al.Aldea, cas.Caserio FROM Cliente c LEFT JOIN Caserio cas ON c.Caserio_ID = cas.idCaserio LEFT JOIN Aldea al ON c.Aldea_idAldea = al.idAldea WHERE Nombres LIKE '"+cadBuscar+"%'");
            while(rs.next()){
                for(int i=0; i<modeloMCliente.getColumnCount(); i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloMCliente.addRow(datos);
            }           
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        } 
        return modeloMCliente;
    }
    
    public DefaultTableModel verCApellido(String cadBuscar){//Búscar cliente por apellido
        con = Conexion.ConnecrDb();
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idCliente, Nombres, Apellidos, CUI, Direccion, Municipio, al.Aldea, cas.Caserio FROM Cliente c LEFT JOIN Caserio cas ON c.Caserio_ID = cas.idCaserio LEFT JOIN Aldea al ON c.Aldea_idAldea = al.idAldea WHERE Apellidos LIKE '"+cadBuscar+"%'");
            while(rs.next()){
                for(int i=0; i<modeloMCliente.getColumnCount(); i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloMCliente.addRow(datos);
            }           
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        } 
        return modeloMCliente;
    }
    
    public void limpiarTabla(){
        while (modeloMCliente.getRowCount() > 0){
            modeloMCliente.removeRow(0);
        }
    }
}
