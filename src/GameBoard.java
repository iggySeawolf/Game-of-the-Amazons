public class GameBoard {
    Tile[][] Board;

    public TileName(Tile tile)
    {
        return new TileName()
    }
    public GameBoard(boolean newBoard) {
        if (newBoard) {
            Board = new Tile[][]{
                    {new Tile(0,0), new Tile(1,0), new Tile(2,0), new Queen(3, 0, 'b'), new Tile(4,0), new Tile(5,0), new Queen(6, 0, 'b'), new Tile(7,0), new Tile(8,0), new Tile(9,0),},
                    {new Tile(0,1), new Tile(1,1), new Tile(2,1), new Tile(3,1), new Tile(4,1), new Tile(5,1), new Tile(6,1), new Tile(7,1), new Tile(8,1), new Tile(9,1),},
                    {new Tile(0,2), new Tile(1,2), new Tile(2,2), new Tile(3,2), new Tile(4,2), new Tile(5,2), new Tile(6,2), new Tile(7,2), new Tile(8,2), new Tile(9,2),},
                    {new Queen(0, 3, 'b'), new Tile(1,3), new Tile(2,3), new Tile(3,3), new Tile(4,3), new Tile(5,3), new Tile(6,3), new Tile(7,3), new Tile(8,3), new Queen(9, 3, 'b')},
                    {new Tile(0,4), new Tile(1,4), new Tile(2,4), new Tile(3, 4), new Tile(4,4), new Tile(5,4), new Tile(6, 4), new Tile(7,4), new Tile(8,4), new Tile(9,4),},
                    {new Tile(0,4), new Tile(1,4), new Tile(2,4), new Tile(3, 4), new Tile(4,4), new Tile(5,4), new Tile(6, 4), new Tile(7,4), new Tile(8,4), new Tile(9,4),},
                    {new Queen(0, 6, 'w'), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Queen(9, 6, 'w'),},
                    {new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(),},
                    {new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(), new Tile(),},
                    {new Tile(), new Tile(), new Tile(), new Queen(3, 9, 'w'), new Tile(), new Tile(), new Queen(6, 9, 'w'), new Tile(), new Tile(), new Tile(),},
            };

//            Board = new Tile[][]{
//                    {null, null, null, new Queen(3,0), null, null, new Queen(6,0), null, null, null },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {new Queen(0,3), null, null, null, null, null, null, null, null, new Queen(9,3) },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {new Queen(0,6), null, null, null, null, null, null, null, null, new Queen(9,6) },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {null, null, null, null, null, null, null, null, null, null },
//                    {null, null, null, new Queen(3,9), null, null, new Queen(6,9), null, null, null },
//            };

        }
    }

    //methods
    /*
    print board to console
     */
    void printBoard() {
        String out = "*________________________________________*\n";
        for (Tile arrT[] : Board) {
            for (Tile t : arrT) {
                out+= "| ";
                if (t instanceof Queen) {
                    if (((Queen) t).color == 'b') {out+= ",B ";}
                    else {out+= ",W ";}
                } else {
                    out+= ", ";
                }
                if(t.x > 9 ){ out+= "|"; }
            }
        }
        out+= "*________________________________________*";
        System.out.println(out);
    }


    //Main Method for testing
    public static void main(String[] args) {
//        test();
        GameBoard g = new GameBoard(true);
        g.printBoard();

//        System.out.println("Queen ? " + (g.Board[3][9] instanceof Queen));
//        System.out.println("Tile ? " + (g.Board[3][9] instanceof Tile));
//        System.out.println((g.Board[3][9]instanceof Tile) ? g.Board[3][9].toString() : false);
    }

    //testing methods
    static void test() {
        GameBoard g = new GameBoard(true);
        System.out.println("(0,3) || " + g.Board[0][3].toString());
        System.out.println("(1,3) || " + g.Board[1][3].toString());
        System.out.println("(2,3) || " + g.Board[2][3].toString());
        System.out.println("(3,3) || " + g.Board[3][3].toString());
        System.out.println("(3,9) || " + g.Board[3][9].toString());
        System.out.println("(6,9) || " + g.Board[6][9].toString());
    }

    static void test2() {


    }

}
