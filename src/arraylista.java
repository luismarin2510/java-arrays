import java.util.ArrayList;

public class arraylista {

	public static void main(String[] args) {
		
		String Variable1 = "Ejemplo1";
		String Variable2 = "Ejemplo2";
		String Variable3 = "Ejemplo3";
		String Variable4 = "Ejemplo4";

		ArrayList<String> lista = new ArrayList();

		lista.add(Variable1);
		lista.add(Variable2);
		lista.add(Variable3);
		lista.add(Variable4);

		System.out.println(lista);

		lista.remove(2);
		System.out.println(lista);

		lista.set(1, "ejemplo alterado");
		System.out.println(lista);

	}

}
