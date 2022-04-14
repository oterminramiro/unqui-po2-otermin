package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaNacimiento;
	private Integer sueldoBasico;
	private List<ReciboDeSueldo> recibos = new ArrayList<ReciboDeSueldo>();
	
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, Integer sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public List<ReciboDeSueldo> getRecibos() {
		return recibos;
	}

	public void addRecibo(ReciboDeSueldo recibo) {
		this.recibos.add(recibo);
	}

	public Integer edad() {
		return Period.between(this.covertDate(this.getFechaNacimiento()), this.covertDate(new java.util.Date())).getYears();
	}
	
	private LocalDate covertDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public Integer calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}

	public Integer calcularSueldoBruto() {
		return null;
	}

	public Integer calcularRetenciones() {
		return null;
	}
	
	public List<Integer> calcularConceptos() {
		return null;
	}
	
	public ReciboDeSueldo generarRecibo() {
		ReciboDeSueldo recibo = new ReciboDeSueldo(this.getNombre(), this.getDireccion(), new java.util.Date(), this.calcularSueldoBruto(), this.calcularSueldoNeto(), this.calcularConceptos());
		this.addRecibo(recibo);
		return recibo;
	}
}
