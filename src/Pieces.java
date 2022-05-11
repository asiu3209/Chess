public abstract class Pieces {
    private boolean white = false;
    private boolean killed = false;

    public Pieces(boolean white)
    {
        this.white = white;
    }

    public boolean isWhite()
    {
        return white;
    }

    public void setWhite(boolean white)
    {
        this.white = white;
    }

    public boolean isKilled()
    {
        return killed;
    }

    public void setKilled(boolean killed)
    {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);
}

