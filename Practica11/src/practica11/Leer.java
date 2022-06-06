package practica11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Leer {
    static String delimiter = ",";

    public static float[] LeerCSV(String csvFile){
        
        float calificacionesTotales[] =  new float[7];
        try{
            
            File file = new File(csvFile); 
            FileReader fr = new FileReader(file); 
            BufferedReader br = new BufferedReader(fr); 
            
            String line = ""; 
            String[] tempArray; 
            
            while((line = br.readLine()) != null) {
                tempArray = line.split(delimiter);
                Random rand = new Random();


                for(int i=0; i<7; i++){
                    calificacionesTotales[i] =  String_Float.convertirStringToFloat(tempArray[rand.nextInt(21)]);
                }
            }
            br.close();
            return calificacionesTotales;
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        return calificacionesTotales;
    }
}
