package prueba.semana1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Barco.java Clase para el objecto Barco
 *
 * @autor: Antoni
 * @revisor: Carlos
 * @version: 1.0
 */
@Entity
@Table(name="barco")
public class Barco extends Vehiculo {
	@Column
    private String tipoBarco;
	@Column
	private static final String TIPO = "Barco";

    /**
     * Constructor de la clase Barco.
     *
     * @param color     El color del Barco.
     * @param marca     La marca del Barco.
     * @param precio    El precio del Barco.
     * @param matricula La matricula del Barco.
     * @param tipoBarco El tipo de Barco.
     */
    public Barco(String color, String marca, String precio, String matricula, String tipoBarco) {
        super(color, marca, precio, matricula, 0);
        this.tipoBarco = tipoBarco;

    }

    /**
     * Devuelve el tipoBarco.
     *
     * @return String
     */
    public String getTipoBarco() {
        return tipoBarco;
    }

    @Override // <- Bien por el uso de Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un barco");
        System.out.println("Este barco es de tipo" + tipoBarco);
        super.imprimirDatos();
    }

	@Override
	public void grabar(Vehiculo v) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo v) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Vehiculo v) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(int id) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscarPorId(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> buscarTodos() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
