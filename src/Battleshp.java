import java.util.Scanner;

public class Battleshp {

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
        player1.player1set5();              //a good idea of the space they have left to work around
        player1.printplayer1placement();      //comment out 5tile just for faster tests?
        player1.player1set3();
        player1.printplayer1placement();

        SEA.printarray();                   //remind p2 of the board and also try to move up/hide player 1s setup in console
        System.out.println("PLAYER 2S TURN");


        //player 2 setup
        player2meth player2 = new player2meth();
        player2.player2name();

        player2.player2set5();
        player2.printplayer2placement();
        player2.player2set3();
        player2.printplayer2placement();


        //testing
        System.out.println("GAME START");
        //while loop based on counting the X tiles from sunk ships each time the turn is finished
        int xcounteight = 0;
        while(xcounteight != 8){
            //PLAYER 1 SET, compare the player1attack board vs the player2placement board
            System.out.println("player 1s turn");
            player2.populatep1attack();
            player2.player1attack();
            player2.printp1attackboard();
            player2.countXs();
            player2.getXcount();
            xcounteight = player2.getXcount();
            if(xcounteight == 8){
                System.out.println("player 1 won");
            } else{                                         //since player 1 hasnt won yet, its player 2s turn
                System.out.println("player 2s turn");
                player1.populatep2attack();
                player1.player2attack();
                player1.printp2attackboard();
                player1.countXs();
                player1.getXcount();
                xcounteight = player1.getXcount();
                if(xcounteight == 8){
                    System.out.println("player 2 won");
                }
            }
        }
            System.out.println("GAME FINISHED");









    }


}

