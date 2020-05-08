package debugging;

public class Debugging_7 {

    static int max_comun_divisor(int a, int b) {
        int mcd = 1;
        int min;
        min = minimo(a, b);
        mcd = 1;
        for (int i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
            }
        }
        return (mcd);
    }

    static int minimo(int a, int b) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return (min);
    }

    public static void main(String[] args) {
        int a, b, mcd;
        System.out.println("Introduce números: ");
        a = Entrada.entero();
        System.out.println("Introduce otro: ");
        b = Entrada.entero();
        System.out.println("");
        mcd = max_comun_divisor(a, b);
        System.out.println("El mcd de " + a + " y " + b + " es " + mcd + ".");
    }
}
