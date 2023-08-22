/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prograiii.CapaLógica;

/**
 *
 * @author emanu
 */
public class Persona {
    int Cedula = 0;
    String Nombre = "";
    int Carnet = 0;
    String Apellido = "";
    String Apellido2 = "";
    int Edad = 0;

    public Persona(String nombre, int Cedula, int carnet, String A1, String A2, int edad) {
        this.Nombre = nombre;
        this.Cedula = Cedula;
        this.Carnet = carnet;
        this.Apellido = A1;
        this.Apellido2 = A2;
        this.Edad = edad;
    }
    public Persona(){
        this.Nombre ="";
        this.Cedula = 0 ;
        this.Carnet = 0;
        this.Apellido = "";
        this.Apellido2 = "";
        this.Edad = 0;
    }

    

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}
