class Military extends Ship {
    private String mission;

    public Military(int id, String name, EngineType engineType, String mission) {
        super(id, name, engineType);
        this.mission = mission;
    }

    @Override
    public String getInfo() {
        return "Military - ID: " + id + ", Name: " + name + ", Engine Type: " + engineType + ", Mission: " + mission;
    }
}
