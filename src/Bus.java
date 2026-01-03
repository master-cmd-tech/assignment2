public class Bus extends Vehicle implements Servicable {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return getBasePrice() * 0.08 + getAge(2025) * 50;
    }

    @Override
    public void performService() {
        System.out.println("Bus service: engine, brakes, and safety inspection");
    }

    @Override
    public int getServiceIntervalKm() {
        return 20_000;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", basePrice=" + getBasePrice() +
                ", capacity=" + passengerCapacity +
                '}';
    }
}

