package com.kgisl.qs1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read {
    public static void main(String args[]) throws IOException {
          FileReader a=new FileReader("D:\\readfile.txt");    
           int i;    
           while((i=a.read())!=-1)    
           System.out.print((char)i);    
          a.close();   
       

            FileWriter b=new FileWriter("D:\\readfile.txt");    
            b.write("Kavin");    
            b.close(); 
           
            //System.out.println(fw);
           
             
    }    
}    