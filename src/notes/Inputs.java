package notes;

import java.util.Scanner;

public class Inputs {

    public Inputs() {
        double value1 = new Scanner("10.2323").nextDouble();
        double value2 = new Scanner("20.00").nextDouble();
        System.out.println("> Provided values: " + value1 + ", " + value2);
    }

    /**
     * Sum two numbers.
     */
    public void soma() {
        double valueX = new Scanner(System.in).nextDouble();
        double valueY = new Scanner(System.in).nextDouble();
        System.out.println("> result: " + (valueX + valueY));
    }

    public void numberOfDigits() {
        System.out.print("Enter a number: ");
        int value = new Scanner(System.in).nextInt();
        int length = Integer.toString(value).length();
        String result = length < 5 ? Integer.toString(length) : "5 ou mais";
        System.out.println("> Possui " + result + " dígitos.");
    }
}
