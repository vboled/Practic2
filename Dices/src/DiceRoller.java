import java.util.*;

public class DiceRoller {
    private ArrayList<Player> allPlayers = new ArrayList<Player>();
    private int numberOfDices;

    public DiceRoller(int numberOfPlayers, int numberOfDices) throws Exception {
        if (numberOfPlayers < 2) {
            throw new Exception("Not enough players");
        } else if (numberOfDices < 1) {
            throw new Exception("Not enough dices");
        }
        this.numberOfDices = numberOfDices;
        allPlayers.add(new UserPlayer("You"));
        for (int i = 0; i < numberOfPlayers - 2; i++) {
            allPlayers.add(new AnotherPlayer(i + 1 + "Player"));
        }
        allPlayers.add(new ComputerPlayer("Computer"));
    }

    void printScores() {
        for (Player player : allPlayers) {
            System.out.println(player.getNickname() + " " + player.getNumberOfWins());
        }
    }

    void turnWinners(int maxTurnScores) {
        System.out.println("In this turn wins: ");
        for (Player player : allPlayers) {
            if (maxTurnScores == player.getTurnScore()) {
                player.increaseNumberOfWins();
                System.out.print(player.getNickname() + " ");
            }
        }
        System.out.println("\n\n");
    }

    void congratulation() {
        System.out.println("Congratulate winners: ");
        for (Player player : allPlayers) {
            if (player.getNumberOfWins() == 7) {
                System.out.print(player.getNickname() + " ");
            }
        }
        System.out.println("\nEnd Game!");
    }

    public void play() throws InterruptedException {
        while (true) {
            int maxTurnScore = 0;
            for (Player player : allPlayers) {
                int currentScore = player.makeTurn(numberOfDices);
                if (currentScore > maxTurnScore) {
                    maxTurnScore = currentScore;
                }
                player.increaseScore(currentScore);
            }
            this.turnWinners(maxTurnScore);
            Collections.sort(this.allPlayers);
            System.out.println("Subtotals: ");
            this.printScores();
            Thread.sleep(2000);
            for (Player player : allPlayers) {
                if (player.getNumberOfWins() == 7) {
                    this.congratulation();
                    return;
                }
            }
        }
    }

}
