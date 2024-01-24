public class Array_bidimensionales_II {
    public static void main(String[] args){
        int [][] matrix={
                {10,25,35,45,55,65},
                {11,25,35,45,55,65},
                {12,25,35,45,55,65},
                {13,25,35,45,55,75}
        };
        for ( int []fila:matrix){
            System.out.println();

            for (int z: fila){

                System.out.print( z + " ");
            }
        }
    }

}
