import javax.swing.*;

public class Uso_Arrays_II {

    public static void main(String[] args){

        String [] paises=new String[8];

        /*paises[0]="México";
        paises[1]="España";
        paises[2]="Colombia";
        paises[3]="Perú";
        paises[4]="Chile";
        paises[5]="Argentia";
        paises[6]="Ecuador";
        paises[7]="Venezuela";*/

        for (int i=0;i<8;i++){
            paises[i]= JOptionPane.showInputDialog("Introduce pais "+ (i+1));


        }

        for(String elemento:paises){
            System.out.println("Pais: " + elemento);
        }




    }
}
