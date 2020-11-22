package newPackage;

import java.util.Scanner;

import java.io.*;

// file writer
public class Class22 {
    public static void main(String[] args) throws IOException {
        Scanner rd=new Scanner(System.in);
        
        FileWriter fw=new FileWriter("./new.txt");
        
        while(true) {
            String a=rd.nextLine();
            
            if(a.equals("el fin")) {
                break;
            }
            
            fw.write(a); fw.write("\r\n");
        }
        
        
        fw.close();
    }
}

/*
first line
second line
third line
fourth line
fifth line
el fin

 */
