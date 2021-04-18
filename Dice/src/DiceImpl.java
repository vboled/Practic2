public class DiceImpl implements Dice {
    private int lastScore = -1;

    @Override
    public void roll() {
        lastScore = (int)(Math.random() * 6) + 1;
    }

    @Override
    public void look() {
        if (lastScore == -1)
            System.out.println("There is no throw!!!");
        else
            System.out.println(lastScore);
    }
}
