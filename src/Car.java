
public class Car {

    private String plateNo;
    private String color;
    private int year;

    public Car(String plateNo, String color, int year) {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
    }

    public String toString() {
        return String.format("%-10s %-8s %-6d", plateNo, color, year);
    }

}
