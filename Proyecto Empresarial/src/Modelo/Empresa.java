package Modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Empresa {
	public static int numeroFactura = 0;
	private String nombreEmpresa;
	private double utilidadBruta;
	private ArrayList<Factura> facturas;
	public Empresa(String nombreEmpresa, double utilidadBruta) {
		this.nombreEmpresa = nombreEmpresa;
		this.utilidadBruta = utilidadBruta;
		this.facturas = new ArrayList<Factura>();
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public double getUtilidadBruta() {
		return utilidadBruta;
	}
	public void setUtilidadBruta(double utilidadBruta) {
		this.utilidadBruta = utilidadBruta;
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public void utilidadActual() {
		double aux = 0;
		for (int i = 0; i < facturas.size(); i++) {
			aux+=facturas.get(i).getTotal()-facturas.get(i).getDebe();
		}
		setUtilidadBruta(aux);
	}
	public void añadirFactura(Date fecha, String nombreCliente, String numeroCliente, double debe, String descripcion) {
		Factura f1 = new Factura(fecha, nombreCliente, numeroCliente, debe, numeroFactura, descripcion);
		facturas.add(f1);
		utilidadActual();
		numeroFactura++;
	}
	public void añadirProductoFactura(int numeroF, double precio, int cantidad, String nombre, String color, String talla) {
		facturas.get(numeroF).añadirProducto(precio, cantidad, nombre, color, talla);
		utilidadActual();
	}
	public void añadirAbonoFactura(int numeroF, double cantidad, Date fecha) {
		facturas.get(numeroF).añadirAbono(cantidad, fecha);
		utilidadActual();
	}
}
