package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	private String descripcion;
	private Date fecha;
	private int numeroFactura;
	private String nombreCliente;
	private String numeroCliente;
	private ArrayList<Productos> productos;
	private ArrayList<Abono> abonos;
	private double total;
	private double debe;

	public Factura(Date fecha, String nombreCliente, String numeroCliente, double debe, int numeroFactura, String descripcion) {
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.numeroCliente = numeroCliente;
		this.debe = debe;
		this.numeroFactura = numeroFactura;
		this.productos = new ArrayList<Productos>();
		this.abonos = new ArrayList<Abono>();
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public ArrayList<Productos> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Productos> productos) {
		this.productos = productos;
	}

	public ArrayList<Abono> getAbonos() {
		return abonos;
	}

	public void setAbonos(ArrayList<Abono> abonos) {
		this.abonos = abonos;
	}

	public double getDebe() {
		return debe;
	}

	public void setDebe(double debe) {
		this.debe = debe;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void totalN() {
		double aux = 0;
		for (int i = 0; i < productos.size(); i++) {
			aux += productos.get(i).precioTotal();
		}
		setTotal(aux);
	}

	public void totalDebe() {
		double aux = 0;
		for (int i = 0; i < abonos.size(); i++) {
			aux += abonos.get(i).getCantidad();
		}
		setDebe(getTotal() - aux);
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public void añadirAbono(double cantidad, Date fecha) {
		Abono a1 = new Abono(cantidad, fecha);
		abonos.add(a1);
		totalDebe();
	}

	public void añadirProducto(double precio, int cantidad, String nombre, String color, String talla) {
		Productos p1 = new Productos(precio, cantidad, nombre, color, talla);
		productos.add(p1);
		totalDebe();
		totalN();
	}
}
