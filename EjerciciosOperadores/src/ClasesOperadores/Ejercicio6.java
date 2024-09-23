package ClasesOperadores;

public class Ejercicio6 {
	public static void main (String [] args) {
		int ladoCuadrado = 8;
		int perimetroCuadrado = ladoCuadrado*4;
		int areaCuadrado = ladoCuadrado*ladoCuadrado;
		int baseTriangulo = 8;
		int alturaTriangulo = 9;
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
		int areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
		int perimetroTriangulo = alturaTriangulo+ladoDosTriangulo+ladoDosTriangulo;
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		int areaRectangulo = baseRectangulo*alturaRectangulo;
		int perimetroRectangulo = alturaRectangulo*2+baseRectangulo*2;
		System.out.println("P.Cuadrado:   " + perimetroCuadrado + " A.Cuadrado:   " + areaCuadrado);
		System.out.println("P.Triangulo:  " + perimetroTriangulo + " A.Triangulo:  " + areaTriangulo);
		System.out.println("P.Rectangulo: " + perimetroRectangulo + " A.Rectangulo: " + areaRectangulo);
	}
}
