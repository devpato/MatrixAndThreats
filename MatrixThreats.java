//Patricio Vargas
// OS Spring 2016
//Valdosta State University

import java.io*;
import java.util*;

public class MatrixThreats{
    public static void main(String[] args){
        boolean flag = false;
        int matrix_A[][],matrix_B[][],threats[][];
        String xvalues = "";
        int [] values;
        String fName = "";
        String space= "\\s+";
        Scanner scan = new Scanner (System.in);
        System.out.println("File name:");
        fName = scan.next();
        scan.close();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(fName));
            xvalues = buffer.readLine();
            values = MatrixThreats.stringArrayToIntArray(xvalues.split(space));
            if(values[0]==values[3]){
                flag = true;
            }
            else{
                buffer.close();
                System.out.println("The dimensions of your array are wrong");
                return;
            }
            
        }
    }     
}
