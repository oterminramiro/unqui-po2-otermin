package ar.edu.unq.po2.tp2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Contratado extends Empleado{
	private Integer numeroDeContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, Integer sueldoBasico, Integer numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

	public Integer getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(Integer numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	@Override
	public Integer calcularSueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public Integer calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones() - this.calcularGastosAdministrativos();
	}
	
	@Override
	public Integer calcularRetenciones() {
		return 0;
	}
	
	private Integer calcularGastosAdministrativos() {
		return 50;
	}
	
	@Override
	public List<Integer> calcularConceptos() {
		return Arrays.asList(this.calcularGastosAdministrativos());
	}
}
