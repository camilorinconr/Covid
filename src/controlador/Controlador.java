 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import modelo.VO.ClinicaVO;
import modelo.VO.Especialidad;
import modelo.VO.Estado;
import modelo.VO.PacienteVO;
import modelo.VO.PersonaVO;
import modelo.VO.PersonalSaludVO;
import servicio.DAO.ClinicaDAO;
import servicio.DAO.Conexion;
import servicio.DAO.PacienteDAO;
import servicio.DAO.PersonaSaludDAO;
import vista.Registro;
import modelo.VO.LugarVO;

/**
 *
 * @author CAMILO
 */
public class Controlador implements ActionListener {

    private Registro formulario;
    ClinicaVO vo = new ClinicaVO();
    PacienteVO pa = new PacienteVO();
     DateFormat dt = DateFormat.getDateInstance();
    /**
     *
     */

    private ClinicaVO clinicaVOS, c;
    private LugarVO lugar;
    private PersonaVO personas;

    public Controlador() {
    }

    public Controlador(Registro formulario) {
        this.formulario = formulario;
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        formulario.btnregistrarPer.addActionListener(controlador);
        formulario.btnLimpiar.addActionListener(controlador);

        //botones Panel registrar clinica
        formulario.btnRegistarClinica.addActionListener(controlador);
        formulario.btncLimpiarccc.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        try {
            if (evento.getActionCommand().equals("Registrar Persona")) {

                String Tipo = formulario.boxPersona.getSelectedItem().toString();

                String nombre = formulario.txtNombre.getText();
                String documento = formulario.txtDocumento.getText();
                String direccion = formulario.txtDireccion.getText();
                Date fechaNaci = formulario.txtFechanaci.getDate();
                String telefono = formulario.txtTelefono.getText();
                String genero = formulario.boxGenero.getSelectedItem().toString();
                Date fechadete = formulario.txtfechadeten.getDate();
                String procedencia = formulario.txtProcedencia.getText();
                String clinica = formulario.boxClinica.getSelectedItem().toString();
                String especialidad = formulario.boxEspecialidad.getSelectedItem().toString();
                String estado = formulario.boxEstado.getSelectedItem().toString();
                boolean casa = Boolean.parseBoolean(formulario.boxCasa.getSelectedItem().toString());

                String fechadet, fechanaci;
                fechadet = dt.format(fechadete);
                fechanaci = dt.format(fechaNaci);

                Controlador a = new Controlador();
                PacienteVO paciente = new PacienteVO(lugar, Estado.valueOf(estado), casa, clinicaVOS, documento, nombre, direccion, telefono, genero, fechaNaci);

                a.paciente(paciente);
                 PersonalSaludVO personal = new PersonalSaludVO(Especialidad.valueOf(especialidad).valueOf(especialidad), documento, nombre, direccion, telefono, genero, fechaNaci);
                 a.Psalud(personal);
            }
        } catch (Exception e) {
        }
        if (evento.getActionCommand().equals("Registrar Clinica")) {

            String nombreC = formulario.txtrNombreC.getText();
            String direccionC = formulario.txtrDireccionC.getText();

            ClinicaVO clinica = new ClinicaVO(nombreC, direccionC);
            Controlador s = new Controlador();

            s.clinicaV(clinica);
        }

    }

    private void paciente(PacienteVO paciente) {
        try {
            PacienteDAO pa = new PacienteDAO();
            Conexion sa = new Conexion();
            pa.guardarPaciente(sa.obtener(), paciente);

            System.out.println("Consulta exitosa paciente");

        } catch (Exception e) {
            System.out.println("Error de consulta paciente metodo persona controlador");
        }
    }

    private void clinicaV(ClinicaVO clinica) {
        try {
            ClinicaDAO da = new ClinicaDAO();
            Conexion se = new Conexion();
            da.guardarClinica(se.obtener(), clinica);

            System.out.println("Consulta exitosa clinica");
        } catch (Exception e) {
            System.out.println("Error de consulta clinica");
        }
    }

    private void Psalud(PersonalSaludVO saludd) {
        try {

            PersonaSaludDAO pe = new PersonaSaludDAO();
            Conexion su = new Conexion();
            pe.guardarPersonaSalud(su.obtener(), saludd);
            System.out.println("Consulta exitosa psalud controlador");

        } catch (Exception e) {

            System.out.println("Erro consulta metodo psalud controlador");
        }
    }

}
