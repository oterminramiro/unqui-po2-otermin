package ar.edu.unq.po2.tp2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PlantaPermanente extends Empleado {
	private Integer cantidadDeHijos;
	private Integer antiguedad;
	
	public PlantaPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, Integer sueldoBasico, Integer cantidadDeHijos, Integer antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	public Integer getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(Integer cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public Integer calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularSalarioFamiliar() + this.calcularAntiguedad();
	}
	
	@Override
	public Integer calcularRetenciones() {
		return this.calcularObraSocial() + this.calcularAportesJubilatorios();
	}
	
	private Integer calcularSalarioFamiliar() {
		return this.calcularAsignacionPorHijo() + this.calcularAsignacionPorConyuge();
	}
	
	private Integer calcularAsignacionPorHijo() {
		return 150 * this.getCantidadDeHijos();
	}
	
	private Integer calcularAsignacionPorConyuge() {
		return this.getEstadoCivil() == "casado" ? 100 : 0;
	}
	
	private Integer calcularAntiguedad() {
		return 50 * this.getAntiguedad();
	}
	
	private Integer calcularObraSocial() {
		return this.calcularObraSocialPorSueldo() + this.calcularObraSocialPorHijo();
	}
	
	private Integer calcularObraSocialPorSueldo() {
		return 10 * this.calcularSueldoBruto() / 100;
	}
	
	private Integer calcularObraSocialPorHijo() {
		return 20 * this.getCantidadDeHijos();
	}
	
	private Integer calcularAportesJubilatorios() {
		return 15 * this.calcularSueldoBruto() / 100;
	}
	
	@Override
	public List<Integer> calcularConceptos() {
		return Arrays.asList(this.calcularSalarioFamiliar(), this.calcularAntiguedad());
	}
}
