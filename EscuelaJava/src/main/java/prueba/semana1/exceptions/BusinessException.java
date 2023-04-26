package prueba.semana1.exceptions;
/**
 * Excepcion del negocio
 */
public class BusinessException extends Exception{
	public BusinessException() {
		super();
	}
	/**
	 * Exepcion del negocio
	 * 
	 * @param msg mensaje de la excepcion
	 */
	public BusinessException(String msg) {
		super(msg);
	}
}
