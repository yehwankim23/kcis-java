package newPackage;

import java.util.Scanner;

import java.io.*;

// file reader
public class Class23 {
    public static void main(String[] args) throws IOException {
        Scanner rd=new Scanner(System.in);
        
        FileReader fr=new FileReader("./new.txt");
        
        BufferedReader bf=new BufferedReader(fr);
        
        while(true) {
            String a=bf.readLine();
            
            if(a==null) break;
            
            System.out.println(a);
            }
            
            bf.close();
    }
}

/*
first line
second line
third line
fourth line
fifth line

 */
