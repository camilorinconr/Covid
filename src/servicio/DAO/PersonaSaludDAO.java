/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.VO.PersonalSaludVO;

/**
 *
 * @author CAMILO
 */
public class PersonaSaludDAO {
    public void guardarPersonaSalud(Connection conexion, PersonalSaludVO salud)throws SQLException{
       
         try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO personalsalud (id,especialidad,clinica)"+ "VALUE(?,?,?)");
            
            consulta.setInt(1, salud.getId());
            consulta.setInt(2, Integer.parseInt(salud.getEspecialidad().toString()));
            consulta.setInt(3, Integer.parseInt(salud.getClinica().toString()));
            
            consulta.executeUpdate();
             System.out.println("consulta exitosa salud clase personaSaludDAO");
            
        } catch (SQLException | NumberFormatException e) {
             System.out.println("error consulta salud clase personaSaludDAO");
        }
    }
}
