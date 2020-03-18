import java.util.Scanner;

public class player1meth extends seaboard {

    String playeronename;
    private static String[][] player1placement = new String[6][6];
    //player1attacking board
    // ------------------------------------------------------------------
    //method to be asked to place ships?
        //method for player2 to place
    //method to chose a tile to attack
        //method for player 2 to attack

    public void player1name(){
        System.out.println("Enter Player 1 name: ");
        Scanner scanthing1 = new Scanner(System.in);
        playeronename = scanthing1.nextLine();
    }
    //have this be for the 3size boat, need a 1 size, a 5size, similar methods

    public void player1set5(){

    }

    public void player1set3(){

        for(int i = 0; i<player1placement.length; i++){             //fill the board with "filler" if theres no "p1" on it
            for(int j=0; j<player1placement.length;j++){
                if(((i!=0) || (i!=0)) && (player1placement[i][j] != "x")){
                    player1placement[i][j] = "~";
                }
                if(i==0){
                    player1placement[0][j] = Integer.toString(j);
                }
                if(j==0){
                    player1placement[i][0] = Integer.toString(i);
                }
                if(i==0 && j==0){
                    player1placement[i][j] = " ";
                }

            }
        }

        System.out.println("Player -" + playeronename + "- enter the coordinates for ship#1 which takes 3 tiles, THIS COORDINATE WILL BE THE CENTER OF THE SHIP");
        System.out.println("-" + playeronename + "- enter the x coordinate");
        Scanner playeronescannerx = new Scanner(System.in);
        int playeronesXinput = playeronescannerx.nextInt();

        System.out.println("-" + playeronename + "- enter the y coordinate");
        Scanner playeronescannery = new Scanner(System.in);
        int playeronesYinput = playeronescannery.nextInt();

        System.out.println("-" + playeronename + "- horizontal - press 1, or vertical | press 2");
        Scanner orientation = new Scanner(System.in);
        int playeronevh = orientation.nextInt();

        //set the centershiptile, if the vh is out of bounds, wipe this tile later on with the vh code

        if(player1placement[playeronesXinput][playeronesYinput] == "~"){    //if the chosen center coord is 'sea', let this happen

            if(playeronevh == 1){   //check if sideways has room, the extends need to be able to replace the 'sea' tiles
                if((player1placement[playeronesXinput-1][playeronesYinput] == "~") && (player1placement[playeronesXinput+1][playeronesYinput]) == "~"){
                    player1placement[playeronesXinput-1][playeronesYinput] = "x";      //if its within the boundary of the currently 6x6 map replace the board tile with their declared tile
                    player1placement[playeronesXinput+1][playeronesYinput] = "x";

                    player1placement[playeronesXinput][playeronesYinput] = "x";      //let the center replace happen after checking the sides too
                }
            }
            if(playeronevh == 2){ //check if updown has room for the extends up down
                if((player1placement[playeronesXinput][playeronesYinput-1] == "~") && (player1placement[playeronesXinput][playeronesYinput+1] == "~")){
                    player1placement[playeronesXinput][playeronesYinput-1] = "x";
                    player1placement[playeronesXinput][playeronesYinput+1] = "x";

                    player1placement[playeronesXinput][playeronesYinput] = "x";
                }

            }

        }




        //return player1placement;
    }

    void printplayer1placement(){
        System.out.println(player1placement[0][0] + "  " + player1placement[1][0] + "  " + player1placement[2][0] + "  " + player1placement[3][0] + "  " + player1placement[4][0] + "  " + player1placement[5][0]);
        System.out.println(player1placement[0][1] + "  " + player1placement[1][1] + "  " + player1placement[2][1] + "  " + player1placement[3][1] + "  " + player1placement[4][1] + "  " + player1placement[5][1]);
        System.out.println(player1placement[0][2] + "  " + player1placement[1][2] + "  " + player1placement[2][2] + "  " + player1placement[3][2] + "  " + player1placement[4][2] + "  " + player1placement[5][2]);
        System.out.println(player1placement[0][3] + "  " + player1placement[1][3] + "  " + player1placement[2][3] + "  " + player1placement[3][3] + "  " + player1placement[4][3] + "  " + player1placement[5][3]);
        System.out.println(player1placement[0][4] + "  " + player1placement[1][4] + "  " + player1placement[2][4] + "  " + player1placement[3][4] + "  " + player1placement[4][4] + "  " + player1placement[5][4]);
        System.out.println(player1placement[0][5] + "  " + player1placement[1][5] + "  " + player1placement[2][5] + "  " + player1placement[3][5] + "  " + player1placement[4][5] + "  " + player1placement[5][5]);
    }

}
