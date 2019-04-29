package com.kgisl.qs1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Rw
 */
public class Rw {

    public static void main(String[] args) {
        try{
            Writer w=new FileWriter("op.txt");
            String con="Hai";
            w.write(con);
            w.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        }
        
        }   