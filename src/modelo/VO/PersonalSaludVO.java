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
public class PersonalSaludVO extends PersonaVO{
   
    private Especialidad especialidad;
    private ClinicaVO clinica;
    private PruebaVo prueva;
    int id;
    
    
    public PersonalSaludVO() {
    }

    public PersonalSaludVO(Especialidad especialidad, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        
     
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ClinicaVO getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaVO clinica) {
        this.clinica = clinica;
    }

    public PruebaVo getPrueva() {
        return prueva;
    }

    public void setPrueva(PruebaVo prueva) {
        this.prueva = prueva;
    }

    public int getId() {
        return id;
    }

   
    
}
