public class Array_bidimensionales {

    public static void main(String[] args){

        int [][] matrix=new int[4][5];

        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[0][3]=4;
        matrix[0][4]=5;

        matrix[1][0]=1;
        matrix[1][1]=2;
        matrix[1][2]=3;
        matrix[1][3]=4;
        matrix[1][4]=5;


        matrix[2][0]=1;
        matrix[2][1]=2;
        matrix[2][2]=3;
        matrix[2][3]=4;
        matrix[2][4]=5;

        matrix[3][0]=1;
        matrix[3][1]=2;
        matrix[3][2]=3;
        matrix[3][3]=4;
        matrix[3][4]=5;

        for ( int i = 0; i<4; i++){
            System.out.println();

            for (int j= 0; j<5; j++){

                System.out.print(" i"+matrix[i][j] + " ");
            }
        }





    }
}
