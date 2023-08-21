/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prograiii.CapaDatos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franco
 * @param <A>
 */
public interface IPersona<A> 
{
    boolean Agregar(A obj);
    boolean Actualizar(A obj);
    boolean Eliminar(String codigo);
    DefaultTableModel Lista(); 
}
