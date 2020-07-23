public class Queen extends Tile{
    //int previousX, previousY;
    Tile previous;
    char color;
    boolean isOpponent;

    public Queen(int x, int y){
        super(x,y);
    }
    public Queen(int x, int y, boolean isOpponent){
        super(x,y);
        this.


    }


    @Override
    public String toString() {
        return "Queen{" +
                "previousX=" + previousX +
                ", previousY=" + previousY +
                ", color=" + color +
                '}';
    }
}
