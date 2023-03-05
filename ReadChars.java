import java.io.*;
import java.nio.BufferOverflowException;

import java.io.*;


class ReadChars{
    public static void main(String[] args) throws IOException{
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println("Enter Characters, period to quit.");

        do{
            
            c = (char) br.read();
            System.out.println(c);
            


        }while(c != '.');

    }
}
