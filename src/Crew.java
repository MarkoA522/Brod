import java.util.List;

// Klasa Crew (Pomorska posada)
class Crew {
    private List<String> sailors;

    public Crew(List<String> sailors) {
        this.sailors = sailors;
    }

    public int getNumberOfSailors() {
        return sailors.size();
    }

    // Izuzetak ako je broj mornara u posadi manji od 6
    public static class InsufficientCrewException extends Exception {
        public InsufficientCrewException(String message) {
            super(message);
        }
    }
}
