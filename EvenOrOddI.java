package Others1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* CONDITIONAL STATEMENTS LAB - EVEN OR ODD
                  BY DANIELA PAVLOVA
         */

        int num = Integer.parseInt(scanner.nextLine());

        boolean isEven = num % 2 == 0;

        /* NEW CODE - REPLACEMENT OF THE IF-THEN-ELSE STATEMENT
                WITH TERNARY OPERATOR
         */

        String result;
        String even = "even";
        String odd = "odd";
        result = isEven ? even : odd;
        System.out.println(result);

        /* OLD CODE

        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

         */
    }
}
