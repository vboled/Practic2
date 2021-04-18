public abstract class BasePlayer implements Player{
    private int scores;
    private int numberOfWins;
    private int turnScore;
    private String nickname;

    public BasePlayer(String nickname) {
        this.nickname = nickname;
        this.scores = 0;
        this.numberOfWins = 0;
    }

    @Override
    public int compareTo(Player player) {
        return player.getTurnScore() - this.turnScore;
    }

    @Override
    public void increaseNumberOfWins() {
        this.numberOfWins += 1;
    }

    @Override
    public int getNumberOfWins() {
        return numberOfWins;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void setTurnScore(int turnScore) {
        this.turnScore = turnScore;
    }

    @Override
    public int getTurnScore() {
        return turnScore;
    }

    @Override
    public void increaseScore(int scores) {
        this.scores += scores;
    }

    public int makeTurn(int numberOfDices) {
        int score = 0;
        int turnScoreSum = 0;
        System.out.println(this.getNickname() + " turn is: ");
        for (int i = 0; i < numberOfDices; i++) {
            score = (int)(Math.random() * 6) + 1;
            System.out.print(score + " ");
            turnScoreSum += score;
        }
        this.setTurnScore(turnScoreSum);
        System.out.println("sum: " + turnScoreSum);
        System.out.println();
        return turnScoreSum;
    }
}
