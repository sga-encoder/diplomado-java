package ClasesOperadores;

public class Ejercicio3 {
	public static void main (String [] args) {
		int numeroUno = 8;
		int numeroDos = 2;
		int aux;
		aux = numeroUno;
		numeroUno = numeroDos;
		numeroDos = aux;
		System.out.println("numeroUno: " + numeroUno + " numeroDos: " + numeroDos);
	}
}
