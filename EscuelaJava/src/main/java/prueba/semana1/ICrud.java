package prueba.semana1;

import java.util.List;

public interface ICrud {

	/**
	 * Graba un vehiculo en la BD
	 * 
	 * @param v vehiculo que se quiere guardar en la BD
	 * @throws BusinessException 
	 */
	public void grabar(Vehiculo v) throws BusinessException;

	/**
	 * Actualiza un vehiculo en la BD
	 * 
	 * @param v vehiculo que se quiere actualizar en la BD
	 * @throws BusinessException
	 */
	public void actualizar(Vehiculo v) throws BusinessException;

	/**
	 * Elimina un vehiculo de la BD
	 * 
	 * @param v vehiculo que se quiere eliminar en la BD
	 * @throws BusinessException
	 */
	public void borrar(Vehiculo v) throws BusinessException;

	/**
	 * Elimina un vehiculo de la BD
	 * 
	 * @param id clave primaria del vehiculo que se quiere eliminar
	 * @throws BusinessException
	 */
	public void borrar(int id) throws BusinessException;

	/**
	 * Busca un vehiculo de la BD
	 * 
	 * @param id clave primaria del vehiculo que se quiere buscar
	 * @return
	 * @throws BusinessException
	 */
	public Vehiculo buscarPorId(int id) throws BusinessException;

	/**
	 * Busca todos los vehiculos de una tabla
	 * 
	 * @return una lista con todos los vehiculos de una tabla
	 * @throws BusinessException
	 */
	public List<Vehiculo> buscarTodos() throws BusinessException;
	
}
