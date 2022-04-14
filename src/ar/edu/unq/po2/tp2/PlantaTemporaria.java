package ar.edu.unq.po2.tp2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PlantaTemporaria extends Empleado {
	private Date fechaDeFin;
	private Integer cantHorasExtras;
	
	public PlantaTemporaria(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, Integer sueldoBasico, Date fechaDeFin, Integer cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaDeFin = fechaDeFin;
		this.cantHorasExtras = cantHorasExtras;
	}

	public Date getFechaDeFin() {
		return fechaDeFin;
	}

	public void setFechaDeFin(Date fechaDeFin) {
		this.fechaDeFin = fechaDeFin;
	}

	public Integer getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(Integer cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}

	@Override
	public Integer calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularHorasExtras();
	}
	@Override
	public Integer calcularRetenciones() {
		return this.calcularObraSocial() + this.calcularAportesJubilatorios();
	}
	
	private Integer calcularHorasExtras() {
		return 40 * this.getCantHorasExtras();
	}

	private Integer calcularObraSocial() {
		return (10 * this.calcularSueldoBruto() / 100) + (this.edad() > 50 ? 50 : 0);
	}
	
	private Integer calcularAportesJubilatorios() {
		return (10 * this.calcularSueldoBruto() / 100) + (5 * this.getCantHorasExtras());
	}

	@Override
	public List<Integer> calcularConceptos() {
		return Arrays.asList(this.calcularHorasExtras());
	}
}
