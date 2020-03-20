import java.util.Scanner;

public class Battleshp {
    // - use inheritance
    // - ship is abstract base class that the other ships inherit from
    // - encapsulation where every field is private
    // - field only accessible by getter/setter
    // - everything should be an object like the board
    // turn the board to an object, loop over it and then override on player1meth to represent the boats?

    //on player1meth "F" will be the five tile ship, "T" will be the three tile ship
    public static void main(String []args){
        System.out.println("Battleship Multiplayer");
        seaboard SEA = new seaboard();
        SEA.initialnuetralboard();
        SEA.printarray();

        //player 1 setup
        player1meth player1 = new player1meth();
        player1.player1name();
                                            //have the player place the biggest ship first so they get
        //player1.player1set5();              //a good idea of the space they have left to work around
        //player1.printplayer1placement();      //comment out 5tile just for faster tests?
        player1.player1set3();
        player1.printplayer1placement();

        SEA.printarray();                   //remind p2 of the board and also try to move up/hide player 1s setup in console

        //player 2 setup
        player2meth player2 = new player2meth();
        player2.player2name();

        player2.player2set5();
        player2.printplayer2placement();


        //testing
        //System.out.println("back to p1s board");
        //player1.printplayer1placement();



    }
}

