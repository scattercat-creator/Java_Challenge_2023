class Die
{
    private int sides;
    private int lastRoll = -1;
    public Die()
    {
        sides = 6;
    }
    public Die(int mySides)
    {
        sides = mySides;
    }

    public int numSides()
    {
        return sides;
    }
    public int roll()
    {
        lastRoll = (int) (Math.random() * sides) + 1;
        return lastRoll;
    }

    public int readLastRoll()
    {
        return lastRoll;
    }
}