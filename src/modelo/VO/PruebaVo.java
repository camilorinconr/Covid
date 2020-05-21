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
public class PruebaVo {
    
    
   private Date fecha;
   private Boolean positivo;

    public PruebaVo() {
    }

    public PruebaVo(Date fecha, Boolean positivo) {
        this.fecha = fecha;
        this.positivo = positivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPositivo() {
        return positivo;
    }

    public void setPositivo(Boolean positivo) {
        this.positivo = positivo;
    }
   
   
}
