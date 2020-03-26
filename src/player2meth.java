import java.util.Scanner;

public class player2meth extends seaboard {

    String playertwoname;
    private static int min = 0;
    private static int max = 6;
    private static String[][] player2placement = new String[max][max];
    boolean placeagain = true;

    private static String[][] player1attackboard = new String[max][max];

    private int Xcount = 0;

    public void player2name(){
        System.out.println("Enter Player 2 name: ");
        Scanner scanthing2 = new Scanner(System.in);
        playertwoname = scanthing2.nextLine();
    }


    //SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP//SIZE 5 SHIP
    public boolean player2set5(){

        for(int i = 0; i<player2placement.length; i++){             //fill the board with "filler" if theres no "p1" on it
            for(int j=0; j<player2placement.length;j++){
                if((player2placement[i][j] != "F") && (player2placement[i][j] != "T")){
                    player2placement[i][j] = "~";
                }
                if(i==0){
                    player2placement[0][j] = Integer.toString(j);
                }
                if(j==0){
                    player2placement[i][0] = Integer.toString(i);
                }
                if(i==0 && j==0){
                    player2placement[i][j] = " ";
                }

            }
        }

        while(placeagain = true){
            System.out.println("Player -" + playertwoname + "- enter the coordinates for ship#1 which takes 5 tiles, THIS COORDINATE WILL BE THE CENTER OF THE SHIP");
            System.out.println("-" + playertwoname + "- enter the x coordinate");
            Scanner playertwoscannerx = new Scanner(System.in);
            int playertwosXinput = playertwoscannerx.nextInt();

            System.out.println("-" + playertwoname + "- enter the y coordinate");
            Scanner playertwoscannery = new Scanner(System.in);
            int playertwosYinput = playertwoscannery.nextInt();

            if((playertwosXinput > max) || (playertwosYinput>max) || (playertwosXinput < min) || (playertwosYinput < min)){
                playertwosXinput = 0;
                playertwosYinput = 0;
            }

            System.out.println("-" + playertwoname + "- horizontal - press 1, or vertical | press 2");
            Scanner orientation = new Scanner(System.in);
            int playertwovh = orientation.nextInt();

            //-----
            if(player2placement[playertwosXinput][playertwosYinput] == "~"){    //if the chosen center coord is 'sea', let this happen

                if(playertwovh == 1){   //check if sideways has room, the extends need to be able to replace the 'sea' tiles in this instance 5 SHIPTILE NEEDS TO CHECK 2 EXTENDS EACH SIDE
                    if((player2placement[playertwosXinput-1][playertwosYinput] == "~") && (player2placement[playertwosXinput+1][playertwosYinput] == "~")
                            && (player2placement[playertwosXinput-2][playertwosYinput] == "~") && (player2placement[playertwosXinput+2][playertwosYinput] == "~")){
                        player2placement[playertwosXinput-1][playertwosYinput] = "F";      //if its within the boundary of the currently 6x6 map replace the board tile with their declared tile
                        player2placement[playertwosXinput+1][playertwosYinput] = "F";
                        player2placement[playertwosXinput-2][playertwosYinput] = "F";
                        player2placement[playertwosXinput+2][playertwosYinput] = "F";

                        player2placement[playertwosXinput][playertwosYinput] = "F";      //let the center replace happen after checking the sides too
                        placeagain = false;
                        return placeagain;
                    }
                }
                if(playertwovh == 2){ //check if updown has room for the extends up down
                    if((player2placement[playertwosXinput][playertwosYinput-1] == "~") && (player2placement[playertwosXinput][playertwosYinput+1] == "~")
                            && (player2placement[playertwosXinput][playertwosYinput-2]=="~") && (player2placement[playertwosXinput][playertwosYinput+2]=="~")){
                        player2placement[playertwosXinput][playertwosYinput-1] = "F";
                        player2placement[playertwosXinput][playertwosYinput+1] = "F";
                        player2placement[playertwosXinput][playertwosYinput-2] = "F";
                        player2placement[playertwosXinput][playertwosYinput+2] = "F";

                        player2placement[playertwosXinput][playertwosYinput] = "F";
                        placeagain = false;
                        return placeagain;
                    }

                }

            }
        }


        return placeagain;
    }

