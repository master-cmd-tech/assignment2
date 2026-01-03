public class Car extends Vehicle implements Servicable {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return getBasePrice() * 0.05 + getAge(2025) * 20;
    }

    @Override
    public void performService() {
        System.out.println("Car service: oil change and diagnostics");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10_000;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", basePrice=" + getBasePrice() +
                ", doors=" + numberOfDoors +
                '}';
    }
}
