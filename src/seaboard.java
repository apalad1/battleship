public class seaboard extends Battleshp {
    private static int min = 0;
    private static int max = 6;
    private static String[][] Nboard = new String[max][max];

    String[][] initialnuetralboard(){
        for(int x=0; x<max;x++){
            for(int y=0;y<max;y++){
                if((x!=0) || (y!=0)){
                    Nboard[x][y] = "~";
                }
                if(x==0){
                    Nboard[0][y] = Integer.toString(y);
                }
                if(y==0){
                    Nboard[x][0] = Integer.toString(x);
                }
                if(x==0 && y==0){
                    Nboard[x][y] = " ";
                }
            }
        }
        return Nboard;
    }   //setup the initial board

    void printarray(){
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                System.out.print(Nboard[j][i]);

                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public void combat(){

        //have the attacks alter the player 1 and player 2 placementboards?         "X" for hits, "M" for misses
        //have a player1attackedboard[][] = same look as the initial board


        //todo player1attackedboard will have "M"/"X"/"~" to show misses, hits, and unknowns, this is the display, not the player2placement
        //player 1 enters x, y coordinates, check the coordinates on player2placement
            //if player1 missed, replace the player1attackedboard[x][y] with = "M"

            //if(player2placement[x][y] == "T")
                //change the player2placement[x][y], loop through the board and remove all "T", change to "X"
                //loop through player2placement[x][y] every tile thats "X" change player1attackedboard with "X" also
                //int shiphit++
                    //if(shiphit == 2) ->gamewon
                //display/print player1attackedboard

            //if(player2placement[x][y] == "F")
                //change the player2placement[x][y], loop and remove all "F", change to "X"
                //loopthrough player2placement[x][y] everytile thats "X" change player1attackedboard with "X" also
                //int shiphit++
                    //if(shiphit == 2) ->gamewon
                //display/print player1attackedboard


    }

}


