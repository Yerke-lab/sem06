
public class Main {
    public static void main(String[] args) {
        int totalTests = 1000;
        MontyHallGame game = new MontyHallGame(totalTests);
        game.runSimulation();
        game.printStatistics();
    }
}


