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




}


