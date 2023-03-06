import java.util.ArrayList;
import java.util.Collections;


public class test_lista_ordenando_objetos {

	public static void main(String[] args) {

		lista_de_objetos curso1 = new lista_de_objetos("Python", 40);
		lista_de_objetos curso2 = new lista_de_objetos("Java", 40);
		lista_de_objetos curso3 = new lista_de_objetos("PHP", 40);
		lista_de_objetos curso4 = new lista_de_objetos("CSS", 40);

		ArrayList<lista_de_objetos> curso = new ArrayList<>();

		curso.add(curso1);
		curso.add(curso2);
		curso.add(curso3);
		curso.add(curso4);
		System.out.println(curso);

		Collections.sort(curso);

		System.out.println(curso);

	}

}
