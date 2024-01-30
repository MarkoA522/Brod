class Passenger extends Ship {
    private int passengerCapacity;

    public Passenger(int id, String name, EngineType engineType, int passengerCapacity) {
        super(id, name, engineType);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String getInfo() {
        return "Passenger - ID: " + id + ", Name: " + name + ", Engine Type: " + engineType + ", Passenger Capacity: " + passengerCapacity;
    }
}
