//Patricio Vargas
// OS Spring 2016
//Valdosta State University

import java.io.*;
import java.util.*;

public class MatrixThreats{
    public static void main(String[] args){
        boolean flag = false;
        int matrix_A[][],matrix_B[][],threats[][];
        String xvalues = "";
        int length = 0;
        int [] values;
        String fName = "";
        String space= "\\s+";
        Scanner scan = new Scanner (System.in);
        System.out.println("File name: ");
        fName = scan.next();
        scan.close();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(fName));
            xvalues = buffer.readLine();
            String [] avalues = xvalues.split(" ");
            length = avalues.length;
            values = new int[length];
            
            for(int i = 0;i<length;i++){
               values[i] = Integer.parseInt(avalues[i]);
            }
            if(values[0]==values[3]){
                flag = true;
            }
            else{
                buffer.close();
                System.out.println("The dimensions of your array are wrong");
                return;
            }
            
        }catch (IOException e) {
         
        }
    }     
}
