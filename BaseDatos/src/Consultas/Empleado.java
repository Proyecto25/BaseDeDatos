package Consultas;

import ConexionBaseDatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleado {
    DefaultTableModel modeloEmp;
    Connection con = null;
    Object datos[];
    String columnas[];
    public Empleado(){
        con = Conexion.ConnecrDb();
    }
    public DefaultTableModel verEmpleados(){//Método para enviar la lista de clientes
        int nC = 0;
        try{        
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT idEmpleado, Nombres, Apellidos, Direccion, Telefono, CUI, NIT, FechaNac, Edad, Genero, Cargo FROM Empleado INNER JOIN Cargo ON Empleado.Cargo_idCargo = Cargo.idCargo;");
            ResultSetMetaData rsMeta=rs.getMetaData();
            nC=rsMeta.getColumnCount();
            datos = new Object[nC];//Número de columnas para rellenar las filas
            columnas = new String[nC];
            for(int i=1; i<=nC; i++){
                columnas[i-1]=rsMeta.getColumnName(i);
            }
            columnas[0] = "No.";
            columnas[3] = "Dirección";
            columnas[4] = "Teléfono";            
            columnas[7] = "F. Nacimiento";
            columnas[9] = "Género";
            modeloEmp = new DefaultTableModel(null, columnas){
            @Override
                public boolean isCellEditable (int fila, int columna) {
                    return false;
                }
            };
            while(rs.next()){
                for(int i=0; i<nC; i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloEmp.addRow(datos);
            }         
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);      
        }  
        return modeloEmp;
    }
    public void limpiarTabla(){
        while (modeloEmp.getRowCount() > 0){
            modeloEmp.removeRow(0);
        }
    }
}
