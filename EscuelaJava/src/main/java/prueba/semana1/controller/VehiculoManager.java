package prueba.semana1.controller;

import prueba.semana1.model.Barco;
import prueba.semana1.model.Coche;
import prueba.semana1.model.Moto;
import prueba.semana1.model.Vehiculo;

/**
 * VehiculoManager
 * Se encarga de gestionar los Vehiculos.
 */
public class VehiculoManager {
    private Vehiculo vehiculo;

    /**
	 * Método para crear un Vehiculo siguiendo el input del usuario.
	 *
	 * @return Vehiculo vehiculo
	 */
	public Vehiculo createVehiculo() {

		InputHandler inputHandler = new InputHandler();

		Integer tipoVehiculo = inputHandler.getTipoVehiculo();

		switch (tipoVehiculo) {
		case 0: // Coche
			this.vehiculo = this.createCoche();
			break;
		case 1: // Moto
			this.vehiculo = this.createMoto();
			break;
		case 2: // Barco
			this.vehiculo = this.createBarco();
			break;
		case 3: // Salir
			break;
		default: // Como default por opcion no incluida, salir
			System.out.println("No se ha encontrado una opción válida.");
			return null;

		}
		return null; // no se ha encontrado ningun resultado valido

	}

	/**
	 * Crea un Vehiculo de tipo Coche
	 * 
	 * @return Vehiculo un Vehiculo de tipo coche
	 */
	private Vehiculo createCoche() {
		Coche coche = new Coche("Rojo", "Toyota", "20.000 €", "SADF12", "Manual");
		System.out.println("Se ha creado un vehículo de tipo Coche ");
		return coche;
	}

	/**
	 * Crea un Vehiculo de tipo Moto
	 * 
	 * @return Vehiculo un Vehiculo de tipo Moto
	 */
	private Vehiculo createMoto() {
		Moto moto = new Moto("Negro", "Yamaha", "50.000 €", "YTUI78", "Motocross");
		System.out.println("Se ha creado un vehículo de tipo Moto ");
		return moto;
	}
	
	/**
	 * Crea un Vehiculo de tipo Barco
	 * 
	 * @return Vehiculo un Vehiculo de tipo Barco
	 */
	private Vehiculo createBarco() {
		Barco barco = new Barco("Rojo", "Toyota", "20.000 €", "VBNM76", "Yate");
		System.out.println("Se ha creado un vehículo de tipo Barco ");
		return barco;
	}

	/**
	 * Maneja las acciones de un vehiculo
	 * 
	 * @return boolean retorna true si la accion seleccionada se ejecuta
	 *         correctamente y false en caso contrario
	 */
	public boolean runAccion() {
		boolean correct = false;
		InputHandler inputHandler = new InputHandler();

		Integer accion = inputHandler.getAccion();

		switch (accion) {
		case 0: // Opcion arranque
			correct = vehiculo.arrancar();

		case 1: // Opcion parar
			correct = vehiculo.parar();

		case 2: // Opcion avanzar
			int metrosAvanzados = inputHandler.getMetros();
			correct = vehiculo.avanzar(metrosAvanzados);

		case 3: // Opcion retroceder
			int metrosRetrocedidos = inputHandler.getMetros();
			correct = vehiculo.retroceder(metrosRetrocedidos);

		case 4: // Opcion imprimir datos
			vehiculo.imprimirDatos();
			correct = true;

		case 5: // Salir
			correct = true;

		default: // Como default por opcion no incluida, salir
			correct = false;

		}
		return correct;

	}

}
