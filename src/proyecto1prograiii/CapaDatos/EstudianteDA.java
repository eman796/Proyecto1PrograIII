/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prograiii.CapaDatos;

import proyecto1prograiii.CapaDatos.ConexionBD;
import proyecto1prograiii.CapaLógica.Estudiante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import proyecto1prograiii.CapaDatos.ConexionBD;


/**
 *
 * @author Franco
 */
public class EstudianteDA implements IPersona<Estudiante>
{   
    Connection cn = new ConexionBD().getConn();

    @Override
    public boolean Agregar(Estudiante obj) {
         boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{Call PA_AGREGAR_ALUMN(?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, obj.getCedula());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getApellido());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getFechaIngreso());
            cs.setFloat(7, obj.getPromedio());
            cs.setString(8, obj.getClasesactuales());
            cs.setString(9, obj.getMateriasPasadas());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al insertar estudiante");
        }
            
      
    return band;
    }

    @Override
    public boolean Actualizar(Estudiante obj) {
        boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{Call PA_ACTUALIZAR_ALUMN(?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, obj.getCedula());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getApellido());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getFechaIngreso());
            cs.setFloat(7, obj.getPromedio());
            cs.setString(8, obj.getClasesactuales());
            cs.setString(9, obj.getMateriasPasadas());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al insertar estudiante");
        }
            
      
    return band;
    }

    @Override
    public boolean Eliminar(String codigo) {
       boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{Call PA_ELIMINAR_ALUMN(?)}");
            cs.setString(1, codigo);
            
            
            if (cs.executeUpdate()>0){
                band = true;
            }
              
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante");
        }
            
      
    return band;
    }

    @Override
    public DefaultTableModel Lista() {
    DefaultTableModel mdl= new DefaultTableModel();
    mdl.addColumn("Cedula");
    mdl.addColumn("Nombre");
    mdl.addColumn("Primer Apellido");
    mdl.addColumn("Segundo Apellido");
    mdl.addColumn("Edad");
    mdl.addColumn("Nacionalidad");
    mdl.addColumn("Correo");
    mdl.addColumn("Direccion");
    mdl.addColumn("Carnet");
        try {
            CallableStatement cs = cn.prepareCall("{CALL PA_LISTAR_TODOS_ALUMN ()}");
            ResultSet rst =cs.executeQuery();
            
            while (rst.next()) {
                Object data[] = { 
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                };
                
                mdl.addRow(data);
                
            }
        } catch (Exception e) {
            System.out.println("Error al traer la lista de estudiantes");
        }
    
    
    
    return mdl;
    }
    
    
    
    
}
