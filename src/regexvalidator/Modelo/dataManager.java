/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regexvalidator.Modelo;

import javax.swing.JOptionPane;
import regexvalidator.Controlador.cRegexCheck;

/**
 *
 * @author dasan
 */
public class dataManager {
    public void llamadaDatos(String num, String sci, String nombre, String apellido, String email){
        //validacion general comun valores o datos
        try{
            Float entRea = Float.valueOf(num);
            System.out.println("number/Float OK");
            cRegexCheck reg = new cRegexCheck();
            reg.regexCheck(entRea, sci, nombre, apellido, email);
        }catch(NumberFormatException e){    
            JOptionPane.showMessageDialog(null, "El numero registrado no es valido.");
        }
        
        
        
        
        
        
    
    }
}
