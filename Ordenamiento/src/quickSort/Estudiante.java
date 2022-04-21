package quickSort;

public class Estudiante {
	private int celular;
	private String nombre;

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int compareTo(Estudiante e) {
		return e.getCelular() - celular;
	}
}
