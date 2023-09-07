package notes;

import java.util.Arrays;

public class LearnArrays {
    private int[] values = {40, 17, 68, 22, 98, 67, 0, 19};

    public LearnArrays() {
    }

    public LearnArrays(int[] values) {
        this.values = values;
    }

    public void showValues() {
        System.out.println(Arrays.toString(this.values));
    }

    public void showLength() {
        System.out.println(this.values.length);
    }
}
