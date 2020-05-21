/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.VO.PersonaVO;

/**
 *
 * @author CAMILO
 */
public class PersonaDao {
    
     public void guardarPersonaSalud(Connection conexion, PersonaVO persona)throws SQLException{
         try {
               PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO persona (id,persona,telefono,genero,fechanacimiento)"+ "VALUE(?,?,?,?,?)");
         } catch (Exception e) {
         }
     }
}
