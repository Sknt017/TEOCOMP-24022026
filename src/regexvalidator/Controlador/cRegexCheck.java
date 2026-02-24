package regexvalidator.Controlador;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dasan
 */
public class cRegexCheck {
    private static final String decRegex = "-?[0-9]+[,|.]+[0-9]";
    private static final String entRegex = "^-?[0-9]$";
    private static final String sciRegex = "^(\\d+\\.?\\d*|\\.\\d+)\\*10\\^[+-]?\\d+$";
    private static final String sciRegex2 = "^([0-9]+.?[0-9]*|.d+)*10\\^[+-]?[0-9]+$";
    private static final String nomApe = "^[a-zA-Z]+$";
    private static final String emailRegex = "^[a-zA-Z0-9]+@+[a-zA-Z0-9]+[.]+[a-zA-Z]{2,}$"; 
    public void regexCheck(Float entRea, String exp, String nombre, String apellido, String email){
        if(Pattern.matches(nomApe, nombre)){
            JOptionPane.showMessageDialog(null, "nombre: "+nombre+" OK");
        }else{System.out.println("ERROR datos no validos: nombre");
        JOptionPane.showMessageDialog(null, "ERROR datos no validos: nombre");}
        if(Pattern.matches(nomApe, apellido)){
            JOptionPane.showMessageDialog(null, "apellido: "+apellido+" OK");
        }else{System.out.println("ERROR datos no validos: apellido");
        JOptionPane.showMessageDialog(null, "ERROR datos no validos: apellido");}
        if(Pattern.matches(emailRegex, email)){
            JOptionPane.showMessageDialog(null, "correo: "+email+" OK");
        }else{System.out.println("ERROR datos no validos: correo");
        JOptionPane.showMessageDialog(null, "ERROR datos no validos: correo");}
        if(Pattern.matches(sciRegex, exp)||Pattern.matches(sciRegex2, exp)){
            JOptionPane.showMessageDialog(null, "expresion not. cien.: "+exp+" OK");
        }else{System.out.println("ERROR datos no validos :notacion cientifica");
        JOptionPane.showMessageDialog(null, "ERROR datos no validos :notacion cientifica");}
    }
}
