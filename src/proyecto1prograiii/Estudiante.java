/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prograiii;

/**
 *
 * @author emanu
 */
public class Estudiante extends Persona{
    public String FechaIngreso = "";
    public float Promedio =0;
    String clasesactuales;
    String MateriasPasadas;
    String Descripcion = "";
    int numero = 0;
    String mails = "";

    public Estudiante(String nombre, int Cedula, int carnet, String A1, String A2, int edad) {
        super(nombre, Cedula, carnet, A1, A2, edad);
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public String getClasesactuales() {
        return clasesactuales;
    }

    public void setClasesactuales(String clasesactuales) {
        this.clasesactuales = clasesactuales;
    }

    public String getMateriasPasadas() {
        return MateriasPasadas;
    }

    public void setMateriasPasadas(String MateriasPasadas) {
        this.MateriasPasadas = MateriasPasadas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMails() {
        return mails;
    }

    public void setMails(String mails) {
        this.mails = mails;
    }
    
}
