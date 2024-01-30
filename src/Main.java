import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ShipList shipList = new ShipList();

        // Dodavanje brodova razlicitog tipa
        shipList.addShip(new Tanker(1, "Tanker 1", EngineType.DIESEL, 5000));
        shipList.addShip(new Passenger(2, "Passenger 1", EngineType.ELECTRIC, 200));
        shipList.addShip(new Cargo(3, "Cargo 1", EngineType.DIESEL, 10000));
        shipList.addShip(new Military(4, "Military 1", EngineType.REACTOR, "Attack"));

        // Dodavanje posade na svaki brod
        List<String> sailors = new ArrayList<>();
        sailors.add("Sailor 1");
        sailors.add("Sailor 2");
        sailors.add("Sailor 3");
        sailors.add("Sailor 4");
        sailors.add("Sailor 5");
        sailors.add("Sailor 6");

        try {
            Crew crew = new Crew(sailors);
            if (crew.getNumberOfSailors() < 6) {
                throw new Crew.InsufficientCrewException("Insufficient crew members!");
            }
        } catch (Crew.InsufficientCrewException e) {
            System.out.println(e.getMessage());
        }

        // Upisivanje podataka u tekstualnu datoteku
        Thread writingThread = new Thread(() -> shipList.writeToFile());
        writingThread.start();

        // Cekanje 6 sekundi
        Thread.sleep(6000);

        // Citanje podataka iz tekstualne datoteke
        Thread readingThread = new Thread(() -> shipList.readFromFile());
        readingThread.start();
    }
}