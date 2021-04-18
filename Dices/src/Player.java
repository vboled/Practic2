public interface Player extends Comparable<Player> {

    public int compareTo(Player player);

    void increaseNumberOfWins();

    public int getNumberOfWins();

    public String getNickname();

    public void setTurnScore(int turnScore);

    public int getTurnScore();

    public void increaseScore(int scores);

    public int makeTurn(int numberOfDices);
}
