package notes;

public class Operators {
    private int sum = 23 + 37; // should be 60
    private int subtraction = 27 - 2; // should be 25
    private int multiplication = 4 * 5; // should be 20
    private int divisionInt = 13 / 4; // should be 3

    // Apply type conversion. (casting)
    private double divisionDouble = (double)13 / (double) 4; // should be 3.25
    private int sum1 = Integer.parseInt("10") + 5; // should be 15
    private String convertToString = Integer.toString(10); // should be "10"

    /**
     * Order of operation.
     *
     * order: left -> right
     *
     * 1. parentheses.
     * 2. multiplication/division.
     * 3. sum/subtraction.
     */
    private int operation1 = 6 + 2 * 2 - 3; // should be 7
    private int operation2 = (6 + 2) * 2 - 3; // should be 13
    private int operation3 = 6 + 2 * (2 - 3); // should be 4
    private int operation4 = 6 / 2 * 2 - 4; // should be 2

    // Comparison operators.
    private boolean isActive = 10 >= 5; // should be true
    private boolean hasProblem = 10 < 5; // should be false


    // Logic operators
    private int price = 45;
    private boolean canBuy = this.price >= 10 && this.price <= 100;
    private boolean canAddProtection = this.canBuy || this.price < 10;
}
