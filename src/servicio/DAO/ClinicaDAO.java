/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import modelo.VO.ClinicaVO;

/**
 *
 * @author CAMILO
 */
public class ClinicaDAO {

    public void guardarClinica(Connection conexion, ClinicaVO clinica) throws SQLException {

        try {
            PreparedStatement consul;
            consul = conexion.prepareStatement("INSERT INTO clinica (id,nombre,direccion)" + " VALUES(?,?,?)");
            consul.setInt(1, clinica.getId());
            consul.setString(2, clinica.getNombre());
            consul.setString(3, clinica.getDireccion());

            consul.executeUpdate();

            System.out.println("Se realizo la consulta clinica ");

        } catch (SQLException | NumberFormatException e) {
            
            System.out.println("Error consulta no realizada clinica ");
            
            throw new SQLDataException(e);
        }

    }


}
