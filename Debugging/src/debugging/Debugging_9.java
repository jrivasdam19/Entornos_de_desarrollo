package debugging;

public class Debugging_9 {

    static int suma_n_impares(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i - 1;
        }
        return (suma);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Introduzca un número: ");
        n = Entrada.entero();
        System.out.println("La suma de los " + n + " primeros impares es: " + suma_n_impares(n));
    }
}
