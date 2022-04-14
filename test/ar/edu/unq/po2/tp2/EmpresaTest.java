package ar.edu.unq.po2.tp2;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class EmpresaTest {
	
	@SuppressWarnings("deprecation")
	PlantaPermanente empleado1 = new PlantaPermanente("ramiro", "quilmes", "soltero", new Date(1999, 12, 9), 10000, 0, 5);
	PlantaPermanente empleado2 = new PlantaPermanente("diego", "quilmes", "casado", new Date(1973, 02, 7), 5000, 2, 15);
	PlantaTemporaria empleado3 = new PlantaTemporaria("natalia", "quilmes", "soltera", new Date(1980, 05, 5), 25000, new java.util.Date(), 15);
	Contratado empleado4 = new Contratado("victoria", "quilmes", "soltera", new Date(2000, 07, 25), 1000, 007, "cheque");
	
	Empresa empresa = new Empresa("prueba","20423950057");

	@Test
	public void testCalcularSueldosNetos() {
		empresa.addEmpleado(empleado1);
		empresa.addEmpleado(empleado2);
		Integer sueldoNeto = 12261;
		assertEquals(sueldoNeto, empresa.calcularSueldosNetos());
	}

	@Test
	public void testGenerarRecibos() {
		empresa.addEmpleado(empleado1);
		empresa.generarRecibos();
		assertEquals(1, empleado1.getRecibos().size());
	}

}
