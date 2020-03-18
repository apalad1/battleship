public class seaboard extends Battleshp {
    private static String[][] Nboard = new String[6][6];

    String[][] initialnuetralboard(){
        for(int x=0; x<6;x++){
            for(int y=0;y<6;y++){
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

    public void printarray(){
        System.out.println(Nboard[0][0] + "  " + Nboard[1][0] + "  " + Nboard[2][0] + "  " + Nboard[3][0] + "  " + Nboard[4][0] + "  " + Nboard[5][0]);
        System.out.println(Nboard[0][1] + "  " + Nboard[1][1] + "  " + Nboard[2][1] + "  " + Nboard[3][1] + "  " + Nboard[4][1] + "  " + Nboard[5][1]);
        System.out.println(Nboard[0][2] + "  " + Nboard[1][2] + "  " + Nboard[2][2] + "  " + Nboard[3][2] + "  " + Nboard[4][2] + "  " + Nboard[5][2]);
        System.out.println(Nboard[0][3] + "  " + Nboard[1][3] + "  " + Nboard[2][3] + "  " + Nboard[3][3] + "  " + Nboard[4][3] + "  " + Nboard[5][3]);
        System.out.println(Nboard[0][4] + "  " + Nboard[1][4] + "  " + Nboard[2][4] + "  " + Nboard[3][4] + "  " + Nboard[4][4] + "  " + Nboard[5][4]);
        System.out.println(Nboard[0][5] + "  " + Nboard[1][5] + "  " + Nboard[2][5] + "  " + Nboard[3][5] + "  " + Nboard[4][5] + "  " + Nboard[5][5]);
    }

    public void combat(){

    }

}


