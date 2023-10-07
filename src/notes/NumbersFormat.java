package notes;

import java.text.NumberFormat;

public class NumbersFormat {

    private NumberFormat moeda = NumberFormat.getNumberInstance();

    private String productValue = moeda.format(3147.98);

    public NumbersFormat() {
        System.out.println(">> Numbers Format");
        System.out.println(">> " + this.productValue);
    }
}
