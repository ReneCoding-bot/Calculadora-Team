package calculadora;

public class Calculadora {

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

	// Fase 2 - metodo DESARROLLADOR B 
	public double potencia(double base, double exponente) {
		 return Math.pow(base, exponente);
		}
}
