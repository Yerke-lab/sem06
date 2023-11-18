import java.util.HashMap;
import java.util.Map;
import java.util.Random;



public class MontyHallGame {
    private int totalTests;
    private Map<Integer, Boolean> results;

    public MontyHallGame(int totalTests) {
        this.totalTests = totalTests;
        results = new HashMap<>();
    }

     public void runSimulation() {
        Random random = new Random();

        for (int i = 1; i <= totalTests; i++) {
            int carDoor = random.nextInt(3);
            int chosenDoor = random.nextInt(3);

            int openedDoor;
            do {
                openedDoor = random.nextInt(3);
            } while (openedDoor == chosenDoor || openedDoor == carDoor);

            int newChosenDoor;
            do {
                newChosenDoor = random.nextInt(3);
            } while (newChosenDoor == chosenDoor || newChosenDoor == openedDoor);

            boolean won = newChosenDoor == carDoor;
            results.put(i, won);
        }
    }

    public void printStatistics() {
        int wins = 0;
        int losses = 0;
        for (boolean result : results.values()) {
            if (result) {
                wins++;
            } else {
                losses++;
            }
        }
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of defeats: " + losses);
    }
}
