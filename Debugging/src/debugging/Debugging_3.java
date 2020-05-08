package debugging;

public class Debugging_3 {

    static int maximo(int t[]) {
        int max;
        max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }

        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int t[];
        t = new int[6];
        for (int i = 2; i < t.length - 2; i++) {
            t[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Los valores son:");
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i] + " ");
        }
        max = maximo(t);
        System.out.println("\nEl número mayor es: " + max);
    }
}
