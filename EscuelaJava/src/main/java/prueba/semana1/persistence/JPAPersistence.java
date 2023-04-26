package prueba.semana1.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAPersistence {

	public static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		// referenciamos a nuestra unidad de persistencia para gestionar 
		// nuestras entidades,
		// aqui le pasamos como parametro nuestro objeto de persistencia
		// que contiene todas las propiedades de conexion a la BD
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	/**
	 * Metodo que libera el objeto EntityManager (cierra conexion con la BD)
	 */
	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

}
