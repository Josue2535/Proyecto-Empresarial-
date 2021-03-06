package Modelo;

public class Productos {
	private double precio;
	private int cantidad;
	private String nombre;
	private String color;
	private String talla;
	public Productos(double precio, int cantidad, String nombre, String color, String talla) {
		this.precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.color = color;
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double precioTotal() {
		return getPrecio()*getCantidad();
	}
	
}
