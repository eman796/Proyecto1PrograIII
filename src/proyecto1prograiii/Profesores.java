/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prograiii;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author emanu
 */
public class Profesores extends Persona {
    public String Profesion;
    public String UniDeEgresion;
    String clasesimpartidas[] = new String[5];
    public int Annosexperiencia;
    String idiomas[] = new String[0];
    public int numero;
    public String Correo;
    public String Username;

    public Profesores(String Profesion, String UniDeEgresion, int Annosexperiencia, int numero, String Correo, String Username) {
        this.Profesion = Profesion;
        this.UniDeEgresion = UniDeEgresion;
        this.Annosexperiencia = Annosexperiencia;
        this.numero = numero;
        this.Correo = Correo;
        this.Username = Username;
    }
    public Profesores(){
        this.Profesion = "";
        this.UniDeEgresion = "";
        this.Annosexperiencia = 0;
        this.numero=0;
        this.Correo = "";
        this.Username = "";
    }
    public void LlenarCampos(JTextField campo_a_llenar, int tipo, String Mensaje){
        String campo = campo_a_llenar.getText();
        if(tipo==1){
            setNombre(campo);
        }
        else if(tipo == 2){
            setApellido(campo);
        }
        else if(tipo == 3){
            setApellido2(campo);
        }
        else if(tipo == 4){
            setCedula(Integer.parseInt(campo));
        }
        else if(tipo == 5){
            setCarnet(Integer.parseInt(campo));
        }
        else if(tipo == 6){
            if(Integer.parseInt(campo)>100){
                JOptionPane.showMessageDialog(null,"Mae, no me creo que tengas + " + tipo + "años. Escribi bien");
            }
        }
        else if(tipo ==7){

        }
}
}
