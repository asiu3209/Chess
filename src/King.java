public class King extends Pieces{
    public boolean hasCastled = false;
    public King(boolean white){
        super(white);
    }

    public boolean isHasCastled() {
        return hasCastled;
    }

    public void setHasCastled(boolean castling){
        hasCastled = castling;
    }
}
