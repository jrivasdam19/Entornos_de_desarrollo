package debugging;

import java.util.Scanner;

public class Debugging_1 {

    public static void main(String[] args) {
        // previo al merge

        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados Centígrados:");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC) / 5;
        System.out.println(gradosC + "ºC = " + gradosF + "ºF");
    }
}
