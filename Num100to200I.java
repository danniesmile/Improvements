package Others1;

import java.util.Scanner;

public class Num100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* CONDITIONAL STATEMENTS LAB - NUM 100..200
                  BY DANIELA PAVLOVA
         */

        int number = Integer.parseInt(scanner.nextLine());

        /* NEW CODE - REPLACEMENT OF THE IF-ELSE IF-ELSE STATEMENT
                WITH CHAINED TERNARY OPERATOR
         */

        boolean condition1 = number <= 99;
        boolean condition2 = number <= 200;
        String lessThan = "Less than 100";
        String between = "Between 100 and 200";
        String greater = "Greater than 200";

        String result;
        result = condition1 ? lessThan : condition2 ? between : greater;
        System.out.println(result);

        /* OLD CODE

         if (number <= 99) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

         */
    }
}
