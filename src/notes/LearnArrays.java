package notes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnArrays {
    private int[] values = {40, 17, 68, 22, 98, 67, 0, 19};

    private String[] cars = {"BMW", "JEEP", "FORD", "TESLA"};

    // Multidimensional
    private String[][] names = {{"Clístenes", "Felipe"}, {"Onassis", "Araújo"}};

    private void init() {
        System.out.println("> Learn Array <<");
    }

    public LearnArrays() {
        this.init();
    }

    public LearnArrays(int[] values) {
        this.values = values;
        this.init();
    }

    public LearnArrays showValues() {
        System.out.println(">> VALUES");
        System.out.println("values: " + Arrays.toString(this.values));
        System.out.println("cars: " + Arrays.toString(this.cars));

        List<String> names = Arrays.stream(this.names).map(Arrays::toString).collect(Collectors.toList());
        System.out.println("names: " + names.toString());
        return this;
    }

    public LearnArrays showLength() {
        System.out.println(this.values.length);
        System.out.println(this.cars.length);
        System.out.println(this.names.length);
        return this;
    }

    public LearnArrays sortArray() {
        System.out.println(">> SORT");
        Arrays.sort(this.values);
        Arrays.sort(this.cars);

        List<String> names = Arrays.stream(this.names).map((element) -> {
            Arrays.sort(element);
            return Arrays.toString(element);
        }).collect(Collectors.toList());

        System.out.println("> Array: sorted - " + Arrays.toString(this.values));
        System.out.println("> Array: sorted - " + Arrays.toString(this.cars));
        System.out.println("> Array: sorted - " + names.toString());
        return this;
    }
}
