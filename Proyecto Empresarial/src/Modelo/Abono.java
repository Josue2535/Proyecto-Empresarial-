package Modelo;

import java.util.Date;

public class Abono {
	private double cantidad;
	private Date fecha;
	public Abono(double cantidad, Date fecha) {
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
