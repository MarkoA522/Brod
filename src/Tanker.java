// Klase koje nasledjuju klasu Ship: Tanker, Passenger, Cargo, Military
class Tanker extends Ship {
    private double cargoCapacity;

    public Tanker(int id, String name, EngineType engineType, double cargoCapacity) {
        super(id, name, engineType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getInfo() {
        return "Tanker - ID: " + id + ", Name: " + name + ", Engine Type: " + engineType + ", Cargo Capacity: " + cargoCapacity;
    }
}
