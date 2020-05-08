package debugging;

public class Debugging_4 {

    static void mostrar(int a, int b) {
        int mayor = 0, menor;
        if (a < b) {
            mayor = b;
            menor = a;
        } else {
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("Introduzca primer número: ");
        a = Entrada.entero();
        System.out.println("Introduzca segundo número: ");
        b = Entrada.entero();
        mostrar(a, b);
    }
}
