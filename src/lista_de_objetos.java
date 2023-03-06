
public class lista_de_objetos implements Comparable<lista_de_objetos> {

	private String nombre;
	private int tiempo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public lista_de_objetos(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	@Override

	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(lista_de_objetos o) {
		return 0;
	}
	
	

}
