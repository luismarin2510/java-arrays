import java.util.ArrayList;

public class Lectura_arrays {

	public static void main(String[] args) {

		String Variable1 = "Ejemplo1";
		String Variable2 = "Ejemplo2";
		String Variable3 = "Ejemplo3";
		String Variable4 = "Ejemplo4";

		ArrayList<String> lista = new ArrayList<>();

		lista.add(Variable1);
		lista.add(Variable2);
		lista.add(Variable3);
		lista.add(Variable4);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("  ");
		
		for (String clase : lista) {
			System.out.println(clase);
		}
		System.out.println("  ");
		
		lista.forEach(clase->{
			System.out.println(clase);
		});

	}

}
