package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReciboDeSueldo {
	private String nombreEmpleado;
	private String direccion;
	private Date fechaEmision;
	private Integer sueldoBruto;
	private Integer sueldoNeto;
	private List<Integer> conceptos = new ArrayList<Integer>();
	
	public ReciboDeSueldo(String nombreEmpleado, String direccion, Date fechaEmision, Integer sueldoBruto, Integer sueldoNeto, List<Integer> conceptos) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Integer getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Integer sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Integer getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Integer sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public List<Integer> getConceptos() {
		return conceptos;
	}

	public void setConceptos(List<Integer> conceptos) {
		this.conceptos = conceptos;
	}
}
