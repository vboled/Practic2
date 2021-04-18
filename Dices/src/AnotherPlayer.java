public class AnotherPlayer extends BasePlayer{
    public AnotherPlayer(String nickname) {
        super(nickname);
    }

    @Override
    public int makeTurn(int numberOfDices) {
        // some another player's logic
        return super.makeTurn(numberOfDices);
    }
}
