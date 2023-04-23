package prueba.semana1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Coche.java Clase para el objecto Coche
 */
@Entity
@Table(name="coche")
public class Coche extends Vehiculo {
	@Column
    private String tipoMarchas;
	@Column
	private static final String TIPO = "Coche";

    /**
     * Constructor de la clase Coche.
     *
     * @param color       color del vehiculo
     * 
     * @param marca       marca del vehiculo
     * 
     * @param precio      precio del vehiculo
     * 
     * @param matricula   matricula del vehiculo
     * 
     * @param tipoMarchas tipo de marchas del coche
     * 
     */
    public Coche(String color, String marca, String precio, String matricula, String tipoMarchas) {
        super(color, marca, precio, matricula, 4); // Siempre tiene 4 ruedas si es un coche
        this.tipoMarchas = tipoMarchas;

    }

    public String getTipoMarchas() {
        return tipoMarchas;
    }

    /**
     * imprime los datos del coche.
     *
     **/
    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un coche");
        System.out.println("Este coche tiene una marcha " + tipoMarchas);
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
