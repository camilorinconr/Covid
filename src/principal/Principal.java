/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.Controlador;
import vista.Registro;

/**
 *
 * @author CAMILO
 */
public class Principal {
     public static void main(String[] args) {
        Registro r = new Registro();
        
        new Controlador(r);
        
        r.setLocationRelativeTo(r);
        r.setVisible(true);
        
        
       
    }
}
