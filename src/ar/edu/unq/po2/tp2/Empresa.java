package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public Integer calcularSueldosNetos() {
		Integer total = 0;
		for (Empleado e : empleados) {
			total += e.calcularSueldoNeto();
		}
		return total;
	}
	
	public Integer calcularSueldosBrutos() {
		Integer total = 0;
		for (Empleado e : empleados) {
			total += e.calcularSueldoBruto();
		}
		return total;
	}
	
	public Integer calcularRetenciones() {
		Integer total = 0;
		for (Empleado e : empleados) {
			total += e.calcularRetenciones();
		}
		return total;
	}
	
	public void generarRecibos() {
		for (Empleado e : empleados) {
			e.generarRecibo();
		} 
	}
}
