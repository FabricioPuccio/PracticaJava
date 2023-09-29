package accesoficheros;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Serializacion {

	public void serializando() {
		Administrador manager = new Administrador("Juan", 80000, 2005, 12, 15);
		manager.setIncentivo(5000);

		Empleado[] personal = {
				manager,
				new Empleado("Ana", 25000, 2008, 10, 1),
				new Empleado("Luis", 18000, 2012, 9, 15) 
				};

		try {

			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
					new FileOutputStream("D:/programacion/personal-workspace/serializacion-java/empleado.txt"));

			escribiendoFichero.writeObject(personal);

			escribiendoFichero.close();

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			try {
				ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream(
						"D:/programacion/personal-workspace/serializacion-java/empleado.txt"));

				// Vamos a recibir un array de Object
				Empleado[] personal_recuperado = (Empleado[]) recuperandoFichero.readObject();

				for (Empleado e : personal_recuperado) {
					System.out.println(e.toString());
				}

				recuperandoFichero.close();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {

			System.out.println("Error al intentar acceder a el fichero en la ruta establecida");
		}

	}
}

//Empleado implements Serializable = aquellos objetos de tipo Empleado pueden convertirse en bytes
class Empleado implements Serializable {

	/**
	 * Para evitar problemas de compatibilidad a la hora de intentar acceder a la
	 * lectura de un objeto serializado que su código podría ser modificado
	 * declaramos nosotros en el programa nuestro propio SHA, no dejamos que java lo
	 * cree automáticamente por defecto.
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	private double sueldo;
	private Date fechaDeContrato;

	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {

		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
		this.fechaDeContrato = fecha.getTime();

	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaDeContrato() {
		return fechaDeContrato;
	}

	public void subirSueldo(double porcentaje) {
		double aumento = this.sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}

	public String toString() {
		return "\nNombre: " + nombre + "\n" + "Fecha de contrato: " + fechaDeContrato + "\n" + "Sueldo: $" + sueldo;
	}
}

class Administrador extends Empleado {

	private static final long serialVersionUID = 1L;

	private double incentivo;

	public Administrador(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia);
		this.incentivo = 0;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setSueldo() {
		super.setSueldo(getSueldo() + getIncentivo());
	}

	public double getSueldo() {
		return super.getSueldo();
	}

	public String toString() {
		return super.toString() + "\nIncentivo: $" + incentivo;
	}

}
