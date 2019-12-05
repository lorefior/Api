package com.cdainfo.afipApiRest.domunio;



import java.sql.Date;

import javax.persistence.*;

@Entity
public class Impuesto {
	


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idimpuestos;

    @Column(name = "porcentaje")
    private Double porcentaje;

    @Column(name = "nombre")
    private  String nombre;
    
	@Column(name = "fecha_liq")
    private  Date fechaLiq;
    

	public Integer getIdimpuestos() {
		return idimpuestos;
	}

	public void setIdimpuestos(Integer idimpuestos) {
		this.idimpuestos = idimpuestos;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaLiq() {
		return fechaLiq;
	}

	public void setFechaLiq(Date fecha_liq) {
		this.fechaLiq = fecha_liq;
	}



    @Override
	public String toString() {
		return "Impuesto \n [id=" + idimpuestos 
				+ ", porcentaje=" + porcentaje 
				+ ", nombre=" + nombre 
				+ ", fecha_liq=" + fechaLiq + "]";
	}
    
}

/*****************************
 
 */