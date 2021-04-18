import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    public UserPlayer(String nickname) {
        super(nickname);
    }

    @Override
    public int makeTurn(int numberOfDices) {
        int score = 0;
        int turnScoreSum = 0;
        System.out.println("This is your turn!"); // User's logic
        System.out.println("Press Enter key to roll dice");
        Scanner scanner = new Scanner(System.in);
        String tap = scanner.nextLine();
        return super.makeTurn(numberOfDices);
    }
}
