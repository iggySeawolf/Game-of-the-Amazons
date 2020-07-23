public class Tile {
    int x, y;
//    boolean occupied; //whether a piece is here or not.

    public Tile(){
        this.x = Integer.max;
        this.y = -1;
    }

    public Tile(int x, int y){

    }


    @Override
    public String toString() {
        return "Tile{" +
                "x=" + x +
                ", y=" + y +
//                ", occupied=" + occupied +
                '}';
    }
}
