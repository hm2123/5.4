public class Car {
    private String color;
    private int horsepower;
    private double enginesize;
    private String make;
    private static int count;
    private double engineSize;

    public Car() {
        color = "pearl white";
        horsepower = 450;
        enginesize = 3.0;
        make = "Infiniti";
        count++;
    }

    public Car(String color, int horsepower, double enginesize, String make) {
        this.color = color;
        this.horsepower = horsepower;
        this.enginesize = enginesize;
        this.make = make;
        count++;
    }

    public String getMake() { return make; }

    public void setMake(String newMake) {
        this.make = newMake; }

    public String getColor() { return color; }

    public void setColor(String newColor) {
        this.color = newColor; }

    public int getHorsepower() { return horsepower; }

    public void setHorsepower(int newHorsepower) {
        this.horsepower = newHorsepower; }

    public double getEngineSize() { return engineSize; }

    public void setEngineSize(double newEngineSize) {
        this.engineSize = newEngineSize; }


    public static int getCount() {
        return count;
    }

    public boolean equals(Car car){
        return this.color.equals(car.color) && this.horsepower == (car.horsepower) && this.enginesize == car.enginesize && car.make.equals(car.make);
    }

    @Override
    public String toString() {
        String output = (this.color + " " + this.make + ", " + this.horsepower + ", " + this.engineSize);
        return output;

    }

}