// Interfejs ShipCollection (Kolekcija brodova)
interface ShipCollection {
    void addShip(Ship ship);

    void removeShip(Ship ship);

    Ship findShip(int id);
}