    //SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP//SIZE 3 SHIP
    public boolean player2set3(){

        for(int i = 0; i<player2placement.length; i++){             //fill the board with "filler" if theres no "p1" on it
            for(int j=0; j<player2placement.length;j++){
                if((player2placement[i][j] != "F") && (player2placement[i][j] != "T")){
                    player2placement[i][j] = "~";
                }
                if(i==0){
                    player2placement[0][j] = Integer.toString(j);
                }
                if(j==0){
                    player2placement[i][0] = Integer.toString(i);
                }
                if(i==0 && j==0){
                    player2placement[i][j] = " ";
                }

            }
        }

        while(placeagain = true){
            System.out.println("Player -" + playertwoname + "- enter the coordinates for ship#1 which takes 3 tiles, THIS COORDINATE WILL BE THE CENTER OF THE SHIP");
            System.out.println("-" + playertwoname + "- enter the x coordinate");
            Scanner playertwoscannerx = new Scanner(System.in);
            int playertwosXinput = playertwoscannerx.nextInt();

            System.out.println("-" + playertwoname + "- enter the y coordinate");
            Scanner playertwoscannery = new Scanner(System.in);
            int playertwosYinput = playertwoscannery.nextInt();

            if((playertwosXinput > max) || (playertwosYinput>max) || (playertwosXinput < min) || (playertwosYinput < min)){
                playertwosXinput = 0;
                playertwosYinput = 0;
            }

            System.out.println("-" + playertwoname + "- horizontal - press 1, or vertical | press 2");
            Scanner orientation = new Scanner(System.in);
            int playertwovh = orientation.nextInt();

            //set the centershiptile, if the vh is out of bounds, wipe this tile later on with the vh code

            if(player2placement[playertwosXinput][playertwosYinput] == "~"){    //if the chosen center coord is 'sea', let this happen

                if(playertwovh == 1){   //check if sideways has room, the extends need to be able to replace the 'sea' tiles
                    if((player2placement[playertwosXinput-1][playertwosYinput] == "~") && (player2placement[playertwosXinput+1][playertwosYinput]== "~") ){
                        player2placement[playertwosXinput-1][playertwosYinput] = "T";      //if its within the boundary of the currently 6x6 map replace the board tile with their declared tile
                        player2placement[playertwosXinput+1][playertwosYinput] = "T";

                        player2placement[playertwosXinput][playertwosYinput] = "T";      //let the center replace happen after checking the sides too
                        placeagain = false;
                        return placeagain;
                    }
                }
                if(playertwovh == 2){ //check if updown has room for the extends up down
                    if((player2placement[playertwosXinput][playertwosYinput-1] == "~") && (player2placement[playertwosXinput][playertwosYinput+1] == "~")){
                        player2placement[playertwosXinput][playertwosYinput-1] = "T";
                        player2placement[playertwosXinput][playertwosYinput+1] = "T";

                        player2placement[playertwosXinput][playertwosYinput] = "T";
                        placeagain = false;
                        return placeagain;
                    }

                }

            }

        }


        return placeagain;
    }

    void printplayer2placement(){
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                System.out.print(player2placement[j][i]);

                System.out.print("  ");
            }
            System.out.println();
        }
    }

    //have the player2attacking player 1 here with the player2 board in here also for direct comparison
    String[][] player1attack(){
        System.out.println("Player 1 enter the x coordinate");
        Scanner p1atk = new Scanner(System.in);
        int xp1atk = p1atk.nextInt();

        System.out.println("Player 1 enter the y coordinate");
        Scanner p2atk = new Scanner(System.in);
        int yp1atk = p2atk.nextInt();

        //check the player2placement board coords see if player2placement[xp1atk][yp1atk] == "T" || player2placement[xp1atk][yp1atk] == "F"
        if(player2placement[xp1atk][yp1atk] == "F" || player2placement[xp1atk][yp1atk] == "T"){
            if(player2placement[xp1atk][yp1atk] == "F"){
                for(int i=0;i<max;i++){
                    for(int j=0;j<max;j++){
                        if(player2placement[i][j] == "F"){                  //run through the loop, check the player2placeboard for f tiles
                            player1attackboard[i][j] = "X";                 //change the player 1 attack board where you hit to x
                                                                            //win condition is to run through the player1attackboard if xcount = 8 tiles, you win (5 from F, 3 from T)
                        }
                    }
                }
            }
            if(player2placement[xp1atk][yp1atk] == "T"){
                for(int a=0;a<max;a++){
                    for(int b=0;b<max;b++){
                        if(player2placement[a][b] == "T"){
                            player1attackboard[a][b] = "X";
                        }
                    }
                }
            }
        } else{
            player1attackboard[xp1atk][yp1atk] = "M";
        }
        return player1attackboard;

    }
    //populate player1attackboard, if its not "M" "X" fill it with "~"
    String[][] populatep1attack(){
        for(int a=0;a<max;a++){
            for(int b=0;b<max;b++){
                if(((a!=0) || (b!=0)) && (player1attackboard[a][b] != "X") && (player1attackboard[a][b] != "M")){
                    player1attackboard[a][b] = "~";
                }
                if(a==0){
                    player1attackboard[0][b] = Integer.toString(b);
                }
                if(b==0){
                    player1attackboard[a][0] = Integer.toString(a);
                }
                if(a==0 && b==0){
                    player1attackboard[a][b] = " ";
                }
            }
        }
        return player1attackboard;
    }
    //display to be called after player 1s attacks to see their current status of attacks
    void printp1attackboard(){
        System.out.println("Player 1s, Attack History");
      for(int a=0;a<max;a++){           //a is the y coord here
          for(int b=0;b<max;b++){       //b is the x coord here
              System.out.print(" "+ player1attackboard[b][a] +" ");
              if(b==5){
                  System.out.println();
              }
          }
      }
    }
    //method to check the player1attackboard if it has 8 X tiles meaning it hit all the ships
    public int countXs(){
        Xcount = 0;                 //set Xcount back to 0, max should be 8 for a 5tile ship + 3tile ship
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(player1attackboard[i][j] == "X"){
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


