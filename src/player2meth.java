import java.util.Scanner;

public class player2meth extends seaboard {

    String playertwoname;
    private static int min = 0;
    private static int max = 6;
    private static String[][] player2placement = new String[max][max];
    boolean placeagain = true;


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
}


