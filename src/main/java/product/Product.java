package product;

import java.time.LocalDate;

public class Product {
	private long id;
	private String nombre;
	private Float precio;
	private LocalDate fecha;
	private int antiguedad;
	
	public Product() {
	}

	public Product(long id, String nombre, Float precio, LocalDate fecha, int antiguedad) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.antiguedad = antiguedad;
	}

	public Product(String nombre, Float precio, LocalDate fecha, int antiguedad) {
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.antiguedad = antiguedad;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
