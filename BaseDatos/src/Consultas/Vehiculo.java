package Consultas;

import ConexionBaseDatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vehiculo {
    DefaultTableModel modeloVehiculo;
    Connection con = null;
    Object datos[];
    String columnas[];
    
    public Vehiculo(){
        con = Conexion.ConnecrDb();
    }
    
    public DefaultTableModel verVehiculos(){//Método para enviar la lista de vehiculos
        int nC = 0;
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idVehiculo, Marca, Modelo, Color, Cilindros, Motor, Num_Placa, Capacidad, e.Nombres, e.Apellidos, e.Edad FROM Vehiculo v INNER JOIN Empleado e ON v.Conductor_ID = e.idEmpleado ORDER BY idVehiculo ASC;");
            ResultSetMetaData rsMeta=rs.getMetaData();
            nC=rsMeta.getColumnCount();
            datos = new Object[nC];//Número de columnas para rellenar las filas
            columnas = new String[nC];
            for(int i=1; i<=nC; i++){
                columnas[i-1]=rsMeta.getColumnName(i);
            }
            columnas[0] = "ID";
            columnas[6] = "Placa";
            modeloVehiculo = new DefaultTableModel(null, columnas){
            @Override
                public boolean isCellEditable (int fila, int columna) {
                    return false;
                }
            };
            while(rs.next()){
                for(int i=0; i<nC; i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloVehiculo.addRow(datos);
            }         
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        }  
        return modeloVehiculo;
    }
}
