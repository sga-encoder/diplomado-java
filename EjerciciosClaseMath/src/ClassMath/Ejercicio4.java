package ClassMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		double numero1 = Math.random()*50;
		double numero2 = Math.random()*50;
		 
		long Numero1Round = Math.round(numero1);
		double Numero1Floor = Math.floor(numero1);
		double Numero1Ceil = Math.ceil(numero1) ;
		
		long Numero2Round = Math.round(numero2);
		double Numero2Floor = Math.floor(numero2);
		double Numero2Ceil = Math.ceil(numero2);
		
		
		System.out.println("Round : " + Math.max(Numero1Round, Numero2Round));
		System.out.println("Floor : " + Math.max(Numero1Floor, Numero2Floor));
		System.out.println("Ceil  : " + Math.max(Numero1Ceil, Numero2Ceil));
		
		
		
		
		
		
		
	}

}
