import java.util.Scanner;

public class Battleshp {
    // - use inheritance                                                    //private static String[][] player1placement = new String[6][6];
    // - ship is abstract base class that the other ships inherit from
    // - encapsulation where every field is private
    // - field only accessible by getter/setter
    // - everything should be an object like the board

    public static void main(String []args){
        System.out.println("Battleship Multiplayer");
        seaboard SEA = new seaboard();
        SEA.initialnuetralboard();
        SEA.printarray();

        //player 1 set
        player1meth player1 = new player1meth();

        player1.player1name();
        player1.player1set3();
        player1.printplayer1placement();

        player1.player1set3();
        player1.printplayer1placement();





    }
}

