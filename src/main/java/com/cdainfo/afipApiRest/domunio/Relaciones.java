package com.cdainfo.afipApiRest.domunio;

import javax.persistence.*;

@Entity
	public class Relaciones {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idrelaciones;
	    @Column(name = "idimpuestos")
	    private Integer idimpuestos;

	    @Column(name = "cuil")
	    private  Integer cuil;

		public Integer getIdrelaciones() {
			return idrelaciones;
		}

		public void setIdrelaciones(Integer idrelaciones) {
			this.idrelaciones = idrelaciones;
		}

		public Integer getIdimpuestos() {
			return idimpuestos;
		}

		public void setIdimpuestos(Integer idimpuestos) {
			this.idimpuestos = idimpuestos;
		}



		@Override
		public String toString() {
			return "Relaciones [cuil=" + cuil 
					+ ", idimpuestos=" + idimpuestos
	                 + "]";
		}

		public Integer getCuil() {
			return cuil;
		}

		public void setCuil(Integer cuil) {
			this.cuil = cuil;
		}

	}



/*****************************
 
 */