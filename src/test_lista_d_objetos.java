import java.util.ArrayList;


public class test_lista_d_objetos {

	public static void main(String[] args) {

		lista_de_objetos curso1 = new lista_de_objetos("Geometria", 30);
		lista_de_objetos curso2 = new lista_de_objetos("Sociales", 30);
		lista_de_objetos curso3 = new lista_de_objetos("Español", 30);
		lista_de_objetos curso4 = new lista_de_objetos("Estadistica", 30);

		ArrayList<lista_de_objetos> curso = new ArrayList<>();

		curso.add(curso1);
		curso.add(curso2);
		curso.add(curso3);
		curso.add(curso4);
		System.out.println(curso);

	}

}
