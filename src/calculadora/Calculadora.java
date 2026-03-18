package calculadora;

public class Calculadora {
public double sumar(double a, double b) { return a + b; }
public double restar(double a, double b) { return a - b; }
public static void main(String[] args) {
Calculadora calc = new Calculadora();
System.out.println("--- INICIO DE LA CALCULADORA ---");
System.out.println("Suma: " + calc.sumar(10, 5));
}
}
