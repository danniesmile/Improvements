package Others1;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* CONDITIONAL STATEMENTS LAB - EQUAL NUMBERS
                  BY DANIELA PAVLOVA
         */

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        /* NEW CODE - REPLACEMENT OF THE IF-THEN-ELSE STATEMENT
                WITH TERNARY OPERATOR
         */

        boolean condition = ((num1 == num2) && (num2 == num3));
        String yes = "yes";
        String no = "no";
        String result;
        result = condition ? yes : no;
        System.out.println(result);

        /* OLD CODE

         if ((num1 == num2) && (num2 == num3)) {
             System.out.println("yes");
          } else {
             System.out.println("no");
          }

        */
    }
}
