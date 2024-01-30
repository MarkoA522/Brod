import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Klasa ShipList (Lista brodova) koja implementira interfejs ShipCollection
class ShipList implements ShipCollection {
    private List<Ship> ships;

    public ShipList() {
        ships = new ArrayList<>();
    }

    @Override
    public void addShip(Ship ship) {
        ships.add(ship);
    }

    @Override
    public void removeShip(Ship ship) {
        ships.remove(ship);
    }

    @Override
    public Ship findShip(int id) {
        for (Ship ship : ships) {
            if (ship.id == id) {
                return ship;
            }
        }
        return null;
    }

    // Metoda za upisivanje brodova u tekstualnu datoteku
    public void writeToFile() {
        try {
            FileWriter writer = new FileWriter("ships.txt");
            for (Ship ship : ships) {
                writer.write(ship.getInfo() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda za citanje podataka iz tekstualne datoteke
    public void readFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ships.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
