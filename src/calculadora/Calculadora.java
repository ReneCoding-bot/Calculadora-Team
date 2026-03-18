package calculadora;

public class Calculadora {
	
// Codigo duplicado 
//	public double sumar(double a, double b) {
//		return a + b;
//	}
//
//	public double restar(double a, double b) {
//		return a - b;
//	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("--- CALCULADORA DEL EQUIPO A Y B ---");
		System.out.println("Suma: " + calc.sumar(10, 5));
	}

	public double sumar(double a, double b) {
		return a + b;
	}

	public double restar(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

//	public static void main1(String[] args) {
//		Calculadora calc = new Calculadora();
//		System.out.println("--- CALCULADORA DEL JEFE A ---");
//		System.out.println("Suma: " + calc.sumar(10, 5));
//	}

}
