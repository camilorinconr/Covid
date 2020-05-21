/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;

import java.util.Date;

/**
 *
 * @author CAMILO
 */
public class PacienteVO extends PersonaVO {

    private LugarVO lugarprocedencia;
    private Date fechaDetencion;
    private Estado estado;
    private Boolean casa;
    private PersonaVO persona;
    private ClinicaVO clinica;
    private int id;

    public PacienteVO() {
    }

    public PacienteVO(LugarVO lugarprocedencia, Estado estado, Boolean casa, ClinicaVO clinica, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.lugarprocedencia = lugarprocedencia;
        this.estado = estado;
        this.casa = casa;
        
        this.clinica = clinica;
    }

    public int getId() {
        return id;
    }

    public LugarVO getLugarprocedencia() {
        return lugarprocedencia;
    }

    public void setLugarprocedencia(LugarVO lugarprocedencia) {
        this.lugarprocedencia = lugarprocedencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public PersonaVO getPersona() {
        return persona;
    }

    public void setPersona(PersonaVO persona) {
        this.persona = persona;
    }

    public ClinicaVO getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaVO clinica) {
        this.clinica = clinica;
    }

    public Date getFechaDetencion() {
        return fechaDetencion;
    }

    public void setFechaDetencion(Date fechaDetencion) {
        this.fechaDetencion = fechaDetencion;
    }

    public Boolean getCasa() {
        return casa;
    }

    public void setCasa(Boolean casa) {
        this.casa = casa;
    }

}
