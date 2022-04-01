package modelo;

import java.util.Date;

public class Alumno {

	private String nombre = "";
	private String apellido = "";
	private String apellidoDos = "";
	private Date fecha = null;
	private String dni = "";
	private String clase = "";

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, String apellidoDos, Date fecha, String dni, String clase) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellidoDos = apellidoDos;
		this.fecha = fecha;
		this.dni = dni;
		this.clase = clase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellidoDos() {
		return apellidoDos;
	}

	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", apellidoDos=" + apellidoDos + ", fecha="
				+ fecha + ", dni=" + dni + ", clase=" + clase + "]";
	}

}
