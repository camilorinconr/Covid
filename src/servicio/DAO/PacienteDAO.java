/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import modelo.VO.PacienteVO;

/**
 *
 * @author CAMILO
 */
public class PacienteDAO {

    public void guardarPaciente(Connection conexion, PacienteVO pacienteVO) throws SQLException {

        try {
            PreparedStatement consul;
            consul = conexion.prepareStatement("INSERT INTO paciente(lugarprocedencia, fechadetencion,estado,casa,id,clinica)" + "  VALUES (?,?,?,?,?,?)");

            consul.setInt(1, Integer.parseInt(pacienteVO.getLugarprocedencia().toString()));
            consul.setDate(2, (Date) pacienteVO.getFechaDetencion());
            consul.setInt(3, Integer.parseInt(pacienteVO.getEstado().toString()));
            consul.setInt(4, Integer.parseInt(pacienteVO.getCasa().toString()));
            consul.setInt(5, pacienteVO.getId());
            consul.setInt(6, Integer.parseInt(pacienteVO.getClinica().toString()));

            consul.executeUpdate();

            System.out.println("Consulta exitosa paciente");
            
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error paciente dao");
            throw new SQLDataException(e);
        }
    }

}
