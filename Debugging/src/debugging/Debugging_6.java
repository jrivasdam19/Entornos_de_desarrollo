package debugging;

public class Debugging_6 {

    static boolean es_primo(int num) {
        boolean primo = false;
        int i;
        i = 1;
        int resto = 1;
        while (resto != 0) {
            i++;
            resto = num % i;
        }
        if (num == i) {
            primo = true;
        }
        return (primo);
    }

    static int num_divisores(int num) {
        int cont;
        cont = 1;
        for (int i = 2; i <= num; i++) {
            if (es_primo(i) && num % i == 0) {
                cont++;
            }
        }
        return (cont);
    }

    static int[] divisores(int num) {
        int cont = 1;
        int div[];
        int num_div;
        num_div = num_divisores(num);
        div = new int[num_div];
        div[0] = 1;
        for (int i = 2; i <= num; i++) {
            if (es_primo(i) && num % i == 0) {
                div[cont] = i;
                cont++;
            }
        }
        return (div);
    }

    public static void main(String[] args) {
        int num, divisores[];
        System.out.println("Introduce números: ");
        num = Entrada.entero();
        divisores = divisores(num);
        System.out.println("Los divisores de " + num + " son: ");
        for (int i = 0; i < divisores.length; i++) {
            System.out.println(divisores[i] + " ");
            System.out.println("");
        }
    }
}
