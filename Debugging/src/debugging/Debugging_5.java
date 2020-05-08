package debugging;

public class Debugging_5 {

    static boolean es_primo(int num) {
        boolean primo=false;
        int i;
        i = 1;
        int resto=1;
        while (resto!=0) {
            i++;
            resto=num%i;
        }
        if(num==i){
            primo=true;
        }
        return (primo);
    }
    /*static boolean es_primo(int num) {
        boolean primo;
        int i;
        primo = true;
        i = 2;
        while (i < num || primo == true) {
            if (num % i == 0) {
                primo = true;
            }
            i++;
        }
        return (primo);
    }*/

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

    public static void main(String[] args) {
        int num, div;
        System.out.println("Introduce números: ");
        num = Entrada.entero();
        div = num_divisores(num);
        System.out.println("Tiene " + div + " divisores.");
    }
}
