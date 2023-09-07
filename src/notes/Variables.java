package notes;

public class Variables {
    // Variables: Primitive Types
    byte age = 10;
    int salary = 50_000;
    long ageOfTheWorld = 78_000_000_000L;
    double PI = 3.14159265358979323846;
    char myInitial = 'C';
    boolean beautiful = true;

    // Variables: Reference Types.
    String name = "Clístenes Onassis";

    public void run() {
        System.out.println("## Variables");
        System.out.println(
                "name:" + "\t" + this.name + "\n" +
                "initial:" + "\t" + this.myInitial + "\n" +
                "age:" + "\t" + this.age + "\n" +
                "salary:" + "\t" + this.salary + "\n" +
                "beautiful:" + "\t" + this.beautiful + "\n" +
                "age of the world:" + "\t" + this.ageOfTheWorld + "\n" +
                "PI:" + "\t" + this.PI + "\n"
        );
    }

}
