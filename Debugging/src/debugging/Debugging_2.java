package debugging;

public class Debugging_2 {

    static int maximo2(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.println("Introduce un número:: ");
        a = Entrada.entero();
        System.out.println("Introduce otro número:: ");
        b = Entrada.entero();
        max = maximo2(a, b);
        System.out.println("El número mayor es: " + max);
    }
}
