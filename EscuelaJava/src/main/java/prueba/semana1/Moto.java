package prueba.semana1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Moto.java Clase para el objecto Moto
 */
@Entity
@Table(name="moto")
public class Moto extends Vehiculo {
	@Column
    private String tipoMoto;
	@Column
	private static final String TIPO = "Moto";

    /**
     * contructor de la clase moto.
     */
    public Moto(String color, String marca, String precio, String matricula, String tipoMoto) {
        super(color, marca, precio, matricula, 2); // Una moto siempre tiene 2 ruedas
        this.tipoMoto = tipoMoto;

    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es una moto");
        System.out.println("Esta moto es de tipo " + tipoMoto);
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
