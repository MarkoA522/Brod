class Cargo extends Ship {
    private double cargoCapacity;

    public Cargo(int id, String name, EngineType engineType, double cargoCapacity) {
        super(id, name, engineType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getInfo() {
        return "Cargo - ID: " + id + ", Name: " + name + ", Engine Type: " + engineType + ", Cargo Capacity: " + cargoCapacity;
    }
}
