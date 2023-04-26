package prueba.semana1.interfaces;

/**
 * Interface Conducible.
 */
public interface Conducible { // Conducible
	/**
     * Arranca el vehiculo.
     *
     * @return boolean retorna true si el vehiculo es arrancado y false en caso contrario
     */
	boolean arrancar();
	/**
     * Avanza el vehiculo los metros especificados.
     *
     * @param distancia int metros a avanzar
     * @return boolean retorna true si el coche avanza los metros especificados y false en caso contrario
     */
    boolean avanzar(int distancia);

    /**
     * Retrocede el vehiculo una distancia especifica
     * 
     * @param distancia int metros que se retrocede
     * @return boolean retorna true si logra retroceder y false en caso contrario
     */
    boolean retroceder(int distancia);
    /**
	 * Para un vehiculo que esta en marcha
	 * 
	 * @return boolean retorna true si se logra parar el coche y false en caso contrario	 
	 */
    boolean parar();

}
