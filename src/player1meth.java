import java.util.Scanner;

public class player1meth extends seaboard {

    String playeronename;
    private static int min = 0;
    private static int max = 6;
    private static String[][] player1placement = new String[max][max];
    boolean placeagain = true;

    private static String[][] player2attackboard = new String[max][max];

    private int Xcount = 0;

    public void player1name(){
        System.out.println("Enter Player 1 name: ");
        Scanner scanthing1 = new Scanner(System.in);
        playeronename = scanthing1.nextLine();
    }


    //SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP
    public boolean player1set5(){

        for(int i = 0; i<player1placement.length; i++){             //fill the board with "filler" if theres no "p1" on it
            for(int j=0; j<player1placement.length;j++){
                if((player1placement[i][j] != "F") && (player1placement[i][j] != "T")){
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

        while(placeagain = true){
            System.out.println("Player -" + playeronename + "- enter the coordinates for ship#1 which takes 5 tiles, THIS COORDINATE WILL BE THE CENTER OF THE SHIP");
            System.out.println("-" + playeronename + "- enter the x coordinate");
            Scanner playeronescannerx = new Scanner(System.in);
            int playeronesXinput = playeronescannerx.nextInt();

            System.out.println("-" + playeronename + "- enter the y coordinate");
            Scanner playeronescannery = new Scanner(System.in);
            int playeronesYinput = playeronescannery.nextInt();

            //sends the players x and y center to 0,0 to force them to reinput to avoid out of bounds centers
            if((playeronesXinput > max) || (playeronesYinput>max) || (playeronesXinput < min) || (playeronesYinput < min)){
                playeronesXinput = 0;
                playeronesYinput = 0;
            }

            System.out.println("-" + playeronename + "- horizontal - press 1, or vertical | press 2");
            Scanner orientation = new Scanner(System.in);
            int playeronevh = orientation.nextInt();

            //-----
            if(player1placement[playeronesXinput][playeronesYinput] == "~"){    //if the chosen center coord is 'sea', let this happen

                if(playeronevh == 1){   //check if sideways has room, the extends need to be able to replace the 'sea' tiles in this instance 5 SHIPTILE NEEDS TO CHECK 2 EXTENDS EACH SIDE
                    if((player1placement[playeronesXinput-1][playeronesYinput] == "~") && (player1placement[playeronesXinput+1][playeronesYinput] == "~")
                        && (player1placement[playeronesXinput-2][playeronesYinput] == "~") && (player1placement[playeronesXinput+2][playeronesYinput] == "~")){
                        player1placement[playeronesXinput-1][playeronesYinput] = "F";      //if its within the boundary of the currently 6x6 map replace the board tile with their declared tile
                        player1placement[playeronesXinput+1][playeronesYinput] = "F";
                        player1placement[playeronesXinput-2][playeronesYinput] = "F";
                        player1placement[playeronesXinput+2][playeronesYinput] = "F";

                        player1placement[playeronesXinput][playeronesYinput] = "F";      //let the center replace happen after checking the sides too
                        placeagain = false;
                        return placeagain;
                    }
                }
                if(playeronevh == 2){ //check if updown has room for the extends up down
                    if((player1placement[playeronesXinput][playeronesYinput-1] == "~") && (player1placement[playeronesXinput][playeronesYinput+1] == "~")
                        && (player1placement[playeronesXinput][playeronesYinput-2]=="~") && (player1placement[playeronesXinput][playeronesYinput+2]=="~")){
                        player1placement[playeronesXinput][playeronesYinput-1] = "F";
                        player1placement[playeronesXinput][playeronesYinput+1] = "F";
                        player1placement[playeronesXinput][playeronesYinput-2] = "F";
                        player1placement[playeronesXinput][playeronesYinput+2] = "F";

                        player1placement[playeronesXinput][playeronesYinput] = "F";
                        placeagain = false;
                        return placeagain;
                    }

                }

            }
        }


        return placeagain;
    }

    //SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP
    public boolean player1set3(){

        for(int i = 0; i<player1placement.length; i++){             //fill the board with "filler" if theres no "p1" on it
            for(int j=0; j<player1placement.length;j++){
                if((player1placement[i][j] != "F") && (player1placement[i][j] != "T")){
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

        while(placeagain = true){


            System.out.println("Player -" + playeronename + "- enter the coordinates for ship#1 which takes 3 tiles, THIS COORDINATE WILL BE THE CENTER OF THE SHIP");
            System.out.println("-" + playeronename + "- enter the x coordinate");
            Scanner playeronescannerx = new Scanner(System.in);
            int playeronesXinput = playeronescannerx.nextInt();

            System.out.println("-" + playeronename + "- enter the y coordinate");
            Scanner playeronescannery = new Scanner(System.in);
            int playeronesYinput = playeronescannery.nextInt();

            if((playeronesXinput > max) || (playeronesYinput>max) || (playeronesXinput < min) || (playeronesYinput < min)){
                playeronesXinput = 0;
                playeronesYinput = 0;
            }

            System.out.println("-" + playeronename + "- horizontal - press 1, or vertical | press 2");
            Scanner orientation = new Scanner(System.in);
            int playeronevh = orientation.nextInt();

            //set the centershiptile, if the vh is out of bounds, wipe this tile later on with the vh code

            if(player1placement[playeronesXinput][playeronesYinput] == "~"){    //if the chosen center coord is 'sea', let this happen

                if(playeronevh == 1){   //check if sideways has room, the extends need to be able to replace the 'sea' tiles
                    if((player1placement[playeronesXinput-1][playeronesYinput] == "~") && (player1placement[playeronesXinput+1][playeronesYinput]== "~") ){
                        player1placement[playeronesXinput-1][playeronesYinput] = "T";      //if its within the boundary of the currently 6x6 map replace the board tile with their declared tile
                        player1placement[playeronesXinput+1][playeronesYinput] = "T";

                        player1placement[playeronesXinput][playeronesYinput] = "T";      //let the center replace happen after checking the sides too
                        placeagain = false;
                        return placeagain;
                    }
                }
                if(playeronevh == 2){ //check if updown has room for the extends up down
                    if((player1placement[playeronesXinput][playeronesYinput-1] == "~") && (player1placement[playeronesXinput][playeronesYinput+1] == "~")){
                        player1placement[playeronesXinput][playeronesYinput-1] = "T";
                        player1placement[playeronesXinput][playeronesYinput+1] = "T";

                        player1placement[playeronesXinput][playeronesYinput] = "T";
                        placeagain = false;
                        return placeagain;
                    }

                }

            }

        }


        return placeagain;
    }

    void printplayer1placement(){
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                System.out.print(player1placement[j][i]);

                System.out.print("  ");
            }
            System.out.println();
        }
    }

    //have the player1attacking player 2 here with the player1 board in here also for direct comparison
    String[][] player2attack(){
        System.out.println("Player 2 enter the x coordinate");
        Scanner p1atk = new Scanner(System.in);
        int xp2atk = p1atk.nextInt();

        System.out.println("Player 2 enter the y coordinate");
        Scanner p2atk = new Scanner(System.in);
        int yp2atk = p2atk.nextInt();

        //check the player2placement board coords see if player2placement[xp1atk][yp1atk] == "T" || player2placement[xp1atk][yp1atk] == "F"
        if(player1placement[xp2atk][yp2atk] == "F" || player1placement[xp2atk][yp2atk] == "T"){
            if(player1placement[xp2atk][yp2atk] == "F"){
                for(int i=0;i<max;i++){
                    for(int j=0;j<max;j++){
                        if(player1placement[i][j] == "F"){                  //run through the loop, check the player2placeboard for f tiles
                            player2attackboard[i][j] = "X";                 //change the player 1 attack board where you hit to x
                            //win condition is to run through the player1attackboard if xcount = 8 tiles, you win (5 from F, 3 from T)
                        }
                    }
                }
            }
            if(player1placement[xp2atk][yp2atk] == "T"){
                for(int a=0;a<max;a++){
                    for(int b=0;b<max;b++){
                        if(player1placement[a][b] == "T"){
                            player2attackboard[a][b] = "X";
                        }
                    }
                }
            }
        } else{
            player2attackboard[xp2atk][yp2atk] = "M";
        }
        return player2attackboard;

    }

    //populate player2attackboard, if its not "M" "X" fill it with "~"
    String[][] populatep2attack(){
        for(int a=0;a<max;a++){
            for(int b=0;b<max;b++){
                if(((a!=0) || (b!=0)) && (player2attackboard[a][b] != "X") && (player2attackboard[a][b] != "M")){
                    player2attackboard[a][b] = "~";
                }
                if(a==0){
                    player2attackboard[0][b] = Integer.toString(b);
                }
                if(b==0){
                    player2attackboard[a][0] = Integer.toString(a);
                }
                if(a==0 && b==0){
                    player2attackboard[a][b] = " ";
                }
            }
        }
        return player2attackboard;
    }


    //display to be called after player 2s attacks to see their current status of attacks
    void printp2attackboard(){
        System.out.println("Player 2s, Attack History");
        for(int a=0;a<max;a++){           //a is the y coord here
            for(int b=0;b<max;b++){       //b is the x coord here
                System.out.print(" "+ player2attackboard[b][a] +" ");
                if(b==5){
                    System.out.println();
                }
            }
        }
    }

    //method to check the player2attackboard if it has 8 X tiles meaning it hit all the ships
    public int countXs(){
        Xcount = 0;                 //set Xcount back to 0, max should be 8 for a 5tile ship + 3tile ship
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(player2attackboard[i][j] == "X"){
                    Xcount++;
                }
            }
        }
        return Xcount;
    }

    public int getXcount(){
        System.out.println("returned xcount is: " + Xcount);
        return Xcount;
    }
    public void setXcount(int newval){
        this.Xcount = newval;
    }


}
