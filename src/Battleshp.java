import java.util.Scanner;

public class Battleshp {
    // - use inheritance
    // - ship is abstract base class that the other ships inherit from
    // - encapsulation where every field is private
    // - field only accessible by getter/setter
    // - everything should be an object like the board
    // turn the board to an object, loop over it and then override on player1meth to represent the boats?
    public static void main(String []args){
        System.out.println("Battleship Multiplayer");
        seaboard SEA = new seaboard();
        SEA.initialnuetralboard();
        SEA.printarray();

        //player 1 set
        player1meth player1 = new player1meth();

        player1.player1name();
                                            //have the player place the biggest ship first so they get
        player1.player1set5();              //a good idea of the space they have left to work around
        player1.printplayer1placement();

        player1.player1set3();
        player1.printplayer1placement();







    }
}

