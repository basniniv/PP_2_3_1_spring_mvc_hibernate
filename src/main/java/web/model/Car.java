package web.model;

public class Car {

    private String name;
    private int series;
    private String color;

    public Car(String name, int series, String color) {
        this.name = name;
        this.series = series;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Series: " + getSeries() + ", Color: " + getColor();
    }
}
