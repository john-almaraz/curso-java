package prueba.semana1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import prueba.semana1.model.Coche;

public class VehiculoTest {
	private static Coche coche;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		coche = new Coche("Negro","BMW","8.000 €","AD-456","Manual");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Fin del test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicio Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Hora Test: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
	}

	/**
	 * Verificacion del arrancado de un coche
	 */
	@Test
	public void testArrancar() {
		coche.arrancar();
		assertEquals(true, coche.getArrancado());
	}

}
