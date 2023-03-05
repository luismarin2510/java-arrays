import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class metodocolecction {

	public static void main(String[] args) {

		String clase1 = "Fisica";
		String clase2 = "Matematicas";
		String clase3 = "Quimica";
		String clase4 = "Filosofia";

		ArrayList<String> cursos = new ArrayList<>();

		cursos.add(clase1);
		cursos.add(clase2);
		cursos.add(clase3);
		cursos.add(clase4);

		System.out.println(cursos);

		Collections.sort(cursos); // orden alfabetico ascendente 
		System.out.println(cursos);
		
		Collections.sort(cursos, Collections.reverseOrder()); // orden alfabetico decendente 
		System.out.println(cursos);
		
		cursos.sort(Comparator.reverseOrder()); // orden alfabetico decendente 
		System.out.println(cursos);
		
		cursos.sort(Comparator.naturalOrder()); // orden alfabetico ascendente 
		System.out.println(cursos);
		
		

	}

}
