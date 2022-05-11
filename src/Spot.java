public class Spot {
    private Pieces piece;
    private int x;
    private int y;

    public Spot(int x, int y, Pieces piece)
    {
        setPiece(piece);
        this.x = x;
        this.y = y;
    }

    public Pieces getPiece()
    {
        return piece;
    }

    public void setPiece(Pieces p)
    {
        this.piece = p;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}

